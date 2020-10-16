/*

author : oloop

variables in gambling = P(probability of winning), total cash, stake, transaction_cost, goal

*/

public class Gambler
{
    public static void main(String[] args)
    { // Run trials experiment to start with 
      // $stakes and terminate on $0 or $goal
        int stake  = Integer.parseInt(args[0]);
        int goal   = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        // int bets  = 0;
        // int bets1 = 0;
        // int wins  = 0;
        for ( int i = 0; i <10 ; i++)
        {
            int bets  = 0;
            int bets1 = 0;
            int wins  = 0;
            double transaction_cost = 0.01*i;
            for (int t = 0; t < trials; t++)
            {
                // int cash = stake;
                double cash = (double) stake;
                while (cash > 0 && cash < goal)
                {
                    bets++;
                    if (Math.random() < 0.514) 
                    {
                        // cash++;
                        cash = cash + 1.0 - transaction_cost;
                        bets1++;
                    }
                    else cash = cash - 1.0 - transaction_cost; //cash--;
                    
                }
                if (cash >= goal) wins++;
            }
        System.out.println(100*wins/trials + "% wins" + "\t" + "Avg # bets: " + bets/trials + "\t" + "transaction_cost : " + transaction_cost );
        // System.out.println("Avg # bets: " + bets/trials );
        }


    }
}