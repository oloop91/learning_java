/*

author : oloop

*/

public class E_2_3_21
{

    public static String[] index(int n)
    {
        String[] c = new String[n];
        for ( int i = 0; i < n; i++)
        {
            c[i] = Integer.toString(i);
        }
        return c;
    }

    public static int[] string_toIntlist(String s)
    {
        int n = s.length();
        int[] c = new int[n];
        for ( int i = 0; i < n; i++)
        {
            c[i] = Character.getNumericValue(s.charAt(i));
        }
        return c;
    }

    public static String flip(String s, int[] index)
    {
        int n = s.length();
        int[] s1 = string_toIntlist(s);
        for ( int i = 0; i < index.length; i++)
        {
            if ( s1[index[i]] == 0 ) s1[index[i]] = 1;
            else s1[index[i]] = 0; 
        }
        String s2 = "";
        for ( int i = 0; i < n; i++)
        {
            s2 += Integer.toString(s1[i]);
        }

        return s2;
    }

    public static void hamming(int k, String s)
    {
        int n = s.length();
        String[] index = E_2_3_20.combination(index(n), k);
        for (int i = 0; i < index.length; i++)
        {
            int[] ind = string_toIntlist(index[i]);
            // StdOut.println(ind.length);
            StdOut.println(flip(s,ind));
        }
    }


    public static void main(String[] args)
    {
        int    k = Integer.parseInt(args[0]);
        String s = args[1];
        hamming(k,s); 
    }
}