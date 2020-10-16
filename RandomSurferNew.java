/*

author : oloop
E_2_2_14
*/

public class RandomSurferNew
{
    public static void main(String[] args)
    {
        int trials = Integer.parseInt(args[0]);
        
        double[][] p = StdArrayIOP.readDouble2D();
        
        int page = 0;
        int n = p.length;
        int[] freq = new int[n];
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(-2.0, n);
        double Y = 2*trials/n;
        StdDraw.setYscale(-100.0, Y);
        for (int t = 0; t < trials; t++)
        {
    
            page = StdRandomP.discrete(p[page]);
            freq[page]++;    
            
            // System.out.println(t + "  " + page);
            StdDraw.clear();
            StdStatsP.plotBars(freq);
            // StdDraw.text(1,8000, String.format("%d", t));
            StdDraw.show();
            // StdDraw.pause(10);        
        }

        // StdDraw.clear(StdDraw.GRAY);
        // for (int i = 0; i < n; i++)
        //     StdDraw.filledRectangle(i, freq[i]/2.0, 0.25, freq[i]/2.0); 
        // // StdDraw.text(1,8000, String.format("%d", t));
        // StdDraw.setPenColor(StdDraw.GREEN);
        // for (int k = 0; k < 10 ; k++)
        // {
        //     int ruler = (int) (1.0*Y*k/10);
        //     StdDraw.text(1,ruler, String.format("%d",ruler));
        // }
        // StdDraw.show();
        // // StdDraw.pause(10);       
            
            
        
        for (int i = 0; i < n; i++)
        {
            StdOut.printf("%10.5f", (double) freq[i]/trials);
        }
        StdOut.println();


    }
}






