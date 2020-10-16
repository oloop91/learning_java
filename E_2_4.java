/*

author : oloop

*/

public class E_2_4
{
    public static boolean eq(int[] a, int[] b)
    {
        if ( a.length != b.length ) return false;
        for ( int i = 0; i < a.length; i++)
        {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main( String[] args)
    {
        int[] a = {1, 3, 4};
        int[] b = {1, 3, 4};
        int[] c = {1, 2, 4};
        StdOut.println(eq(a,b));
        StdOut.println(eq(b,c));
    }

}