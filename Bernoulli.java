/*

author : oloop

*/

public class Bernoulli
{

    public static int binomial(int n)
    {
        int heads = 0;
        for ( int i = 0; i < n ; i++)
        {
            if ( StdRandom.bernoulli(0.5)) heads++;
        }
        return heads;
    }

    public static int binomial(int n, double p)
    {
        int heads = 0;
        for ( int i = 0; i < n ; i++)
        {
            if ( StdRandom.bernoulli(p)) heads++;
        }
        return heads;
    }

    public static double[] p(int[] a, int t)
    {
        int n = a.length;
        double[] prob = new double[n];
        for ( int i = 0; i < n; i++)
        {
            prob[i] = 1.0*a[i]/t;
        }
        return prob;
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        int trials = Integer.parseInt(args[2]);

        double mean = n*p;
        double stddev = Math.sqrt(n*p*(1-p)) ;
        double[] phi = new double [n+1];
        for (int i = 0; i <= n; i++)
        {
            phi[i] = Gaussian.pdf(i, mean, stddev); 
        }
        // StdStats.plotLines(phi);
        
        
        // int[] freq = new int[n+1];
        // for ( int t = 0; t < trials; t++)
        // {
        //     freq[binomial(n)]++;
        // }

        // StdDraw.enableDoubleBuffering();
        // double[] freq = new double[n+1];
        // for ( int t = 0; t < trials; t++)
        // {
        //     int k = binomial(n);
        //     freq[k] += 1.0/trials;
        //     StdDraw.clear();
        //     StdStats.plotLines(phi);
        //     StdStats.plotBars(freq);
        //     StdDraw.show();
        // }

        StdDraw.enableDoubleBuffering();
        int[] freq = new int[n+1];
        for ( int t = 1; t < trials; t++)
        {
            int k = binomial(n,p);
            freq[k]++;
            StdDraw.clear();
            StdStats.plotLines(phi);
            StdStats.plotBars(p(freq,t));
            StdDraw.show();
        }

        // double[] norm = new double[n+1];
        // for ( int i = 0; i <= n; i++)
        // {
        //     norm[i] = (double) freq[i] / trials;
        //     // StdStats.plotBars(norm);
        // }
        // // StdStats.plotBars(norm);

        

        // double sumn = 0.0;
        // double sump = 0.0;
        // for ( int i = 0; i <= n; i++)
        // {
            // StdOut.printf("%.3f : %.3f\n", norm[i], phi[i]);
            // sumn += norm[i];
            // sump += phi[i];
            // StdOut.printf("%.3f : %.3f\n", freq[i], phi[i]);
            // sumn += freq[i];
            // sump += phi[i];
        // }

        // StdOut.println(sumn + " " + sump);






    }    

}