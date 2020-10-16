/*

author : oloop

*/

public class Histogram
{
    private final double freq[];
    private double max;

    public Histogram(int n)
    {
        // Create a new histogram
        freq = new double[n];
    }

    public void addDataPoint(int i)
    {
        // Add one occurance of the value i
        freq[i]++;
        if ( freq[i] > max ) max = freq[i];
    }

    public void draw()
    {
        //Draw and (Scale) the histogram
        StdDraw.setYscale(0,max);
        StdStats.plotBars(freq); 
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        Histogram histogram = new Histogram(n + 1);
        StdDraw.setCanvasSize(500, 200);
        for ( int i = 0; i < trials; i++)
        {
            histogram.addDataPoint(Bernoulli.binomial(n));
        }
        histogram.draw();

    }
}
