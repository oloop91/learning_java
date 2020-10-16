/*

author : oloop

*/

public class E_3_1_1
{
    public static String reverse(String a)
    {
        int n = a.length();
        char[] b = new char[n];

        for ( int i = 0; i < n; i++)
        {
            b[i] = a.charAt(n - 1 - i);
        }

        return new String(b);
    }

    public static void main(String[] args)
    {
        String a = args[0];
        StdOut.println(reverse(a));
    }
}