/*

author : oloop

*/

public class Rough
{

    public static String ex234(int n)
    {
        if (n <= 0) return "";
        return ex234(n-3) + n + ex234(n-2) + n;
    }

    public static void ex233(int n)
    {
        if (n <= 0) return;
        StdOut.println(n);
        ex233(n-2);
        ex233(n-3);
        StdOut.println(n);
    }

    public static void main (String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdOut.println(ex234(n));
    }

}