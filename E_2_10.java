/*

author : oloop

*/

public class E_2_10
{
    public static int lg(int n)
    {
        int x = 1;
        int y = 0;
        while ( x <= n/2 )
        {
            x = x*2;
            y++;
        }
        return y;
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdOut.println(lg(n));
    }

}