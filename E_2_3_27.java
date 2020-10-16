/*

author : oloop

*/

public class E_2_3_27
{
    public static double[][] coordinates(double x, double y, double s)
    {
        double[][] a = new double[2][3];
        a[0][0] = x;
        a[0][1] = x + s * Math.sqrt(3)/2.0;
        a[0][2] = x - s * Math.sqrt(3)/2.0;
        a[1][0] = y + s;
        a[1][1] = y - s/2.0;
        a[1][2] = y - s/2.0;

        return a;
    }

    public static void sierpinski_triangle(int n, double x, double y, double s)
    {
        
        if (n == 1) 
        {
            double[][] a = coordinates(x,y,s);
            StdDraw.polygon(a[0],a[1]);
            return;
        }

        sierpinski_triangle( n-1, x - s* Math.sqrt(3)/4.0, y - s/4.0, s/2.0);
        sierpinski_triangle( n-1, x + s* Math.sqrt(3)/4.0, y - s/4.0, s/2.0);
        sierpinski_triangle( n-1, x                      , y + s/2.0, s/2.0);

        return;


    }



    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        sierpinski_triangle( n, 0.5, 0.5, 0.4 );
    }

}