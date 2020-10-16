/*

author : oloop

exercise : 3.2.23
todo : find a good mathematical function for scaling 

*/

import java.awt.Color;


public class Potential
{
    private final Charge[] q;
    private final int n = 800; // pixels
    public Picture picture;

    public Potential(Charge[] q0)
    {
        q = q0;
        picture = new Picture(n,n);
    }

    public double getPotential(double x, double y)
    {
        double p = 0.0;
        for (int i = 0; i < q.length; i++)
        {
            double pot = q[i].potentialAt(x,y);
            if ( x == q[i].rx && y == q[i].ry )
            {
                pot = 0.0;
            }
            p += pot;

        }
        return p;
    }

    public double[][] Potentialpixels()
    {
        // int n = 800; // 1000 by 1000 square
        double[][] p = new double[n][n];
        for ( int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
            {
                p[i][j] = getPotential(1.0*i/n,1.0*j/n)/1000000000;
            }
        return p;
    }

    private double[] maxmin(double[][] pixels)
    {
        // int n = pixels.length;
        double[] m = new double[2];
        m[0] = Double.POSITIVE_INFINITY;
        m[1] = Double.NEGATIVE_INFINITY; 
        for ( int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
            {
                if (pixels[i][j] < m[0] ) m[0] = pixels[i][j];
                if (pixels[i][j] > m[1] ) m[1] = pixels[i][j];
            }
        // StdOut.println(m[0] + " " + m[1]);
        return m;
    }
    


    private Color getscaledColor(double a,double[] m)
    {
        // int scale = (int) ((Math.pow( (a - m[0]) / (m[1] - m[0]) , 5 ) * 255 ) );
        // return new Color( scale, scale , scale );
        
        int scale = 0;
        double power = 0.3;
        if ( a > 0 )
        {
            
            if (a > 5000)
            {
                scale = (int) (235 + (Math.pow( a / m[1] , power)*20) );
            }
            else if ( a > 1000 && a < 5000)
            {
                scale = (int) (170 + (Math.pow( a / m[1] , power)*65) );
            }
            else 
            {
                scale = (int) (128 + (Math.pow( a / m[1] , power)*42) );
            }
            
            return new Color(scale, scale , scale);
        }
        else 
        {
            if (a < -5000)
            {
                scale = (int) (50 - (Math.pow( a / m[0] , power)*50) );
            }
            else if ( a < -2000 && a > -5000)
            {
                scale = (int) (90 - (Math.pow( a / m[0] , power)*40) );
            }
            else 
            {
                scale = (int) (128 - (Math.pow( a / m[0] , power)*38) );
            }
            

            return new Color(scale, scale , scale);
        }
        
    }

    public void updatePotential()
    {
        // only of a unit square
        double[][] p = Potentialpixels();
        // int n = p.length;
        // Picture picture = new Picture(n,n);
        
        double[] m = maxmin(p);
        for ( int col = 0; col < n; col++)
            for( int row = 0; row < n; row++ )
            {
                Color c = getscaledColor(p[col][n - row - 1],m);
                picture.set(col, row, c);
            }
        // return picture;
    }

    public void draw()
    {
        updatePotential();
        picture.show();
    }

    public static void main(String[] args)
    {
        int n = StdIn.readInt();
        Charge[] q = new Charge[n];
        for ( int i = 0; i < n; i++)
        {
            q[i] = new Charge(StdIn.readDouble(), StdIn.readDouble(), StdIn.readDouble());
        }
        Potential po = new Potential(q);
        po.draw();
        // StdArrayIO.print(po.Potentialpixels());
    }

}