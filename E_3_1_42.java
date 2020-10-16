/*

author : oloop

*/

public class E_3_1_42
{
    
    public static void Scale(String file_path, double s, int x, int y)
    {
        Picture old_p = new Picture(file_path);
        int w = 800; //old_p.width();
        int h = 800; //old_p.height();
        Picture p = new Picture(w, h);
        for ( int colT = 0; colT < w; colT++)
            for (int rowT = 0; rowT < h; rowT++)
            {
                int colS = (int) (x - ( w/2 - colT)/s);
                int rowS = (int) (y - ( h/2 - rowT)/s);
                p.set(colT, rowT, old_p.get(colS, rowS) );
            }
        p.show();
    }

    public static void main(String[] args)
    {
        double s = Double.parseDouble(args[1]);
        int x = Integer.parseInt(args[2]);
        int y = Integer.parseInt(args[3]);
        Scale(args[0], s, x, y);
    }
}