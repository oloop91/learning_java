/*

author : oloop

*/

public class Data
{

    private final double[] data;
    private int max;

    public Data(int n0, int max0)
    {
        data = new data[n0];
        max = max0;
    }

    public double addDataPoints(int i, double x)
    {
        data[i] = x;
        if (x > data[max]) max = i;
    }

    public void plotPoints()
    {
        //
    }

}