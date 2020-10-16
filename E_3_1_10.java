/*

author : oloop

*/

public class E_3_1_10
{
    public static String complementWatsonCrick(String s)
    {
        s = s.replace("A", "-");
        s = s.replace("T", "A");
        s = s.replace("-", "T");
        s = s.replace("C", "-");
        s = s.replace("G", "C");
        s = s.replace("-", "G");

        return s;
        
    }

    public static void main(String[] args)
    {
        StdOut.println(complementWatsonCrick(args[0]));
    }
}