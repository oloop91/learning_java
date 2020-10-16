/*

author : oloop

*/

public class E_2_3_29
{

    private static int[] count_collatz = new int[10000];

    public static void collatz(int n)
    {
        count_collatz[n]++;
        StdOut.print(n + " ");
        if (n == 1) return;
        if (n % 2 == 0) collatz(n / 2);
        else collatz(3*n + 1);
    }

    public static int max_calls(int n)
    {
        collatz(n);
        StdOut.println();
        int max_index = 0;
        for ( int i = 0; i < count_collatz.length; i++)
        {
            if ( count_collatz[i] > count_collatz[max_index]) max_index = i;
        }

        return max_index;

    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdOut.println(max_calls(n));
    }

}