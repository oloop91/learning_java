/*

author : oloop

*/

import java.awt.Color;

public class Luminance
{
    public static double intensity(Color color)
    {
        // Monochrome luminance of color
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
        return 0.299*r + 0.587*g + 0.114*b;
    }

    public static Color toGray(Color color)
    {
        // Use luminance to convert to greyscale
        int y = (int) Math.round(intensity(color));
        Color gray = new Color( y, y, y );
        return gray;
    }

    public static boolean areCompatible(Color a, Color b)
    {
        // True if colors are compatible
        return Math.abs(intensity(a) - intensity(b) ) >= 128.0;
    }

    public static void main(String[] args)
    {
        //Are two specified RGB color compatitble?
        int[] a = new int[6];
        for ( int i = 0; i < 6; i++)
            a[i] = Integer.parseInt(args[i]);
        Color c1 = new Color(a[0], a[1], a[2]);
        Color c2 = new Color(a[3], a[4], a[5]);
        // StdOut.println(intensity(c1));
        // StdOut.println(intensity(c2));
        StdOut.println(areCompatible(c1, c2));
    }

}