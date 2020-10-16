/*

author : oloop

*/

import java.awt.Color;

public class E_3_1_5
{
    public static void flip_horizontally(Picture p)
    {
        Picture new_p = new Picture(p.width(), p.height());
        for ( int col = 0; col < p.width(); col++)
            for ( int row = 0; row < p.height(); row++)
            {
                Color old = p.get(col, row);
                new_p.set(p.width() - 1 - col, row, old);
            }
        new_p.show();
    }
    
    public static void main(String[] args)
    {
        Picture p = new Picture(args[0]);
        flip_horizontally(p);
    }
}