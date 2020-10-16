/*

author : oloop

*/

public class StopWatch_p
{
    private long start;
    private double elapsed_time;

    public StopWatch_p()
    {
        start = System.currentTimeMillis();
        elapsed_time = 0;
    }

    public double elapsedTime()
    {
        long now = System.currentTimeMillis();
        return ( elapsed_time + now - start) / 1000.0;
    }
    // exercise 3.2.12

    public void stop()
    {
        elapsed_time = elapsedTime();
    }

    public void restart()
    {
        start = System.currentTimeMillis();
    }


    public static void main(String[] args)
    {
        //Compute and time computation using Math.sqrt()
        int n = Integer.parseInt(args[0]);
        StopWatch_p timer1 = new StopWatch_p();
        double sum1 = 0.0;
        for (int i = 0; i < n; i++)
        {
            sum1 += Math.sqrt(i);
        }
        double time1 = timer1.elapsedTime();
        StdOut.printf("%e (%.2f seconds)\n", sum1, time1);

        // Compute and time computation using Math.pow();
        StopWatch_p timer2 = new StopWatch_p();
        double sum2 = 0.0;
        for ( int i = 0 ; i < n; i++)
        {
            sum2 += Math.pow(i,0.5);
        }
        double time2 = timer2.elapsedTime();
        StdOut.printf("%e (%.2f seconds)\n", sum2, time2);
    
    }
}