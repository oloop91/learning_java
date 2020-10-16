/*

author : oloop

*/

public class RootsOfUnity
{
    public static void main(String[] args)
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        int n = Integer.parseInt(args[2]);
        
        double A = Math.sqrt(a*a + b*b);
        double theta = Math.acos(a/A);

        double A_nth_root = Math.pow(A, 1.0/n);

        for ( int i = 0 ; i < n; i++)
        {
            Complex r = new Complex(A_nth_root*Math.cos(theta/n + 2*Math.PI*i/n), A_nth_root*Math.sin(theta/n + 2*Math.PI*i/n));
            StdOut.println(r);
        }


    }
}