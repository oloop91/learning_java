/*

author : oloop

*/

public class E_3_1_15
{

    public static boolean isCircularShift(String s, String t)
    {
        String new_s = s+s;
        if (s.length() != t.length()) return false;

        if (new_s.indexOf(t) == -1 ) return false;
        else return true;

    }

    public static void main(String[] args)
    {
        StdOut.println(isCircularShift(args[0], args[1]));
    }
}