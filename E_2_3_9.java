/*

author : oloop

*/

public class E_2_3_9
{
    // public static void drawRuler(int n)
    // {
    //     if ( n==0 ) return;
    //     drawRuler(n-1);
    //     for (int i = 0; i < Math.pow(2, n - 1); i++)
    //     {
    //         double h = Math.pow(2,n);
    //         StdDraw.line((2*i + 1)/h,0,(2*i + 1)/h, 1.0/h);
    //         StdDraw.pause(100);
    //     }
        
    // }

    public static void drawRuler(int n, double h,double x)
    {
        if ( n==0 ) return;
        // double h = Math.pow(2,n);
        
        
        drawRuler(n-1,h/2,x - h/2);
        StdDraw.line(x, 0, x, h);
        drawRuler(n-1,h/2,x + h/2);

        StdDraw.pause(100);

        // for (int i = 0; i < Math.pow(2, n - 1); i++)
        // {
        //     double h = Math.pow(2,n);
        //     StdDraw.line((2*i + 1)/h,0,(2*i + 1)/h, 1.0/h);
        //     StdDraw.pause(100);
        // }
        
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        drawRuler(n,0.5,0.5);
    }
}