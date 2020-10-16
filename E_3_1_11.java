/*

author : oloop

*/

public class E_3_1_11
{
    public static String complementWatsonCrick(String s)
    {
        s = s.replace("A", "-");
        s = s.replace("T", "A");
        s = s.replace("-", "T");
        s = s.replace("C", "-");
        s = s.replace("G", "C");
        s = s.replace("-", "G");

        return s;
        
    }

    public static String reverse(String s)
    {
        int n = s.length();
        char[] a = new char[n];
        for ( int i = 0; i< n; i++)
        {
            a[n-1-i] = s.charAt(i);
        }

        return new String(a);
    }
    
    public static boolean isWatsonCrickPalindrome(String s)
    {
        return s.equals(reverse(complementWatsonCrick(s)));
    }


    public static void main(String[] args)
    {
        StdOut.println(isWatsonCrickPalindrome(args[0]));
    }
}