/*

author : oloop

*/

public class RandomIntSeq
{
    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        for ( int i = 0; i < n; i++)
        {
            int randNum = (int) (Math.random()*m);
            StdOut.println(randNum);
        }

    }
}