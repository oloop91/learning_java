/*

author : oloop

*/

import java.awt.Color;

public class E_3_1_7
{

    public static boolean isWhite(Color c)
    {
        if (c.getRed() == 255 && c.getGreen() == 255 && c.getBlue() == 255)
        {
            return true;
        }
        return false;
    }
    
    public static int height(Picture p)
    {
        for( int col = 0; col < p.width(); col++)
            for ( int row = 0; row < p.height(); row++)
            {
                if ( !isWhite(p.get(col, row))) 
                {
                    return row;
                }
            }
        return p.height();
    }


    public static int width(Picture p)
    {
        for( int col = 0; col < p.width(); col++)
            for ( int row = 0; row < p.height(); row++)
            {
                if ( !isWhite(p.get(p.width() - 1 - col, row))) 
                {
                    return p.width() - 1 - col;
                }
            }
        return 0;
    }
    
    public static void bound_box(Picture p)
    {
        StdOut.printf("%5d, %5d\n", 0, p.height()-1);
        StdOut.printf("%5d, %5d\n", width(p), height(p) );


    }
    
    public static void main(String[] args)
    {
        Picture p = new Picture(args[0]);
        bound_box(p);
    }
}