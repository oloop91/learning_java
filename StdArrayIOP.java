/*

author : oloop

*/

public class StdArrayIOP
{
    public static double[] readDouble1D()
    {
        int n = StdIn.readInt();
        double[] a = new double[n];
        for ( int i = 0; i < n; i++)
        {
            a[i] = StdIn.readDouble();
        }
        return a;
    }

    public static double[][] readDouble2D()
    {
        int m = StdIn.readInt();
        int n = StdIn.readInt();
        double[][] a = new double[m][n];
        for ( int i = 0; i < m; i++)
        {
            for ( int j = 0; j < n; j++)
            {
                a[i][j] = StdIn.readDouble();
            }
        }
        return a;
    }

    public static void print(double[] a)
    {
        int n = a.length;
        System.out.println(n);
        for ( int i = 0; i < n; i++)
        {
            StdOut.printf("%9.5f ", a[i]);
        }
        StdOut.println();
    }

    public static void print(double[][] a)
    {
        int m = a.length;
        int n = a[0].length;
        System.out.println(m + " " + n);
        for ( int i = 0; i < m; i++)
        {
            for ( int j = 0; j < n; j++)
            {
                StdOut.printf("%9.5f ", a[i][j]);
            }
            StdOut.println();
        }
    }

    // int overloading

    public static int[] readInt1D()
    {
        int n = StdIn.readInt();
        int[] a = new int[n];
        for ( int i = 0; i < n; i++)
        {
            a[i] = StdIn.readInt();
        }
        return a;
    }

    public static int[][] readInt2D()
    {
        int m = StdIn.readInt();
        int n = StdIn.readInt();
        int[][] a = new int[m][n];
        for ( int i = 0; i < m; i++)
        {
            for ( int j = 0; j < n; j++)
            {
                a[i][j] = StdIn.readInt();
            }
        }
        return a;
    }

    public static void print(int[] a)
    {
        int n = a.length;
        System.out.println(n);
        for ( int i = 0; i < n; i++)
        {
            StdOut.printf("%5d ", a[i]);
        }
        StdOut.println();
    }

    public static void print(int[][] a)
    {
        int m = a.length;
        int n = a[0].length;
        System.out.println(m + " " + n);
        for ( int i = 0; i < m; i++)
        {
            for ( int j = 0; j < n; j++)
            {
                StdOut.printf("%5d ", a[i][j]);
            }
            StdOut.println();
        }
    }

    // String overloading

    public static String[] readString1D()
    {
        int n = StdIn.readInt();
        String [] a = new String[n];
        for ( int i = 0; i < n; i++)
        {
            a[i] = StdIn.readString();
        }
        return a;
    }

    public static String[][] readString2D()
    {
        int m = StdIn.readInt();
        int n = StdIn.readInt();
        String[][] a = new String[m][n];
        for ( int i = 0; i < m; i++)
        {
            for ( int j = 0; j < n; j++)
            {
                a[i][j] = StdIn.readString();
            }
        }
        return a;
    }

    public static void print(String[] a)
    {
        int n = a.length;
        System.out.println(n);
        for ( int i = 0; i < n; i++)
        {
            StdOut.printf("%15s ", a[i]);
        }
        StdOut.println();
    }

    public static void print(String[][] a)
    {
        int m = a.length;
        int n = a[0].length;
        System.out.println(m + " " + n);
        for ( int i = 0; i < m; i++)
        {
            for ( int j = 0; j < n; j++)
            {
                StdOut.printf("%15s ", a[i][j]);
            }
            StdOut.println();
        }
    }

    public static void main(String[] args)
    {
        print(readString2D());
    }
}