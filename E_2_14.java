/*

author : oloop

*/

public class E_2_14
{
    public static long checksum_func(long n)
    {
        if ( n < 5 )  return 2 * n;
        else return (2*n/10 + 2*n%10);
    } 

    public static void main(String[] args)
    {
        long a = Long.parseLong(args[0]);
        long sum = 0;

        for ( long i = 0; i < 10; i++)
        {
            long num = (a/((long) Math.pow(10, (10 - 1 -i))))%10;
            long add;
            if (i%2 == 0) add = num;
            else add = checksum_func(num);
            sum += add;
        }

        Long shortby = -((-sum)%10);
        StdOut.println( a*10 + shortby);

    }

}