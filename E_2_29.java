/*

author : oloop

*/

public class E_2_29
{
    public static double fspikes(int n, double t)
    {
        double sum = 0.0;
        for (int i = 1; i <=n; i++)
        {
            sum += Math.cos(i*t);
        }
        return sum/n;
    }

    public static void fdraw(double[] x, double[] y)
    {
        StdDraw.setXscale(-12, 12);
        StdDraw.setYscale(-1.2, 1.2);
        int n = x.length;
        for (int i = 0; i < n; i++)
        {
            StdDraw.point(x[i], y[i]);
        }
    }

    public static double[][] graph_points(int n, double lo, double hi, int points)
    {
        double[][] p = new double[2][points];

        for (int i = 0; i < points; i++)
        {
            p[0][i] = lo + (hi-lo)*i/points;
            p[1][i] = fspikes(n, p[0][i]);
        }

        return p;

    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        double lo = -10;
        double hi = 10;
        int points = 5000;

        double[][] p = graph_points(n, lo, hi, points);
        fdraw(p[0],p[1]);
    }

    
}
