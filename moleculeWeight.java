/*

author : oloop

exercise : 3.2.30

*/

public class moleculeWeight
{


    public static void main(String[] args)
    {
        String file_path = "input.txt";
        PeriodicTable p = new PeriodicTable(file_path);
        
        
        String molecule = StdIn.readString();
        double mass = 0.0;
        for ( int i = 0; i < molecule.length(); i++ )
        {
            String symbol = molecule.substring(i, i+1);
            int n = 1; 
            for ( int j = i+1; j < molecule.length(); j++)
            {
                
                if (!(new checkInteger(molecule.substring(j,j+1)).isInt()))
                {
                    // StdOut.println(i + " " + j);
                    // StdOut.println(molecule.substring(i+1,j));
                    if (j == i+1)
                    {
                        n = 1;
                    }
                    else n = Integer.parseInt(molecule.substring(i+1,j));
                    i = j-1;
                    break;
                }
                else if (j == molecule.length()-1)
                {
                    n = Integer.parseInt(molecule.substring(i+1,j+1));
                    i = j;
                    break;
                }
            }
            // StdOut.println("no. : " + n  + ", Symbol :" + symbol);
            mass += n*p.getMass(symbol);
        }
        StdOut.println(mass);
    }
}