/*

author : oloop

*/

import java.awt.Color;

public class E_3_1_4
{

    public static int intensity(Color c)
    {
        int r = c.getRed();
        int g = c.getGreen();
        int b = c.getBlue();
        return (int) Math.round(0.299*r + 0.587*g + 0.114*b);
    }

    public static int max(int[] a)
    {
        int max  = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max ) max = a[i];
        }
        return max;
    }

    public static void histogram(int[] a)
    {
        StdDraw.setYscale(0.0, max(a) + 1);
        StdDraw.setXscale(-1, a.length);
        for (int i = 0; i < a.length; i++)
        {
            StdDraw.filledRectangle(i , a[i]/2.0, 0.25, a[i]/2.0 );
        }
        return;
    }

    public static void draw_histogram( Picture p )
    {
        int width = p.width();
        int height = p.height();
        int[] intensity_histogram = new int[256];
        for ( int col = 0; col < width; col++)
            for ( int row = 0; row < height; row++)
            {
                int i = intensity(p.get(col, row));
                intensity_histogram[i]++;
            }
        histogram(intensity_histogram);
        return;
    }

    public static void main(String[] args)
    {
        Picture p = new Picture(args[0]);
        draw_histogram(p);
    }
}