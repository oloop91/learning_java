/*

author : oloop

*/


public class E_2_25 //Birthday Problem
{
    public static int new_bday()
    {
        return (int) (Math.random()*365);
    }

    public static int count()
    {
        int[] a = new int[365];
        boolean[] check = new boolean[365];
        int count = 0;
        for ( int i = 0; i < 365; i++)
        {
            count++;
            int r = new_bday();
            if (!check[r]) check[r] = true;
            else break;
        }
        return count;
    }

    public static double E_value(int trials)
    {
        int sum = 0;
        for ( int i = 0; i < trials; i++)
        {
            sum += count();
        }
        return 1.0*sum/trials;
    }

    public static void main(String[] args)
    {
        int trials = Integer.parseInt(args[0]);
        StdOut.printf("%5.2f\n", E_value(trials));
    }

}