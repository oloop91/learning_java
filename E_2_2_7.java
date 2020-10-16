/*

author : oloop

*/

public class E_2_2_7
{

    public static void gausplot(double mu, double sigma)
    {
        int n = 1000;
        double[] a = new double[n];
        for ( int i = 0; i < n; i++ )
        {
            a[i] = Gaussian.pdf(-10 + 20.0*i/n, mu, sigma);
        }

        StdStatsP.plotLines(a);
    }

    public static void explot(double lambda)
    {
        int n = 1000;
        double[] a = new double[n];
        for ( int i = 0; i < n; i++ )
        {
            double x = 10.0*i/n;
            a[i] = Math.exp( -x/lambda); 
        }

        StdStatsP.plotLines(a);
    }

    public static void plotMaxB(double sigma)
    {
        int n = 1000;
        int[] a = new int[n];
        int trials = 10000;
        for ( int t = 0; t < trials; t++ )
        {
            double x = StdRandomP.maxwellBoltzmann(sigma);
            int jar = (int) (x*50);
            if (jar < n)
                a[jar]++ ;
        }
        StdDraw.setYscale(0.0, trials/50.0);
        StdStatsP.plotBars(a);
    }

    public static void main(String[] args)
    {
        
        double sigma = Double.parseDouble(args[0]);
        plotMaxB(sigma);
        
        // double[] a = StdArrayIOP.readDouble1D();

        // for ( int i = 0; i < a.length; i++)
        //     explot( a[i] );


    }

}