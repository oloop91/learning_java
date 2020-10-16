/*

author : oloop

*/

public class E_2_3_15
{
    
    public static void bool(int n)
    {
        if ( n == 0) return;
        bool(n/2);
        StdOut.print(n%2);
    }
    
    public static void boolreverse(int n)
    {
        while ( n > 0)
        {
            StdOut.print(n%2);
            n = n/2;
        }
    }
    
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        // boolreverse(n);
        // StdOut.println();
        bool(n);
        StdOut.println();
    }
}