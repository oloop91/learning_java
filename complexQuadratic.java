/*

author : oloop

exercise : 3.2.17

*/

public class complexQuadratic
{
    public static void main(String[] args)
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        // check complex
        double t = b*b - 4*a*c;
        Complex r1,r2;
        if ( t > 0 )
        {
            r1 = new Complex(-b/2.0 + Math.sqrt(t)/2.0,0);
            r2 = new Complex(-b/2.0 - Math.sqrt(t)/2.0,0);

        }
        else 
        {
            r1 = new Complex(-b/2.0, Math.sqrt(-t)/2.0);
            r2 = new Complex(-b/2.0, -Math.sqrt(-t)/2.0);


        }

        StdOut.println(r1 + "\n" +r2);
    }
}