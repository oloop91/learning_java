/*

author : oloop

exercise : 3.2.21

*/

public class E_3_2_21
{
    public static void main(String[] args)
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        Complex c = new Complex(a, b);

        StdOut.println(Mandelbrot.mand(c,256));

    }
}