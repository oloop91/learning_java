/*

author : oloop

*/

public class hyperbolic
{
    
    public static double sinh(double x)
    {
        return (Math.exp(x) - Math.exp(-x))/2.0;       
    }

    public static double cosh(double x)
    {
        return (Math.exp(x) + Math.exp(-x))/2.0;
    }

    public static double tanh(double x)
    {
        return sinh(x)/cosh(x);
    }

    public static double coth(double x)
    {
        return cosh(x)/sinh(x);
    }

    public static double sech(double x)
    {
        return 1.0/cosh(x);
    }

    public static double csch(double x)
    {
        return 1.0 / sinh(x);
    }

    public static void main (String[] args)
    {
        double x = Double.parseDouble(args[0]);
        StdOut.printf("%5s : %.2f\n","sinh", sinh(x) );
        StdOut.printf("%5s : %.2f\n","cosh", cosh(x) );
        StdOut.printf("%5s : %.2f\n","tanh", tanh(x) );
        StdOut.printf("%5s : %.2f\n","coth", coth(x) );
        StdOut.printf("%5s : %.2f\n","sech", sech(x) );
        StdOut.printf("%5s : %.2f\n","csch", csch(x) );
        
        
        StdDraw.setYscale(-5,5);
        double[] a = new double[1000];
        double y = -5;
        for ( int i = 0; i < 1000; i++)
        {
            y = -5.0 + 10.0*i/1000.0;
            a[i] = sinh(y);
        }
        
        StdStats.plotLines(a);

    }

}