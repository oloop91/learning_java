/*

author : oloop

*/

public class PrimeSieve
{
    public static void main(String[] args)
    {   // Print the number of primes <= n
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i<=n; i++)
        {
            isPrime[i] = true;
        }

        for (int i = 2; i <= n/i; i++)
        {
            if (isPrime[i])
            {
                for ( int j = i; j*i <= n; j++ )
                {
                    isPrime[i*j] = false;
                }
            }
        }
        // Count the primes
        int primes = 0;
        for ( int i = 2 ; i <= n; i++)
        {
            if (isPrime[i])
            {
                primes += 1;
            }
        }
        
        System.out.println(primes);
        

        
    }
}