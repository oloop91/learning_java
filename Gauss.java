/*

author : oloop
E_2_2_17

*/

public class Gauss
{
    public static double gaussianBM()
    {
        double v = Math.random();
        double u = Math.random();
        double pi = Math.PI;
        double r = Math.sin(2 * pi *  v) * Math.sqrt(- 2 * Math.log(u));
        return r;
    }

    public static double gaussianM()
    {
        double r, x, y;
        do
        {
            x = StdRandomP.uniform(-1.0, 1.0);
            y = StdRandomP.uniform(-1.0, 1.0);
            r = x*x + y*y;
        } while (r >= 1 || r == 0);
        return x * Math.sqrt(-2 * Math.log(r) / r);
    }

    

    public static double[] g(int m, int trials)
    {
        int n = 1000; // intervals
        double[] a = new double[n];
        for ( int t = 1; t < trials; t++ )
        {
            double r = 0;
            if ( m == 0 ) r = gaussianM();
            else if ( m == 1) r = gaussianBM();
            
            double lo = -5;
            double hi = 5;
            
            if ( r > lo & r < hi)
            { 
                int i = (int) (n * ( (r  - lo ) / (hi - lo)));
                a[i] += 1.0/trials;
            }
        }
        return a;
    }

    public static void main(String[] args)
    {
        int trials = Integer.parseInt(args[0]);
        // double[] BM = g(1,trials);
        // double[] M = g(0,trials);
        // double m = StdStatsP.max(BM);
        // StdDraw.setYscale(0,m*2);
        // StdStatsP.plotBars(BM,0);
        // StdStatsP.plotBars(M,m);

        StdOut.println(trials);
        for ( int i = 0; i < trials; i++)
        {   
            StdOut.println(gaussianM());
        }
    }

}