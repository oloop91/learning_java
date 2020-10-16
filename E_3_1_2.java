/*

author : oloop

*/

import java.awt.Color;

public class E_3_1_2
{

    public static void picture256(Color color)
    {
        int width = 256;
        int height = 256;
        Picture p = new Picture(width, height);
        for ( int col = 0; col < width; col++)
            for (int row = 0; row < height; row++)
            {
                p.set(col, row, color);
            }
        p.show();
        return;
    }

    public static void main(String[] args)
    {
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        Color color = new Color(r, g, b);
        picture256(color);
    }
}