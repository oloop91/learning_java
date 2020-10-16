/*

author : oloop

*/

public class E_3_1_9
{
    public static boolean isValidDNA(String s)
    {
        int n = s.length();

        for ( int i = 0; i < n; i++)
        {
            if ( !( "A".equals(Character.toString(s.charAt(i))) || 
                    "T".equals(Character.toString(s.charAt(i))) || 
                    "C".equals(Character.toString(s.charAt(i))) || 
                    "G".equals(Character.toString(s.charAt(i)))     ))
                   {
                       return false;
                   }
        }
        return true;
    }

    public static boolean isValidDNA2(String s)
    {
        String k = s.replaceAll("A","");
        k = k.replace("T","");
        k = k.replace("C","");
        k = k.replace("G","");

        if (k.length() > 0 ) return false;
        return true;
    }

    public static void main(String[] args)
    {
        StdOut.println(isValidDNA2(args[0]));
    }
}