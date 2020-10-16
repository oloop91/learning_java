/*

author : oloop

*/

public class E_2_3_20
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

    public static String[] copy(String[] a)
    {
        String[] c = new String[a.length];
        for ( int i = 0; i < a.length; i++)
        {
            c[i] = a[i];
        }

        return c;
    }

    public static String[] add(String[] a, String[] b)
    {
        int m = a.length;
        int n = b.length;
        String[] c = new String[n+m];
        for ( int i = 0; i < m+n; i++)
        {
            if ( i < m ) c[i] = a[i];
            else c[i] = b[i-m];
        }
        return c;
    }




    public static String[] combination(String[] a, int k)
    {
        if (a.length == 0 || k == 0)
        {
            
            String c = "";
            String[] cc = {c};
            return cc;
        }
        if ( k == a.length) 
        {
            String c = "";
            for ( int i = 0; i < k; i++)
            {
                c += a[i];
            }
            String[] cc = {c};
            return cc;
        }

        String[] c = combination(remove(a,0),k);

        String[] b = combination(remove(a,0),k-1);

        String[] c1 = new String[b.length];
        for ( int i = 0; i < b.length; i++)
        {
            c1[i] = a[0] + b[i];
        }

        String[] cc = add(c, c1);
        return cc;

    }

    public static void comb(int n, int k)
    {
        String[] a = get_alphabets(n);
        String[] c = combination(a,k);
        for ( int i = 0; i < c.length; i++)
        {
            StdOut.println(c[i]);
        }
    }

 

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        comb(n,k);
    }




}