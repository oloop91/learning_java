/*

author : oloop

*/

public class BangloreTaxi
{
    public static void main(String[] args)
    {
        int count = 0;
        int n = 9999;

        for (int i = n; i > 0000; i--)
        {
            int a = i%10;
            int b = (i/10)%10;
            int c = (i/100)%10;
            int d = (i/1000);
            if ( d < c && c < b && b < a)
            {
                count++;
            }
        }
        System.out.println(count);

    }
}