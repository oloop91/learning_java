/*

author : oloop

*/

public class E_3_1_35
{
    
    public static void tileIt(String file_path, int w, int h)
    {
        Picture old_p = new Picture(file_path);
        int old_w = old_p.width();
        int old_h = old_p.height();
        Picture p = new Picture(w,h);
        for ( int col = 0; col < w; col++)
            for ( int row = 0; row < h; row++)
            {
                p.set( col, row , old_p.get(col%old_w, row%old_h) );
            }
        p.show();
        return;
    }

    public static void main(String[] args)
    {
        int w = Integer.parseInt(args[1]);
        int h = Integer.parseInt(args[2]);
        tileIt(args[0],w,h);
    }
}