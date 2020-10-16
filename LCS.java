/*

author : oloop

*/

public class LCS
{
    public static String[] cutlist(String[] a, int x)
    {
        int n = a.length;
        String[] b = new String[n-x];
        for ( int i = x; i < n; i++)
        {
            b[i-x] = a[i];
        }
        return b;
    }

    public static String[] add_list(String[] a, String b)
    {
        int n = a.length + 1;
        String[] c = new String[n];
        c[0] = b;
        for ( int i = 1; i < n; i++)
        {
            c[i] = a[i-1];
        }
        return c;
    }

    public static int[] matchindex(String[] a, String[] b)
    {
        String k = a[0];
        int[] c = new int[2];
        c[0] = a.length - 1;
        c[1] = b.length - 1;
        for ( int i = 0; i < a.length; i++)
        {
            for ( int j = 0; j < b.length; j++)
            { 
                if ( a[i].equals(b[j]) ) 
                { 
                    c[0] = i;
                    c[1] = j;
                    return c;
                }
            }
        }
        return c;
    }

    public static String[] empty()
    {
        String[] c = new String[0];
        return c;
    }

    public static String[] lcs(String[] a, String[] b)
    {
        String[] c;
        if ( a.length == 0 || b.length == 0) return empty();
        
        int[] ai = matchindex(a,b);
        int[] bi = matchindex(b,a);

        // StdOut.println(a.length + " " + ai[0]);
        String[] al = lcs(cutlist(a,ai[0]+1), cutlist(b,ai[1]+1));
        String[] bl = lcs(cutlist(b,bi[0]+1), cutlist(a,bi[1]+1));
        
        if ( al.length >= bl.length ) return add_list(al, a[ai[0]]);
        else return add_list(bl, b[bi[0]]); 

    }

    public static void print_string(String[] a)
    {
        int n = a.length;
        for ( int i = 0; i < n; i++)
        {
            StdOut.print(a[i]);
        }
        StdOut.println();
    }



    public static void main(String[] args)
    {
        // String[] a = {"G", "G", "C","A", "C", "C", "A", "C", "G"};
        // String[] b = {"A", "C", "G", "G", "C", "G", "G", "A", "T", "A", "C", "G"};
        String[] a = { "A", "B", "C", "D", "G", "H"};
        String[] b = { "A", "E", "D", "F", "H", "R"};
        String[] l = lcs(a,b);
        print_string(l);
    }
}