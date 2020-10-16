/*

author : oloop
Tree
*/

public class E_2_3_33
{

    public static double new_X(double x, double ang, double orientation, double s)
    {
        return x + s*Math.cos(ang+orientation);
    }

    public static double new_Y(double y, double ang, double orientation, double s)
    {
        return y + s*Math.sin(ang+orientation);
    }

    

    public static void Rtree(int n, double x, double y, double s, double a)
    {
        if ( n == 0 ) return;

        StdDraw.setPenRadius(0.02*s);

        StdDraw.line(x,y, new_X( x,Math.PI*5.0/6.0, a, s) , new_Y(y, Math.PI*5.0/6.0, a, s) );
        StdDraw.line(x,y, new_X( x,Math.PI*2.0/3.0, a, s) , new_Y(y, Math.PI*2.0/3.0, a, s) );
        StdDraw.line(x,y, new_X( x,Math.PI*1.0/5.0, a, s) , new_Y(y, Math.PI*1.0/5.0, a, s) );
        Rtree( n-1 , new_X( x,Math.PI*5.0/6.0, a, s) , new_Y(y, Math.PI*5.0/6.0, a, s), s*0.7 , a +  Math.PI*1.0/4.0);
        Rtree( n-1 , new_X( x,Math.PI*2.0/3.0, a, s) , new_Y(y, Math.PI*2.0/3.0, a, s), s*0.7 , a + Math.PI*1.0/6.0);
        Rtree( n-1 , new_X( x,Math.PI*1.0/5.0, a, s) , new_Y(y, Math.PI*1.0/5.0, a, s), s*0.7 , a - Math.PI*1.0/6.0);

    }


    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(-2.5,4);
        StdDraw.setYscale(0,5);
        double s = 1;
        Rtree(n, 0.5, s , s/1.5, 0); 
        
        StdDraw.filledRectangle(0.5, s/2.0, s/25.0,s/2.0);
    }
}