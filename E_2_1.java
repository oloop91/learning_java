/*

author : oloop

*/


public class E_2_1
{
    public static int max3(int a, int b, int c)
    {
        int max = a;
        if ( b > max ) max = b;
        if ( c > max ) max = c;
        return max;
    }

    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        StdOut.println(max3(a,b,c));
    }

}