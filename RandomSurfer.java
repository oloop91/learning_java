/*

author : oloop

*/

public class RandomSurfer
{
    public static void main(String[] args)
    {
        int trials = Integer.parseInt(args[0]);
        int n = StdIn.readInt();
        StdIn.readInt();

        // Read Transition Matrix
        double[][] p = new double[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                p[i][j] = StdIn.readDouble();
            }
        }
        int page = 0;
        int[] freq = new int[n];
        // StdDraw.enableDoubleBuffering();
        // StdDraw.setXscale(-2.0, n);
        // double Y = 2*trials/n;
        // StdDraw.setYscale(-100.0, Y);
        for (int t = 0; t < trials; t++)
        {
    
            double r = Math.random();
            double sum = 0.0;
            for (int j = 0; j < n; j++)
            {
                sum += p[page][j];
                if ( r < sum ) 
                {
                    page = j;
                    break;
                }
            }
            if ( r > sum) page = (int) (Math.random()*(n-1)); // change the page to rest of the pages
            freq[page]++;    
            
            // System.out.println(t + "  " + page);
            // StdDraw.clear();
            // for (int i = 0; i < n; i++)
            //     StdDraw.filledRectangle(i, freq[i]/2.0, 0.25, freq[i]/2.0); 
            // // StdDraw.text(1,8000, String.format("%d", t));
            // for (int k = 0; k < 10 ; k++)
            // {
            //     int ruler = (int) (1.0*Y*k/10);
            //     StdDraw.text(0,ruler, String.format("%f",ruler));
            // }
            // StdDraw.show();
            // // StdDraw.pause(10);        
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






