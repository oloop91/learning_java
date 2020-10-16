/*

author : oloop

*/

public class Point
{
    private final double x,y;

    public Point(double x0, double y0)
    {
        x = x0;
        y = y0;
    }

    public double distanceTo(Point b)
    {
        return Math.sqrt( (x-b.x)* ( x- b.x) + (y-b.y) * (y- b.y));
    }

    public String toString()
    {
        return String.format("[ %5.2f, %5.2f ]",x,y);
    }

    public static void main(String[] args)
    {
        StdOut.println(new Point(3.4,4.4));
        StdOut.println((new Point(3,4)).distanceTo(new Point(0,0)));
    }

}