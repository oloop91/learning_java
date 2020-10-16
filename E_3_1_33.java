/*

author : oloop

*/

import java.awt.Color;

public class E_3_1_33
{
    
    public static void AlbersSquare(double x, double y, double r1, double r2, Color c1, Color c2)
    {
        // first square should be larger one
        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(x,y,r1);
        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(x,y,r2);

        return;
    }

    public static void ColorStudy()
    {
        StdDraw.setXscale(-1,16);
        StdDraw.setYscale(-1,16);
        for (int i = 0; i < 16; i++)
            for ( int j = 15; j >=0 ; j--)
            {
                Color c1 = new Color(255 - (j*16 + i),255 - (j*16 + i),255);
                Color c2 = new Color(i*16 + j, i*16 + j, i*16 + j);
                AlbersSquare(i,j,0.5,0.25,c1,c2);
            }
        return;
    }

    public static void main(String[] args)
    {
        ColorStudy();
    }
}