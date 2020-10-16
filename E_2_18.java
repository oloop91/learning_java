/*

author : oloop

*/

public class E_2_18
{
    public static boolean[][] readBoolean2D()
    {
        int m = StdIn.readInt();
        int n = StdIn.readInt();
        boolean[][] a = new boolean[m][n];
        for ( int i = 0; i < m; i++)
        {
            for ( int j = 0; j < n; j++)
            {
                a[i][j] = StdIn.readBoolean();
            }
        } 
        return a;
    }

    public static void print2Darray(boolean[][] a)
    {
        for ( int i = 0; i < a.length; i++)
        {
            for ( int j = 0; j < a[0].length; j++)
            {
                StdOut.print(a[i][j] + " ");
            }
            StdOut.println();
        }
    }

    public static void main(String[] args)
    {
        boolean[][] a = readBoolean2D();
        print2Darray(a);
    }
}