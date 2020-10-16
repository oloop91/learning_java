/*

author : oloop

*/

public class E_2_3_17
{
    public static String[] get_alphabets(int n)
    {
        String[] a = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] c = new String[n];
        for ( int i = 0; i < n; i++)
        {
            c[i] = a[i];
        }
        return c;
    }

    public static int fact(int n)
    {
        if ( n == 1) return 1;
        return n * fact(n-1);
    }

    public static String[] remove(String[] a, int x)
    {
        int n = a.length;

        String[] c = new String[n-1];

        for ( int i = 0; i < n-1; i++)
        {
            if ( i < x) c[i] = a[i];
            else c[i] = a[i + 1];
        }

        return c;
    }

    public static String[] permuation(String[] a)
    {
        int n = a.length;
        if ( n == 1) 
        {
            String[] c = {a[0]};
            return c;
        }

        String[] c = new String[fact(n)];

        for ( int i = 0; i < n; i++)
        {
            String x = a[i];
            String[] b = permuation(remove(a,i));
            for ( int j = 0; j < b.length; j++ )
            {
                c[i*b.length + j] = a[i] + b[j];
            }

        }
        return c;

    }

    public static void perm( int n)
    {
        String[] a = get_alphabets(n);
        String[] c = permuation(a);
        for ( int i = 0; i < c.length; i++)
        {
            StdOut.println(c[i]);
        }
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        perm(n);
    }


}