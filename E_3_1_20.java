/*

author : oloop

*/

public class E_3_1_20
{   
    
    public static String[] PotentialGeneFinder(String dna)
    {
        String[] c = {"",dna};

        int index = dna.indexOf("ATG");
        if ( index == -1)
        {
            return c;
        }
        // StdOut.println(index);

        int index_end = index;

        for ( int i = 3; i < dna.length(); i++)
        {
            if ( i%3 == 0 )
            {
                
                String codon = dna.substring(i, i+3);
                // StdOut.println(codon);
                if (codon.equals("TAA")) 
                {
                    index_end = i+3;
                    break;
                }
                if (codon.equals("TAG")) 
                {
                    index_end = i+3;
                    break;
                }
                if (codon.equals("TGA")) 
                {
                    index_end = i+3;
                    break;
                }
            }
        }

        // StdOut.println(index_end);
        if ( index == index_end ) return c;
        // StdOut.println(dna.substring(index, index_end));
        
        String[] b = {dna.substring(index, index_end), dna.substring(index_end, dna.length())};
        return b;
    }

    public static void PotentialGenes(String dna)
    {
        String[] c = PotentialGeneFinder(dna);

        if ( c[0].length() == 0 ) return;

        StdOut.println(c[0]);
        PotentialGenes(c[1]);

    }
    
    public static void main(String[] args)
    {
        String dna = args[0];
        // StdOut.println(PotentialGeneFinder(dna)[0]);
        PotentialGenes(dna);
    }
}