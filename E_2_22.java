/*

author : oloop

*/

public class E_2_22
{
    public static boolean any(boolean[] a)
    {
        boolean flag = false;
        for ( int i = 0; i < a.length; i++)
        {
            flag = (flag || a[i]);
        }
        return flag;
    }

    public static boolean all(boolean[] a)
    {
        boolean flag = true;
        for ( int i = 0; i < a.length; i++)
        {
            flag = flag & a[i];
        }
        return flag;
    }

    public static void main(String[] args)
    {
        boolean[] a = StdIn.readAllBooleans();
        StdOut.println(all(a));
        StdOut.println(any(a));
    }
}