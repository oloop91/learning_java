/*

author : oloop

*/

public class E_2_3_22
{


    public static void squares(int n, double x, double y, double a)
    {
        if ( n == 0 ) return;
        
        
        
        squares( n - 1, x - a, y + a, a/2.2);
        squares( n - 1, x + a, y + a, a/2.2);
        

        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.filledSquare(x,y,a);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.005);
        StdDraw.square(x,y,a);

        squares( n - 1, x - a, y - a, a/2.2);
        squares( n - 1, x + a, y - a, a/2.2);
        

        

    }


    public static void main(String[]  args)
    {
        int n = Integer.parseInt(args[0]);
        squares(n,0.5,0.5,0.25);
    }
}