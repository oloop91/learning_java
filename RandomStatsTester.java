/*

author : oloop

*/

public class RandomStatsTester
{
    
    public static void printstats(double[] a)
    {
        StdOut.printf("      min %7.3f\n", StdStatsP.min(a));
        StdOut.printf("     mean %7.3f\n", StdStatsP.mean(a));
        StdOut.printf("      max %7.3f\n", StdStatsP.max(a));
        StdOut.printf("  std dev %7.3f\n", StdStatsP.stddev(a));
    }


    
    public static void get_stats_uniform(int n) // k type of dist 
    {
        double[] a = new double[n];
        for ( int i = 0; i < n; i++)
        {
            a[i] = StdRandomP.uniform(n);
        }

        printstats(a);
    }


    public static void get_stats_gaussian(int n) // k type of dist 
    {
        double[] a = new double[n];
        for ( int i = 0; i < n; i++)
        {
            a[i] = StdRandomP.gaussian();
        }

        printstats(a);
    }


    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        get_stats_uniform(n);
        StdOut.println();
        get_stats_gaussian(n);

    }



}