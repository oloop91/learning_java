/*

author : oloop

*/

public class E_2_3_2
{
    public static double logfac(int n)
    {
        if ( n == 1) return 0;
        return Math.log(n) + logfac(n-1);
    }



    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdOut.println(logfac(n));
        
    }
}