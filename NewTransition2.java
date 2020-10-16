/*

author : oloop

*/

public class NewTransition2
{
    public static void main(String[] args)
    {
        int n = StdIn.readInt();
        int[][] counts = new int[n][n];
        int[] outDegrees= new int[n];
        while(!StdIn.isEmpty())
        {
            int i = StdIn.readInt();
            int j = StdIn.readInt();
            outDegrees[i]++;
            counts[i][j]++;
        }

        StdOut.println(n + " " + n);
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                double p ;
                if (outDegrees[i] != 0) p = 0.9*counts[i][j]/outDegrees[i] + 0.1/n;
                else p = 1.0/n;
                StdOut.printf("%8.5f", p);
            }
            StdOut.println();
        }
    }
}