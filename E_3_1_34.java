/*

author : oloop

*/

public class E_3_1_34
{

    public static double Entropy(String file_path)
    {
        In in = new In(file_path);
        String s = in.readAll();
        s = s.replaceAll(" ", "");
        s = s.replaceAll("\n", "");
        int n = s.length();
        double sum = 0.0;
        while ( s.length() > 0 )
        {
            String a = s.substring(0,1);
            int count = 0;
            while ( s.contains(a) )
            {
                int i = s.indexOf(a);
                count++;
                s = s.substring(0,i) + s.substring(i+1,s.length());
            }
            double p = (double) count/n;
            sum = sum - p*Math.log(p)/Math.log(2);
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        StdOut.println(Entropy(args[0]));
    }
}