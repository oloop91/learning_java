/*

author : oloop

*/

import java.awt.Color;

public class ColorMandelbrot
{
    public static int mand(Complex z0, int max)
    {
        Complex z = z0;
        for ( int t = 0; t < max; t++ )
        {
            if ( z.abs() > 2.0) return t;
            z = z.times(z).plus(z0);
        }
        return max;
    }

    public static Color[] readColor(String file_name)
    {
        In in = new In(file_name);
        int n = 256;
        Color[] c = new Color[n];
        for (int i = 0; i < n; i++)
        {
            c[i] = new Color(in.readInt(), in.readInt(), in.readInt());
        }
        return c;
        
    }

    public static void main(String[] args)
    {
        double xc   = Double.parseDouble(args[0]);
        double yc   = Double.parseDouble(args[1]);
        double size = Double.parseDouble(args[2]);

        int n = 512;
        Picture picture = new Picture(n, n);
        Color[] colors = readColor("mandel.txt");
        for ( int i = 0; i < n; i++)
            for ( int j = 0; j < n; j++)
            {
                double x0 = xc - size/2 + size*i/n;
                double y0 = yc - size/2 + size*j/n;
                Complex z0 = new Complex(x0, y0);
                int ci = mand(z0, 255);                
                Color c  = colors[ci];
                picture.set(i, n-1-j, c);
            }
        picture.show();
    }


}