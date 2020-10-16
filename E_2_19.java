/*

author : oloop

*/

public class E_2_19
{
    public static int[] histogram(int[] a, int m)
    {
        int[] b = new int[m];
        for ( int i = 0; i < a.length; i++)
        {
            b[a[i]]++;
        }
        return b;
    }

    public static void main(String[] args)
    {
        int m = StdIn.readInt();
        int[] a = StdIn.readAllInts();
        int[] b = histogram(a, m);

        for ( int i = 0; i < m; i++)
        {
            StdOut.println(b[i]);
        }
    }

}