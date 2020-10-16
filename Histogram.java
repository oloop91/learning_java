/*

author : oloop

exercise 3.2.14

*/

import java.awt.Color;

public class Histogram 
{
    private final double freq[];
    private double max;
    private double mean;
    private double stddev;

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

    private double sum()
    {
        double s = 0.0;
        for(int i = 0; i < freq.length; i++)
        {
            s += freq[i];
        }
        return s;
    }

    public double mean()
    {
        double m = 0;
        double t = 0;
        for ( int i = 0; i < freq.length; i++)
        {
            m += freq[i]*i;
        }
        return m / sum();
    }

    public double stddev()
    {
        double var = 0.0;
        double m = mean();
        for ( int i = 0; i < freq.length; i++)
        {
            var += freq[i]*(i - m)*(i - m);
        }
        return Math.sqrt(var / (sum() - 1 ));
    }

    public void draw()
    {
        double[] a = freq;
        int n = a.length;
        Draw bars = new Draw();
        bars.setCanvasSize(500, 200);
        bars.setXscale(-1, n);
        bars.setYscale(0,max);
        for (int i = 0; i < n; i++) {
            bars.filledRectangle(i, a[i]/2, 0.25, a[i]/2);
        }
        double m = mean();
        double s = stddev();
        bars.setPenColor(new Color(255,0,0));
        bars.line(m , 0,  m, max);
        bars.setPenColor(new Color(0,0,255));
        bars.line(m - 2*s ,0 , m - 2*s ,max);
        bars.line(m + 2*s ,0 , m + 2*s ,max);
        // return bars;
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        
        Histogram histogram2 = new Histogram(n + 1);
        Histogram histogram4 = new Histogram(n + 1);
        Histogram histogram6 = new Histogram(n + 1);
        Histogram histogram8 = new Histogram(n + 1);

        for ( int i = 0; i < trials; i++)
        {
            histogram2.addDataPoint(Bernoulli.binomial(n,0.2));
            histogram4.addDataPoint(Bernoulli.binomial(n,0.4));
            histogram6.addDataPoint(Bernoulli.binomial(n,0.6));
            histogram8.addDataPoint(Bernoulli.binomial(n,0.8));

        }
        histogram2.draw();
        histogram4.draw();
        histogram6.draw();
        histogram8.draw();

    }

}