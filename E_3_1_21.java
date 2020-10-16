/*

author : oloop

*/

public class E_3_1_21
{

    public static void main(String[] args)
    {
        In in = new In(args[0]);
        Out out = new Out("outerr.txt");
        while(in.hasNextLine())
        {
            String s = in.readLine();
            if (s.replace(" ", "").length() != 0) out.println(s); 
        }
    }
}