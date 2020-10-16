/*

author : oloop

*/

public class PlayThatTuneDeluxe
{
    public static double[] superpose(double[] a, double[] b, double awt, double bwt)
    {
        double[] c = new double[a.length];
        for ( int i = 0;i < a.length; i++)
        {
            c[i] = a[i]*awt + b[i] * awt;
        }
        return c;
    }

    public static double[] tone(double hz, double t)
    {
        int SAMPLING_RATE = 44100;
        int n = (int) (SAMPLING_RATE * t);
        double[] a = new double[n+1];
        for ( int i = 0; i <= n; i++)
        {
            a[i] = Math.sin(2 * Math.PI * i * hz/ SAMPLING_RATE);
        }
        return a;
    }

    public static double[] note(int pitch, double t)
    {
        double hz = 440 * Math.pow(2, pitch / 12.0);
        double[] a  = tone(hz   , t);
        double[] hi = tone(2*hz , t);
        double[] lo = tone(hz/2 , t);
        double[] h = superpose(hi, lo, 0.5, 0.5);
        return superpose(a, h, 0.5, 0.5);
    }

    public static void main(String[] args)
    {
        while(!StdIn.isEmpty())
        {
            int pitch = StdIn.readInt();
            double duration = StdIn.readDouble();
            double[] a = note(pitch, duration);
            StdAudio.play(a);
        }
    }




}