/*

author : oloop

*/

public class E_2_11
{
    public static int signum(int n)
    {
        if ( n < 0 ) return -1;
        else if ( n == 0 ) return 0;
        else return 1; 
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdOut.println(signum(n));
    }

}