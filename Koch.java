/*

author : oloop

*/

public class Koch
{
    
    public static void Koch_curve(Turtle turtle, int n, double step)
    {
        if ( n == 0 ) 
        {
            turtle.goForward(step);
            return;
        }
        Koch_curve( turtle, n-1, step/3);
        turtle.turnLeft(60);
        Koch_curve( turtle, n-1, step/3 );
        turtle.turnLeft(-120);
        Koch_curve(turtle, n-1, step/3);
        turtle.turnLeft(60);
        Koch_curve(turtle, n-1, step/3);

        return;
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        Turtle turtle = new Turtle(0 ,0.1, 0);
        Koch_curve(turtle, n, 1.0);


    }
}