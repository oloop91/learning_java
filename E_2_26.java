/*

author : oloop

*/

public class E_2_26
{
    public static int totient(int n)
    {
        boolean[] check = new boolean[n+1];

        for ( int i = 2; i < n; i++)
        {
            if (!check[i])
            { 
                if ( n%i == 0)
                {
                    for ( int j = 1; i*j <= n; j++)
                    {
                        check[i*j] = true;
                    }
                }
            }
        }
        int count = 0;
        for ( int i = 2; i < n; i++)
        {
            if (!check[i]) 
            {
                count++;
                // StdOut.println(i);
            }
        }

        return count + 1; // count the one
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        System.out.println(totient(n));
    }

}