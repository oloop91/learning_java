/*

author : oloop

exercise : 3.2.36

*/

public class Quaternions
{
    private final double a0,a1,a2,a3;

    public Quaternions(double x0, double x1, double x2, double x3)
    {
        a0 = x0;
        a1 = x1;
        a2 = x2;
        a3 = x3;
    }

    public double magnitude()
    {
        return Math.sqrt( a0*a0 + a1*a1 + a2*a2 + a3*a3 );
    }

    public Quaternions conjugate()
    {
        return new Quaternions(a0, -a1, -a2, -a3);
    }

    public Quaternions inverse()
    {
        double m = magnitude();
        return new Quaternions( a0/m, a1/m, a2/m, a3/m);
    }

    public Quaternions sum(Quaternions b)
    {
        return new Quaternions(a0 + b.a0, a1 + b.a1, a2 + b.a2, a3 + b.a3);
    }

    public Quaternions product(Quaternions b)
    {
        return new Quaternions( a0*b.a0 - a1*b.a1 - a2*b.a2 - a3*b.a3, 
                            a0*b.a1 - a1*b.a0 + a2*b.a3 - a3*b.a2, 
                            a0*b.a2 - a1*b.a3 + a2*b.a0 + a3*b.a1, 
                            a0*b.a3 + a1*b.a2 - a2*b.a1 + a3*b.a0);
    }

    public Quaternions quotient(Quaternions b)
    {
        return product(b.inverse());
    }

    public String toString()
    {
        return String.format("( %8.2f, %8.2f, %8.2f, %8.2f )", a0, a1, a2, a3);
    }

    public static void main(String[] args)
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double d = Double.parseDouble(args[3]);
        Quaternions q0 = new Quaternions(1,2,3,4);
        Quaternions q = new Quaternions( a, b, c, d);
        StdOut.println(q.magnitude());
        StdOut.println(q.conjugate());
        StdOut.println(q.inverse());
        StdOut.println(q.sum(q0));
        StdOut.println(q.product(q0));
        StdOut.println(q.quotient(q0));

    }

}