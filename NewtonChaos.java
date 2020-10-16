/*

author : oloop

exercise : 3.2.34

*/

import java.awt.Color;

public class NewtonChaos
{
    
    public static Complex polynomial(Complex z)
    {
        // return z.power(n).minus(new Complex(1,0));
        return z.times(z.times(z.times(z))).minus(new Complex(1,0));



    }

    public static Complex dpolynomial(Complex z)
    {
        // return z.power(n).times(new Complex(n,0));
        return z.times(z.times(z)).times(new Complex(4,0));


        
    }

    public static Complex nextC(Complex z)
    {
        return z.minus(polynomial(z).divides(dpolynomial(z)));
    }

    public static Complex NewtonMethod(Complex z)
    {
        Complex zr = z;
        for ( int i = 0; i < 100; i++)
        {
            Complex zr_new = nextC(zr);
            if (zr.equals(zr_new)) 
            {
                break;
            }
            zr = zr_new;
        }
        return zr;
    }

    public static boolean equalInLimits(Complex a, Complex b)
    {
        double delta = 0.05;
        if (Math.abs(a.re() - b.re()) < delta && Math.abs(a.im() - b.im()) < delta)
        {
            return true;
        }
        else return false;
    }


    public static Color getChaos(Complex z0)
    {
        Complex z = NewtonMethod(z0);
        if(equalInLimits(z,new Complex(1,0))) return new Color(255, 255, 255);
        else if(equalInLimits(z,new Complex(-1,0))) return new Color(255, 0, 0);
        else if(equalInLimits(z,new Complex(0, 1))) return new Color(0, 255, 0);
        else if(equalInLimits(z,new Complex(0,-1))) return new Color(0, 0, 255);
        else return new Color(0, 0, 0);
        
    }

    // public static Color getChaos(Complex z0)
    // {
    //     Complex z = NewtonMethod(z0);
    //     if(z.equals(new Complex(1,0))) return new Color(255, 255, 255);
    //     else if(z.equals(new Complex(-1,0))) return new Color(255, 0, 0);
    //     else if(z.equals(new Complex(0, 1))) return new Color(0, 255, 0);
    //     else if(z.equals(new Complex(0,-1))) return new Color(0, 0, 255);
    //     else return new Color(0, 0, 0);
        
    // }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        Picture p = new Picture(n, n);
        for(int col = 0; col < n; col++)
            for(int row = 0; row < n; row++)
            {
                p.set(col, row, getChaos(new  Complex( col - n/2 , n/2 - row - 1)  ));
            }
        p.show();    
        // double a = Double.parseDouble(args[0]);
        // double b = Double.parseDouble(args[1]);
        // Complex c = new Complex(a , b);
        // StdOut.println(NewtonMethod(c));

    }
}