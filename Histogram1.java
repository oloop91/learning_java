/*

author : oloop

*/

public class Histogram1
{
    
    public static double[] sample(int n)
    {
        double[] a = new double[n];

        for ( int i = 0; i < n; i++)
        {
            a[i] = Gauss.gaussianM();
        }
        return a;
    }


    public static double[] hist(double[] h, double lo, double hi, int n)
    {   // n : no. of intervals, lo & hi are the limits

        double[] a = new double[n];
        int l = h.length;
        for ( int i = 1; i < l; i++ )
        {
            double r = h[i];
            if ( r > lo & r < hi)
            { 
                int k = (int) (n * ( (r  - lo ) / (hi - lo)));
                a[k] += 1.0/l;
            }
        }
        return a;

    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);

        double[] a = StdArrayIOP.readDouble1D();
        double[] h = hist(a, lo, hi, n);
        
        StdStatsP.plotBars(h);


    }

}