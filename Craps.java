/*

author : oloop

E_2_2_16
*/

public class Craps
{

    public static int Ndice()
    {
        return StdRandomP.uniform(6) + StdRandomP.uniform(6) + 2;  
    }

    public static int Ldice(double p)
    {
        double[] prob = {p, 1.0/6 , 1.0/6 , 1.0/6, 1.0/6, 2.0/6 - p};
        return StdRandomP.discrete(prob) + StdRandomP.discrete(prob) + 2;
    }

    public static boolean pass()
    {
        int x = Ndice();
        if ( x == 7 || x == 11 ) return true;
        else if ( x == 2 || x == 3 || x == 12 ) return false;

        while(true)
        {
            int y = Ndice();
            if (y == x) return true;
            else if ( y == 7) return false;
        }

    }

    public static boolean pass(double p)
    {
        int x = Ldice(p);
        if ( x == 7 || x == 11 ) return true;
        else if ( x == 2 || x == 3 || x == 12 ) return false;

        while(true)
        {
            int y = Ldice(p);
            if (y == x) return true;
            else if ( y == 7) return false;
        }

    }

    public static double passprob(int trials)
    {
        int count = 0;
        for ( int i = 0; i < trials; i++)
        {
            if ( pass() ) count++;
        }

        return 1.0*count / trials;
    }

    public static double passprob(int trials, double p)
    {
        int count = 0;
        for ( int i = 0; i < trials; i++)
        {
            if ( pass(p) ) count++;
        }

        return 1.0*count / trials;
    }

    public static void main(String[] args)
    {
        double p = Double.parseDouble(args[0]);
        int trials = Integer.parseInt(args[1]);
        StdOut.printf("Standard : %.3f, Loaded : %.3f\n",passprob(trials), passprob(trials,p));
    }

}