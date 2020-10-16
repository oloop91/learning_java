/*

author : oloop

*/

public class E_3_1_32
{
    
    private static String smallcase = "abcdefghijklmnopqrstuvwxyz";
    private static String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String numbers = "0123456789";

    public static boolean check_type_of_character(String s, String type)
    {
        for ( int i =0; i < s.length(); i++)
        {
            if(type.contains(s.substring(i,i+1)))
            {
                return true;
            }
        }
        return false;
    }
    
    public static boolean isPasswordSafe(String s)
    {
        if ( s.length() < 8 ) return false;
        if(!check_type_of_character(s, numbers)) return false;
        if(!check_type_of_character(s, smallcase)) return false;
        if(!check_type_of_character(s, uppercase)) return false;
        boolean flag = false;
        for ( int i = 0; i < s.length(); i++)
        {
            String c = s.substring(i , i + 1);
            if ( !check_type_of_character(c,numbers) && !check_type_of_character(c,smallcase) && !check_type_of_character(c,uppercase) )
            {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        StdOut.println(isPasswordSafe(args[0]));
        // StdOut.println(check_type_of_character("1",numbers));
    }
}