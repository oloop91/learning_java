/*

author : oloop

*/

public class PercolationPlot
{
    public static void curve(int n, double x0, double y0,
                                    double x1, double y1)
    {
        double gap = 0.01;
        double err = 0.0025;
        int trials = 10000;
        double xm = (x0 + x1)/2.0;
        double ym = (y0 + y1)/2.0;
        double fxm = PercolationProbability.estimate( n, xm, trials );
        // double fxm = PercolationProbability.estimate_new( xm );
        // double fxm = PercolationProbability.estimate_bernoulli( n, xm, trials );


        if ( x1 - x0 < gap || Math.abs(ym - fxm) < err )
        {
            StdDraw.line(x0,y0,x1,y1);
            return;
        }
        curve(n, x0, y0, xm, fxm);
        StdDraw.filledCircle( xm,fxm, 0.005 );
        // StdOut.println(xm + " : " + fxm);
        curve(n, xm, fxm, x1, y1);
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdDraw.line(0.593,0, 0.593,1);
        // StdDraw.setYscale(0,0.2);
        curve(n, 0.0, 0.0, 1.0, 1.0);
    }

}