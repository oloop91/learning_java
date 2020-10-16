/*

author : oloop
E_2_2_13
*/

public class MarkovMatrix
{
    public static void copy(double[][] a ,double[][] c)
    {
        int m = a.length;
        int n = a[0].length;
        for ( int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                c[i][j] = a[i][j];
    }

    public static void squareitself(double[][] p)
    {
        double[][] newP = Matrix.multiply(p,p);
        copy(newP,p);
    }

    


    public static void main(String[] args)
    {   // compute pageranks after trials moves
        int trials = Integer.parseInt(args[0]);
        // int destination = Integer.parseInt(args[1]);

        // Read Transition Matrix
        double[][] p = StdArrayIOP.readDouble2D();



        for (int t = 0; t < trials; t++)
        {   //compute effect of next move on page ranks
            squareitself(p);
        }
        
        for (int i = 0; i < p.length; i++)
        { 
            for(int j = 0; j < p.length; j++)
            {
                StdOut.printf("%8.5f", p[i][j]);
            }
            StdOut.println();
        }    


    }
}