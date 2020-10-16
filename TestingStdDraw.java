/*

author : oloop

*/

public class TestingStdDraw
{
    public static void main(String[] args)
    {
        StdDraw.square(.2, .8, .1);
        StdDraw.filledSquare(.8, .8, .2);
        StdDraw.circle(.8, .2, .2);
        double[] xd  = { .1, .2, .3, .2};
        double[] yd  = { .2, .3, .2, .1};
        StdDraw.filledPolygon(xd,yd);
        StdDraw.text(.2, .5, "blackish text");
        StdDraw.setPenColor(StdDraw.CYAN);
        StdDraw.text(.8, .8, "white TEXT" );
    }
}