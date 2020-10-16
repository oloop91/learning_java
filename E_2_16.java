/*

author : oloop

*/

public class E_2_16
{
    public static double max(double[] a)
    {
        double max = Double.NEGATIVE_INFINITY;
        for ( int i = 0; i < a.length; i++)
        {
            if ( a[i] > max ) max = a[i];
        }
        return max;
    }

    public static double min(double[] a)
    {
        double min = Double.POSITIVE_INFINITY;
        for ( int i = 0; i < a.length; i++)
        {
            if ( a[i] < min ) min = a[i];
        }
        return min;
    }

    public static void scale(double[] a)
    {
        double mini = min(a);
        double diff = max(a) - mini;

        for (int i = 0; i < a.length; i++)
        {
            a[i] = (a[i] - mini) / diff;
        }
    }

    public static void  main(String[] args)
    {
        double[] a  = StdIn.readAllDoubles();
        scale(a);

        for ( int i = 0 ; i < a.length; i++)
        {
            StdOut.printf("%.3f ", a[i]);
        }
        StdOut.println();
        

        
    }




}