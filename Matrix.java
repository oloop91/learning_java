/*

author : oloop
E_2_2_12
*/

public class Matrix  
{
    public static double dot(double[] a, double[] b)
    {
        int n = a.length;
        double sum = 0.0;
        for ( int i = 0; i < n; i++)
        {
            sum += a[i]*b[i];
        }
        return sum;
    }

    public static double[][] multiply(double[][] a, double[][] b)
    {
        int m = a.length;
        int p = a[0].length;
        int n = b[0].length;
        double[][] c = new double[m][n];
        for ( int i = 0; i < m; i++)
        {
            for ( int j = 0; j < n; j++)
            {
                for ( int k = 0; k < p; k++)
                {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public static double[][] transpose(double[][] a)
    {
        int m = a.length;
        int n = a[0].length;
        double[][] c = new double[m][n];
        for ( int i = 0 ; i < m; i++)
        {
            for ( int j = 0; j < n; j++)
            {
                c[i][j] = a[j][i];
            }
        }
        return c;
    }


    public static double[] multiply(double[] x, double[][] a)
    {
        int m = a.length;
        int n = a[0].length;
        double[] c = new double[n];
        for ( int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                c[j] += x[i]*a[i][j];
            }
        }
        return c;
    }

    public static double[] multiply(double[][] a, double[] x)
    {
        int m = a.length;
        int n = a[0].length;
        double[] c = new double[n];
        for ( int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                c[j] += x[i]*a[i][j];
            }
        }
        return c;
    }

    public static void main(String[] args)
    {
        int trials = Integer.parseInt(args[0]);
        double[][] p = StdArrayIO.readDouble2D();
        double[] ranks = new double[p.length];
        ranks[0] = 1.0;
        for (int t = 0; t < trials; t++)
            ranks = Matrix.multiply(ranks, p);
        StdArrayIO.print(ranks);
    }

}