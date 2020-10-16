/*

author : oloop

*/

public class BouncingBall
{
    public static void main(String[] args)
    {
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.enableDoubleBuffering();
        double rx = 0.480, ry = 0.860;
        double vx = 0.0015, vy = 0.023;
        // double ay = -0.01;
        double radius = 0.05;
        while (true)
        {
            if (Math.abs(rx+vx) + radius > 1.0) vx = -vx;
            if (Math.abs(ry+vy) + radius > 1.0) vy = -vy;
            // if (ry+vy + radius > 1.0) vy = -vy;
            // if (-(ry+vy) + radius > 1.0) vy = -0.8*vy;
            rx += vx;
            ry += vy;
            vy += ay;
            // ay = -0.02;
            StdDraw.clear();
            StdDraw.filledCircle(rx,ry,radius);
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}