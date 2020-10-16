/*

author : oloop

*/

public class E_3_1_37
{
    public static void Swirl(String file_path, double theta_swirl)
    {
        Picture old_p = new Picture(file_path);
        int w = old_p.width();
        int h = old_p.height();
        int ci = w/2;
        int cj = h/2;
        Picture p = new Picture(w, h);
        for ( int col = 0; col < w; col++)
            for ( int row = 0; row < h; row++)
            {
                int si = col;
                int sj = h -1 -row;
                double theta = theta_swirl + Math.PI/256.0*Math.sqrt( (si-ci)*(si-ci) + (sj - cj)*(sj-cj) );
                int ti = (int) ((si - ci)*Math.cos(theta) - (sj - cj)*Math.sin(theta) + ci);
                int tj = (int) ((si - ci)*Math.sin(theta) + (sj - cj)*Math.cos(theta) + cj);
                if (ti < w && tj < h && ti >=0 && tj >=0)
                    p.set(ti, h - 1 - tj, old_p.get(si, h - 1 - sj));
            }
        p.show();
    }

    public static void main(String[] args)
    {
        Swirl(args[0], Math.PI/300.0);
    }
}