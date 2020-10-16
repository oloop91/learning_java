/*

author : oloop

exercise : 3.2.30

*/

public class ChemicalElement
{
    private final int A;
    private final double M;
    private final String S;

    public ChemicalElement(String s, int a, double m)
    {
        A = a;
        M = m;
        S = s;
    }

    
    public int getAtomicNumber()
    {
        return A;
    }

    public double getAtomicWeight()
    {
        return M;
    }

    public String getSymbol()
    {
        return S;
    }

    public String toString()
    {
        return  String.format("%3s, %3d, %5.2f",S,A,M);
    }

    public static void main(String[] args)
    {
        ChemicalElement h = new ChemicalElement( "H", 1 , 1.038);
        StdOut.println(h);

    }


}