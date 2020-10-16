package com.example.androidac
import android.app.TimePickerDialog
import android.content.Context
import android.content.SharedPreferences
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.hardware.ConsumerIrManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.TimePicker
import java.util.Arrays
import java.util.Calendar
class MainActivity:AppCompatActivity() {
  private val irManager:ConsumerIrManager
  // x 0 0 1 0 0 0 0 1 1 0 1 0 1 0 1 0 1 1 1 1
  protected fun onCreate(savedInstanceState:Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val config = this.getResources().getConfiguration()
    if (config.smallestScreenWidthDp >= 600)
    {
      setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)
    }
    else
    {
      setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
    }
    sharedPref = this.getPreferences(Context.MODE_PRIVATE)
    prefEditor = sharedPref.edit()
    irManager = getSystemService(CONSUMER_IR_SERVICE) as ConsumerIrManager
    restore_data()
    update_view()
    findViewById(R.id.powerButton).setOnClickListener(object:View.OnClickListener() {
      fun onClick(view:View) {
        power = !power
        update_view()
        send()
        prefEditor.putBoolean("Power", power)
        prefEditor.apply()
      }
    })
    findViewById(R.id.tempUpButton).setOnClickListener(object:View.OnClickListener() {
      fun onClick(view:View) {
        temperature = Math.min(temperature + 1, TEMP_16 + 14)
        update_view()
        send()
        prefEditor.putInt("Temperature", temperature)
        prefEditor.apply()
      }
    })
    findViewById(R.id.tempDownButton).setOnClickListener(object:View.OnClickListener() {
      fun onClick(view:View) {
        temperature = Math.max(temperature - 1, TEMP_16)
        update_view()
        send()
        prefEditor.putInt("Temperature", temperature)
        prefEditor.apply()
      }
    })
    findViewById(R.id.swingButton).setOnClickListener(object:View.OnClickListener() {
      fun onClick(view:View) {
        swing = !swing
        update_view()
        send()
        prefEditor.putBoolean("Swing", swing)
        prefEditor.apply()
      }
    })
    findViewById(R.id.modeButton).setOnClickListener(object:View.OnClickListener() {
      fun onClick(view:View) {
        mode = (mode + 1) % 4
        if (mode == MODE_FAN && fan == FAN_AUTO)
        {
          fan = (fan + 1) % 4
        }
        update_view()
        send()
        prefEditor.putInt("Mode", mode)
        prefEditor.apply()
      }
    })
    findViewById(R.id.fanButton).setOnClickListener(object:View.OnClickListener() {
      fun onClick(view:View) {
        fan = (fan + 1) % 4
        if (mode == MODE_FAN && fan == FAN_AUTO)
        fan = (fan + 1) % 4
        update_view()
        send()
        prefEditor.putInt("Fan", fan)
        prefEditor.apply()
      }
    })
    findViewById(R.id.sleepButton).setOnClickListener(object:View.OnClickListener() {
      fun onClick(view:View) {
        if (sleep)
        {
          sleep = false
          tsleep_hours = 10
          tsleep_tens = 0
          tsleep_pm = true
          update_view()
          send()
          prefEditor.putBoolean("Sleep", sleep)
          prefEditor.putInt("SleepHour", tsleep_hours)
          prefEditor.putInt("SleepTens", tsleep_tens)
          prefEditor.putBoolean("SleepPM", tsleep_pm)
          prefEditor.apply()
        }
        else
        {
          val currentTime = Calendar.getInstance()
          val hour = currentTime.get(Calendar.HOUR_OF_DAY)
          val minute = currentTime.get(Calendar.MINUTE)
          val timepicker = TimePickerDialog(this@MainActivity, object:TimePickerDialog.OnTimeSetListener() {
            fun onTimeSet(timePicker:TimePicker, hourofday:Int, selectedminute:Int) {
              sleep = true
              tsleep_hours = hourofday % 12
              tsleep_pm = hourofday >= 12
              tsleep_tens = selectedminute / 10
              update_view()
              send()
              prefEditor.putBoolean("Sleep", sleep)
              prefEditor.putInt("SleepHour", tsleep_hours)
              prefEditor.putInt("SleepTens", tsleep_tens)
              prefEditor.putBoolean("SleepPM", tsleep_pm)
              prefEditor.apply()
            }
          }, hour, minute, false)
          timepicker.setTitle("Select Sleep Time")
          timepicker.show()
        }
      }
    })
    findViewById(R.id.wakeButton).setOnClickListener(object:View.OnClickListener() {
      fun onClick(view:View) {
        if (wake)
        {
          wake = false
          twake_hours = 6
          twake_tens = 0
          twake_pm = false
          update_view()
          send()
          prefEditor.putBoolean("Wake", wake)
          prefEditor.putInt("WakeHour", twake_hours)
          prefEditor.putInt("WakeTens", twake_tens)
          prefEditor.putBoolean("WakePM", twake_pm)
          prefEditor.apply()
        }
        else
        {
          val currentTime = Calendar.getInstance()
          val hour = currentTime.get(Calendar.HOUR_OF_DAY)
          val minute = currentTime.get(Calendar.MINUTE)
          val timepicker = TimePickerDialog(this@MainActivity, object:TimePickerDialog.OnTimeSetListener() {
            fun onTimeSet(timePicker:TimePicker, hourofday:Int, selectedminute:Int) {
              wake = true
              twake_hours = hourofday % 12
              twake_pm = hourofday >= 12
              twake_tens = selectedminute / 10
              update_view()
              send()
              prefEditor.putBoolean("Wake", wake)
              prefEditor.putInt("WakeHour", twake_hours)
              prefEditor.putInt("WakeTens", twake_tens)
              prefEditor.putBoolean("WakePM", twake_pm)
              prefEditor.apply()
            }
          }, hour, minute, false)
          timepicker.setTitle("Select Wake up Time")
          timepicker.show()
        }
      }
    })
    findViewById(R.id.sendButton).setOnClickListener(object:View.OnClickListener() {
      fun onClick(view:View) {
        send()
      }
    })
  }
  internal fun update_view() {
    (findViewById(R.id.powerText) as TextView).setText(if (power) "On" else "Off")
    (findViewById(R.id.tempratureText) as TextView).setText(Integer.toString(temperature + (16 - TEMP_16)))
    val state = "Cold"
    when (mode) {
      MODE_COLD -> state = "Cold"
      MODE_HOT -> state = "Hot"
      MODE_DRY -> state = "Dry"
      MODE_FAN -> state = "Fan"
    }
    (findViewById(R.id.modeText) as TextView).setText(state)
    (findViewById(R.id.swinText) as TextView).setText(if (swing) "On" else "Off")
    when (fan) {
      FAN_AUTO -> {
        findViewById(R.id.fanImage).setVisibility(View.INVISIBLE)
        findViewById(R.id.autoText).setVisibility(View.VISIBLE)
      }
      FAN_1 -> {
        findViewById(R.id.fanImage).setVisibility(View.VISIBLE)
        findViewById(R.id.autoText).setVisibility(View.INVISIBLE)
        (findViewById(R.id.fanImage) as ImageView).setImageResource(R.drawable.fan1)
      }
      FAN_2 -> {
        findViewById(R.id.fanImage).setVisibility(View.VISIBLE)
        findViewById(R.id.autoText).setVisibility(View.INVISIBLE)
        (findViewById(R.id.fanImage) as ImageView).setImageResource(R.drawable.fan2)
      }
      FAN_3 -> {
        findViewById(R.id.fanImage).setVisibility(View.VISIBLE)
        findViewById(R.id.autoText).setVisibility(View.INVISIBLE)
        (findViewById(R.id.fanImage) as ImageView).setImageResource(R.drawable.fan3)
      }
    }
    if (sleep)
    {
      val sleepText = findViewById(R.id.sleepText)
      sleepText.setVisibility(View.VISIBLE)
      sleepText.setText("Sleep at " + Integer.toString(tsleep_hours) + ":" + Integer.toString(tsleep_tens * 10) + " " + (if (tsleep_pm) "PM" else "AM"))
    }
    else
    {
      findViewById(R.id.sleepText).setVisibility(View.INVISIBLE)
    }
    if (wake)
    {
      val wakeText = findViewById(R.id.wakeText)
      wakeText.setVisibility(View.VISIBLE)
      wakeText.setText("Wake up at " + Integer.toString(twake_hours) + ":" + Integer.toString(twake_tens * 10) + " " + (if (twake_pm) "PM" else "AM"))
    }
    else
    {
      findViewById(R.id.wakeText).setVisibility(View.INVISIBLE)
    }
  }
  internal fun restore_data() {
    power = sharedPref.getBoolean("Power", false)
    temperature = sharedPref.getInt("Temperature", TEMP_16 + 8)
    fan = sharedPref.getInt("Fan", FAN_1)
    mode = sharedPref.getInt("Mode", MODE_COLD)
    swing = sharedPref.getBoolean("Swing", false)
    sleep = sharedPref.getBoolean("Sleep", false)
    wake = sharedPref.getBoolean("Wake", false)
    tsleep_hours = sharedPref.getInt("SleepHour", 10)
    tsleep_tens = sharedPref.getInt("SleepTens", 0)
    tsleep_pm = sharedPref.getBoolean("SleepPM", true)
    twake_hours = sharedPref.getInt("WakeHour", 6)
    twake_tens = sharedPref.getInt("WakeTens", 0)
    twake_pm = sharedPref.getBoolean("WakePM", false)
  }
  internal fun send() {
    set_time()
    set_checksum()
    update_raw()
    Log.d("raw", Arrays.toString(raw))
    if (irManager.hasIrEmitter())
    {
      irManager.transmit(38000, raw)
    }
    else
    {
      Log.e("ir", "No ir emmiter detected")
    }
  }
  companion object {
    internal var temperature:Int = 0
    internal var fan:Int = 0
    internal var mode:Int = 0
    internal var tnow_units:Int = 0
    internal var tnow_tens:Int = 0
    internal var tnow_hours:Int = 0
    internal var checksum:Int = 0
    internal var tsleep_hours:Int = 0
    internal var tsleep_tens:Int = 0
    internal var twake_hours:Int = 0
    internal var twake_tens:Int = 0
    internal var power:Boolean = false
    internal var swing:Boolean = false
    internal var sleep:Boolean = false
    internal var wake:Boolean = false
    internal var tnow_pm:Boolean = false
    internal var tsleep_pm:Boolean = false
    internal var twake_pm:Boolean = false
    private val FAN_AUTO = 0
    private val FAN_1 = 1
    private val FAN_2 = 2
    private val FAN_3 = 3
    private val MODE_DRY = 0
    private val MODE_HOT = 1
    private val MODE_COLD = 2
    private val MODE_FAN = 3
    private val TEMP_16 = 0
    private val LOW = 552
    private val HIGH = 1683
    internal var sharedPref:SharedPreferences
    internal var prefEditor:SharedPreferences.Editor
    private val raw = intArrayOf(8835, 4497, 552, 552, 552, 552, 552, 1683, 552, 552, 552, 552, 552, 552, 552, 552, 552, 1683, 552, 1683, 552, 552, 552, 1683, 552, 552, 552, 1683, 552, 552, 552, 1683, 552, 552, 552, 1683, 552, 1683, 552, 1683, 552, 1683, 552, 552, 552, 1683, 552, 1683, 552, 552, 552, 1683, 552, 552, 552, 552, 552, 1683, 552, 552, 552, 552, 552, 552, 552, 552, 552, 1683, 552, 552, 552, 1683, 552, 552, 552, 1683, 552, 552, 552, 552, 552, 552, 552, 1683, 552, 552, 552, 1683, 552, 1683, 552, 1683, 552, 552, 552, 1683, 552, 552, 552, 552, 552, 552, 552, 552, 552, 552, 552, 552, 552, 1683, 552, 1683, 552, 552, 552, 552, 552, 552, 552, 552, 552, 1683, 552, 552, 552, 1683, 552, 552, 552, 1683, 552, 552, 552, 1683, 552, 1683, 552, 552, 552, 552, 552, 552, 552, 552, 552, 552, 552, 50067)
    internal fun set_checksum() {
      checksum = ((tsleep_hours and 15) + (if (tsleep_pm) 8 else 0) + (tsleep_tens and 7)
                  + (twake_hours and 15) + (if (twake_pm) 8 else 0) + (twake_tens and 7)
                  + (tnow_hours and 15) + (if (tnow_pm) 8 else 0) + (tnow_tens and 7)
                  + (if (wake) 4 else 0) + (if (sleep) 2 else 0) + (if (power) 1 else 0) + (tnow_units and 15)
                  + (if (swing) 2 else 0) + (temperature and 15) + (fan and 3) * 4 + (mode and 3))
      checksum = checksum % 16
    }
    internal fun set_time() {
      val currentTime = Calendar.getInstance()
      tnow_hours = currentTime.get(Calendar.HOUR)
      tnow_pm = currentTime.get(Calendar.AM_PM) == Calendar.PM
      tnow_tens = currentTime.get(Calendar.MINUTE) / 10
      tnow_units = currentTime.get(Calendar.MINUTE) % 10
    }
    internal fun update_raw() {
      raw[35] = if ((checksum and 1) > 0) HIGH else LOW
      raw[37] = if ((checksum and 2) > 0) HIGH else LOW
      raw[39] = if ((checksum and 4) > 0) HIGH else LOW
      raw[41] = if ((checksum and 8) > 0) HIGH else LOW
      raw[43] = if ((mode and 1) > 0) HIGH else LOW
      raw[45] = if ((mode and 2) > 0) HIGH else LOW
      raw[47] = if ((fan and 1) > 0) HIGH else LOW
      raw[49] = if ((fan and 2) > 0) HIGH else LOW
      raw[51] = if ((temperature and 1) > 0) HIGH else LOW
      raw[53] = if ((temperature and 2) > 0) HIGH else LOW
      raw[55] = if ((temperature and 4) > 0) HIGH else LOW
      raw[57] = if ((temperature and 8) > 0) HIGH else LOW
      raw[61] = if (swing) HIGH else LOW
      raw[67] = if ((tnow_units and 1) > 0) HIGH else LOW
      raw[69] = if ((tnow_units and 2) > 0) HIGH else LOW
      raw[71] = if ((tnow_units and 4) > 0) HIGH else LOW
      raw[73] = if ((tnow_units and 8) > 0) HIGH else LOW
      raw[75] = if (power) HIGH else LOW
      raw[77] = if (sleep) HIGH else LOW
      raw[79] = if (wake) HIGH else LOW
      raw[83] = if ((tnow_tens and 1) > 0) HIGH else LOW
      raw[85] = if ((tnow_tens and 2) > 0) HIGH else LOW
      raw[87] = if ((tnow_tens and 4) > 0) HIGH else LOW
      raw[89] = if (tnow_pm) HIGH else LOW
      raw[91] = if ((tnow_hours and 1) > 0) HIGH else LOW
      raw[93] = if ((tnow_hours and 2) > 0) HIGH else LOW
      raw[95] = if ((tnow_hours and 4) > 0) HIGH else LOW
      raw[97] = if ((tnow_hours and 8) > 0) HIGH else LOW
      raw[99] = if ((twake_tens and 1) > 0) HIGH else LOW
      raw[101] = if ((twake_tens and 2) > 0) HIGH else LOW
      raw[103] = if ((twake_tens and 4) > 0) HIGH else LOW
      raw[105] = if (twake_pm) HIGH else LOW
      raw[107] = if ((twake_hours and 1) > 0) HIGH else LOW
      raw[109] = if ((twake_hours and 2) > 0) HIGH else LOW
      raw[111] = if ((twake_hours and 4) > 0) HIGH else LOW
      raw[113] = if ((twake_hours and 8) > 0) HIGH else LOW
      raw[115] = if ((tsleep_tens and 1) > 0) HIGH else LOW
      raw[117] = if ((tsleep_tens and 2) > 0) HIGH else LOW
      raw[119] = if ((tsleep_tens and 4) > 0) HIGH else LOW
      raw[121] = if (tsleep_pm) HIGH else LOW
      raw[123] = if ((tsleep_hours and 1) > 0) HIGH else LOW
      raw[125] = if ((tsleep_hours and 2) > 0) HIGH else LOW
      raw[127] = if ((tsleep_hours and 4) > 0) HIGH else LOW
      raw[129] = if ((tsleep_hours and 8) > 0) HIGH else LOW
    }
  }
}