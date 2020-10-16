/*

author : oloop

*/

public class Turtle
{
    private double x, y;
    private double angle;
    
    public Turtle(double x0, double y0, double a0)
    {
        x = x0;
        y = y0;
        angle = a0;
    }

    public void turnLeft( double delta )
    {
        angle += delta;
    }

    public void goForward( double step )
    {
        // Compute new position; move and draw line to it
        double oldx = x; double oldy = y;
        x += step * Math.cos(Math.toRadians(angle));
        y += step * Math.sin(Math.toRadians(angle));
        StdDraw.line(oldx, oldy, x, y);
    }

    
    


    
    public static void main(String[] args)
    {
        // Draw a regular polygon with n sides
        // int n = Integer.parseInt(args[0]);
        // double angle = 360.0 / n;
        // double step = Math.sin(Math.toRadians(angle/2));
        // Turtle turtle = new Turtle(0.5, 0, angle/2);
        // StdDraw.setPenRadius(0.008);
        // for (int i = 0; i < n; i++)
        // {
        //     turtle.goForward(step);
        //     turtle.turnLeft(angle);
        // }

        // Draw a star with n vertices
        int n = Integer.parseInt(args[0]);
        double angle = 360.0 / n;
        double step = Math.sin(Math.toRadians(angle/2));
        Turtle turtle = new Turtle(0.5, 0, angle/2);
        StdDraw.setPenRadius(0.008);
        StdDraw.setYscale(-5,10);
        StdDraw.setXscale(-5,10);
        for (int i = 0; i < n; i++)
        {
            // turtle.goForward(step);
            double a = 30;
            turtle.turnLeft(a);
            turtle.goForward((step/2.0) / Math.cos(a) );
            turtle.turnLeft(-2*a);
            turtle.goForward((step/2.0) / Math.cos(a) );
            turtle.turnLeft(a);
            turtle.turnLeft(angle);
        }


    }

}