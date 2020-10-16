/*

author : oloop

*/

public class Markov
{
    public static void main(String[] args)
    {   // compute pageranks after trials moves
        int trials = Integer.parseInt(args[0]);
        // int destination = Integer.parseInt(args[1]);
        int n = StdIn.readInt();
        StdIn.readInt();

        // Read Transition Matrix
        double[][] p = new double[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                p[i][j] = StdIn.readDouble();
            }
        }

        // Use the power method to compute page ranks
        double[] ranks = new double[n];
        ranks[0] = 1.0;
        for (int t = 0; t < trials; t++)
        {   //compute effect of next move on page ranks
            double[] newRanks = new double[n];
            for ( int j = 0; j < n; j++)
            {   // New rank of page j is the dot product
                // of old ranks and column j of p[][]
                for ( int k = 0; k < n; k++)
                {
                    newRanks[j] += ranks[k]*p[k][j];
                    
                }
            }
            // StdOut.println(t + " ");
            for (int j = 0; j < n; j++)
            {
                ranks[j] = newRanks[j]; 
                // StdOut.printf("%8.5f",ranks[j]);
            }
            // StdOut.println();
   
            
        }
        for (int i = 0; i < n; i++)
        {
            StdOut.printf("%8.5f", ranks[i]);
        }
        // StdOut.printf("%8.5f", ranks[destination]);
        StdOut.println();


    }
}