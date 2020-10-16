/*

author : oloop

*/

public class RandomDoubleSeq
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++)
        {
            double r = -1 + Math.random()*2;
            StdOut.println(r);
        }
    }
}