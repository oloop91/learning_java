/*

author : oloop

*/

public class E_3_1_12
{

    public static boolean isValidISBN(int a)
    {
        int sum = 0;
        for (int i = 1; i <= 10; i++)
        {
            sum += i * (a%10);
            StdOut.println(sum);
            a = a/10;
        }

        if ( sum%11 == 0) return true;
        else return false;
    }       

    public static int last_digit(int n)
    {

        // 1.3.35
        int checksum  = 0;
        int divider;

        for (int i = 8; i >= 0; i-- )
        {
            divider = (int) Math.pow(10,i);
            checksum = checksum + (n/divider)*(i+2);
            System.out.println((n/divider)*(i+2));
            n = n%divider;
        } 

        return 11 - checksum%11;

    }
        
    public static void main(String[] args)
    {
        int isbn = Integer.parseInt(args[0].replaceAll("-",""));
        StdOut.println(isValidISBN(isbn));
    }
    


}