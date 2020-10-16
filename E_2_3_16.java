/*

author : oloop

*/

public class E_2_3_16
{
    public static void cutter(int n, double x, double y, double w, double h)
    {
        if ( n == 0) return;
        
        if ( w == h ) 
        {
            cutter(n-1,  x - w/2.0 , y , w/2.0,  h );
            StdDraw.line(x , y - h , x , y + h );
            cutter(n-1, x + w/2.0,  y  ,  w/2.0 , h );
        
        }
        else 
        {
            cutter(n-1,  x , y - h/2.0 , w,  h/2.0 );
            StdDraw.line(x - w, y , x + w , y );
            cutter(n-1, x,  y + h/2.0  ,  w , h/2.0 );            
        }

        
        // StdDraw.pause(1000);
    }   

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        cutter(n,0.5,0.5,0.5,0.5);
    }
}           