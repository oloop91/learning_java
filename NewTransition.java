/*

author : oloop

*/

public class NewTransition
{
    public static void main(String[] args)
    {
        int destination = Integer.parseInt(args[0]);
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
        counts[23][destination]++;
        outDegrees[23]++;
        StdOut.println(destination);
        StdOut.println(n + " " + n);
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                double p = 0.9*counts[i][j]/outDegrees[i] + 0.1/n;
                StdOut.printf("%8.5f", p);
            }
            StdOut.println();
        }
    }
}