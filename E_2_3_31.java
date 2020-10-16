/*

author : oloop

*/


import java.awt.Color;


public class E_2_3_31
{

    public static int get_random(double var)
    {
        int d = (int) StdRandom.gaussian(0,Math.sqrt(var));
        return d;
        // else return get_random(var);
    }
    
    public static void plasmacloud(double x, double y, double d, double var, double s, int b)
    {
        if ( d < 0.005)
        {
            // StdOut.println(b);
            StdDraw.setPenColor( new Color( 255 - b , 255 - b , 255 ));
            
            StdDraw.filledSquare(x,y,d);
            return;
        }
        int b1 = b + get_random(var);
        if ( b1 > 255 || b1 < 1) b1 = 128;
        plasmacloud( x - d/2.0, y - d/2.0, d/2.0, var/s, s, b1);

        // int b2 = b + get_random(var);
        // if ( b2 > 255 || b2 < 1) b2 = 128;
        plasmacloud( x - d/2.0, y + d/2.0, d/2.0, var/s, s ,  b1);

        // int b3 = b + get_random(var);
        // if ( b3 > 255 || b3 < 1) b3 = 128;
        plasmacloud( x + d/2.0, y - d/2.0, d/2.0, var/s, s,  b1 );

        // int b4 = b + get_random(var);
        // if ( b4 > 255 || b4 < 1) b4 = 128;
        plasmacloud( x + d/2.0, y + d/2.0, d/2.0, var/s, s,  b1 );

    }
    
    public static void main(String[] args)
    {
        double hurst = Double.parseDouble(args[0]);
        double var = 10000;
        double s = Math.pow(2, 2*hurst);
        plasmacloud(0.5,0.5,0.5,var,s,128);
    }

}