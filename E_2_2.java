/*

author : oloop

*/

public class E_2_2
{
    public static boolean odd(boolean a, boolean b, boolean c)
    {
        boolean flag = false;
        if (a) flag = flag^a;
        if (b) flag = flag^b;
        if (c) flag = flag^c;
        return flag;
    }

    public static void main(String[] args)
    {
        boolean a = Boolean.parseBoolean(args[0]);
        boolean b = Boolean.parseBoolean(args[1]);
        boolean c = Boolean.parseBoolean(args[2]);

        StdOut.println(odd(a,b,c));
    }

}