/*

author : oloop

*/

public class E_2_2_6
{
    public static void linear_scaler(double[] a ,double ymin, double ymax)
    {
        int n = a.length;
        double max = StdStatsP.max(a);
        double min = StdStatsP.min(a);
        for ( int i = 0; i < n; i++)
        {
            StdOut.printf("%d : %5.2f",i,a[i]);
            a[i] = ymin + (ymax - ymin) * (a[i] - min) / (max - min);
            StdOut.printf(" : %5.2f\n", a[i]);
        }
    }

    public static void main(String[] args)
    {
        double ymax = Double.parseDouble(args[0]);
        double ymin = Double.parseDouble(args[1]);
        double[] a = StdArrayIOP.readDouble1D();
        linear_scaler(a, ymax, ymin);
    }
}