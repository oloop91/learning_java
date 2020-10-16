/*

author : oloop

*/

public class E_2_34
{

    public static double pdf(double x)
    {
        return Math.exp(-x*x/2) / Math.sqrt(2*Math.PI);
    }
    
    public static double cdf(double z)
    {
        if (z < -8.0) return 0.0;
        if (z > 8.0) return 1.0;
        double sum = 0.0;
        double term = z;
        for (int i = 3; sum != sum + term; i += 2)
        {
            sum = sum + term;
            term = term * z * z / i;
        }
        return 0.5 + pdf(z) * sum;
    }

    public static double general_cdf(double z, double mu, double sigma)
    {
        return cdf((z - mu)/sigma);
    }
    
    public static double log_fac(int n)
    {
        if ( n == 0 ) return 0;
        double sum = 0;
        for ( int i = 1; i <=n; i++)
        {
            double lg = Math.log(i);
            sum += lg;
        }

        return sum;
    }



    public static double binomial(int n, int k, double p)
    {
        // probability = p^k *(1-p)^(n-k) * n! / (k!* (n-k)!) - we will use log to prevent overflow
        
        double term1 = k * Math.log(p);
        double term2 = (n-k) * Math.log(1-p);
        double term3 = log_fac(n);
        double term4 = -log_fac(k) - log_fac(n-k);

        double x = term1 + term2 + term3 + term4;
        // System.out.println(term1 + " " + term2 + " " + term3 + " " + term4);

        return Math.pow(Math.E, x);
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);

        double sum = 0.0;
        for ( int k = 0; k <= n; k++ )
        {
            double b = binomial(n,k,p);
            double g_n = general_cdf(k,n*p,n*p*(1-p));
            sum += b;
            StdOut.printf("%3d : %4.3f, normal : %4.3f\n", k, b, g_n);
            // b is discrete pdf, g_n is continuous cdf
            
        }
        StdOut.println("sum : "+ sum);
        
        
    }

}