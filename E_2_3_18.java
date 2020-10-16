/*

author : oloop

*/

public class E_2_3_18
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



    public static String insert(String s, String s1, int k )
    {
        int n = s.length();
        char[] a = new char[n+1];
        for (int i = 0; i < n+1; i++)
            if ( i < k) a[i] = s.charAt(i);
            else if ( i == k) a[i] = s1.charAt(0);
            else a[i] = s.charAt(i-1);
        
        return new String(a);

    }



    public static String[] permutation(String[] a, int k)
    {
        if ( k == 1 || a.length == 1 || k == 0)
        {
            String[] c = new String[a.length];
            for ( int i = 0; i < a.length; i++)
            {
                c[i] = a[i];
            }
            if ( k == 1) return c;
            if ( k == 0) return new String[0];
        }
        
        if ( k == a.length ) return permutation(a);

        String[] c1 = permutation(remove(a,0),k);

        String[] c2 = permutation(remove(a,0), k-1);

        String[] c3 = new String[c2.length*(c2[0].length() + 1)];

        for ( int i = 0; i < c2[0].length() + 1; i++)
            for ( int j = 0; j < c2.length; j++)
            {
                
                c3[i*c2.length + j] = insert(c2[j],a[0],i);

            }
        
        String[] c = add(c1,c3);

        return c;


    }



    public static String[] permutation(String[] a)
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
            String[] b = permutation(remove(a,i));
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
        String[] c = permutation(a);
        for ( int i = 0; i < c.length; i++)
        {
            StdOut.println(c[i]);
        }
    }
    
    public static void perm( int n, int k)
    {
        String[] a = get_alphabets(n);
        String[] c = permutation(a,k);
        for ( int i = 0; i < c.length; i++)
        {
            StdOut.println(c[i]);
        }
    }


    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        perm(n,k);
    }


}