/*

author : oloop

*/

public class CouponCollector
{
    public static void main(String[] args)
    {
        // Generate random values [0,n), until finding each one.
        int n = Integer.parseInt(args[0]);
        boolean[] isCollected = new boolean[n];
        int count = 0;
        int distinct = 0;

        while ( distinct < n)
        {
            int r = (int) (Math.random()*n);
            count++;
            if(!isCollected[r])
            {
                isCollected[r] = true;
                distinct++;
            }

        }
        System.out.println(count);

    }
}