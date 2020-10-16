/*

author : oloop

*/

public class E_2_31
{
    public static double evaluate(double x, double[] p)
    {
        int n = p.length;
        double sum = p[n-1];
        for ( int i = n-2; i >= 0; i-- )
        {
            sum = x * (sum);
            sum = p[i] + sum;
        }
        return sum;
    }

    public static double exp(double x)
    {
        int n = 11; // total terms
        double[] p = new double[n];
        p[0] = 1;
        double mul = 1.0;
        for ( int i =1; i < n; i++)
        {
            mul = i*mul;
            p[i] = 1.0/mul;
        }
        return evaluate(x, p);
    }



    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        StdOut.printf("%.3f\n",exp(x));
    }
}