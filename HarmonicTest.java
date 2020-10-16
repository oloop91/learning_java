/*

author : oloop

*/

public class HarmonicTest
{
    public static double harmonic(int n)
    {
        if (n==1) return 1.0;
        return harmonic(n-1) + 1.0/n;
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StopWatch_p sw = new StopWatch_p();
        StdOut.println(harmonic(n));
        StdOut.println(sw.elapsedTime());
        
    }
}