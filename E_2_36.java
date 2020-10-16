/*

author : oloop

*/

public class E_2_36
{
    
    public static int[] barCode(int n)
    {
        int[][] code = {{1,1,0,0,0},{0,0,0,1,1},{0,0,1,0,1},{0,0,1,1,0},{0,1,0,0,1},
                         {0,1,0,1,0},{0,1,1,0,0},{1,0,0,0,1},{1,0,0,1,0},{1,0,1,0,0}};

        return code[n];
    }
    
    public static void drawbar(double x, int h)
    {
        // h = 1 - full bar, h = 0 - half bar
        // x is the postion of the bar
        // full bar height 1
        StdDraw.filledRectangle(x, 0.5/(2-h), 0.25, 0.5/(2-h));
    }

    public static void setscales(int n)
    {
        // n is the numbers to be plotted
        StdDraw.setCanvasSize(200*n, 500);
        StdDraw.setXscale(0.0, n*5 + 3 );
        StdDraw.setYscale(0.0, 1.5);
        
        drawbar(1,1);
        drawbar(n*5,1);
    }

    public static void drawdigit(int n, int x)
    {
        int[] code = barCode(n);
        for ( int i = 0; i < code.length; i++)
        {
            drawbar(x+i, code[i]);
        }
    }

    public static int checksum(int[] m)
    {
        int sum = 0;
        for ( int i = 0; i < m.length; i++)
        {
            sum += m[i];
        }
        return sum%10;
    }

    public static void drawbar(int[] m)
    {
        int n = m.length;
        int[] m1 = new int[n + 1];
        for ( int i = 0; i < n; i++)
        {
            m1[i] = m[i];
        }
        m1[n] = checksum(m);
        
        n = n + 1;  
        
        setscales(n);
        
        for ( int i = 0; i < n; i++)
        {
            drawdigit(m1[i], 2 + i*5);
        }

       
    }

    public static void main(String[] args)
    {
        int[] m = new int[args.length];
        for (int i = 0; i < m.length; i++)
        {
            m[i] = Integer.parseInt(args[i]);
        }

        drawbar(m);
       
    }



}

