/*

author : oloop

*/

public class E_2_7
{
    public static double sqrt(double x)
    {
        double y = x;
        double acc = 0.001;
        while ( Math.abs(y*y - x) > acc )
        {
            y = (x/y + y) / 2.0;
        }
        return y;
    }

    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        StdOut.printf("%.2f\n",sqrt(x));
    }

}