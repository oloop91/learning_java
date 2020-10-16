/*

author : oloop

exercise : 3.2.30

*/

public class PeriodicTable
{
    private final ChemicalElement[] elements;
    private final int n;

    public PeriodicTable(String file_path)
    {
        In in = new In(file_path);
        n = in.readInt();
        elements = new ChemicalElement[n];
        for ( int i = 0; i < n; i++)
        {
            elements[i] = new ChemicalElement( in.readString(), in.readInt(), in.readDouble());
        }

    }

    public double getMass(String s)
    {
        for ( int i =0 ; i < n; i++)
        {
            if (elements[i].getSymbol().equals(s))
            {
                return elements[i].getAtomicWeight();
            }
        }
        return 0.0;
    }

    public String toString()
    {
        String s = "";
        for(int i = 0; i < elements.length; i++)
        {
            s += elements[i] + "\n";
        }
        return s.substring(0, s.length() -1);
    }


    public static void main(String[] args)
    {
        String file_path = "input.txt";
        PeriodicTable p = new PeriodicTable(file_path);
        StdOut.println(p);

    }

}
