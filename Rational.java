/*

author : oloop

exercise : 3.2.7

*/

public class Rational
{
    private final int n,d;

    public Rational(int num, int denom)
    {
        int gcd = Euclid.gcd(num, denom);
        n = Math.abs(num)/gcd;
        d = denom/Math.abs(gcd);
    }

    public Rational plus(Rational b)
    {
        int num = n*b.d + b.n*d;
        int denom = d*b.d;
        return new Rational(num, denom);

    }

    public Rational minus(Rational b)
    {
        int num = n*b.d - b.n*d;
        int denom = d*b.d;
        Rational c = new Rational(num, denom);
        return c;
    }

    public Rational times(Rational b)
    {
        int num   = n*b.n;
        int denom = d*b.d;
        return new Rational(num, denom);
    }

    public Rational divides(Rational b)
    {
        int num   = n*b.d;
        int denom = d*b.n;
        return new Rational(num, denom);
    }

    public String toString()
    {
        return n + " / " + d;
    }

    public static void main(String[] args)
    {
        int num = Integer.parseInt(args[0]);
        int denom = Integer.parseInt(args[1]);
        Rational a = new Rational(num, denom);
        int num1 = Integer.parseInt(args[2]);
        int denom1 = Integer.parseInt(args[3]);
        Rational b = new Rational(num1, denom1);

        StdOut.println(a.plus(b));
        StdOut.println(a.minus(b));
        StdOut.println(a.times(b));
        StdOut.println(a.divides(b));

    }
}