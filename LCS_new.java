/*

author : oloop

*/

public class LCS_new
{
    private static int counter = 0;

    public static String[] cutlist(String[] a, int x)
    {
        // x is the index
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

    // public static int[] matchindex(String[] a, String[] b)
    // {
    //     String k = a[0];
    //     int[] c = new int[2];
    //     c[0] = a.length - 1;
    //     c[1] = b.length - 1;
    //     for ( int i = 0; i < a.length; i++)
    //     {
    //         for ( int j = 0; j < b.length; j++)
    //         { 
    //             if ( a[i].equals(b[j]) ) 
    //             { 
    //                 c[0] = i;
    //                 c[1] = j;
    //                 return c;
    //             }
    //         }
    //     }
    //     return c;
    // }

    public static String[] empty()
    {
        String[] c = new String[0];
        return c;
    }


    public static String[] lcs(String[] a, String[] b, String[] c)
    {
        counter++;
        // StdOut.println(counter);
        
        if ( a.length == 0 || b.length == 0 || c.length == 0) return empty();

        if (a[0].equals(b[0]) && a[0].equals(c[0]))
        {
            String[] cl = lcs(cutlist(a,1), cutlist(b,1), cutlist(c,1));
            return add_list(cl, a[0]); 
        }

        String[][] ml = new String[3][];

        ml[0] = lcs(cutlist(a,1), b, c);
        ml[1] = lcs(cutlist(b,1), a, c);
        ml[2] = lcs(cutlist(c,1), a, b);
        
        int m = getMaxIndex(ml[0].length, ml[1].length, ml[2].length);

        return ml[m];

    }

    public static int getMaxIndex(int a, int b, int c)
    {
        if ( a >= b && a>= c ) return 0;
        else if ( b >= a && b >= c) return 1;
        else return 2;
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
        String[] a = {"G", "G", "C","A", "C", "C", "A", "C", "G"};
        String[] b = {"A", "C", "G", "G", "C", "G", "G", "A", "T", "A", "C", "G"};
        String[] c = {"G", "G" , "X", "Y", "C"};
        // String[] a = { "A", "B", "C", "D", "G", "H"};
        // String[] b = { "A", "E", "D", "F", "H", "R"};
        String[] l = lcs(a,b,c);
        print_string(l);
        StdOut.println(counter);

    }
}