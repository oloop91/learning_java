/*

author : oloop

exercise : 3.2.10

*/


public class Rectangle1
{
    private final Interval x, y;

    public Rectangle1( double x0, double y0, double w, double h)
    {
        x = new Interval(x0 - w/2, x0 + w/2);
        y = new Interval(y0 - h/2, y0 + h/2);
    }

    public double area()
    {
        return x.length() * y.length();
    }

    public double perimeter()
    {
        return 2* (x.length() + y.length());
    }

    public boolean intersects(Rectangle1 b)
    {
        if (  x.intersects(b.x) && y.intersects(b.y))
        {
            return true;
        }

        return false;

    }

    public boolean contains(Rectangle1 b)
    {
        if( x.contains(b.x)  &&
            y.contains(b.y)   )
        {
            return true;
        }

        return false;
    }

    public void draw(Rectangle1 b)
    {
        StdDraw.rectangle( x.mean(),   y.mean()   , x.length()/2.0,   y.length()/2.0  );
        StdDraw.rectangle( b.x.mean(), b.y.mean() , b.x.length()/2.0, b.y.length()/2.0  );
    }

    public void draw()
    {
        StdDraw.rectangle( x.mean(),   y.mean()   , x.length()/2.0,   y.length()/2.0  );

    }

    public String toString()
    {
        return String.format("%4.2f, %4.2f, %4.2f, %4.2f",x.mean(),  y.mean()   , x.length() ,   y.length() );
    }

    public static void main(String[] args)
    {
        StdOut.println(new Rectangle1(0.5, 0.5, 0.25, 0.25));
    }
}
