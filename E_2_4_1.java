/*

author : oloop

*/

// 1.4.16

public class E_2_4_1
{
    
    public static boolean[][] coprime(int n)
    {
        boolean[][] a = new boolean[n][n];

        int count1 = 0;;

        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
        
                a[i][j] = true;
                count1++;

            }
        }
        
        int count = 0;

        // for (int i = 2; i < n; i++)
        // {
        //     if (a[i][i])
        //     {
        //         for (int j = 1; j*i < n; j++)
        //         {                                            
        //             a[i*j][i*j] = false;
        //             for ( int k = j; k*i < n; k++ )
        //             {
        //                 a[i*k][i*j] = false;
        //                 a[i*j][i*k] = false;
        //             }
        //             count++;
        //         }
        //         a[i][i] = false;
        //     }
        //     else count++;
        // }

        
        for (int i = 2; i < n; i++)
        {   // better way to do it than the above method
            if (a[i][i])
            {
                for (int j = 1; j*i < n; j++)
                {
                    for ( int k = 1; k*i < n; k++ )
                    {
                        a[i*k][i*j] = false;
                    }
                    count++;
                }
            }
            else count++;
            
        }





        // System.out.print ("  ");
        // for (int i = 0; i < n; i++)
        // {
        //     if (i < 10)
        //     {
        //         System.out.print("0" +i + " ");
        //     }
        //     else System.out.print(i + " ");
        // }
        // System.out.println();
        // for ( int i = 0; i < n; i++)
        // {
        //     if (i < 10)
        //     {
        //         System.out.print("0" +i + " ");
        //     }
        //     else System.out.print(i + " ");
        //     for (int j = 0; j < n; j++)
        //     {
        //         String temp ;
        //         if (a[i][j]) temp = "*  ";
        //         else temp = "   ";
        //         System.out.print(temp);
        //     }
        //     System.out.println();
        // }

        // System.out.println(count);
        // System.out.println(count1);

        return a;

    }

    public static boolean[][] Hamdard(int n)
    {
        // 1.4.29

        boolean[][] a = new boolean[n][n];
        a[0][0] = true;

        int m = 1; // iterator and filler of matrix a 

        while (m < n)
        {

            for (int i = 0; i < m; i++)
            {
                for (int j = m ; j < 2*m; j++)
                {
                    a[i][j] = a[i][j-m];
                    a[j][i] = a[j-m][i];
                    a[i+m][j] = !a[i][j];
                }
            }

            m *= 2;

        }


        // for ( int i = 0; i < n; i++)
        // {
        //     for (int j = 0; j< n; j++)
        //     {
        //         if (a[i][j]) System.out.print("T ");
        //         else System.out.print("F ");
        //     }
        //     System.out.println();
        // }

        return a;
    }

    public static boolean[][] binomial(int q)
    {
              // 1.4.41
        int n = q+1;
        int[][] a = new int[n][];

        for (int i = 0; i < n; i++)
        {
            a[i] = new int[i+1];
            a[i][0] = 0;
        }
        a[1][1] = 1;
        for (int i = 2; i < n; i++)
        {
            for (int j = 1; j < a[i].length; j++)
            {
                // System.out.println("i : " + i + ", j : " + j);
                if (j == a[i].length - 1 )
                {
                    a[i][j] = ( 0 + a[i-1][j-1]);
                }
                else a[i][j] = (a[i-1][j] + a[i-1][j-1]);
                // StdOut.printf( "%3d ", a[i][j]);
            }
            // System.out.println();
        }

        boolean[][] c = new boolean[n-1][n-1];
        for ( int i = 0; i < n - 1 ; i++ )
            for ( int j = 0; j < a[i+1].length - 1; j++)
                if ( a[i+1][j+1]%2 != 0)
                {
                    c[i][j] = true;
                }

        return c;
    }


    public static void main(String[] args)
    { 
        int n = Integer.parseInt(args[0]);
        // StdArrayIO.print(coprime(n));
        // StdArrayIO.print(Hamdard(n));
        StdArrayIO.print(binomial(n));

    }
    



}