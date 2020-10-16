/*

author :oloop

*/

public class RandomWalk
{
    public static double[] gaussGap(int n, double sigma)
    {
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        double x = 0.0;
        for ( int i = 0; i < n; i++)
        {
            // double r = StdRandom.gaussian(0,sigma);
            boolean r = StdRandomP.bernoulli();
            double r1 = 0;
            if (r) r1 = 1;
            else  r1 = -1;
            
            x += r1;

            if ( max < x ) max = x;
            if ( min > x) min = x;
        }
        double[] s = {max, min};
        return s;
    }

    public static void printstats( double sigma)
    {
        for ( int i = 1000; i < 11000; i += 1000 )
        {
            double[] gg = gaussGap(i,sigma);
            double g = gg[0] - gg[1];
            double mx = gg[0];
            double mi = gg[1];
            StdOut.printf("interval : %4d, gap : %5.2f, gap/sqrt(n) : %5.2f\n", i, g, g/Math.sqrt(i/100.0));
            StdOut.printf("max : %5.2f, min : %5.2f\n", mx, mi);
        }
    }

    public static void main(String[] args)
    {
        double sigma = Double.parseDouble(args[0]);
        printstats(sigma);

    }

}