/*

author : oloop

*/

public class E_2_17
{

    public static String[] reverse(String[] a)
    {
        String[] b = new String[a.length]; 

        for ( int i = 0; i < a.length; i++)
        {
            b[i] = a[a.length - 1 - i];
        }
        return b;
    }

    public static void reverseInplace(String[] a)
    {
        int n = a.length;
        for ( int i = 0; i < n/2; i++)
        {
            String temp = a[i];
            a[i] = a[n-1 - i];
            a[n-1 - i] = temp;
        }
    }

    public static void main(String[] args)
    {
        reverseInplace(args);
        for ( int i =0; i < args.length; i++)
        {
            StdOut.print(args[i] + " ");
        }
    }

}