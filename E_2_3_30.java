/*

author : oloop

Brownian Island

*/


public class E_2_3_30
{
    public static void curve(double x0, double y0,
                             double x1, double y1,
                             double var, double s )
    {
        if (Math.sqrt((x1 - x0)*(x1-x0) + (y1 - y0)*(y1-y0) ) < 0.01)
        {
            
            StdDraw.line(x0, y0, x1, y1);
            return;
        }
        double xm = (x0 + x1) / 2;
        double ym = (y0 + y1) / 2;
        double deltax = StdRandom.gaussian(0, Math.sqrt(var));
        double deltay = StdRandom.gaussian(0, Math.sqrt(var));
        // StdOut.printf("dx : %3.2f dy : #3.2f\n",deltax, deltay);
        curve(x0, y0, xm + deltax, ym + deltay, var/s, s);
        curve(xm + deltax, ym + deltay, x1, y1, var/s, s);
    }
    
    public static void main(String[] args)
    {
        double hurst = Double.parseDouble(args[0]);
        double s = Math.pow(2, 2*hurst);
        // curve(0.85, 0.85, 0.25, 0.25, 0.01, s);
        // curve(0.85, 0.85, 0.25, 0.25, 0.01, s);
        curve(0.5, 0.5, 0.52, 0.5, 0.1, s);
    }
}