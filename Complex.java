/*

author : oloop

*/

public class Complex
{
    private final double re;
    private final double im;
    
    public Complex(double real, double imag)
    {
        re = real;
        im = imag;
    }

    public Complex plus(Complex b)
    {
        // return the sum of this number and b
        double real = re + b.re;
        double imag = im + b.im;
        return new Complex(real, imag);
    }

    public Complex times(Complex b)
    {
        // Return the product of this number and b
        double real = re * b.re - im * b.im;
        double imag = re * b.im + im * b.re;
        return new Complex(real, imag);
    }

    public double abs()
    {
        return Math.sqrt(re*re + im*im);
    }
    public double theta()
    {
        return Math.acos(re / Math.sqrt(re*re + im*im));
    }

    public Complex minus(Complex b)
    {
        return new Complex(re - b.re, im - b.im);
    }

    public Complex conjugate()
    {
        return new Complex(re, -im);
    }

    public Complex divides(Complex b)
    {
        return new Complex( (re * b.re + im * b.im) / (b.re * b.re + b.im*b.im)  , (b.re*im - b.im* re)/(b.re* b.re + b.im * b.im) );
    }

    public Complex power(int b)
    {
        return new Complex(Math.pow(abs(),b)*Math.cos(b*theta()), Math.pow(abs(),b)*Math.sin(b*theta()));
    }

    public double re() { return re; }
    public double im() { return im; }

    public boolean equals(Complex b)
    {
        if (re == b.re && im == b.im) return true;
        else return false;

    }

    public String toString()
    {
        String r1 = String.format("%5.3f",re);
        String i1 = String.format("%5.3f",im);
        int r = (int) re;
        int i = (int) im;
        if ( re - r == 0.0)
        {
            if (im - i ==0 )
            {
                if (im == 1.0)
                {
                    i1 = "";
                }
                else 
                {
                    i1 = Integer.toString(i);
                }
            }
            
            r1 = Integer.toString(r);

        }
        return String.format("%6s + %6si", r1, i1);
    }

    public static void main(String[] args)
    {
        Complex z0 = new Complex(1.0, 3.0);
        Complex z = z0;
        z = z.times(z).plus(z0);
        // StdOut.println(z);
        // StdOut.println(z0);
        // StdOut.println(z.theta());
        // StdOut.println(z.minus(z0));
        // StdOut.println(z.divides(z0));
        StdOut.println(z.power(4));
        StdOut.println(z.times(z.times(z.times(z))));

    }


}