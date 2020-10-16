/*

author : oloop

*/

import java.awt.Color;

public class E_3_1_6
{
    public static void draw_3Colors(Picture p)
    {
        Picture newRed   = new Picture(p.width(), p.height());
        Picture newGreen = new Picture(p.width(), p.height());
        Picture newBlue  = new Picture(p.width(), p.height());

        for ( int col = 0; col < p.width(); col++)
            for ( int row = 0; row < p.height(); row++)
            {
                Color old = p.get(col, row);
                newRed.set(  col, row, new Color(old.getRed(),0,0));
                newGreen.set(col, row, new Color(0, old.getGreen(), 0));
                newBlue.set( col, row, new Color(0, 0, old.getBlue()));
                
            }

        newRed.show();
        newGreen.show();
        newBlue.show();

    }
    
    public static void main(String[] args)
    {
        Picture p = new Picture(args[0]);
        draw_3Colors(p);
    }
}