/*

author : oloop

*/

public class StdRandomP
{
    public static int uniform( int n )
    {
        return (int) (Math.random()*n);
    }

    public static double uniform(double lo, double hi)
    {
        return lo + Math.random() * (hi - lo);
    }

    public static boolean bernoulli(double p)
    {
        return Math.random() < p;
    }

    public static boolean bernoulli()
    {
        return bernoulli(0.5);
    }

    public static double pdf (double x)
    {
        return Math.exp(-x*x/2) / Math.sqrt(2*Math.PI);
    }

    public static double cdf (double z)
    {
        if ( z < -8.0 ) return 0.0;
        if ( z >  8.0 ) return 1.0;
        double sum = 0.0;
        double term = z;
        for ( int i = 3; sum != sum + term; i+= 2)
        {
            sum = sum + term;
            term = term * z * z / i; 
        }
        return 0.5 + pdf(z) * sum; 
        // taylor series expansion is very useful in terms
        // of calculating mathematical function computationally. 
    }

    public static double gaussian()
    {
        int n = 10000;
        while (true)
        { 
            double r = Math.random();
            for ( int i = 0; i < n; i++)
            {
                double z = -8.0 + 1.0*i/n*16;
                double x = cdf(z);
                if ( x > r ) return z;
            }
        }
        
    }

    public static double gaussian(double mu, double sigma)
    {
        return mu + sigma * gaussian();
    }

    public static int discrete(double[] probabilities)
    {
        int n = probabilities.length;
        while (true)
        { 
            double r = Math.random();
            double sum = 0.0;
            for (int j = 0; j < n; j++)
            { // Find interval containing r.
                sum += probabilities[j];
                if (sum > r) return j; 
            }    
        }
    }

    public static void shuffle(double[] a)
    {
        int n = a.length;
        for ( int i = 0; i < n; i++)
        {
            int r = i + uniform(n-i);
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static void shuffle(int[] a)
    {
        int n = a.length;
        for ( int i = 0; i < n; i++)
        {
            int r = i + uniform(n-i);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static void shuffle(String[] a)
    {
        int n = a.length;
        for ( int i = 0; i < n; i++)
        {
            int r = i + uniform(n-i);
            String temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static double exp(double lambda)
    {
        return -1.0 * Math.log(Math.random()/lambda);

    }

    public static double maxwellBoltzmann(double sigma)
    {
        double x = gaussian(0, sigma);
        double y = gaussian(0, sigma);
        double z = gaussian(0, sigma);

        return Math.sqrt(x*x + y*y + z*z);
    }

    

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        // double[] probabilities = { 0.5, 0.3, 0.1, 0.1 };
        // for (int i = 0; i < n; i++)
        // {
        //     StdOut.printf(" %2d " , uniform(100));
        //     StdOut.printf("%8.5f ", uniform(10.0, 99.0));
        //     StdOut.printf("%5b " , bernoulli(0.5));
        //     StdOut.printf("%7.5f ", gaussian(9.0, 0.2));
        //     StdOut.printf("%2d " , discrete(probabilities));
        //     StdOut.println();
        // }

        double[] a = new double[n];
        int[] count = new int[n];
        double sum = 0.0;

        for ( int i = 0; i < n; i++ )
        {
            a[i] = Math.random();
            sum += a[i];
        }

        for ( int i = 0; i < n; i++ )
        {
            a[i] = a[i]/sum;
        }

        int trials = Integer.parseInt(args[1]);

        for ( int t = 0; t < trials; t++)
        {
            int w = discrete(a);
            count[w]++;
        }

        double csum = 0.0;
        for ( int i = 0; i < n; i++)
        {
            StdOut.printf("%3d : %.3f : %.3f\n", i,a[i], 1.0*count[i]/trials);
            csum += 1.0*count[i]/trials;
        }

        StdOut.println(csum);



    }



}