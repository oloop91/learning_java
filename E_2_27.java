/*

author : oloop

*/

public class E_2_27
{
    public static double harmonicSmall(int n)
    {
        double sum = 0.0;
        for ( int i = 1; i <= n; i++)
        {
            sum += 1.0/i;
        }
        return sum;
    }

    public static double harmonicLarge(int n)
    {
        //approximation
        double term1 = Math.log(n);
        double term2 = 0.577215664901532; // Euler's constant
        double term3 = 1.0/(2*n);
        double term4 = -1.0/(12*n*n);
        double term5 = 1.0/(120*n*n*n*n);
        return term1 + term2 + term3 + term4 + term5;
    }

    public static double harmonic(int n)
    {
        if( n < 100 ) return harmonicSmall(n);
        else return harmonicLarge(n);
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        StdOut.println(harmonic(n));
    }
}