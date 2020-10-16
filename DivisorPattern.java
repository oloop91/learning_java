/* 

author : oloop

*/

public class DivisorPattern
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n ; i++ )
        { // for printing the ith line
            // String i_line = "";
            for (int j = 1; j<= n; j++)
            { // for printing the jth element in ith line
                if ( i%j == 0 || j%i == 0) 
                    // i_line += "* ";
                    System.out.print("* ");
                else                       
                    //  i_line += "  ";
                    System.out.print("  ");
            }
            System.out.println(i);

        }

    }
}