/*

author : oloop

*/

public class checkInteger
{

    private final char test;

    public checkInteger(String a)
    {
        test = a.charAt(0);
    }

    public boolean isInt()
    {
        String ints = "0123456789";
        for ( int i = 0 ; i < 10; i++)
        {
            if (test == ints.charAt(i))
            {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args)
    {
        StdOut.println(new checkInteger("4").isInt());
    }
}