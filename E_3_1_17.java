/*

author : oloop

*/

public class E_3_1_17
{
    
    public static String reverseDomain(String a)
    {
        String[] domains = a.split("\\.");
        String r = "";
        for (int i = 0; i < domains.length; i++)
        {
            r += domains[domains.length - 1 -i] + ".";
        }
        return r.substring(0,r.length()-1);
    }
    
    public static void main(String[] args)
    {
        StdOut.println(reverseDomain(args[0]));
    }
}