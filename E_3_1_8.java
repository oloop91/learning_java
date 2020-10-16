/*

author : oloop

*/

import java.awt.Color;

public class E_3_1_8
{
    
    public static boolean isPixelCompatible(Color c1, Color c2)
    {

        if ( Math.abs( intensity(c1) - intensity(c2) ) >= 128)
        {
            return true;
        }
        return false;
    }

    public static double intensity(Color c)
    {
        int r = c.getRed();
        int g = c.getGreen();
        int b = c.getBlue();
        return 0.299*r + 0.587*g + 0.114*b;
    }

    public static boolean isCompatible(Picture p, Color c, int col1, int row1, int col2, int row2)
    {
        for ( int col = col1; col < col2; col++)
            for( int row = row1; row < row2; row++)
            {
                if ( !isPixelCompatible(p.get(col, row),c))
                {
                    Color m = p.get(col, row);
                    // StdOut.printf("%4d %4d %4d\n", m.getRed(), m.getGreen(), m.getBlue());
                    // StdOut.println(c);
                    return false; 
                }
            }
        return true;
    }

    public static void main(String[] args)
    {
        Picture p = new Picture(args[0]);
        int col1 = Integer.parseInt(args[1]);
        int row1 = Integer.parseInt(args[2]);
        int col2 = Integer.parseInt(args[3]);
        int row2 = Integer.parseInt(args[4]);
        while (!StdIn.isEmpty())
        {
            int r = StdIn.readInt();
            int g = StdIn.readInt();
            int b = StdIn.readInt();
            Color c = new Color(r, g, b);
            boolean a = isCompatible(p, c, col1, row1, col2, row2);
            StdOut.println(a);
        }
    }
}