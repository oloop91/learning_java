/*

author : oloop

*/

public class StockQuote
{
    private static String readHTML(String symbol)
    {
        // return HTML corresponding to stock symbol

        In page = new In("https://finance.yahoo.com/quote/" + symbol);

        return page.readAll();
    }

    public static double priceOf(String symbol)
    {
        //Return Stock price for symbol
        String html = readHTML(symbol);
        int p       = html.indexOf("<span class=\"Trsdu(0.3s) Trsdu(0.3s) Fw(b) Fz(36px) Mb(-4px) D(b)\" data-reactid=\"14\"", 0);
        int from    = html.indexOf(">", p);
        // StdOut.println(from);
        // StdOut.println(html.substring(from + 1, from + 4));
        int to      = html.indexOf("</span>", from);
        // StdOut.println(to);
        String price = html.substring(from + 1, to);
        return Double.parseDouble(price.replaceAll(",",""));

    }

    public static void main(String[] args)
    {
        //Print the price of the stock specfied by the symbol
        String symbol = args[0];
        // StdOut.println(readHTML(symbol));
        double price = priceOf(symbol);
        StdOut.println(price);
        
    }

}