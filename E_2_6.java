/*

author : oloop

*/

public class E_2_6
{
    public static double sigmoid(double x)
    {
        return (1.0/ (1 + Math.pow(Math.E, -x)));
    }

    public static void main(String[] args)
    {
        double x = Double.parseDouble(args[0]);
        StdOut.println(sigmoid(x));
    }
}