/*

author : oloop

*/


public class E_2_21
{
    public static double[][] multiply(double[][] a, double[][] b)
    {
        int m = a.length;
        int p = a[0].length;
        int n = b[0].length;
        
        double[][] empty = new double[0][0];
        if ( p != b.length) return empty;

        double[][] mul = new double[m][n];

        for ( int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                for ( int k = 0; k < p; k++)
                {
                    mul[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return mul;

    }

    public static void main(String[] args)
    {
        int m = StdIn.readInt();
        int p = StdIn.readInt();
        int n = StdIn.readInt();

        double[][] a = new double[m][p];
        double[][] b = new double[p][n];

        for ( int i = 0; i < m; i++)
        {
            for ( int j = 0; j < p; j++)
            {
                a[i][j] = StdIn.readDouble();
            }
        }

        for ( int i = 0; i < p; i++)
        {
            for ( int j = 0; j < n; j++)
            {
                b[i][j] = StdIn.readDouble();
            }
        }

        double[][] mm = multiply(a,b);

        for ( int i = 0; i < m; i++)
        {
            for ( int j = 0; j < n; j++)
            {
                StdOut.printf("%5.2f  ", mm[i][j]);
            }
            StdOut.println();
        }

    }

}