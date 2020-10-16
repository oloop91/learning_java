/*

author : oloop

*/

public class Htree
{

    public static void drawbranch(double x, double y, double h)
    {
        StdDraw.line( x - h/2.0 , y        , x + h/2.0, y        );
        StdDraw.line( x - h/2.0 , y - h/2.0, x - h/2.0, y + h/2.0);
        StdDraw.line( x + h/2.0 , y - h/2.0, x + h/2.0, y + h/2.0);

    }

    public static void drawTree(int n)
    {
        if ( n == 0 ) return;
        for ( int i = 0; i < Math.pow(2,n-1); i++ )
            for (int j = 0; j < Math.pow(2,n-1); j++)
            {
                double tpn = Math.pow(2,n);
                drawbranch( (2*i + 1) / tpn , (2*j + 1)/ tpn, 1/tpn);
                // StdOut.println(n + " " + i + " " + j);
                // StdDraw.pause(100);
            }
        drawTree(n-1);
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        drawTree(n);
    }
}