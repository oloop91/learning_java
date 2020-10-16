/*

author : oloop

*/

public class StockAccount
{
    private final String name;
    private double cash;
    private int n;
    private int[] shares;
    private String[] stocks;

    public StockAccount(String filename)
    {
        //Build data structure from specified file
        In in = new In(filename);
        name = in.readLine();
        cash = in.readDouble();
        n = in.readInt();
        shares = new int[n];
        stocks = new String[n];
        for ( int i = 0; i < n; i++)
        {
            shares[i] = in.readInt();
            stocks[i] = in.readString();

        }
    }

    public void printReport()
    {
        StdOut.println(name);
        double total = cash;
        for ( int i = 0; i < n; i++)
        {
            int amount = shares[i];
            double price = StockQuote.priceOf(stocks[i]);
            total += price*amount;  
            StdOut.printf("%4d %5s %9.2f %11.2f\n", amount ,stocks[i], price, amount*price);
        }
        StdOut.printf("%20s %11.2f\n","Cash:",cash);
        StdOut.printf("%20s %11.2f\n", "Total:",total);

    }

    public void save()
    {
        Out out = new Out(name.substring(0, name.indexOf(","))+".txt");
        out.println(name);
        out.println(cash);
        out.println(n);
        double total = cash;
        for ( int i = 0; i < n; i++)
        {
            int amount = shares[i];
            double price = StockQuote.priceOf(stocks[i]);
            out.printf("%4d %5s\n", amount ,stocks[i]);
        }
        // StdOut.printf("%20s %11.2f\n","Cash:",cash);
        // StdOut.printf("%20s %11.2f\n", "Total:",total);
    }

    public double valueOf()
    {
        double total = cash;
        for ( int i = 0; i < n; i++)
        {
            int amount = shares[i];
            double price = StockQuote.priceOf(stocks[i]);
            total += price*amount;
        }
        return total;
    }

    public static void main(String[] args)
    {
        StockAccount account = new StockAccount(args[0]);
        StdOut.println(account.valueOf());
        account.save();
    }

}