/*

author : oloop

*/

public class E_2_3_24
{

    private static String s = "0000";

    public static void print_code(String a, int n, boolean enter)
    {
        char[] aa  = new char[a.length()];
        for ( int i = 0; i < a.length(); i++)
        {
            aa[i] = a.charAt(i);
        }
        if (enter) aa[n-1] = "1".charAt(0);
        else aa[n -1] = "0".charAt(0);

        String c = "";
        for (int i = 0; i < aa.length; i++)
        {
            c += Character.toString(aa[i]);
        }
        
        s = c;
        StdOut.println(c);
    }

    public static void gray_code(int n, boolean enter)
    {
        if ( n == 0) return;
        gray_code(n-1, true);
        print_code(s, n, enter);
        gray_code(n-1, false);
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        gray_code(n, true);
    }

}