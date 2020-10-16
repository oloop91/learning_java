/*

author : oloop

*/

public class E_3_1_24
{
    public static void main(String[] args)
    {
        //Split the file by column into n files
        String name = args[0];
        // int n = Integer.parseInt(args[1]);
        String delimiter = ",";

        //Create Draw pens.
        // Out[] out = new Out[n];
        Draw price = new Draw();
        // Draw volume = new Draw();

        In in = new In(name + ".csv");
        in.readLine();
        String a = in.readLine();
        double p = Double.parseDouble(a.split(delimiter)[4]);
        double v = Double.parseDouble(a.split(delimiter)[5]);
        double x = 0;
        price.setXscale(0,20000);
        price.setYscale(0, 30000);
        while ( in.hasNextLine())
        {
            //Read a line and write fields to output streams
            String line = in.readLine();
            String[] fields = line.split(delimiter);
            double p_new = Double.parseDouble(fields[4]);
            price.line(x,  p, x+1, p_new);
            x++;
            p = p_new;
            
        } 


    }
}