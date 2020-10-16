/*

author : oloop

*/

public class E_2_28
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
    
    public static double Black_Scholes(double s, double x, double r, double sigma, double t)
    {
        // s : current stock price
        // x : exercise price
        // r :continuously compounded risk free interest rate
        // sigma : volatility
        // t : time in years
        double a = ( Math.log(s/x) + (r + sigma*sigma/2)*t ) / (sigma * Math.sqrt(t));
        double b = a - sigma*Math.sqrt(t);
        
        return s*cdf(a) - x*Math.pow(Math.E, -r*t)*cdf(b);

    }

    public static void main(String[] args)
    {
        double s     = Double.parseDouble(args[0]);
        double x     = Double.parseDouble(args[1]);
        double r     = Double.parseDouble(args[2]);
        double sigma = Double.parseDouble(args[3]);
        double t     = Double.parseDouble(args[4]);

        StdOut.println(Black_Scholes(s,x,r,sigma,t));
        

    }
}