/*

author : oloop

*/

public class Sample
{
    public static void main(String[] args)
    {   // Print a random sample of m Integers
        // from a sample of 0 to n-1
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        
        int sum = 0;
        int sum1 = 0;
        int trials = 100;

        for (int t = 0; t < trials; t++)
        { 
            int[] perm = new int[n];
            
            // System.out.println(perm[0]);
            
            // Intialize perm[]
            for (int j = 0 ; j < n; j++)
            {
                perm[j] = j;
            }

            // take sample
            for (int i = 0; i < n; i++)
            {   // Exchange perm[i] with a random element to its right
                int r = i + (int) (Math.random()*(n-i));
                int temp = perm[r];
                perm[r] = perm[i];
                perm[i] = temp; 
                if (perm[i] == 0 || perm[r]==0) System.out.println(" i : " + perm[i]+"\t" + "r : " +perm[r]);
            }        

            // Print Sample
            
            for (int k = 0; k < m; k++)
            {
                // System.out.print(perm[k] + " ");
            }
            // System.out.println();
            if (perm[0] == 0) sum++;
            if (perm[5] == 5) sum1++;
        }

        System.out.println((sum*100)/trials + "%");
        System.out.println((sum1*100)/trials + "%");


    }
}