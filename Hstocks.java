/*

author : oloop

*/

public class Hstocks
{
    public static double[] get_data()
    {
        double[] a = StdArrayIOP.readDouble1D();
        return a;
    }
    
    public static double gap(double[] a, int n)
    {
        int k = (int) (a.length/n);
        double sum = 0.0;
        for ( int i = 0; i < k; i++ )
        { 
            double max = Double.NEGATIVE_INFINITY;
            double min = Double.POSITIVE_INFINITY;
            for ( int j = 0; j < n; j++)
            {
                
                double num = a[k*i + j];
                if ( num > max ) max = num;
                if ( num < min ) min = num;
            }
            sum += max - min;
        }
        return sum/k;
    }

    public static void printstat(double[] a, int k, double h)
    {   // k is the number of intervals
        int n = a.length/k;
        for ( int i = 1; i < k-1; i++)
        {
            double g  = gap(a,n*i);
            StdOut.printf("interval : %6d, gap : %9.2f, gap/interval : %9.2f\n", n*i, g, g/Math.pow(i,h));
        }
    }

    public static void main(String[] args)
    {
        double[] a = get_data();
        double h = Double.parseDouble(args[0]);
        printstat(a, 10,h);
    }

}