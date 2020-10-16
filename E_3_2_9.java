/*

author : oloop

exercise : 3.2.9

*/

public class E_3_2_9
{
    public static void main(String[] args)
    { 
        int n = StdIn.readInt();
        n = 10;

        Interval[] interval = new Interval[n];

        for (int i = 0; i < n; i++)
        {
            interval[i] = new Interval( StdIn.readDouble(), StdIn.readDouble() );
        }

        for ( int i = 0; i < n; i++)
        {
            for (int j = i+1; j < n; j++)
            {
                if (interval[i].intersects(interval[j]))
                {
                    StdOut.println(interval[i] + " " + interval[j]);
                }
            }
        }
    }
}