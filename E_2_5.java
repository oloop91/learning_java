/*

author : oloop

*/

public class E_2_5
{
    public static boolean areTriangular(double a, double b, double c)
    {
        return (((a + b) > c) & ((b + c) > a) & ((a + c) > b));
    }

    public static void main(String[] args)
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        StdOut.println("are Triangular : " + areTriangular(a,b,c));
    }
}