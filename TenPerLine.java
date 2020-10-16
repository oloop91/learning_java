/*

author = oloop

*/

public class TenPerLine
{
    public static void main(String[] args)
    {
        int column = 0;
        while(!StdIn.isEmpty())
        {
            int a = StdIn.readInt();
            if ( a >= 0 && a <= 99)
            {
                if ( column < 10)
                {
                    StdOut.printf("%3d ",a);
                }
                else 
                {
                    StdOut.printf("\n");
                    StdOut.printf("%3d ",a);
                    column = 0;
                }
                column++;
            }
        }
        StdOut.println();
    }
}