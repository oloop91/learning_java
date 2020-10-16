/*

author : oloop

*/

public class E_2_23
{

    
    public static double[] p_array(int n)
    {
        double[] p = new double[n];
        int u = (int) ( Math.random()*n);
        for ( int i  = 0; i < n; i++)
        {
            if ( i != (u-1)) p[i] = (1.0 - 1.0/(1000.0*n))/(n-1);
            else p[i] = 1.0/(1000.0*n);
        } 
        return p;
    }

    public static int getCoupon(double[] p)
    { 
        int n = p.length;
        int new_coupon = -1;
        double r = Math.random();
        double sum = 0.0;
        for (int j = 0; j < n; j++)
        { // Find interval containing r.
            sum += p[j];
            if (r < sum) { new_coupon = j; break; }
        }
        return new_coupon;
    }
    
    public static int collectCoupons( double[] p)
    { // Collect coupons until getting one of each value
      // and return the number of coupons collected.
        int n = p.length;
        boolean[] isCollected = new boolean[n];
        int count = 0, distinct = 0;
        while (distinct < n)
        {
            int r = getCoupon(p);
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
        double[] p = p_array(n);
        
        
        int count = 0;
        int trials = 1000;
        for ( int t = 0; t < trials; t++)
            count += collectCoupons(p);
        StdOut.println(1.0*count/trials);
    }


}