/*

author : oloop

*/

public class E_3_1_16
{
    
    public static String topDomain(String a)
    {
        String[] domains = a.split("\\.");
        // StdOut.println(a.split("\\.").length);
        // return domains[domains.length - 1];
        return domains[domains.length - 1];
    }
    
    public static void main(String[] args)
    {
        StdOut.println(topDomain(args[0]));
    }
}