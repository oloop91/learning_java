/*

author : oloop

*/

public class exercises_1_3
{
    public static void main(String[] args)
    {
        // 1.3.1
        // int a, b, c;
        // a = Integer.parseInt(args[0]);
        // b = Integer.parseInt(args[1]);
        // c = Integer.parseInt(args[2]);
        // if ( a == b && b == c) System.out.println("equal");
        // else                   System.out.println("unequal");

        // 1.3.2
        // double a,b,c;
        // a = Double.parseDouble(args[0]);
        // b = Double.parseDouble(args[1]);
        // c = Double.parseDouble(args[2]);
        // double discriminant = b*b - 4*a*c;
        // if (a == 0)
        // {
        //     System.out.println("Not a quadratic equation");
        // }
        // else if (discriminant < 0)
        // {
        //     System.out.println("Equation has no real roots");
        // }
        // else if (discriminant == 0)
        // {
        //     System.out.println("Equation has only one root : " + Math.sqrt(-b/(2*a)));
        // }
        // else 
        // {
        //     double r1,r2;
        //     r1 = (-b + Math.sqrt(discriminant))/2.0;
        //     r2 = (-b - Math.sqrt(discriminant))/2.0;
        //     System.out.println("Roots of the equation are : " + r1 + " , " + r2); 
        // }

        // 1.3.4
        // double x, y;
        // x = Double.parseDouble(args[0]);
        // y = Double.parseDouble(args[1]);
        
        // if ( x > 0 && y < 1 && y > 0 && y < 1)  System.out.println(true);
        // else                                    System.out.println(false);

        // 1.3.5 RollLoadedDie
        // int trials = Integer.parseInt(args[0]);
        // int counter = 0;
        // int number = Integer.parseInt(args[1]) ;  // counter for result = 1
        // int result;
        
        // for (int i = 0; i < trials; i++)
        // {
                
        //     double chance = Math.random();
        //     if ( chance < 3.0/8.0 ) result = 6;
        //     else 
        //     {
        //         result = (1 + (int) (5*Math.random()));
        //     }
        //     if (result == number) counter++;

        // }
        // System.out.println(counter/((double)trials));


        // 1.3.7
        // int i, j ;
        
        // for (i = 0, j = 0; i < 10; i++) 
        // {
        //     j += i;
        //     System.out.println(i + "\t" + j);
        // }
        // System.out.println(j); // 45
        // System.out.println("-----------------------------------");
       
       
        // for (i = 0, j = 1; i < 10; i++) 
        // {
        //     j += j;
        //     System.out.println(i + "\t" + j);
        // }
        // System.out.println(j); //46
        // System.out.println("-----------------------------------");
        
        // for (j = 0; j < 10; j++) 
        // {
        //     j += j;
        //     System.out.println(i + "\t" + j);
        // }
        // System.out.println(j); // 14
        // System.out.println("-----------------------------------");
        
        // for (i = 0, j = 0; i < 10; i++) 
        // {
        //     j += j++; // here the j++ assign the value before the increment to itself as the result the j remains to be zero see page no. - 79 of the book
        //     System.out.println(i + "\t" + j);
        // }
        // System.out.println(j); //4092
        // System.out.println("-----------------------------------");


        // 1.3.8
        // int n = Integer.parseInt(args[0]);
        // if ( n <0 && n >= 1000)
        // {
        //     System.out.println("out of bound");
        // }
        // else 
        // { 
        //     for (int i = 1; i <= n; i++)
        //     {
        //         String suffix = "";
        //         if (i%100 < 4 && i%100 >0)
        //         {
        //             if (i%10 == 1)
        //             {
        //                 suffix = "st";
        //             }
        //             else if (i%10 == 2)
        //             {
        //                 suffix = "nd";
        //             }
        //             else if (i%10 == 3)
        //             {
        //                 suffix = "rd";
        //             }           
        //         }
        //         else 
        //         {
        //             suffix = "th";
        //         }     
        //         System.out.println(i+suffix + "Hello");
        //     }
        // }

        // 1.3.9
        // for (int i = 1000; i <=2000; i++)
        // {
        //     System.out.print(i+" ");
        //     if (i%5 == 4) System.out.println();
        // }

        // 1.3.10

        // int n = Integer.parseInt(args[0]);
        // double total = 0.0;
        // double value = 0.0;
        // for (int i = 0; i<n; i++)
        // {
        //     value = Math.random();
        //     total += value;
        //     System.out.print(value);
        //     if (i%5 == 4) System.out.println();
        // }
        // System.out.println();
        // System.out.println("average : " + total/n);

        // 1.3.11
        // int n = Integer.parseInt(args[0]);
        // String ruler = "1";
        // for (int i = 2; i <= n; i++)
        // ruler = ruler + " " + i + " " + ruler; System.out.println(ruler);

        // 1.3.12
        // int n = 16;
        // System.out.println(" \t" + "logn" + "\t" +  "n" + "\t" + "nlogn"+ "\t" + "n^2"+ "\t" + "n^3"+ "\t" + "2^n" );
        // for (int i = 4; i <= 11; i++ )
        // {
        //     System.out.print(n + "\t");
        //     System.out.print( Math.log(n) + "\t" );
        //     System.out.print( n + "\t" );
        //     System.out.print( n*Math.log(n) + "\t" );
        //     System.out.print( n*n + "\t" );
        //     System.out.print( n*n*n + "\t" );
        //     System.out.println( Math.pow(2,n));
        //     n *= 2;

        // }

        // 1.3.16
        // int n = Integer.parseInt(args[0]);
        // if (n <= 0) System.out.println("you are a negative person");
        // else 
        // {
        //     int power = 2;
        //     for (int i=1; power<=n; i++)
        //     {
        //         System.out.print((int) Math.pow(2,i) + "\t");
        //         power *= 2;
        //     }

        //     System.out.println();
        // }

        // 1.3.17
        // double P,r;
        // P = Double.parseDouble(args[0]);
        // r = Double.parseDouble(args[1]);
        // for (int t=0; t <=25 ; t++)
        // {
        //     System.out.println(t + "\t"+ P*Math.exp(r*t));
        // }

        // 1.3.18
        // int n = 1000000;
        // double sum = 0.0;
        // for (int i = 65531; i > 65530 && i <= 65538; i++) 
        // {
        //     System.out.println(i + "\t" + 1/(i*i)+ "\t" + sum);
        //     sum += 1 / (i*i); // 65536*65536 - > overflow and the it becomes 0 leads to divide by zero error
        // }
        // System.out.println(sum);
        // sum = 0.0;
        // for (int i = 1; i <= n; i++) sum += 1.0 / i*i;
        // System.out.println(sum);
        // sum = 0.0;
        // for (int i = 1; i <= n; i++) sum += 1.0 / (i*i);
        // System.out.println(sum);    // i*i overflows becomes zero and result in infinity
        // sum = 0.0;
        // for (int i = 1; i <= n; i++) sum += 1 / (1.0*i*i);
        // System.out.println(sum);


        // 1.3.20
        // int n,k;
        // n = Integer.parseInt(args[0]);
        // k = Integer.parseInt(args[1]);
        // double epsilon = 1e-15;
        // double r = n; //kth root
        // while (Math.abs(Math.pow(r,k) - n) > epsilon)
        // {
        //     r = ((k-1)*r + n/(Math.pow(r,k-1)))/k;
        // }
        // System.out.println("kth root of n is : " + r);

        // 1.3.21
        // int i,k;
        // i = Integer.parseInt(args[0]);
        // k = Integer.parseInt(args[1]);
        // int power = k;

        // // finding n for i < k^n 
        // while (power <= i)
        // {
        //     power *= k;
        // }

        // System.out.println(power);

        // while (power > 1)
        // {
        //     power /= k;
        //     int p = i/power;
        //     if (p < 10)
        //     {
        //         System.out.print(p);
        //     }
        //     else if ( p == 10)
        //     {
        //         System.out.print("A");
        //     }
        //     else if ( p == 11)
        //     {
        //         System.out.print("B");
        //     }
        //     else if ( p == 12)
        //     {
        //         System.out.print("C");
        //     }
        //     else if ( p == 13)
        //     {
        //         System.out.print("D");
        //     }
        //     else if ( p == 14)
        //     {
        //         System.out.print("E");
        //     }
        //     else if ( p == 15)
        //     {
        //         System.out.print("F");
        //     }
        //     else 
        //     {
        //         System.out.print("Not Allowed");
        //     }

        //     i = i%power;
        // }
        // System.out.println();   

        // 1.3.23-26
        // while loop
        // int stake = Integer.parseInt(args[0]);
        // int goal = Integer.parseInt(args[1]);
        // int trials = Integer.parseInt(args[2]);
        // int bets = 0;
        // int wins = 0;
        // int t = 0; // trial counter
        // while (t < trials)
        // {
        //     int cash = stake;
        //     while (cash > 0 && cash < goal)
        //     {
        //         if (Math.random() < 0.5) cash++;
        //         else                    cash--;
        //         bets++;
        //     }
            
        //     if ( cash == goal ) wins++;
        //     t++;
        // }

        // System.out.println(100*wins/trials + "% wins");
        // System.out.println("Avg # bets: " + bets/trials);

        // // for loop
        // int stake = Integer.parseInt(args[0]);
        // int goal = Integer.parseInt(args[1]);
        // int trials = Integer.parseInt(args[2]);
        // double P =  Double.parseDouble(args[3]);  //Probability of winning
        // int betLimit = Integer.parseInt(args[4]);   
        // int bets = 0;
        // int wins = 0;
        // int wallet = 0;
        // int walletStopLoss = 0;

        // for (int t = 0; t < trials; t++)
        // {
        //     int cash;
        //     int bet1 = 0;
        //     int bet2 = 0;
        //     for (cash = stake;  bet1 < betLimit && cash > 0 && cash < goal;)
        //     {
        //         if (Math.random() < P) cash++;
        //         else                   cash--;
        //         bet1++;
        //     }

        //     bets = bets + bet1;
        //     wallet = wallet + cash;
            
        //     for (cash = stake;  bet2 < betLimit && cash > stake*0.8 && cash < goal;)
        //     {
        //         if (Math.random() < P) cash++;
        //         else                   cash--;
        //         bet2++;
        //     }
            
        //     walletStopLoss = walletStopLoss + cash;
        //     // if ( cash == goal ) wins++;
            
        // }

        // // System.out.println(100*wins/trials + "% wins");
        // // System.out.println("Avg # bets: " + bets/trials);
        // System.out.println("Expected cash at the end: " + wallet/trials);
        // System.out.println("Expected cash at the end with StopLoss : " + walletStopLoss/trials);

        // 1.3.27
        // int n = Integer.parseInt(args[0]);
        // int factor;
        // for (factor = 2; factor <= n / factor; factor++)
        // {
        //     int factorPrint = 0;
        //     while( n%factor == 0)
        //     {
        //         // System.out.print(factor + " ");
        //         n /= factor;
        //         if (factorPrint != factor) System.out.print(factor + " ");
        //         factorPrint = factor;
                
        //     }
            
        // }
        // if (n > 1) System.out.print(n);
        // System.out.println();

        // 1.3.29
        // int n = Integer.parseInt(args[0]);

        // for (int i = 0; i < n; i++)
        // {
        //     for (int j = 0; j < n; j++)
        //     {
        //         if ( Math.random() < 0.5/*j%2 == 0 ^ i%2 !=0*/ ) System.out.print("*");
        //         else              System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        // 1.3.30
        // int x,y;
        // x = Integer.parseInt(args[0]);
        // y = Integer.parseInt(args[1]);
        
        // while ( x%y != 0 )
        // {
        //     if ( y > x ) 
        //     {
        //         int thirdWorld = x;
        //         x = y;
        //         y = thirdWorld;
        //     }
        //     x=x%y;
        // }

        // System.out.println("gcd of x,y is : " + y );


        // 1.3.31
        // int n;
        // n = Integer.parseInt(args[0]);
        
        // for ( int i = 1; i <= n ; i++)
        // {
        //     for (int j = 1; j <= n; j++)
        //     {
        //         int x = i, y = j;
        //         while ( x%y != 0 )
        //         {
        //             if ( y > x ) 
        //            {
        //                 int thirdWorld = x;
        //                   x = y;
        //                   y = thirdWorld;
        //             }
        //             x=x%y;
        //         }

        //         if ( y == 1) System.out.print("*");
        //         else         System.out.print(" ");

        //     }
        //     System.out.println();
        // }
        

        // // 1.3.32
        // long k = Integer.parseInt(args[0]);
        // long powerOfK = k;

        // while (  (Long.MAX_VALUE/powerOfK) >= k )
        // {
        //     System.out.println(powerOfK);
        //     // System.out.println(Long.MAX_VALUE%powerOfK);
        //     powerOfK *= k;
        // }

        // 1.3.33
        // double x,y;
        // do 
        // {
        //     x = 2*Math.random() - 1.0;
        //     y = 2*Math.random() - 1.0;
        // }
        // while ( x*x + y*y > 1.0);

        // double a = 2*x*Math.sqrt(1-x*x-y*y);
        // double b = 2*y*Math.sqrt(1-x*x - y*y);
        // double c = 1 - 2*(x*x + y*y);

        // System.out.println(a + "," + b + "," + c);
        // System.out.println(a*a + b*b + c*c);
        // System.out.println(x*x + y*y);
        

        // 1.3.34 - Creative Exercises
        // int n = Integer.parseInt(args[0]);

        // int check = 1;

        // for (int a = 1; a*a*a < n; a++)
        // {
        //     for (int c = 1; c < a; c++)
        //     {
        //         for (int b = 1; b < a; b++ )
        //         {
        //             for (int d = 1; d < c; d++)
        //             {
        //                 if (a*a*a + b*b*b == n && c*c*c + d*d*d == n && a != c)
        //                 {
        //                     System.out.println("a : " + a + " b : " + b + " c : " + c + " d : " + d );
        //                     check = 0;

        //                 }
                        
        //             }
        //         }
        //     }
        // }

        // if (check == 1) System.out.println("No two distinct set of two integers");

        // 1.3.35
        // int n = Integer.parseInt(args[0]);
        // int checksum  = 0;
        // int divider;

        // for (int i = 8; i >= 0; i-- )
        // {
        //     divider = (int) Math.pow(10,i);
        //     checksum = checksum + (n/divider)*(i+2);
        //     System.out.println((n/divider)*(i+2));
        //     n = n%divider;
        // } 

        // System.out.println( 11 - checksum%11);

        // 1.3.36
        // int n = Integer.parseInt(args[0]);
        // int primes = 0;
            
        // for (int i = 2; i <=n ; i++)
        // {
        //     int j = i;
        //     for (int factor = 2; factor <= j/factor; factor++)
        //     {
        //         if(i%factor == 0) 
        //         {
        //             j = j/factor;
        //             break;
        //         }            
        //     } 


        //     if (i == j ) 
        //     {
        //         System.out.println(i);
        //         primes++;
        //     }


        // }
        // System.out.println(primes);


        // 1.3.37
        // int n = Integer.parseInt(args[0]);

        // int x = 0;
        // int y = 0;
        // double p = 0.0; // probability
        // int steps = 0;
        // int trials = 1000;

        // for ( int t = 0; t < trials; t++)
        // {
        //     while (Math.abs(x)<n && Math.abs(y) < n )
        //     {
        //         p = Math.random();
        //         if (p < 0.25) x++;
        //         else if (p >= 0.25 && p < 0.5) x--;
        //         else if (p >= 0.5 && p < 0.75) y++;
        //         else y--;
        //         steps++;
        //     }
        //     x = 0;
        //     y = 0;
        // }

        // System.out.println(steps/trials);


        // 1.3.38
        // double x = Double.parseDouble(args[0]);
        // // int limit = 100;
        // double sum = 1;
        // // double power = 1;
        // // double factorial = 1;
        // double term = 1;
        // for (int i = 1; sum != sum +term; i++)
        // {
        //     // power *= x;
        //     // factorial = factorial*(i);
        //     term *= x/i;
        //     sum = sum +  term;

        // }
        // System.out.println(sum);

        // 1.3.39

        // double x = Double.parseDouble(args[0]);
        // double term = 1;
        // double sum = 0;
        
        // for (int i = 1; sum != sum + term; i = i+2)
        // {
        //     sum = sum + term;
        //     term *= -1*x*x/(i*(i+1));
        // }

        // System.out.println(sum);
        //sinx
        // double x = Double.parseDouble(args[0]);
        // double term = x;
        // double sum = 0;
        
        // for (int i = 2; sum != sum + term; i = i+2)
        // {
        //     sum = sum + term;
        //     term *= -1*x*x/(i*(i+1));
        // }

        // System.out.println(sum);

        // 1.3.41

        // int diceResult = 0;
        // int trials = 1000;
        // int wins6 = 0;
        // int wins12 =0;
        // int flag = 0;
        // for (int i = 1; i <=trials; i++ )
        // {
            
        //     for (int j = 0; j < 6; j++)
        //     {
        //         diceResult = (int) (6*Math.random());
        //         if (diceResult == 0) flag = 1;

        //     }

        //     if (flag == 1) wins6++;
        //     flag = 0;

        // }
        // System.out.println("once in 6 times : " + (wins6*100)/trials+"%");

        // int flag1 = 0;
        // for (int i = 1; i <=trials; i++ )
        // {
            
        //     for (int j = 0; j < 6; j++)
        //     {
        //         diceResult = (int) (6*Math.random());
        //         if (diceResult == 0) 
        //         {
        //             if (flag == 1) flag1 = 1;
        //             flag = 1;
        //         } 
        //     }

        //     if (flag == 1 && flag1 == 1) wins12++;
        //     flag = 0;
        //     flag1 = 0;

        // }

        // System.out.println("atleast twice in 12 times : " + (100*wins12)/trials+"%");



        // 1.3.42
        // int n = Integer.parseInt(args[0]);
        // // int D;
        // int cDoor;
        // int wins = 0;

        // for (int i = 0; i < n; i++)
        // {
        //     // D = (int) (3*Math.random()) + 1;
        //     cDoor = (int) (3*Math.random()) + 1;
        //     if (cDoor != 1) wins++;

        // }
        // System.out.println("change of winning by changing is : " + (100*wins)/n);

        // 1.3.43
        // int a,b,c,d,e;

        // a = Integer.parseInt(args[0]);
        // b = Integer.parseInt(args[1]);
        // c = Integer.parseInt(args[2]);
        // d = Integer.parseInt(args[3]);
        // e = Integer.parseInt(args[4]);
        // int median = a;
        // int p,q,r,s,t;

        // int max, min;

        // p = a;
        // q = b;
        // r = c;
        // s = d;
        // t = e;

        // // int average = (a+b+c+d+e)/5.0;
        // // int a1 = (b+c+d+e)/4.0 - average;
        // // int b1 = (a+c+d+e)/4.0 - average;
        // // int c1 = (a+b+d+e)/4.0 - average;
        // // int d1 = (a+b+c+e)/4.0 - average;
        // // int e1 = (a+b+c+d)/4.0 - average;


    
   

        // if (b > a) 
        // {
        //     p = a;
        //     q = c;
        //     max = b;
        // }
        // else 
        // {
        //     p = b;
        //     q = c;
        //     max = a;
        // }
        // if ( c > max ) 
        // {
        //     q = max;
        //     max = c;

        // }
        // if ( d > max )
        // { 
        //     if ( e > max ) median = max;
        //     else // max > e
        //     {
        //         int max1;
        //         if (p > q) max1 = q;
        //         else max1 = p;
        //         if ( e > max1 ) max1 = e;
        //         median = max1;
        //     }


        // }
        // else  // max > d
        // {
        //     max = d;
        //     if ( e > max )
        //     {   
        //         int max2;
        //         if ( p > q) max2 = q;
        //         else max2 = p ;
        //         if ( max > max2) max2 = max;
        //         median = max2 ;
        //     }
        //     else // max > e
        //     {
        //         int max3;
        //         if ( p > q) max3 = q;
        //         else max3 = p ;
        //         if ( e > max3) max3 = e;
        //         median = max3 ;
                
        //     }
        // }
        

       
        // System.out.println(median);


        // 1.3.45
        // double r = Double.parseDouble(args[0]);
        // double start = Double.parseDouble(args[1]);
        // int n = Integer.parseInt(args[2]);
        // // double r = 1.00;
        // // double start = 0.01;
        // double x;
        // for (int i = 0; i < 50; i++ )
        // {
        //     x = start;
        //     for ( int j = 0; j < n; j++ )
        //     {
        //         x = r*x*(1-x);
        //         if ( x < 0) break; 
                
        //     }
        //     System.out.println( Math.round(r*100)/100.0 + "\t" + Math.round(x*100)/100.0 + "\t" + Math.round((1-1.0/r)*100)/100.0);
        //     r += 0.01;
        // }


        // 1.3.46
        // long a,b,c,d,e;
        // a = 2;
        // b = 2;
        // c = 2;
        // d = 2;
        // e = 2;
        // int MAX = 150;

        // boolean found = false;
       
        // for ( a = 27; !found  ; a++ )
        // {
        //     for ( b = a+1; b < MAX && !found  ; b++)
        //     {
        //         for ( c = b+1; c < MAX && !found  ; c++)
        //         {
        //             for ( d = c+1; d < MAX && !found  ; d++)
        //             {
        //                 for ( e = d+1;  !found  && (a*a*a*a*a + b*b*b*b*b + c*c*c*c*c + d*d*d*d*d) >= e*e*e*e*e; e++)
        //                 {
        //                     if ((a*a*a*a*a + b*b*b*b*b + c*c*c*c*c + d*d*d*d*d) == e*e*e*e*e) 
        //                     {
        //                         found = true;
        //                         System.out.println(found);
        //                     }
        //                     System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + e);

        //                 }
        //             }
        //         }
        //     }
            
        // }

        // System.out.println("------------------------" );
        // System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + e);

        

        

    }
}