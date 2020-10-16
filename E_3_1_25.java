/*

author : oloop

*/

public class E_3_1_25
{
    public static void main(String[] args)
    {
        String delimiter = args[0];

        In[] in = new In[args.length - 1];

        for ( int i = 0; i < in.length; i++)
        {
            in[i] = new In("./introcs-data/" + args[i+1] + ".txt");
        }

        while(in[0].hasNextLine())
        {
            String s = "";
            for ( int i = 0; i < in.length; i++)
            {
                s += in[i].readLine() + delimiter;
            }
            StdOut.println(s.substring(0,s.length() -1));
        }
    }
}