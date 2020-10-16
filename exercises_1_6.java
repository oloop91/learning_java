/*

author : oloop

*/

public class exercises_1_6
{
    public static void main(String[] args)
    {
        // 1.6.1
        // double P = Integer.parseInt(args[0])/100.0;

        // int n = StdIn.readInt();
        // int[][] count = new int[n][n];
        // int[] outDegrees = new int[n];
   

        // while(!StdIn.isEmpty())
        // {
        //     int i = StdIn.readInt();
        //     int j = StdIn.readInt();
        //     outDegrees[i]++;
        //     count[i][j]++;
        // }

        // StdOut.println(n + " " + n);
        // for (int i = 0; i < n; i++)
        // {
        //     for (int j = 0; j < n; j++)
        //     {
        //        double p = P * count[i][j]/outDegrees[i] + ( 1.0 - P ) * 1/n;
        //        StdOut.printf("%8.5f" , p );
        //     }
        //     StdOut.println();
        // }


        // 1.6.2
        // double P = Integer.parseInt(args[0])/100.0;

        // int n = StdIn.readInt();
        // int[][] count = new int[n][n];
        // int[] outDegrees = new int[n];
   

        // while(!StdIn.isEmpty())
        // {

        //     int i = StdIn.readInt();
        //     int j = StdIn.readInt();
        //     if (count[i][j] < 1) 
        //     {
        //         outDegrees[i]++;
        //         count[i][j]++;

        //     }
        // }

        // StdOut.println(n + " " + n);
        // for (int i = 0; i < n; i++)
        // {
        //     for (int j = 0; j < n; j++)
        //     {
        //        double p = P * count[i][j]/outDegrees[i] + ( 1.0 - P ) * 1/n;
        //        StdOut.printf("%8.5f" , p );
        //     }
        //     StdOut.println();
        // }

        
        // 1.6.3
        // double P = 0.9;

        // int n = StdIn.readInt();
        // int[][] count = new int[n][n];
        // int[] outDegrees = new int[n];
   

        // while(!StdIn.isEmpty())
        // {
        //     int i = StdIn.readInt();
        //     int j = StdIn.readInt();
        //     outDegrees[i]++;
        //     count[i][j]++;
        // }

        // StdOut.println(n + " " + n);
        // for (int i = 0; i < n; i++)
        // {
        //     for (int j = 0; j < n; j++)
        //     {
        //        double outlink = 0.0;
        //        if ( outDegrees[i] != 0 ) outlink = P * count[i][j]/outDegrees[i];
        //        double p = outlink + ( 1.0 - P ) * 1/n;
        //        StdOut.printf("%8.5f" , p );
        //     }
        //     StdOut.println();
        // }

        //1.6.4- 1.6.12 done through textbook programs

        // 1.6.13

        // compute pageranks after trials moves - power of 2
        // int trials = Integer.parseInt(args[0]);
        // // int destination = Integer.parseInt(args[1]);
        // int n = StdIn.readInt();
        // StdIn.readInt();

        // // Read Transition Matrix
        // double[][] p = new double[n][n];
        // for (int i = 0; i < n; i++)
        // {
        //     for (int j = 0; j < n; j++)
        //     {
        //         p[i][j] = StdIn.readDouble();
        //     }
        // }

        
        
        // for (int t = 0; t < trials; t++)
        // {   //compute effect of next move on page ranks
        //     double[][] newp = new double[n][n];
        //     for ( int i = 0; i < n; i++)
        //     {   
        //         for ( int j = 0; j < n; j++)
        //         {
        //             double sum = 0.0;
        //             for (int k = 0; k < n; k++)
        //             {
        //                 sum += p[i][k] * p[k][j];
        //             }
        //             newp[i][j] = sum;
                    
        //         }
        //     }

        //     for ( int i = 0; i < n; i++)
        //     {
        //         for (int j = 0; j < n; j++)
        //         {
        //             p[i][j] = newp[i][j];
        //         }
        //     }
        // }

        // for (int i = 0; i < n; i++)
        // {
        //     for ( int j = 0; j < n; j++)
        //     { 
        //         StdOut.printf("%8.5f", p[i][j]);
        //     }
        //     StdOut.println();
        // }
        // // StdOut.printf("%8.5f", ranks[destination]);
        // StdOut.println();

        // 1.6.14
        // int n = Integer.parseInt(args[0]);
        // int m = Integer.parseInt(args[1]);
        // int t = n*n;
        // int[][] combinations = new int[t][2];

        // int k = 0;
        // for (int i = 0; i < n; i ++)
        // {
        //     for (int j = 0; j < n; j++)
        //     {
        //         combinations[k][0] = i; 
        //         combinations[k][1] = j;
        //         k++;
        //     }
        // }

        // int[] cshuffle = new int[t];

        // for ( int i = 0; i < t; i++)
        // {
        //     cshuffle[i] = i;
        // }

        // for ( int i = 0; i < t; i++)
        // {
        //     int r = i + ((int) (Math.random()*(t-i)));
        //     int temp = cshuffle[i];
        //     cshuffle[i] = cshuffle[r];
        //     cshuffle[r] = temp;
        // }

        // if ( m > t)
        // {
        //     StdOut.println("number of demanded links greater than theoretically possible links");
        //     m = t;
        // }
        
        // StdOut.println(n);

        
        // for (int i = 0; i < m; i++)
        // {
        //     int c1 = combinations[cshuffle[i]][0];
        //     int c2 = combinations[cshuffle[i]][1];
        //     StdOut.println(c1 + " " + c2);
        // }

        // 1.6.15
        // int n = Integer.parseInt(args[0]);
        // int m = Integer.parseInt(args[1]);
        // int t = n*n;
        // int[][] combinations = new int[t][2];

        // int k = 0;
        // for (int i = 0; i < n; i ++)
        // {
        //     for (int j = 0; j < n; j++)
        //     {
        //         combinations[k][0] = i; 
        //         combinations[k][1] = j;
        //         k++;
        //     }
        // }

        // int[] cshuffle = new int[t];

        // for ( int i = 0; i < t; i++)
        // {
        //     cshuffle[i] = i;
        // }

        // for ( int i = 0; i < t; i++)
        // {
        //     int r = i + ((int) (Math.random()*(t-i)));
        //     int temp = cshuffle[i];
        //     cshuffle[i] = cshuffle[r];
        //     cshuffle[r] = temp;
        // }

        // if ( m > t)
        // {
        //     StdOut.println("number of demanded links greater than theoretically possible links");
        //     m = t;
        // }
        
        // int hubs = 3;
        // int authorities = 3;

        // int n1 = n + hubs + authorities;
        // StdOut.println(n1);
        // for (int i = 0; i < m; i++)
        // {
        //     int c1 = combinations[cshuffle[i]][0];
        //     int c2 = combinations[cshuffle[i]][1];
        //     StdOut.println(c1 + " " + c2);
        // }
        

        // int[] shuffle = new int[n];

        // for ( int i = 0; i < n; i++)
        // {
        //     shuffle[i] = i;
        // }

        // for ( int i = 0; i < n; i++)
        // {
        //     int r = i + ( (int) (Math.random()*(n-i)));
        //     int temp = shuffle[i];
        //     shuffle[i] = shuffle[r];
        //     shuffle[r] = shuffle[i];
        // }

        // int cut = (int) (0.1*n);

        // for ( int i = 0; i < hubs; i++)
        // {
        //     for ( int j = 0; j < cut; j++)
        //     {
        //         StdOut.println(shuffle[j] + " " +(n+i));
        //     }
        // }

        // for ( int i = 0; i < authorities; i++)
        // {
        //     for ( int j = 0; j < cut; j++)
        //     {
        //         StdOut.println((n + hubs +i) + " " + shuffle[j]);
        //     }
        // }

        // 1.6.17
        // int trials = Integer.parseInt(args[0]);
        // int n = StdIn.readInt();
        // StdIn.readInt();

        // // Read Transition Matrix
        // double[][] p = new double[n][n];
        // for (int i = 0; i < n; i++)
        // {
        //     for (int j = 0; j < n; j++)
        //     {
        //         p[i][j] = StdIn.readDouble();
        //     }
        // }
        
        // double[] freq = new double[n];
        // for ( int i = 0; i < n; i++)
        // {  
        //     int opage = i;
        //     int attempts = 0;
        //     int page = opage;
        //     for (int t = 0; t < trials; t++)
        //     {
        
        //         boolean repeated = false;
        //         while (!repeated)
        //         { 
        //             double r = Math.random();
        //             double sum = 0.0;
        //             for (int j = 0; j < n; j++)
        //             {
        //                 sum += p[page][j];
        //                 if ( r < sum ) 
        //                 {
        //                     page = j;
        //                     break;
        //                 }
        //             }
        //             attempts++;
        //             if ( page == opage ) repeated = true;
        //         }  
        //     }
        //     freq[opage] = attempts;
        // }
            
        
        // for (int i = 0; i < n; i++)
        // {
        //     StdOut.printf("%10.5f", (double) freq[i]/trials);
        // }
        // StdOut.println();


        // 1.6.18
        int trials = Integer.parseInt(args[0]);
        int n = StdIn.readInt();
        StdIn.readInt();

        // Read Transition Matrix
        double[][] p = new double[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                p[i][j] = StdIn.readDouble();
            }
        }
        
        int cover_time = 0;
        for (int t = 0; t < trials; t++)
        {
            int page = 0;
            boolean[] check = new boolean[n];
            check[0] = true;
            int page_counter = 1;
            while(true)
            {
                double r = Math.random();
                double sum = 0.0;
                for (int j = 0; j < n; j++)
                {
                    sum += p[page][j];
                    if ( r < sum ) 
                    {
                        page = j;
                        break;
                    }
                }
                cover_time++;
                if (!check[page]) 
                {
                    check[page] = true;
                    page_counter++;
                    if (page_counter == n)
                    {
                        break;
                    }
                }
            }
                 
        }

        StdOut.printf("%10.5f", (double) cover_time/trials);
        
        
        StdOut.println();
        



    }
}