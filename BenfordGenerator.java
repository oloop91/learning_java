/*

author : oloop

Benford's law complaint random number generator

*/

public class BenfordGenerator
{
        public static int bnumber()
    {
        double[] p_dist = {0.32, 0.17, 0.13, 0.09, 0.07, 0.07, 0.06, 0.05, 0.04};
        int n = p_dist.length;
        int num = 0;
        double r = Math.random();
        double sum = 0.0;
        for (int j = 0; j < n; j++)
        { // Find interval containing r.
            sum += p_dist[j];
            if (r < sum) { num = j+1; break; }
        }
        return num;
    }

    public static int b_fullnumber() // between 1 and 1000;
    {
        int leading_num = bnumber();
        int second_number = (int) (Math.random()*11);
        int third_number = (int) (Math.random()*11);

        int num = leading_num;

        if ( second_number != 10 ) num = num*10 + second_number;
        if ( third_number != 10 ) num = num*10 + third_number;
 
        return num;
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        
        for ( int i = 0; i < n; i++)
        {
            StdOut.println(b_fullnumber());
        }


    }
}
