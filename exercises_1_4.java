/*

author : oloop

*/

public class exercises_1_4
{
    public static void main(String[] args)
    {
        // 1.4.1
        // double[] a;
        // a = new double[1000];
        // for ( int i = 0; i<1000; i++)
        // {
        //     a[i] = i;
        // }
        // System.out.println(a[1000]);

        // 1.4.2
        // int n = 1000;
        // int[] a = new int[n*n*n*n];
        // System.out.println(a[1000]);

        // 1.4.3 Euclidean distance
        // int n = Integer.parseInt(args[0]);
        // double[] a1 = new double[n];
        // double[] a2 = new double[n];

        // for (int i = 0; i<n; i++)
        // {
        //     a1[i] = (Math.random()*n);
        //     a2[i] = (Math.random()*n);
        // }

        // double sum = 0;
        // for (int i = 0; i<n; i++) // could have done the calculation in the above loop
        // {
        //     double diff = a1[i] - a2[i];
        //     sum += diff*diff; 
        // }

        // Double EuclideanDistance = Math.sqrt(sum);
        // System.out.println(EuclideanDistance);

        // 1.4.4
        // String[] a = {"Pradeep", "Sandeep", "Rahul", "Citto", "Bitto", "Bhalu", "kinger"};
        // int n = a.length;
        // for (int i=0; i < n/2; i++)
        // {
        //     String temp = a[i];
        //     a[i] = a[n-i-1];
        //     a[n-i-1] = temp;
        // }

        // for (int j = 0; j<n; j++)
        // {
        //     System.out.println(a[j]);
        // }

        // 1.4.5
        // int n = Integer.parseInt(args[0]);

        // boolean[][] a = new boolean[n][n];

        // for (int i = 0 ; i < n; i++)
        // {
        //     for (int j = 0; j<n; j++)
        //     {
        //         boolean temp;
        //         if (Math.random() <0.5) temp = true;
        //         else temp = false;
        //         a[i][j] = temp;
        //     }
        // }

        // System.out.print(" ");
        // for (int j = 0; j< n; j++)
        // {
        //     System.out.print(j);
        // }
        // System.out.println();

        // 1.4.6
        // for ( int i = 0; i < n; i++)
        // {
        //     System.out.print(i);
        //     for (int j = 0; j < n; j++)
        //     {
        //         String temp ;
        //         if (a[i][j]) temp = "*";
        //         else temp = " ";
        //         System.out.print(temp);
            
        //     }
        //     System.out.println();

        // }

        // 1.4.7
        // int[] a = new int[10];
        // for (int i = 0; i < 10; i++)
        // a[i] = 9 - i;
        // for (int i = 0; i < 10; i++)
        // a[i] = a[a[i]];
        // for (int i = 0; i < 10; i++)
        // System.out.println(a[i]);

        // 1.4.10 Deal
        // int n = Integer.parseInt(args[0]);


        // String[] deck = new String[52];
        // String[] suit = { "Hearts", "Clubs","Diamonds", "Spades"};
        // String[] rank = {"King", "Queen","Jack","Ace","2","3","4","5","6","7","8","9","10"};

        
        // for (int i = 0; i < suit.length; i++)
        // {
        //     for (int j = 0; j<rank.length; j++ )
        //     {
        //         deck[suit.length*j + i] = rank[j] + " of " + suit[i];
                
        //     }
        // }

        // for (int i = 0; i< deck.length; i++)
        // {
        //     int r = (int) (Math.random()*deck.length);
        //     String temp = deck[i];
        //     deck[i] = deck[r];
        //     deck[r] = temp;
        // }


        // if (n%5 == 0)
        // {
        //     for (int i = 0; i < n*5; i++)
        //     {
        //         if ( i%5 == 0 && i!=0)
        //         {
        //             System.out.println();
        //             System.out.println();
        //             System.out.print(deck[i] + " ");
        //         }
        //         else System.out.print(deck[i] + " ");
        //     }
        // }
        // else System.out.println("not a multiple of 5");

        // System.out.println();

        // 1.4.11

        // System.out.println(args.length);

        // 1.4.12

        // int[] a = new int[args.length];

        // int sum = 0;
        // for (int i = 0; i<a.length; i++)
        // {
        //     a[i] = Integer.parseInt(args[i]);
        //     sum += a[i];
        // }

        // // int r = (int) (sum*Math.random() + 1) ;
        // // int psuedoR;
        // int count = 0;
        // int trials = 1000;
        // for (int j = 0; j < trials; j++)
        // { 
        //     int r = (int) (sum*Math.random() + 1) ;
        //     for (int i = 0; i < a.length; i++)
        //     {
        //         r -= a[i];
        //         if (r <=0 )
        //         {
        //             System.out.println(a[i]);
        //             if ( a[i] == a[0])
        //             {
        //                 count++;
        //             }
        //             break;
        //         }
        //     }
        // }
        // System.out.println((100*count)/trials);

        

        // // int[] a1 = new int[sum];
        // // int m = 0;
        // // for (int i = 0; i<a.length; i++)
        // // {
        // //     for (int k = 0; k < a[i]; k++)
        // //     {
        // //         a1[m] = a[i];
        // //         m++;
        // //     }
        // // }

        // // System.out.println(a1[((int) (sum*Math.random()))]);


        // 1.4.13
        // int n = 10;
        // int m = 10;

        // // square
        // double[][] a = new double[n][n];

        // for ( int i = 0; i < n;i++ )
        // {
        //     for (int j = 0; j < n; j++)
        //     {
        //         a[i][j] = j*Math.random();
        //     }
        // }

        // double[][] b = new double[n][n];

        // for (int i = 0; i < n; i++)
        // {
        //     for (int j = 0; j<n; j++)
        //     {
        //         b[i][j] = a[i][j];
        //     }
        // }

        // // rectangle
        // double[][] a = new double[m][n];

        // for ( int i = 0; i < m;i++ )
        // {
        //     for (int j = 0; j < n; j++)
        //     {
        //         a[i][j] = j*Math.random();
        //     }
        // }

        // double[][] b = new double[m][n];

        // for (int i = 0; i < m; i++)
        // {
        //     for (int j = 0; j<n; j++)
        //     {
        //         b[i][j] = a[i][j];
        //     }
        // }

        // // ragged array

        // for (int i = 0; i < n; i++)
        // {
        //     for (int j = 0; j < a[i].length; j++)
        //     {
        //         b[i][j] = a[i][j];
        //     }
        // }
        // int n = 10;
        // int[][] a = new int[n][];  //= {10,20,30};
        
        // for (int i = 0; i<n; i++)
        // {
        //     int length = 2 + ((int) (Math.random()*5));
        //     a[i] = new int[length];
        //     for (int j = 0; j < length; j++)
        //     {
        //         a[i][j] = (int) (Math.random()*length);
        //     }
        // }

        // for (int i = 0; i< a.length; i++)
        // {
        //     for (int j = 0; j < a[i].length; j++)
        //     {
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        // int[][] b = new int[a.length][];

        // for (int i = 0; i < a.length; i++)
        // {
        //     b[i] = new int[a[i].length];
        //     for (int j = 0; j<a[i].length; j++)
        //     {
        //         b[i][j] = a[i][j];
        //     }
        // }

        // for (int i = 0; i< b.length; i++)
        // {
        //     for (int j = 0; j < b[i].length; j++)
        //     {
        //         System.out.print(b[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        

        // 1.4.14
        // int m = 15;
        // int n = 5;
        // int[][] a = new int[m][n];

        // for ( int i = 0; i < m; i++)
        // {
        //     for ( int j = 0; j < n; j++)
        //     {
        //         a[i][j] = (int) (Math.random()*100);
        //         System.out.print(a[i][j] + "\t");
        //     }
        //     System.out.println();
        // }
        // System.out.println("------------------------------");

        // for ( int i = 0; i < n; i++)
        // {
        //     for ( int j= 0; j< m; j++)
        //     {
        //         System.out.print(a[j][i] + "\t");
        //     }
        //     System.out.println();
        // }


        // 1.4.15
        
        // int n = 5;
        // int[][] a = new int[n][n];

        // for ( int i = 0; i < n; i++)
        // {
        //     for ( int j = 0; j < n; j++)
        //     {
        //         a[i][j] = (int) (Math.random()*100);
        //         System.out.print(a[i][j] + "\t");
        //     }
        //     System.out.println();
        // }
        // System.out.println("------------------------------");

        // // transposing without creating another array
        // for ( int i = 0; i < n; i++)
        // {
        //     for ( int j = 0; j < n; j++)
        //     {
        //         int temp = a[i][j];
        //         a[i][j] = a[j][i];
        //         a[j][i] = temp;
                
        //     }
            
        // }

        // for ( int i = 0; i < n; i++)
        // {
        //     for ( int j= 0; j< n; j++)
        //     {
        //         System.out.print(a[j][i] + "\t");
        //     }
        //     System.out.println();
        // }


        // 1.4.16
        // int n = Integer.parseInt(args[0]);
        // boolean[][] a = new boolean[n][n];

        // int count1 = 0;
        // for (int i = 0; i < n; i++)
        // {
        //     for (int j = 0; j < n; j++)
        //     {
        
        //         a[i][j] = true;
        //         count1++;

        //     }
        // }
        
        // int count = 0;

        // // for (int i = 2; i < n; i++)
        // // {
        // //     if (a[i][i])
        // //     {
        // //         for (int j = 1; j*i < n; j++)
        // //         {                                            
        // //             a[i*j][i*j] = false;
        // //             for ( int k = j; k*i < n; k++ )
        // //             {
        // //                 a[i*k][i*j] = false;
        // //                 a[i*j][i*k] = false;
        // //             }
        // //             count++;
        // //         }
        // //         a[i][i] = false;
        // //     }
        // //     else count++;
        // // }

        
        // for (int i = 2; i < n; i++)
        // {   // better way to do it than the above method
        //     if (a[i][i])
        //     {
        //         for (int j = 1; j*i < n; j++)
        //         {
        //             for ( int k = 1; k*i < n; k++ )
        //             {
        //                 a[i*k][i*j] = false;
        //             }
        //             count++;
        //         }
        //     }
        //     else count++;
            
        // }





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


        // 1.4.17
        // double[][] a = 
        // { 
        //     { 99.0, 85.0, 98.0, 0.0 }, 
        //     { 98.0, 57.0, 79.0, 0.0 }, 
        //     { 92.0, 77.0, 74.0, 0.0 }, 
        //     { 94.0, 62.0, 81.0, 0.0 }, 
        //     { 99.0, 94.0, 92.0, 0.0 }, 
        //     { 80.0, 76.5, 67.0, 0.0 }, 
        //     { 76.0, 58.5, 90.5, 0.0 }, 
        //     { 92.0, 66.0, 91.0, 0.0 }, 
        //     { 97.0, 70.5, 66.5, 0.0 }, 
        //     { 89.0, 89.5, 81.0, 0.0 }, 
        //     {  0.0,  0.0,  0.0, 0.0 } 
        // };

        // double[] weights = { 0.25, 0.25, 0.5};

        // int m = 10;
        // int n = 3;

        // for (int i = 0; i < m; i++)
        // {
        //     double wSum = 0;
        //     for (int j = 0; j < n; j++)
        //     {
        //         wSum += a[i][j]*weights[j]; 
        //     }
        //     a[i][3] = wSum;
            
        // }

        // for (int i = 0; i < 10; i++)
        // {
        //     for (int j = 0; j<4; j++)
        //     {
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // 1.4.18

        // two matrices mXn and nXp;

        // double[][] l = new double[m][n];
        // double[][] r = new double[n][p];
        // // declare the new matrix;
        // double[][] dotProduct = new double[m][p];

        // for (int i = 0; i < m; i++)
        // {
        //     for (int j = 0; j < p; j++)
        //     {
        //         double sum = 0;
        //         for (int k = 0; k < n; k++)
        //         {
        //             sum += l[i][k]*r[k][j];
        //         }
        //         dotProduct[i][j] = sum;
        //     }
        // }

        // if (l[0].length != r.length)
        // {
        //     System.out.println(" Invalid matrix multiplication ")
        // }


        // 1.4.19
        // int n =15;
        // boolean[][] a1 = new boolean[n][n];
        // boolean[][] a2 = new boolean[n][n];

        // for (int i = 0; i < n; i++)
        // {
        //     for (int j = 0; j < n; j++)
        //     {
        //         a1[i][j] = (Math.random() > 0.5);
        //     }
        // }

        // for (int i = 0; i < n; i++)
        // {
        //     for (int j = 0; j < n; j++)
        //     {
        //         a2[i][j] = (Math.random() > 0.5);
        //     }
        // }

        // // multiplication
        // boolean[][] product = new boolean[n][n];

        // for (int i = 0; i < n; i++)
        // {
        //     for (int j =0; j<n; j++)
        //     {
        //         product[i][j] = (product[i][j] || (a1[i][j] && a2[j][i]));
        //     }
        // }

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
        //         if (product[i][j]) temp = "*  ";
        //         else temp = "   ";
        //         System.out.print(temp);
        //     }
        //     System.out.println();
        // }


        // 1.4.20

        // int n = Integer.parseInt(args[0]);
        // int trials = Integer.parseInt(args[1]);
        // int deadEnds = 0;
        // int escapePathLength = 0;
        // int deadEndPathLength = 0;
        
        // for (int t = 0; t < trials; t++)
        // {
        //     int pathLength = 0;
        //     boolean[][] a = new boolean[n][n];
        //     int x = n/2, y = n/2;
        //     boolean flag_of_deadEnd = false;
        //     while ( x > 0 && x < n-1 && y > 0 && y < n-1)
        //     {
        //         a[x][y] = true;
        //         if ( a[x-1][y] && a[x+1][y] && a[x][y-1] && a[x][y+1])
        //         {
        //             deadEnds++;
        //             deadEndPathLength += pathLength;
        //             flag_of_deadEnd = true; 
        //             break;
        //         }
        //         int k = x+y; // to add path length only if it moves
        //         double r = Math.random();
        //         if  (r < 0.25) x--;
        //         else if (r < 0.5) x++;
        //         else if (r < 0.75) y--;
        //         else y++;
        //         
        //         if (x+y - k != 0) pathLength++;  
        //     }
        //     if (!flag_of_deadEnd) escapePathLength += pathLength;

        // }
        // System.out.println(100*deadEnds/trials + "% deadEnds");
        // double deadEndsProbability = deadEnds/(1.0*trials);
        // double averagePathLength = deadEndsProbability*deadEndPathLength + (1-deadEndsProbability)*escapePathLength;

        // System.out.println("Dead End Path Length : " + deadEndPathLength);
        // System.out.println("escape path length : " + escapePathLength);
        // System.out.println("average path length : "+ averagePathLength);


        // // 1.4.21
        // int n = Integer.parseInt(args[0]);
        // int trials = Integer.parseInt(args[1]);
        // int deadEnds = 0;
        // int area = 0;
        
        // for (int t = 0; t < trials; t++)
        // {

        //     boolean[][] a = new boolean[n][n];
        //     int x = n/2, y = n/2;
            
        //     int xmax = x, xmin = x, ymax = y, ymin = y;
            
        //     while ( x > 0 && x < n-1 && y > 0 && y < n-1)
        //     {
        //         a[x][y] = true;
        //         if ( a[x-1][y] && a[x+1][y] && a[x][y-1] && a[x][y+1])
        //         {
        //             deadEnds++;
                    
        //             area += (ymax - ymin)*(xmax - xmin);

        //             break;
        //         }
        //         double r = Math.random();
        //         if  (r < 0.25) x--;
        //         else if (r < 0.5) x++;
        //         else if (r < 0.75) y--;
        //         else y++;
        //         if ( x > xmax) xmax = x;
        //         if (x < xmin) xmin = x;
        //         if (y > ymax) ymax = y;
        //         if (y < ymin) ymin = y;

        //     }
        // }

        // System.out.println(100*deadEnds/trials + "% deadEnds");
        // System.out.println("average area : " + area/deadEnds );


        // 1.4.22
        // int[] frequencies = new int[13];
        // for (int i = 1; i <= 6; i++)
        // {
        //     for (int j = 1; j <= 6; j++)
        //     {
        //         frequencies[i+j]++;
        //     }
        // }

        // double[] probabilities = new double[13];
        // for (int k =1; k <= 12; k++)
        // {
        //     probabilities[k] = frequencies[k]/36.0;
        // }


        // int trials = Integer.parseInt(args[0]);
        // double[] realProb = new double[13];

        // for (int t = 0; t < trials; t++)
        // {
        //     int dice1 = 1 + ((int) (Math.random()*6));
        //     int dice2 = 1 + ((int) (Math.random()*6));
        //     realProb[dice1+dice2] += 1.0/trials;
        // }

        // for (int k =1; k <= 12; k++)
        // {
        //     System.out.println("Experimental "+ k + " is : " + Math.round(realProb[k]*10000)/10000.0);
        //     System.out.println("Theoretical "+ k + " is : " + Math.round(10000*probabilities[k])/10000.0);
        // }

        // 1.4.23
        // int n = 10; // length of the array
        // int[] landscape = new int[n];

        // for (int i = 0; i < n; i++)
        // {
        //     landscape[i] = Integer.parseInt(args[i]);
        // }


        // // finding the plateau
        // int mloc = 0;
        // int loc = 0;
        // int macrolength = 0;
        // boolean searchon = false;
        // int length = 0;
        // for (int i = 1; i < n-1 ; i++)
        // {   
            
        //     if (searchon)
        //     {
        //         if (landscape[i] == landscape [i-1])
        //         {
        //             length++;
        //         }
        //     }

        //     if ( (landscape[i-1] < landscape[i] && landscape[i]==landscape[i+1]))
        //     {
        //         searchon = true;
        //         loc = i;
        //         length = 1;
        //     }

        //     if (landscape[i+1] < landscape[i] && landscape[i]==landscape[i-1])
        //     {
        //         searchon = false;
        //         if ( length > macrolength) 
        //         {
        //             mloc = loc;
        //             macrolength = length;
        //         }
                
        //     }

            
        // }

        // System.out.print( "00 || ");
        // for ( int i = 0; i < n; i++)
        // {
        //     // if (landscape[i] < 10)
        //     // { 
        //     //     System.out.print( "0" + landscape[i] + " ");
        //     // }
        //     // else 
        //     System.out.print( landscape[i] + " ");
            
        //     if (i%5 == 4)
        //     {
        //         System.out.println();
        //         System.out.print((i+1)+ " || ");
        //     }
        // }
        // System.out.println();
        
        // System.out.println("loc : " + mloc + ", length : " + macrolength);


        // 1.4.24 Shuffle Test
        // int m = Integer.parseInt(args[0]);
        // int n = Integer.parseInt(args[1]);
        // int[][] counter = new int[m][m];


        // for ( int k = 0; k < n; k++)
        // {
        //     int[] a = new int[m];

        //     for (int j = 0; j < m; j++)
        //     {
        //         a[j] = j;
        //     }

        //     for (int i = 0; i < m; i++)
        //     {
        //         int r = i + (int) (Math.random()*(m-i));
        //         int temp = a[i];
        //         a[i] = a[r];
        //         a[r] = temp;
        //         counter[a[i]][i]++;
        //     }

        // }

        // // printer
        // System.out.print("   ");
        // for (int i = 0; i < m; i++)
        // {
        //     if (i < 10) System.out.print("0"+i+ " ");
        //     else System.out.print(i + " ");
        // }
        // System.out.println();
        // for (int i = 0; i < m; i++)
        // {
        //     if (i < 10) System.out.print("0"+i+ " ");
        //     else System.out.print(i + " ");

        //     for (int j = 0; j < m; j++)
        //     {
        //         int t = counter[i][j];
        //         if (t < 10) System.out.print("0"+t+ " ");
        //         else System.out.print(t + " ");
        //     }
        //     System.out.println();
        // }

        // 1.4.25
        // int m = Integer.parseInt(args[0]);
        // int n = Integer.parseInt(args[1]);
        // int bad = Integer.parseInt(args[2]);
        // int[][] counter = new int[m][m];


        // for ( int k = 0; k < n; k++)
        // {
        //     int[] a = new int[m];

        //     for (int j = 0; j < m; j++)
        //     {
        //         a[j] = j;
        //     }

        //     for (int i = 0; i < m; i++)
        //     {
        //         int r;
        //         if (bad == 0)
        //         { 
        //             r = i + (int) (Math.random()*(m-i));
        //         }
        //         else 
        //         {
        //             r = 0 + (int) (Math.random()*(m-0));
        //         }
        //         int temp = a[i];
        //         a[i] = a[r];
        //         a[r] = temp;
        //         // counter[a[i]][i]++;
        //     }

        //     for (int i = 0; i < m; i++)
        //     {
        //         counter[a[i]][i]++;
        //     }

        // }

        // // printer
        // System.out.print("   ");
        // for (int i = 0; i < m; i++)
        // {
        //     if (i < 10) System.out.print("0"+i+ " ");
        //     else System.out.print(i + " ");
        // }
        // System.out.println();
        // for (int i = 0; i < m; i++)
        // {
        //     if (i < 10) System.out.print("0"+i+ " ");
        //     else System.out.print(i + " ");

        //     for (int j = 0; j < m; j++)
        //     {
        //         int t = counter[i][j];
        //         if (t < 10) System.out.print("0"+t+ " ");
        //         else System.out.print(t + " ");
        //     }
        //     System.out.println();
        // }

        // 1.4.26
        // int n = 100;
        // int[] a = new int[n];
        
        // for (int i = 0; i < n; i++)
        // {   
        //     a[i] = i;
        // }

        // // Shuffle
        // int trials = 1000;
        // int count = 0; // sequence counter

        // for ( int t = 0; t < trials; t++)
        // {

        //     for (int i = 0; i < n; i++)
        //     {
        //         int r = i + ((int) (Math.random()*(n-i)));
        //         int temp = a[i];
        //         a[i] = a[r];
        //         a[r] = temp;
        //         System.out.print(a[i]+ " ");
        //     }
            
        //     for (int j = 0; j < n-1; j++)
        //     {
        //         if ( a[j]+1 == a[j+1])
        //         {
        //             count++;
        //             System.out.print("negative flag");
        //             break;
        //         }
        //     }

        //     System.out.println();

        // }

        // System.out.println("probability : " + Math.round(100*(1.0 - (1.0*count)/trials))+ "%");

        // 1.4.27
        // int n = Integer.parseInt(args[0]);
        // int m = Integer.parseInt(args[1]);
        // int[] a = new int[n];
        // int totalLrm = 0;
        // for (int k = 0; k < m; k++)
        // {
        //     for(int i = 0; i < n; i++)
        //     {
        //         a[i] = i;
        //     }
        //     // shuffle
        //     for ( int i = 0; i < n; i++)
        //     {
        //         int r = i + ((int) (Math.random()*(n-i)));
        //         int temp = a[i];
        //         a[i] = a[r];
        //         a[r] = temp;
        //         // System.out.print(a[i] + " ");
        //     }
        //     // System.out.print("|| ");
        //     // left to right minima

        //     int lrm = 0;
        //     int min = a.length;
        //     for( int i = 0; i < n; i++)
        //     {
        //         if (a[i] < min)
        //         {
        //             min = a[i];
        //             lrm++;
        //             // System.out.println(" min : "+ min+ " lrm : " + lrm);
        //         }
        //     }

        //     // System.out.println(lrm);
        //     totalLrm += lrm;
        // }
        // double averageLrm = totalLrm/(1.0*m);
        // System.out.println("average lrm : " + averageLrm);

        // double harmonic = 0.0;
        // for (int i = 1; i <= n; i++)
        // {
        //     harmonic += 1.0/i;
        // }

        // System.out.println(harmonic);


        // 1.4.28
        // int n = args.length;
        // int[] a = new int[args.length];

        // for (int i = 0; i < n; i++)
        // {
        //     a[i] = Integer.parseInt(args[i]);
        // }

        // boolean[] checker = new boolean[n];
        // for (int i = 0; i < n; i++)
        // {
        //     checker[a[i]] = true;
        // }

        // boolean flag = true;
        // for (int i = 0; i < n; i++)
        // {
        //     if (!checker[i]) flag = false;
        // }

        // if (flag)
        // { 
        //     int[] b = new int[a.length];

        //     for (int i = 0; i < n; i++)
        //     {
        //         b[a[i]] = i;
        //     }

        //     for (int i = 0; i < n; i++)
        //     {
        //         System.out.print(a[b[i]]+ " ");
        //     }

        //     System.out.println();
        
        // }
        // else System.out.println( "Invalid Permutation" );


        // 1.4.29

        // int n = Integer.parseInt(args[0]);
        // boolean[][] a = new boolean[n][n];
        // a[0][0] = true;

        // int m = 1; // iterator and filler of matrix a 

        // while (m < n)
        // {

        //     for (int i = 0; i < m; i++)
        //     {
        //         for (int j = m ; j < 2*m; j++)
        //         {
        //             a[i][j] = a[i][j-m];
        //             a[j][i] = a[j-m][i];
        //             a[i+m][j] = !a[i][j];
        //         }
        //     }

        //     m *= 2;

        // }


        // for ( int i = 0; i < n; i++)
        // {
        //     for (int j = 0; j< n; j++)
        //     {
        //         if (a[i][j]) System.out.print("T ");
        //         else System.out.print("F ");
        //     }
        //     System.out.println();
        // }


        // 1.4.30

        // int n = Integer.parseInt(args[0]);
        // int trials = Integer.parseInt(args[1]);
        // int people = 0;
        // int count = 0; // count that all will know
        // int[] Pcount = new int[n+1];
        // for (int t = 0; t < trials; t++)
        // { 
            
        //     boolean[] mongers = new boolean[n];
        //     mongers[0] = true;
        //     boolean stopFlag = false;
        //     int perCyclepeople = 1;
            
        //     for (int i = 1; i < n; i++)
        //     {
        //         int randomChoice = (int) (Math.random()*n);

        //         if ( mongers[randomChoice] )
        //         {
        //             stopFlag = true;
        //             break;
        //         }
        //         else 
        //         {
        //             perCyclepeople++;
        //             //people++;
        //             // System.out.print( people + " ");
        //             mongers[randomChoice] = true;  
        //         }
        //     }
        //     people += perCyclepeople;
        //     Pcount[perCyclepeople]++;
        //     // System.out.println(perCyclepeople);
        //     if (!stopFlag) count++;
        
        // }
        // System.out.println("probability for all to know : " + (100.0*count)/trials + "%");
        // System.out.println("expected number of people to know : " + (1.0*people)/trials);

        // double sum = 0;
        // double ePeople = 0.0;
        // for (int i = 1; i < n; i++)
        // {   
        //     double p = 1.0 ;
        //     for (int j = 1; j <= i; j++)
        //     {
                
        //         if ( i == j ) 
        //         {  
        //             double k = (1.0*j*j)/(1.0*n);
        //             p = p*k;
        //         }
        //         else 
        //         {
        //             double k = (n-j)/(1.0*n);
        //             p = p*k;
        //         }
        //     }
        //     sum = sum + p;

        // }
        // System.out.println(sum);

        // 1.4.32

        // int m = Integer.parseInt(args[0]);
        // int n = Integer.parseInt(args[1]);
        // double p = Double.parseDouble(args[2]);

        // String[][] mine = new String[m][n];

        // for ( int i = 0; i < m; i++)
        // {
        //     for (int j = 0; j < n; j++)
        //     {
        //         double r = Math.random();
        //         if (r < p) mine[i][j] = "* ";
        //         else mine[i][j] = ". ";
        //         System.out.print(mine[i][j]);
        //     }
        //     System.out.println();
        // } 

        // int[][] a = new int[m][n];
        // boolean[][] b = new boolean[m+2][n+2];

        // for (int i = 1; i < m+1; i++)
        // {
        //     for ( int j = 1; j< n+1; j++)
        //     {
        //         if (mine[i-1][j-1] == "* ")
        //         {
        //             b[i][j] = true;
        //         }
        //     }
        // }

        // for (int i = 0; i < m; i++)
        // {
        //     for (int j = 0; j < n; j++)
        //     {
        //         if (!b[i+1][j+1])
        //         {
        //             for ( int x = 0; x <=2; x++)
        //             {
        //                 for (int y = 0; y <=2; y++)
        //                 {
        //                     if (b[i+x][j+y] && !(x==1 && y==1))
        //                     {
        //                         a[i][j]++;
        //                     }
        //                 }
        //             }
        //         }
        //     }
        // }

        // for (int i = 0; i < m; i++)
        // {
        //     for (int j = 0; j < n; j++)
        //     {
        //         if (mine[i][j] == "* ")
        //         {
        //             System.out.print("* ");
        //         }
        //         else System.out.print(a[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // 1.4.33

        // int n = Integer.parseInt(args[0]);
        // boolean ifDuplicate = false;
        // // int[] a = new int[n];

        // // for (int i = 0; i < n; i++)
        // // {
        // //     a[i] = 1 + (int) (Math.random()*n);
        // //     System.out.print( a[i] + " ");
        // // }
        
        // // int[] a = { 1, 2, 1, 2, 7, 9, 1, 5, 5, 10};
        // // int[] a = { 3, 8, 9, 6, 9, 1, 7, 5, 2, 10 };
        // int[] a = { 7, 9, 8, 5, 1, 4, 3, 6, 2, 2 };

        // // for (int i = 0; i < n; i++)
        // // {
        // //     int r = i + ((int) (Math.random()*(n-i)));
        // //     int temp = a[i];
        // //     a[i] = a[r];
        // //     a[r] = temp;
        // //     System.out.print(a[i]+ " ");
        
        // // }
        // System.out.println();

        


        // for (int i = 0; i < n; i++)
        // {
        //     while (a[i] - 1  != i && !ifDuplicate)
        //     // if (true)
        //     {
                
        //         if (a[i] == a[a[i]-1]) 
        //         {
        //             ifDuplicate = true;
        //             System.out.println( "Break : " + "i : " + i + ", " + " a[i] : " + a[i] + ", " + "a[a[i]-1] : "+ a[a[i]-1]);
        //             break;
        //         }

        //         System.out.println( "Before : " + "i : " + i + ", " + " a[i] : " + a[i] + ", " + "a[a[i]-1] : "+ a[a[i]-1]);
        //         int temp = a[i];
        //         a[i] = a[a[i]-1];
        //         a[temp-1] = temp;
        //         System.out.println( "After : " + "i : " + i + ", " + " a[i] : " + a[i] + ", " + "a[a[i]-1] : "+ a[a[i]-1]);
        //         for ( int alpha = 0; alpha < n; alpha++)
        //         {
        //             System.out.print(a[alpha] + " ");
        //         }
        //         System.out.println();
        //         System.out.println("==============================");
                
        //     }
        //     // if ( i == n-1 && a[i] != n) 
        //     // {
        //     //     ifDuplicate = true;
        //     //     System.out.println( "Break : " + "i : " + i + ", " + " a[i] : " + a[i] + ", " + "a[a[i]-1] : "+ a[a[i]-1]);
        //     //     break;
        //     // }
        // }


        // if (ifDuplicate || a[n-1] != n) System.out.println("yes");
        // else System.out.println("no duplicates");


        // 1.4.34
        // int n = Integer.parseInt(args[0]);
        // int trials = Integer.parseInt(args[1]); 
        // int deadEnds = 0;
        // int pathLength = 0;
        // for (int t = 0; t < trials; t++) 
        // {
        //     boolean[][] a = new boolean[n][n];
        //     int x = n/2, y = n/2;
        //     while ( x > 0 && x < n-1 && y > 0 && y < n-1 )
        //     { // Check for dead end and make a random move.
        //         a[x][y] = true;
        //         if (a[x-1][y] && a[x+1][y] && a[x][y-1] && a[x][y+1]) 
        //         { 
        //             deadEnds++; break; 
        //         }
        //         int k = x+y;
        //         double r = Math.random();
        //         if (r < 0.25) { if (!a[x+1][y]) x++; }
        //         else if (r < 0.50) { if (!a[x-1][y]) x--; } 
        //         else if (r < 0.75) { if (!a[x][y+1]) y++; } 
        //         else if   (r < 1.00) { if (!a[x][y-1]) y--; }
        //         if ((x+y-k) != 0) pathLength++;
        //     }
        // }
        // System.out.println(100.0*deadEnds/trials + "% dead ends"); 
        // System.out.println("average path length : " + 1.0*pathLength/trials);   
        // for sufficiently large  matrix all the path ends on dead Ends


        // 1.4.35
        // int n = Integer.parseInt(args[0]);
        // int trials = Integer.parseInt(args[1]); 
        // int deadEnds = 0;
        // int pathLength = 0;
        // for (int t = 0; t < trials; t++) 
        // {
        //     boolean[][][] a = new boolean[n][n][n];
        //     boolean flagDE = false;
        //     int x = n/2, y = n/2, z = n/2;
        //     while ( x > 0 && x < n-1 && y > 0 && y < n-1 && z > 0 && z < n-1)
        //     { // Check for dead end and make a random move.
        //         a[x][y][z] = true;
        //         if (a[x-1][y][z] && a[x+1][y][z] && a[x][y-1][z] && a[x][y+1][z] &&   a[x][y][z-1] && a[x][y][z+1] ) 
        //         { 
        //             deadEnds++; 
        //             flagDE = true;
        //             break; 
        //         }
        //         int k = x+y+z; // to count path only when it moves
        //         double r = Math.random();
        //         if      (r < (0.166)) { if (!a[x+1][y][z]) x++; }
        //         else if (r < (0.333)) { if (!a[x-1][y][z]) x--; } 
        //         else if (r < (0.5))   { if (!a[x][y+1][z]) y++; } 
        //         else if (r < (0.66))  { if (!a[x][y-1][z]) y--; }
        //         else if (r < (0.833)) { if (!a[x][y][z+1]) z++; }
        //         else if (r < (1))     { if (!a[x][y][z-1]) z--; } 
                
        //         if ( (x+y+z - k) != 0) pathLength++;
        //     }
        //     // System.out.println("x : " + x + ", y : " + y + ", z : " + z + ", flag : " + flagDE);
            
        // }
        // System.out.println(100.0*deadEnds/trials + "% dead ends"); 
        // System.out.println("average path length : " + 1.0*pathLength/trials); 


        // // 1.4.36
        // int trials = Integer.parseInt(args[0]);
        // int n = Integer.parseInt(args[1]);
        // int m = Integer.parseInt(args[2]);
        
        // int steps = 0;


        // for (int t = 0; t < trials; t++)
        // {
        //     boolean[][] a = new boolean[n][n];
        //     // int m = n/2; // m walkers
        //     int[][] walkers = new int[m][2];
            
        //     int sum = 1;
        //     a[n/2][n/2] = true;
            

        //     for ( int i = 0; i < m; i++)
        //     {
        //         walkers[i][0] = n/2;
        //         walkers[i][1] = n/2;
        //     }
            
        //     while (sum != n*n)
        //     {
        //         for (int i = 0; i < m ; i++)
        //         {
        //             boolean stepTaken = false;
        //             while (!stepTaken)
        //             { 
        //                 double r = Math.random();
                        
        //                 if      (r < 0.25) 
        //                 { 
        //                     if (walkers[i][0] != n-1) 
        //                     {
        //                         // System.out.println("Before : " + ", i : " + i + ", xi : " + walkers[i][0] + ", yi : "+ walkers[i][1]);
        //                         walkers[i][0]++; 
        //                         stepTaken = true;
        //                         // System.out.println("After : " + ", i : " + i + ", xi : " + walkers[i][0] + ", yi : "+ walkers[i][1]);
                                
        //                     }
                            
        //                 } 
        //                 else if (r < 0.50) 
        //                 { 
        //                     if (walkers[i][0] != 0)   
        //                     {
        //                         // System.out.println("Before : " + ", i : " + i + ", xi : " + walkers[i][0] + ", yi : "+ walkers[i][1]);
        //                         walkers[i][0]--;
        //                         stepTaken = true;
        //                         // System.out.println("After : " + ", i : " + i + ", xi : " + walkers[i][0] + ", yi : "+ walkers[i][1]);
        //                     } 
        //                 }
        //                 else if (r < 0.75) 
        //                 { 
        //                     if (walkers[i][1] != n-1) 
        //                     {
        //                         // System.out.println("Before : " + ", i : " + i + ", xi : " + walkers[i][0] + ", yi : "+ walkers[i][1]);
        //                         walkers[i][1]++;
        //                         stepTaken = true;
        //                         // System.out.println("After : " + ", i : " + i + ", xi : " + walkers[i][0] + ", yi : "+ walkers[i][1]);
        //                     }
        //                 }    
        //                 else if (r < 1.00) 
        //                 { 
        //                     if (walkers[i][1] != 0)  
        //                     { 
        //                         // System.out.println("Before : " + ", i : " + i + ", xi : " + walkers[i][0] + ", yi : "+ walkers[i][1]);
        //                         walkers[i][1]--;
        //                         // System.out.println("After : " + ", i : " + i + ", xi : " + walkers[i][0] + ", yi : "+ walkers[i][1]);
        //                         stepTaken = true; 
                                
        //                     }
        //                 } 
                        
                        
        //                 if (!a[walkers[i][0]][walkers[i][1]]) 
        //                 {
        //                     a[walkers[i][0]][walkers[i][1]] = true;
        //                     sum++;
        //                     // System.out.println("new : " + ", i : " + i + ", xi : " + walkers[i][0] + ", yi : "+ walkers[i][1]);
        //                     // System.out.println(sum);
        //                     if (sum == n*n) break;
        //                 }
                        
        //             }
                    


        //         }
        //         steps++;
        //     }
            

        // }

        // System.out.println("steps taken : " + steps/trials);

        // // hypothesis is that the steps taken are = 3.6*(n^1.58)
        // // this is a bizarre result, and needs to be analytically derived;
        
        // 1.4.37
        // String[] rank = {"King", "Queen", "Jack", "10", "9","8","7", "6", "5", "4", "3", "2", "Ace"};
        // String[] suit = {"Heart", "Club", "Spade", "Love"};
        // int trials = 1000000;
        // int count = 0;

        // for (int t = 0; t<trials; t++)
        // {
        
        //     int[] a = new int[52];
        //     int n = 52;
        //     for (int i = 1; i< 52; i++)
        //     {
        //         a[i] = i;
        //     }
            
        //     // Shuffle;

        //     for (int i = 0; i < 52; i++)
        //     {
        //         int r = i + (int) (Math.random()*(n-i));
        //         int temp = a[i];
        //         a[i] = a[r];
        //         a[r] = temp;
        //     }

        //     int[][] suitcounter = new int[4][4];

        //     for (int i = 0; i < 4; i++)
        //     {
        //         for (int j = 0; j < 13; j++)
        //         {
        //             suitcounter[i][  ((a[i*13+j]))/13  ]++;
        //         }
                
        //     }

        //     int[] desiredHand = { 5,3,3,2 };

        //     for (int i = 0; i < 1; i++)
        //     {
        //         boolean flag = true;
        //         for (int j = 0; j <4; j++)
        //         {
        //             // System.out.print(suitcounter[i][j] + " ");
        //             flag = (flag && (suitcounter[i][j] == desiredHand[j]));

        //         }
        //         // System.out.println();
        //         if (flag) count++;
        //     }
        // }

        // System.out.println("probablity : " + 1.0*count/trials);

        // 1.4.38
        
        // int trials = 10000;
        // int count = 0;

        // for (int t = 0; t<trials; t++)
        // {
        
        //     int[] a = new int[365];
        //     int n = 365;
           
        //     for (int i = 1; i< n; i++)
        //     {
        //         a[i] = i;
        //     }
            
        //     int[] b = new int[n];
        
        //     for (int i = 0; i < n; i++)
        //     {
        //         int r = (int) (Math.random()*(n));
        //         b[i] = a[r];
        //         boolean flag = false;
        //         // it is stupid to loop over it just make a boolean array
        //         for ( int j = 0; j < i; j++)
        //         {
        //             if (b[j] == b[i])
        //             {
        //                 count += i;
        //                 flag = true;
        //                 break;
        //             }
        //         }
        //         if (flag) break;
        //     }


        // }
        // System.out.println("average number of person : " + 1.0*count/trials);



        // 1.4.39
        // int trials = 10000;
        // int count = 0;

        // for (int t = 0; t<trials; t++)
        // {
        
        //     boolean[] a = new boolean[52];
        //     int n = 52;
        //     int cards = 52;
           

        //     while (cards > 0 )
        //     {
        //         int r = (int) (Math.random()*(n));
        //         if (!a[r])
        //         {
        //             a[r] = true;
        //             cards--;
        //         }
        //         count++;
        //     }
        // }
        // System.out.println("average number of person : " + 1.0*count/trials);


        // 1.4.40
        // int trials =     Integer.parseInt(args[0]);
        // int iterations = Integer.parseInt(args[1]);
        // int n = 52;
        // int randomTest = 0;
        
        

        // for (int t = 0; t < trials; t++)
        // {
        //     int[] a = new int[n];
        //     for ( int i = 0; i < n; i++)
        //     {
        //         a[i] = i;
        //     }
            
        //     for ( int k = 0; k < iterations; k++)
        //     { 
        //         // binomial distribution coin flip
        //         int heads = 0;
        //         for (int i = 0; i < n; i++)
        //         {
        //             if (Math.random() < 0.5)
        //             {
        //                 heads++;
        //             }
        //         }
        //         int r = heads;

        //         // pack of cards
        //         int[] ar  = new int[r];
        //         int[] anr = new int[n-r];
        //         for ( int i = 0; i < n; i++)
        //         {
        //             if (i < r) ar[i] = a[i];
        //             else anr[i-r] = a[i];
        //         }

        //         // int[] nPile = new int[n];
        //         int rcount = r;
        //         int nrcount = n-r;

        //         for ( int i = 0; i < n; i++)
        //         {
        //             if (Math.random() < (1.0 * rcount)/(rcount+nrcount))
        //             {
        //                 a[i] = ar[r - rcount];
        //                 rcount--;
        //             }
        //             else
        //             {
        //                 a[i] = anr[n - r - nrcount];
        //                 nrcount--;
        //             }
        //             // if ( i < 5)
        //             // {
        //             //     // System.out.print("i : " + nPile[i] + " ");
        //             // }
        //         }
        //     }

        //     if ( a[0] == 25 )
        //     {
        //         randomTest++;
        //     }


        // }
        


        // System.out.println("probability of 1st element : " + 1.0*randomTest/trials);

        // 1.4.41
        // int n = Integer.parseInt(args[0]);
        // double[][] a = new double[n][];

        // for (int i = 0; i < n; i++)
        // {
        //     a[i] = new double[i+1];
        //     a[i][0] = 0.0;
        // }
        // a[1][1] = 1;
        // System.out.println(a[1][1]);
        // for (int i = 2; i < n; i++)
        // {
        //     for (int j = 1; j < a[i].length; j++)
        //     {
        //         // System.out.println("i : " + i + ", j : " + j);
        //         if (j == a[i].length - 1 )
        //         {
        //             a[i][j] = ( 0.0 + a[i-1][j-1]) / 2.0;
        //         }
        //         else a[i][j] = (a[i-1][j] + a[i-1][j-1]) / 2.0;
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // ************************THE END***********************************



    }   

}