/*

author : oloop

*/

public class E_2_3_38
{
    public static int binomial(int n, int k )
    {
        if ( n < 0 ) return 0;
        else if ( k == 0 ) return 1;

        return binomial(n-1,k-1) + binomial(n-1,k);
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        StdOut.println(binomial(n,k));
    }
}