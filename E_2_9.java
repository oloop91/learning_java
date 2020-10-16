/*

author : oloop

*/

public class E_2_9
{
    public static double lg(double n)
    {
        return Math.log(n)/Math.log(2);
    }

    public static void main(String[] args)
    {
        double n = Double.parseDouble(args[0]);
        StdOut.println(lg(n));
    }

}