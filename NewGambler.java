/*

author : oloop

E_2_2_20

variables in gambling = P(probability of winning), total cash, stake, transaction_cost, goal

*/

public class NewGambler
{
    
    // StdRandomP.bernoulli(p)

    public static boolean game(int goal, int stake, double p)
    {
        int cash = stake;
        while (cash > 0 || cash < goal)
        {
            if (StdRandomP.bernoulli(p)) cash++;
            else cash--;
        }
        if (cash == goal) return true;
        else return false;
    }
    
    public static int[] game_bet(int goal, int stake, double p)
    {
        int cash = stake;
        int[] r = new int[2];
        while (cash > 0 & cash < goal)
        {
            r[1]++;
            if (StdRandomP.bernoulli(p)) cash++;
            else cash--;
            // StdOut.println(cash);
        }
        
        if (cash == goal) 
        {
            r[0] = 1;
            return r;
        }
        else 
        {
            r[0] = 0;
            return r;
        }
    }

    public static double game_kelly(int bets, double stake, double p, double k)
    {   // betting k% of stake
        double cash = stake;
        for ( int i = 0; i < bets; i++)
        {
            if (StdRandomP.bernoulli(p)) cash += k*cash;
            else cash -= k*cash;

        }
        
        return cash;
    }
    
    public static void main(String[] args)
    { // Run trials experiment to start with 
      // $stakes and terminate on $0 or $goal
        int stake  = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);
        int bets = Integer.parseInt(args[4]);
        // int goal   = Integer.parseInt(args[4]);
        // int bets  = 0;
        // int bets1 = 0;
        // int wins  = 0;
        // int bets  = 0;
        // int wins  = 0;
        double sum = 0.0;
        // double transaction_cost = 0.01*i;
        double[] payout = new double[trials];
        int count_positive = 0;
        for (int t = 0; t < trials; t++)
        {
            // int[] a = game_bet(goal, stake, p);
            // if (a[0] == 1) wins++;
            // bets += a[1];
            // // System.out.println(t + " " + a[0]);
            payout[t] = game_kelly(bets, stake, p, k);
            if ( payout[t] > stake) count_positive++;

        }
        // System.out.println(100*wins/trials + "% wins" + "\t" + "Avg # bets: " + bets/trials );

        StdOut.printf("min    : %4.2f\n" ,    StdStatsP.min(payout) );
        StdOut.printf("max    : %4.2f\n" ,    StdStatsP.max(payout) );
        double m = StdStatsP.mean(payout);
        double std = StdStatsP.stddev(payout);
        StdOut.printf("mean   : %4.2f\n" ,   m );
        StdOut.printf("stddev : %4.2f\n" , std );
        StdOut.printf("count  : %4.2f\n" , 1.0*count_positive/trials );
        StdOut.printf("new metric : %4.2f\n" , m/std );
        


    }
}