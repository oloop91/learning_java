/*

author : oloop

exercise : 3.2.8

*/

public class Interval
{
    private final double min, max;

    public Interval(double mn, double mx)
    {
        min = mn;
        max = mx;
    }

    public double mean()
    {
        return (min + max)/2.0;
    }

    public double length()
    {
        return max - min;
    }

    public boolean contains(double x)
    {
        return x >= min && x <= max;
    }

    public boolean contains(Interval b)
    {
        return (contains(b.min) && contains(b.max)) && b.min < b.max;
    }

    public boolean intersects(Interval b)
    {
        return (contains(b.min) || contains(b.max)) && b.min < b.max;
    }

    public String toString()
    {
        return "[ " + String.format("%5.2f",min) + " : " + String.format("%5.2f",max) + " ]";
    }

    public static void main(String[] args)
    {
        // for (int i = 0; i < 1000; i++)
        // {
        //     StdOut.println(StdRandom.uniform(0.0, 5.0) + " " + StdRandom.uniform(0.0, 5.0));
        // }

        double x = Double.parseDouble(args[0]);
        int n = StdIn.readInt();
        for ( int i = 0; i < n; i++)
        {
            Interval i1 = new Interval(StdIn.readDouble(), StdIn.readDouble());
            if ( i1.contains(x))
            {
                StdOut.println(i1);
            }
        }        
    }
}