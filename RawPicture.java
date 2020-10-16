/*

author : oloop

E_3_1_29

*/

import java.awt.Color;

public class RawPicture
{
    public static void write(Picture picture, String file_path)
    {
        Out out = new Out(file_path);
        out.println(picture.width() + " " + picture.height());
        for ( int row = 0; row < picture.height(); row++)
            for ( int col = 0; col < picture.width(); col++)
            {
                Color c = picture.get(col, row);
                out.printf("%4d %4d %4d\n",c.getRed(), c.getGreen(), c.getBlue());
            }
        return;
    }

    public static Picture read(String file_path)
    {
        In in = new In(file_path);
        int w = in.readInt();
        int h = in.readInt();
        Picture picture = new Picture(w, h);
        for ( int row = 0; row < h; row++)
            for (int col = 0; col < w; col++)
            {
                Color c = new Color(in.readInt(), in.readInt() ,in.readInt() );
                picture.set(col, row, c);
            }
        return picture;
    }

    public static void main(String[] args)
    {
        String file = args[0];
        write(new Picture("./introcs-data/darwin.jpg"),file);
        Picture p = read(file);
        p.show();

    }
}