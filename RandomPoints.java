/*

author : oloop

*/


public class RandomPoints
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        StdDraw.setPenRadius(0.004);
        
        
        
        for (int i = 0; i < n; i++)
        {
            double x = StdRandomP.gaussian(.5, .1);
            double y = StdRandomP.gaussian(.5, .1);
            StdDraw.point(x, y);
        }
        
    }
}