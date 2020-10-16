/*

author 

*/

public class PercolationDirected
{
    public static boolean[][] flow(boolean[][] isOpen)
    {
        int n = isOpen.length;
        boolean[][] isFull = new boolean[n][n];
        for ( int j = 0; j < n; j++)
            flow( isOpen, isFull, 0, j);
        return isFull;
    }

    public static void flow(boolean[][] isOpen, boolean[][] isFull, int i,  int j)
    {
        int n = isFull.length;
        if (animation) 
        {
            StdOut.println("depth : " + depth + "   count : " + count );
            animator(isOpen, isFull);
        }
        if( i < 0 || i >= n) 
        {
            if (count > depth ) depth = count;
            count = 0;
            return;
        }
        if( j < 0 || j >= n)
        {
            if (count > depth ) depth = count;
            count = 0;
            return;
        }
        if ( !isOpen[i][j]) 
        {
            if (count > depth ) depth = count;
            count = 0;
            return;
        }
        if ( isFull[i][j]) 
        {
            if (count > depth ) depth = count;
            count = 0;
            return;
        }
        isFull[i][j] = true;
        count++;
        int temp = count;
        flow(isOpen, isFull, i+1, j);
        count = temp;
        flow(isOpen, isFull, i, j+1);
        count = temp;
        flow(isOpen, isFull, i, j-1);
        // count = temp;
        // flow(isOpen, isFull, i-1, j);
    }

    private static boolean animation = false;
    private static int depth = 0;
    private static int count = 0;

    public static boolean percolates(boolean[][] isOpen)
    {
        boolean[][] isFull = flow(isOpen);
        int n = isOpen.length;
        for(int j = 0; j < n; j++ )
            if ( isFull[n-1][j]) return true;
        return false;
    }

    public static void show(boolean[][] a, boolean which)
    {
        int n = a.length;
        StdDraw.setXscale(-1,n);
        StdDraw.setYscale(-1,n);
        for (int i = 0;i < n; i++)
            for( int j = 0; j < n; j++)
                if ( a[i][j] == which )
                    StdDraw.filledSquare( j, n-i-1, 0.5 );
    }

    public static boolean[][] random(int n, double p)
    {
        boolean[][] a = new boolean[n][n];
        for ( int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = StdRandom.bernoulli(p);
        return a;
    }

    public static void print(boolean[][] isOpen)
    {
        boolean[][] isFull = flow(isOpen);
        for ( int i = 0; i < isOpen.length; i++)
        {
            for ( int j = 0; j < isOpen.length; j++)
                {
                    if( isOpen[i][j] )
                    {
                        if (isFull[i][j]) StdOut.print("* ");
                        else StdOut.print("0 ");
                    }
                    else StdOut.print("1 ");
                }
            StdOut.println();
        }   
        
        return;

    }

    public static void animator(boolean[][] isOpen, boolean[][] isFull)
    {
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        show(isOpen, false);
        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        show(isFull, true);
        StdDraw.show();
        StdDraw.pause(10);
        return;
    }

    public static void animate(boolean[][] isOpen)
    {
        StdDraw.enableDoubleBuffering();
        animation = true;
        boolean[][] isFull = flow(isOpen);
        
        return;
    }

    public static int depth(boolean[][] isOpen)
    {
        boolean[][] isFull = flow(isOpen);
        return depth;
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        boolean[][] isOpen = random(n,p);
        // boolean[][] isFull = flow(isOpen);
        // print(isOpen);
        // StdOut.println(percolates(isOpen));
        // StdDraw.setPenColor(StdDraw.BLACK);
        // show(isOpen, false);
        // StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        // show(isFull, true);
        animate(isOpen);
        // StdOut.println(depth(isOpen));


    }
}