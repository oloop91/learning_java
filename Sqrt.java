/*

author : oloop

*/

public class Sqrt
{
    public static void main(String[] args)
    {
        double c = Integer.parseInt(args[0]);
        double epsilon = 1e-15;
        double t = c;
        while (Math.abs(t*t-c) > epsilon)
        {
            t = (t + c/t)/2.0;
        }
        System.out.println("Square root of "+ c + " is : " + t);
    }
}