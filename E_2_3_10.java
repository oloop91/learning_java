/*

author : oloop

*/


/*

solution are 
i.   log2(n)
ii.  2n - 1
iii. nlog2(n)
iv.  2*n^2 -1 

*/

public class E_2_3_10
{
    public static double T(int n)
    {
        if ( n == 1) return 1.0;
        return 4* T(n/2) + 3;
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdOut.println(T(n));
    }
}