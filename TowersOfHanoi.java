/*

author : oloop

*/

public class TowersOfHanoi
{
    
    public static void shift(int n, int t1, int t2)
    {
        if ( n == 0) return;

        if      ( t2 - t1 ==  1 ) StdOut.println(n + " right");
        else if ( t1 - t2 ==  1 ) StdOut.println(n + " left" );
        else if ( t1 - t2 == -2 ) StdOut.println(n + " left" );
        else if ( t1 - t2 ==  2 ) StdOut.println(n + " right");
    }

    public static int Etower(int t1, int t2)
    {
        return 3 - t1 - t2;
    }

    public static void move(int n,int t1, int t2)
    {
        if ( n <= 0) return;
        else 
        {
            
            move(n-1,t1,Etower(t1,t2));
            // StdOut.println(" move n, t1,t2, : " + n + " " + t1 + " " + t2 );
            shift(n,t1,t2);
            move(n-1,Etower(t1,t2),t2);
        }

    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int t1 = Integer.parseInt(args[1]);
        int t2 = Integer.parseInt(args[2]);
        move(n,t1,t2);
    }
}