/*

author : oloop

*/

/*

author : oloop

*/

public class E_2_4_4
{
    public static void main(String[] args)
    {
        
        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        
        StdDraw.enableDoubleBuffering();

        // Draw blocked sides in black
        boolean[][] isOpen = Percolation.random( n, p);
        StdDraw.setPenColor(StdDraw.BLACK);
        Percolation.show(isOpen, false);

        
        // Draw filled sites in blue
        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        boolean[][] isFull = Percolation.flow(isOpen);
        Percolation.show(isFull, true);

        StdDraw.show();
    }
}