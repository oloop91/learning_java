/*

author : oloop

*/

public class E_2_35
{
    

    public static double log_fac(int n)
    {
        if ( n == 0 ) return 0;
        double sum = 0;
        for ( int i = 1; i <=n; i++)
        {
            double lg = Math.log(i);
            sum += lg;
        }

        return sum;
    }



    public static double binomial(int n, int k, double p)
    {
        // probability = p^k *(1-p)^(n-k) * n! / (k!* (n-k)!) - we will use log to prevent overflow
        
        double term1 = k * Math.log(p);
        double term2 = (n-k) * Math.log(1-p);
        double term3 = log_fac(n);
        double term4 = -log_fac(k) - log_fac(n-k);

        double x = term1 + term2 + term3 + term4;
        // System.out.println(term1 + " " + term2 + " " + term3 + " " + term4);

        return Math.pow(Math.E, x);
    }
    
    public static int binomial_rn(int n, double x)
    {
        double p = 0.5;
        double sum = binomial(n,0,p);
        
        int rn = 0;
        for ( int i = 0; i < n ; i++ )
        {
            sum += binomial(n,i+1,p);
            if ( sum > x ) 
            {
                rn = i; break;
            }
        }
        return rn; // array index no. n-1 corresponds to coupon no n
    }
    
    
    public static int getCoupon(int n)
    { // Return a random integer between 0 and n-1.
        double x = Math.random();
        return binomial_rn(n,x);
    }
    
    public static int collectCoupons(int n)
    { // Collect coupons until getting one of each value
      // and return the number of coupons collected.
        boolean[] isCollected = new boolean[n];
        int count = 0, distinct = 0;
        while (distinct < n)
        {
            int r = getCoupon(n);
            count++;
            if (!isCollected[r])
                distinct++;
                isCollected[r] = true;
        }
        return count;
    }


    public static void main(String[] args)
    { // Collect n different coupons.
        int n = Integer.parseInt(args[0]);
        int count = collectCoupons(n);
        StdOut.println(count);
    }






}