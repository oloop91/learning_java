/*

author : oloop

*/

public class examples_1_3
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        // double sum = 0;
        // for ( int i = 1; i <= n; i++)
        // {
        //     sum += 1.0/i;
        //     System.out.println( i + "\t" + sum + "\t\t" + (Math.log(i)+1.0/(2*i)+ 0.577));
        // }
        int product = 1;
        for (int i = 1; i <= n; i++)
            product *= i;
        System.out.println(product);
        
    }
}