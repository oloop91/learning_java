/*

author : oloop

*/

public class E_2_3
{

    public static boolean majority(boolean a, boolean b, boolean c)
    {
        return  (a & b) || (b & c) || ( a & c);
    }

    public static void main(String[] args)
    {
        boolean a = Boolean.parseBoolean(args[0]);
        boolean b = Boolean.parseBoolean(args[1]);
        boolean c = Boolean.parseBoolean(args[2]);

        StdOut.println(majority(a,b,c));
    }

}