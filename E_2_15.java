/*

author : oloop

*/

public class E_2_15
{
    public static double angle(double d1, double a1, double d2, double a2)
    {
        d1 = Math.toRadians(d1);
        a1 = Math.toRadians(a1);
        d2 = Math.toRadians(d2);
        a2 = Math.toRadians(a2);
        double d = d2 - d1;
        double a = a2 - a1;

        double term1 = Math.pow(Math.sin(d/2),2);
        double term2 = Math.cos(d1) * Math.cos(d2) * Math.pow(Math.sin(a/2),2) ;

        double ang = 2 * Math.asin( Math.pow((term1 + term2),0.5));

        return Math.toDegrees(ang);
                                    
    }

    public static void main(String[] args)
    {
        double d1 = Double.parseDouble(args[0]);
        double a1 = Double.parseDouble(args[1]);
        double d2 = Double.parseDouble(args[2]);
        double a2 = Double.parseDouble(args[3]);

        StdOut.printf("%.3f\n",angle(d1, a1, d2, a2));
    }
}