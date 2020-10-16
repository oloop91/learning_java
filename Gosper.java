/*

author : oloop

exercise : 3.2.29

*/

public class Gosper
{
    public static void gosper_lines(Turtle t,int n, double step)
    {
        if (n == 0 ) 
        {
            t.goForward( step ) ;
            return;
        }
        double h = 1.0/3;
        double angle = Math.toDegrees(Math.atan(h));
        double l = (1.0/3.0)/Math.cos(Math.toRadians(angle)) *step;
        t.turnLeft(-angle);
        gosper_lines(t,n-1,l);
        t.turnLeft(3*angle);
        gosper_lines(t,n-1,l);
        t.turnLeft(-3*angle);
        gosper_lines(t,n-1,l);
        t.turnLeft(angle);
        return;


    }

    public static void gosper(int n)
    {
        // Draw a regular polygon with n sides
        int s = 6;
        double angle = 360.0 / s;
        StdDraw.setYscale( -2, 3);
        StdDraw.setXscale( -2, 3);
        double step = 1;
        Turtle turtle = new Turtle(0.5, 0, 0);
        StdDraw.setPenRadius(0.002);
        for (int i = 0; i < s; i++)
        {
            gosper_lines(turtle,n,1);
            turtle.turnLeft(angle);
        }
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        gosper(n);
    }

}