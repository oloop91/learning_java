/*

author : oloop
E_2_2_15
*/

public class Sciherman
{
    public static int Sdice()
    {
        int[] a = { 1,3,4,5,6,8};
        int[] b = { 1,2,2,3,3,4};
        return a[StdRandomP.uniform(6)] + b[StdRandomP.uniform(6)];
    }

    public static int Ndice()
    {
        return StdRandomP.uniform(6) + StdRandomP.uniform(6) + 2;  
    }

    public static double[] Sprob(int trials)
    {
        double[] a = new double[11];
        for ( int t = 1; t < trials; t++ )
        {
            int r = Sdice();
            a[r-2] += 1.0/trials;
        }
        return a;
    }

    public static double[] Nprob(int trials)
    {
        double[] a = new double[11];
        for ( int t = 1; t < trials; t++ )
        {
            int r = Ndice();
            a[r-2] += 1.0/trials;
        }
        return a;
    }

    public static void main(String[] args)
    {
        int trials = Integer.parseInt(args[0]);
        double[] s = Sprob(trials);
        double[] n = Nprob(trials);
        StdDraw.setYscale(0,2);
        StdStatsP.plotBars(s,0);
        StdStatsP.plotBars(n,0.3);
    }
}