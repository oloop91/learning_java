/*

author : oloop

*/

public class E_2_3_32
{

    public static int mcCarthy(int n)
    {
        if (n > 100) return n - 10;
        // StdOut.println(n);
        return mcCarthy(mcCarthy(n+11));
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdOut.println(mcCarthy(n));
    }
}