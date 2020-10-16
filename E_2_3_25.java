/*

author : oloop

*/


public class E_2_3_25
{
    
    
    
    public static void unbundle(int n)
    {
        if ( n <= 0 ) return;


        unbundle(n-1);
        // StdOut.println("unbundle n : " + n + " move n gone is : " + ((2*n) - 3) );
        TowersOfHanoi.move( ((2*n) - 3) , 1 , 2);
        TowersOfHanoi.move( 2*n - 2 , 2 , 0);
        TowersOfHanoi.move( 2*n - 1 , 0 , 1);

    }

    public static void bundle(int n)
    {
        if ( n <= 1 ) return;
        TowersOfHanoi.move(n-1,2,0);
        TowersOfHanoi.move(n-2,0,2);
        bundle(n-2);

    }

    public static void newHanoi(int n)
    {
        unbundle(n);
        TowersOfHanoi.shift(2*n,2,0);
        TowersOfHanoi.move(2*n - 1, 1, 2);
        bundle(2*n - 1);
    }
    
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        newHanoi(n);
    }

}