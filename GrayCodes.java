/*

author : oloop

*/

public class GrayCodes
{
    public static void enter(int n)
    {
        StdOut.println("enter "+n);
    }

    public static void exit(int n)
    {
        StdOut.println(" exit "+n);
    }


    public static void moves(int n,boolean entry)
    { 
        if ( n == 0) return;
        else 
        {
            
            moves(n - 1,true);
            if (entry) enter(n);
            else exit(n);
            moves(n - 1,false);

        }

    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        moves(n,true);
    }
}