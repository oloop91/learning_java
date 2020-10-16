/*

author : oloop

*/

public class PercolationProbability
{
    public static double estimate(int n, double p, int trials)
    {
        // Generate trials random n by n systems; return 
        // empirical percolation probability estimate
        int count = 0;
        for( int t = 0; t < trials; t++)
        {
            boolean[][] isOpen = Percolation.random( n, p );
            // if ( Percolation.percolates(isOpen) && (!PercolationDirected.percolates(isOpen))) 
            // {
            //     count++;
            // }
            if ( Percolation.percolates(isOpen) count++;

        }
        return (double) count / trials;
    }

    public static double estimate_new(double x)
    {
        return 0.5 * (Math.sin(x) + Math.cos(10 * x));
    }


    public static double estimate_depth(int n, double p, int trials)
    {
        // Generate trials random n by n systems; return 
        // empirical percolation probability estimate
        int count = 0;
        for( int t = 0; t < trials; t++)
        {
            boolean[][] isOpen = Percolation.random( n, p );
            count += Percolation.depth(isOpen);
        }
        return (double) count / (trials);
    }

    public static double estimate_bernoulli(int n, double p, int trials)
    {
        // Generate trials random n by n systems; return 
        // empirical percolation probability estimate
        int count = 0;
        for( int t = 0; t < trials; t++)
        {
            int heads = 0;
            for ( int i = 0; i < n; i++)
                if (StdRandom.bernoulli(0.5)) heads++;
            if (heads == (int) (p*n)  ) count++; 
        }
        return (double) count / (trials);
    }




    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        int trials = Integer.parseInt(args[2]);
        double q = estimate( n, p, trials);
        StdOut.println(q);
    }
}