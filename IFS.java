/*

author : oloop

*/

public class IFS
{
    public static void main(String[] args)
    {   // Plot trials iterations of IFS on StdIn
        int trials = Integer.parseInt(args[0]);
        double[] dist = StdArrayIO.readDouble1D();
        double[][] cx = StdArrayIO.readDouble2D();
        double[][] cy = StdArrayIO.readDouble2D();
        double x = 0.0, y = 0.0;
        StdDraw.setXscale(-0.5,1.5);
        StdDraw.setYscale(0, 1.5);
        for ( int t = 0; t < trials ; t++ )
        {
            int r = StdRandom.discrete(dist);
            double x0 = cx[r][0]*x + cx[r][1]*y + cx[r][2];
            double y0 = cy[r][0]*x + cy[r][1]*y + cy[r][2];
            x = x0;
            y = y0;
            StdDraw.point(x,y);
        } 

    }
}