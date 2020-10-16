/*

author : oloop


*/

public class PotentialGene
{
    
    public static boolean isPotentialGene(String dna)
    {
        // Length is a multiple of 3
        if ( dna.length()%3 != 0 ) return false;

        // Start with start codon
        if(!dna.startsWith("ATG")) return false;

        // No intervening stop codons.
        for ( int i = 3; i < dna.length() - 3; i++)
        {
            if ( i%3 == 0 )
            {
                String codon = dna.substring(i, i+3);
                if (codon.equals("TAA")) return false;
                if (codon.equals("TAG")) return false;
                if (codon.equals("TGA")) return false;
            }
        }

        //End with a stop codon
        if (dna.endsWith("TAA")) return true;
        if (dna.endsWith("TAG")) return true;
        if (dna.endsWith("TGA")) return true;
        
        return false;

    }
    
    public static void main(String[] args)
    {
        String dna = args[0];
        StdOut.println(isPotentialGene(dna));
    }
}