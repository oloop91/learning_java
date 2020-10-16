/*

author : oloop

*/

import java.awt.Font;

public class exercises_1_5
{
    public static void main(String[] args)
    {
        // 1.5.1
        
        // int max = StdIn.readInt();
        // int min = max;
        
        // while (!StdIn.isEmpty())
        // {
        //     int temp = StdIn.readInt();
        //     if (temp > max) max = temp;
        //     if (temp < min) min = temp;
        // }
        // StdOut.printf("max : %d, min : %d\n",max, min);

        // 1.5.2
        // if (!StdIn.isEmpty())
        // { 
        //     int temp = StdIn.readInt();
        //     while ( temp <= 0 )
        //     {
        //         StdOut.println("Please enter a positive number");
        //         temp = StdIn.readInt();
        //     }
        //     int max = temp;
        //     int min = temp;
            
        //     while (!StdIn.isEmpty())
        //     {
        //         temp = StdIn.readInt();
        //         while ( temp <= 0 )
        //         {
        //             StdOut.println("Please enter a positive number");
        //             temp = StdIn.readInt();
        //         }
        //         if (temp > max) max = temp;
        //         if (temp < min) min = temp;
        //     }
        //     StdOut.printf("max : %d, min : %d\n",max, min);
        
        // }

        // 1.5.3
        // int n = Integer.parseInt(args[0]);

        // double[] sample = StdIn.readAllDoubles();
        // double sum = 0;

        // for ( int i = 0; i < n; i++)
        // {
        //     sum += sample[i];
        // }

        // double mean = sum/n;
        // double variance = 0;
        // for ( int i = 0; i < n; i++)
        // {
        //     variance += Math.pow((sample[i] - mean), 2);
        // }

        // double stDev = Math.sqrt(variance)/(n-1);

        // StdOut.printf("mean : %.2f, standard Deviation : %.2f\n", mean, stDev);

        // 1.5.4
        // int n = Integer.parseInt(args[0]);

        // double[] sample = StdIn.readAllDoubles();
        // double sum = 0;

        // for ( int i = 0; i < n; i++)
        // {
        //     sum += sample[i];
        // }

        // double mean = sum/n;
        // double variance = 0;
        // for ( int i = 0; i < n; i++)
        // {
        //     variance += Math.pow((sample[i] - mean), 2);
        // }

        // double stDev = Math.sqrt(variance)/(n-1);

        // StdOut.printf("mean : %.2f, standard Deviation : %.2f\n", mean, stDev);

        // for (int i = 0; i < n; i++)
        // {
        //     if ( Math.abs(sample[i] - mean) > 1.5*stDev ) StdOut.println(sample[i]);
        // }

        // 1.5.5

        // int[] seq = StdIn.readAllInts();
        // int n = seq.length;
        // int starter = seq[0];
        // int counter = 1;
        // int maxcount = 1;
        // int maxstart = starter;

        // for (int i = 1; i < n; i++)
        // {
        //     if (seq[i] == starter) counter++;
        //     else
        //     {
        //         if (counter > maxcount)
        //         {
        //             maxcount = counter;
        //             maxstart = starter;
        //         }
        //         starter = seq[i];
        //         counter = 1;
        //     }
            
        // }
        // StdOut.printf("Longest run : %d consecutive : %ds\n", maxcount, maxstart);

        // 1.5.6
        // int[] seq = StdIn.readAllInts();
        // int n = seq.length;
        // int tracker = seq[0];
        // // System.out.printf("\n"); // weirdly ^D appears in a blank line
        // StdOut.println(seq[0] + " ");

        // for (int i = 1; i < n; i++)
        // {
        //     if ( seq[i] != tracker)
        //     {
        //         tracker = seq[i];
        //         StdOut.println(tracker);
        //     }
        // }

        // 1.5.7
        
        // int n = Integer.parseInt(args[0]);
        // int[] seq = StdIn.readAllInts();
        // boolean[] inIt = new boolean[n+1];

        // for (int i = 0; i < n-1; i++ )
        // {
        //     inIt[seq[i]] = true;
        // }

        // for (int i = 1 ;i <= n; i++)
        // {
        //     if(!inIt[i]) StdOut.printf("missing value : %d\n", i);
        // }

        // 1.5.8
        // double[] seq = StdIn.readAllDoubles();
        // // geometric mean
        // int n = seq.length;
        // double sum = 0; 
        // for (int i = 0; i < n; i++)
        // {
        //     sum += Math.log(seq[i]);
        // }
        // double geometricMean = Math.pow(Math.E, sum/n);
        // // harmonic mean
        // double hSum = 0;
        // for (int i = 0; i < n; i++)
        // {
        //     hSum += 1/seq[i];
        // }
        // double harmonicMean = n/hSum;
        // StdOut.printf("Geometric Mean : %.2f, Harmonic Mean : %.2f\n", geometricMean, harmonicMean);

        // 1.5.9

        // String dragon = StdIn.readString(); 
        // String nogard = StdIn.readString(); 
        // StdOut.print(dragon + "L" + nogard); 
        // StdOut.print(" "); 
        // StdOut.print(dragon + "R" + nogard); 
        // StdOut.println();

        // 1.5.10 TenPerLine
        // int column = 0;
        // while(!StdIn.isEmpty())
        // {
        //     int a = StdIn.readInt();
        //     if ( a >= 0 && a <= 99)
        //     {
        //         if ( column < 10)
        //         {
        //             StdOut.printf("%3d ",a);
        //         }
        //         else 
        //         {
        //             StdOut.printf("\n");
        //             StdOut.printf("%3d ",a);
        //             column = 0;
        //         }
        //         column++;
        //     }
        // }

        // // RandomIntSeq
        // int m = Integer.parseInt(args[0]);
        // int n = Integer.parseInt(args[1]);

        // for ( int i = 0; i < n; i++)
        // {
        //     int randNum = (int) (Math.random()*m);
        //     StdOut.println(randNum);
        // }

        // 1.5.11
        // int count = 0;

        // while (!StdIn.isEmpty())
        // {
        //     String m = StdIn.readString();
        //     count++;
        // }
        // StdOut.printf("number of words are : %s\n", count);

        // 1.5.12
        // StdOut.printf("Name     | Integer1 | Integer2 | Calculation\n");
        // StdOut.printf("_________|__________|__________|_____________\n");
        // while(!StdIn.isEmpty())
        // {
        //     String name = StdIn.readString();
        //     int    num1 = StdIn.readInt();
        //     int    num2 = StdIn.readInt();
        //     double  cal = 1.0*num1/num2;
        //     String format = "%-8s | %8d | %8d | %11.3f\n";
        //     StdOut.printf(format, name, num1, num2, cal);
        // }

        // 1.5.13
        // double term = Double.parseDouble(args[0]);
        // double principal = Double.parseDouble(args[1]);
        // double interest = Double.parseDouble(args[2]);

        // int n = (int) term*12;
        // StdOut.printf("Month | Monthly Payment | Re. Principal | Interest paid\n");
        // StdOut.printf("______|_________________|_______________|______________\n");
        
        // double rPrincipal = principal;
        // double iPaid = 0;
        // double mi = interest/(12.0*100);
        // double monPayment = principal * mi * Math.pow((1+mi),n) / (Math.pow((1+mi),n)-1);
        

        // for (int i = 1; i <= n; i++)
        // {
        //     double mInterest =  rPrincipal*mi;
        //     double pPaid = monPayment - mInterest;
        //     rPrincipal -=  pPaid;
        //     iPaid += mInterest;
        //     String format = "%-5d | %15.3f | %13.3f | %13.3f\n";
        //     StdOut.printf(format, i, monPayment, rPrincipal, iPaid);
        // }
        
        // 1.5.14
        // 1. save array
        // 2. filter
        // 3. filter
        // 4. save array
        // 5. save array
        // 6. save array
        // 7. save array

        // 1.5.15
        // double x = Double.parseDouble(args[0]);
        // double y = Double.parseDouble(args[1]);
        // double z = Double.parseDouble(args[2]);

        // // first batch
        // double xi = StdIn.readDouble();
        // double yi = StdIn.readDouble();
        // double zi = StdIn.readDouble();
        // double d2 = (x - xi)*(x-xi) + (y-yi)*(y-yi) + (z-zi)*(z-zi);
        // double min = d2;
        // double xmin = xi;
        // double ymin = yi;
        // double zmin = zi;

        // while(!StdIn.isEmpty())
        // {
        //     xi = StdIn.readDouble();
        //     yi = StdIn.readDouble();
        //     zi = StdIn.readDouble();
        //     d2 = (x - xi)*(x-xi) + (y-yi)*(y-yi) + (z-zi)*(z-zi);
        //     if (min > d2) 
        //     {
        //         min = d2;
        //         xmin = xi;
        //         ymin = yi;
        //         zmin = zi;
        //     }
        // }

        // StdOut.printf("Closest point coordinates are - x : %6.2f, y : %6.2f, z: %6.2f\n", xmin, ymin, zmin);

        // 1.5.16
        // double m = 0.0;
        // double x = 0.0;
        // double y = 0.0;

        // while (!StdIn.isEmpty())
        // {
        //     double xi = StdIn.readDouble();
        //     double yi = StdIn.readDouble();
        //     double mi = StdIn.readDouble();
        //     x += mi*xi;
        //     y += mi*yi;
        //     m += mi;
        // }
        // StdOut.printf("m : %4.2f, x : %4.2f, y : %4.2f\n", m, x/m, y/m);


        // 1.5.17
        // double n = StdIn.readDouble();
        // double mag = Math.abs(n);
        // double power = n*n;
        // int crossing = 0;
        // double old = n ;
        // int count = 1;

        // while (!StdIn.isEmpty())
        // {
        //     n = StdIn.readDouble();
        //     mag += Math.abs(n);
        //     power += n*n;
        //     if ( n*old < 0 ) crossing++;
        //     old = n;
        //     count++;
        // }
        // StdOut.printf("Average Magnitude       : %6.2f\n", mag/count);
        // StdOut.printf("Average Power           : %6.2f\n", power/count);
        // StdOut.printf("number of zero crossing : %6d\n", crossing );
        
        // 1.5.18
        // int n = Integer.parseInt(args[0]);
        // boolean flipx = true;
        // boolean flipy = true;
        // double r = 1.0/(2*n);
        // for (int x = 0; x < n; x++)
        // {
        //     flipx = flipy;
        //     for(int y = 0; y < n; y++)
        //     {
        //         if (flipy)
        //         {
        //             StdDraw.setPenColor(StdDraw.RED);
        //             double xi = 1.0*x/n + 1.0/(2*n);
        //             double yi = 1.0*y/n + 1.0/(2*n);
        //             StdDraw.filledSquare(xi, yi, r);
        //         }
        //         else 
        //         {
        //             StdDraw.setPenColor(StdDraw.BLACK);
        //             double xi = 1.0*x/n + 1.0/(2*n);
        //             double yi = 1.0*y/n + 1.0/(2*n);
        //             StdDraw.filledSquare(xi, yi, r);
        //         }
        //         flipy = !flipy;
        //     }
        //     flipy = !flipx;
        // }


        // 1.5.19
        // int    n = Integer.parseInt(args[0]);
        // double p = Double.parseDouble(args[1]);
        // double r = 0.4;
        // double angle = 2*Math.PI/n;
        // double[] x = new double[n];
        // double[] y = new double[n];
        // StdDraw.setPenColor(StdDraw.CYAN);
        // StdDraw.setCanvasSize(1200,1200);
        // StdDraw.setPenRadius(0.005);
        // for (int i = 0; i < n; i++)
        // {
        //     x[i] = 0.5 + r*Math.cos(i*angle);
        //     y[i] = 0.5 + r*Math.sin(i*angle);
        //     StdDraw.point(x[i],y[i]);
        // }   
        // StdDraw.setPenRadius(0.002);
        // StdDraw.setPenColor(StdDraw.CYAN);
        // for (int i = 0; i < n; i++)
        // {
        //     for (int j = i; j < n; j++)
        //     {
        //         if (Math.random() < p)
        //         {
        //             StdDraw.line( x[i], y[i], x[j], y[j]);
        //         }
        //     }
        // }

        // 1.5.20
        // int n = 100;
        // double[] x = new double[n+2];
        // double[] y = new double[n+2];

        // x[0] = 0.5;
        // y[0] = 0.0;

        // for (int i = 0; i < n+1; i++)
        // {
        //     x[i+1] = 0.5 + 1.0*i/n*0.25;
        //     y[i+1] = 0.25*Math.pow(1 - Math.pow(4*(x[i+1]-0.5),0.5), 2);
        // }
        // StdDraw.filledPolygon(x,y);

        // x[0] = 0.5;
        // y[0] = 0.0;

        // for (int i = 0; i < n+1; i++)
        // {
        //     x[i+1] = 0.5 - 1.0*i/n*0.25;
        //     y[i+1] = 0.25*Math.pow(1 - Math.pow(4*(-x[i+1]+0.5),0.5), 2);
        // }

        // StdDraw.filledPolygon(x,y);

        // double[] tx = {0.2, 0.5, 0.8};
        // double[] ty = {0.25, 0.8, 0.25 };

        // StdDraw.filledPolygon(tx, ty);
        // // first semi circle
        // double[] sx = new double[n+1];
        // double[] sy = new double[n+1];

        // sx[0] = 0.5;
        // sy[0] = 0.25;

        // for (int i = 1; i <= n; i++ )
        // {
        //     sx[i] = 0.5 - 0.3*i/n;
        //     sy[i] = 0.25 - Math.sqrt(0.15*0.15 - (sx[i]-0.35)*(sx[i]-0.35));
        // }

        // StdDraw.filledPolygon(sx, sy);
        // // second semi circle

        // for (int i = 1; i <= n; i++ )
        // {
        //     sx[i] = 0.5 + 0.3*i/n;
        //     double mm = 0.15*0.15 - (sx[i]-0.65)*(sx[i]-0.65);
        //     System.out.println(mm);
        //     sy[i] = 0.25 - Math.sqrt(0.15*0.15 - (sx[i]-0.650000001)*(sx[i]-0.650000001));
        //     // double approximation making a problem - reason for 0.6500000001
        // }

        // StdDraw.filledPolygon(sx, sy);

        // 1.5.21
        // StdDraw.setPenRadius(0.006);
        // int n = Integer.parseInt(args[0]);
        // int iterations = 5000;
    
        // for (int i = 0; i < iterations; i++)
        // {
        //     double theta = (1.0*i/iterations) * (2.0*Math.PI);
        //     double x = 0.5 + 0.5 * Math.sin(n*theta)* Math.cos(theta);
        //     double y = 0.5 + 0.5 * Math.sin(n*theta)* Math.sin(theta);
        //     StdDraw.point(x, y);
        // }

        // 1.5.22
        // String s = args[0];
        // int dt = Integer.parseInt(args[1]);
        // // int n = s.length;
        // String fs = s;

        // // if ( n > 1)
        // // {
        // //     for (int i = 1; i < n; i++ )
        // //     {
        // //         fs = fs + " " + s[i];
        // //     }
        // // }
        // int l = fs.length();
        // StdDraw.enableDoubleBuffering();
        // int frames = 100;
        // double clength = 0.02;
        // while (true)
        // {
        //     for ( int i = 0; i < frames; i++)
        //     {
        //         StdDraw.clear();

        //         double x = (0.5 + 1.0*i/frames)%(1);
        //         double y = 0.5;
        //         StdDraw.text( x , y, fs);
        //         if ( x + clength*l/2 >= 1 )
        //         {
        //             double x1 = x - 1.0;
        //             double y1 = 0.5;
        //             StdDraw.text( x1 , y1, fs);
        //         }
        //         else if (x - clength*l/2 <= 0)
        //         {
        //             double x2 = x + 1.0;
        //             double y2 = 0.5;
        //             StdDraw.text( x2 , y2, fs);
        //         }
        //         StdDraw.show();
        //         StdDraw.pause(dt);
                
        //     }
        // }

        // 1.5.23
        // int volume = Integer.parseInt(args[0]);
        // int tempo = Integer.parseInt(args[1]);
        // int SAMPLING_RATE = 44100;
        // while (!StdIn.isEmpty())
        // {
        //     int pitch = StdIn.readInt();
        //     double duration = tempo * StdIn.readDouble();
        //     double hz = 440 * Math.pow(2, pitch/12.0);
        //     int n = (int) (SAMPLING_RATE * duration);
        //     double[] a = new double[n+1];
        //     for (int i = 0; i <= n; i++)
        //     {
        //         a[i] = volume * Math.sin( 2 * Math.PI * hz * i / SAMPLING_RATE ) ;
        //     }
        //     StdAudio.play(a);
        // }
        
        // 1.5.24
        // double[] a = StdIn.readAllDoubles();

        // StdAudio.save("tujhe.wav", a);
        // int SAMPLING_RATE = 44100;
        // String name = args[0];
        // double r = Double.parseDouble(args[1]);
        // double[] a = StdAudio.read(name + ".wav");
        // // int sec = a.length/1000;
        // int sample_space = 5000;
        // int samples = a.length/5000;

        // int n = (int) ( r * a.length);
        // // int k = (int) (r*100);
        // double[] a_new = new double[n];
        // double res = r - ((int) r );
        // if ( r == 1)
        // {
        //     a_new = a;
        // }
        // else if ( r < 1) 
        // {
            
        //     int k = 0;
        //     for (int i = 0; i < a.length; i++)
        //     {
        //         if ( i%sample_space < ((int) (r*sample_space)) && k < n)
        //         {
        //             a_new[k] = a[i];
        //             // System.out.println(a_new[k]);
        //             k++;
        //         } 
        //     }
        // }
        // else if ( r > 1)
        // {
        //     int k = 0;
        //     for (int i = 1; i < a.length && k < n; i++)
        //     {
        //         a_new[k] = a[i];
        //         k++;

        //         if ( i%5000 == 0 )
        //         {
        //             for (int k1 = 0; k1 < ((int) ((r-1)*sample_space))&& k < n; k1++ )
        //             {
        //                 a_new[k] = a[i-5000 + k1];
        //                 k++;
        //             }
                    
        //         }
        //     }

        // }
        
        // StdAudio.play(a_new);




        // int n = (int) ( r * a.length);
        // int k = (int) (r*100);
        // double[] a_new = new double[n];
        // double res = r - ((int) r );
        // if ( r == 1)
        // {
        //     a_new = a;
        // }
        // else if ( r < 1) 
        // {
            
        //     int j = 0;
        //     for (int i = 0; i < a.length; i++)
        //     {
        //         if ( Math.random() < r && j < n)
        //         {
        //             a_new[j] = a[i];
        //             j++;
        //         } 
        //     }
        // }
        // else if ( r > 1)
        // {
        //     int j = 0;
        //     for (int i = 0; i < n && j < a.length; i++)
        //     {
        //         for(int e = 0; e < ((int) r) && i < n  && j < a.length ; e++)
        //         {
        //             a_new[i] = a[j];
        //             i++;
                    
        //         }
                
                
        //         if ( Math.random() < res && i < n - 1 && j < a.length )
        //         {
                    
        //             a_new[i] = a[j];
        //             i++;
        //         } 
        //         j++;
        //     }
        // }
        // StdAudio.play(a_new);




        // 1.5.25
        // #1
        // StdDraw.clear(StdDraw.BLACK);
        // StdDraw.setPenColor(StdDraw.GRAY);
        // double[] x = { 0.5, 0.0, 0.5, 1.0};
        // double[] y = { 0.0, 0.5, 1.0, 0.5};
        // StdDraw.filledPolygon(x, y);

        // StdDraw.setPenColor(StdDraw.WHITE);
        // double[] tx1 = { 0.00, 0.25, 0.25 };
        // double[] ty1 = { 0.75, 0.75, 1.00 };
        // StdDraw.filledPolygon(tx1, ty1);

        // StdDraw.setPenColor(StdDraw.WHITE);
        // double[] tx2 = { 0.75, 0.75, 1.00 };
        // double[] ty2 = { 1.00, 0.75, 0.75 };
        // StdDraw.filledPolygon(tx2, ty2);

        // StdDraw.setPenColor(StdDraw.WHITE);
        // double[] tx3 = { 0.75, 0.75, 1.00 };
        // double[] ty3 = { 0.00, 0.25, 0.25 };
        // StdDraw.filledPolygon(tx3, ty3);

        // StdDraw.setPenColor(StdDraw.WHITE);
        // double[] tx4 = { 0.25, 0.25, 0.00 };
        // double[] ty4 = { 0.00, 0.25, 0.25 };
        // StdDraw.filledPolygon(tx4, ty4);

        // #2
        // StdDraw.clear(StdDraw.BLACK);
        // StdDraw.setPenColor(StdDraw.GRAY);
        // double[] x = { 0.5, 0.0, 0.5, 1.0};
        // double[] y = { 0.0, 0.5, 1.0, 0.5};
        // StdDraw.filledPolygon(x, y);

        // StdDraw.setPenColor(StdDraw.WHITE);
        // double[] tx1 = { 0.25, 0.375, 0.125, 0.00 };
        // double[] ty1 = { 0.00, 0.125, 0.375, 0.25  };
        // StdDraw.filledPolygon(tx1, ty1);

        // StdDraw.setPenColor(StdDraw.WHITE);
        // double[] tx2 = { 0.625, 0.75, 1.00, 0.875 };
        // double[] ty2 = { 0.125, 0.00, 0.25, 0.375 };
        // StdDraw.filledPolygon(tx2, ty2);

        // StdDraw.setPenColor(StdDraw.WHITE);
        // double[] tx3 = { 0.625, 0.75, 1.00, 0.875 };
        // double[] ty3 = { 0.875, 1.00, 0.75, 0.625 };
        // StdDraw.filledPolygon(tx3, ty3);

        // StdDraw.setPenColor(StdDraw.WHITE);
        // double[] tx4 = { 0.25, 0.375, 0.125, 0.00 };
        // double[] ty4 = { 1.00, 0.875, 0.625, 0.75 };
        // StdDraw.filledPolygon(tx4, ty4);

        

        // #3
        // StdDraw.clear(StdDraw.BLACK);
        // StdDraw.setPenColor(StdDraw.GRAY);
        // double[] x = { 0.5, 0.0, 0.5, 1.0};
        // double[] y = { 0.0, 0.5, 1.0, 0.5};
        // StdDraw.filledPolygon(x, y);

        // StdDraw.setPenColor(StdDraw.WHITE);
        // double[] tx1 = { 0.00, 0.25, 0.25, 0.00 };
        // double[] ty1 = { 0.75, 0.75, 1.00, 1.00 };
        // StdDraw.filledPolygon(tx1, ty1);

        // StdDraw.setPenColor(StdDraw.WHITE);
        // double[] tx2 = { 0.75, 0.75, 1.00, 1.00 };
        // double[] ty2 = { 0.75, 1.00, 1.00, 0.75 };
        // StdDraw.filledPolygon(tx2, ty2);

        // StdDraw.setPenColor(StdDraw.WHITE);
        // double[] tx3 = { 0.75, 0.75, 1.00, 1.00 };
        // double[] ty3 = { 0.25, 0.00,  0.00, 0.25 };
        // StdDraw.filledPolygon(tx3, ty3);

        // StdDraw.setPenColor(StdDraw.WHITE);
        // double[] tx4 = { 0.25, 0.25, 0.00, 0.00 };
        // double[] ty4 = { 0.25, 0.00,  0.00, 0.25 };
        // StdDraw.filledPolygon(tx4, ty4);

        // #4
        // StdDraw.clear(StdDraw.BLACK);
        // StdDraw.setPenColor(StdDraw.GRAY);
        // double[] x = { 0.5, 0.0, 0.5, 1.0};
        // double[] y = { 0.0, 0.5, 1.0, 0.5};
        // StdDraw.filledPolygon(x, y);

        // StdDraw.setPenColor(StdDraw.WHITE);
        // double[] tx11 = { 0.25, 0.375, 0.125, 0.00 };
        // double[] ty11 = { 0.00, 0.125, 0.375, 0.25  };
        // StdDraw.filledPolygon(tx11, ty11);

        // StdDraw.setPenColor(StdDraw.WHITE);
        // double[] tx22 = { 0.625, 0.75, 1.00, 0.875 };
        // double[] ty22 = { 0.125, 0.00, 0.25, 0.375 };
        // StdDraw.filledPolygon(tx22, ty22);

        // StdDraw.setPenColor(StdDraw.WHITE);
        // double[] tx33 = { 0.625, 0.75, 1.00, 0.875 };
        // double[] ty33 = { 0.875, 1.00, 0.75, 0.625 };
        // StdDraw.filledPolygon(tx33, ty33);

        // StdDraw.setPenColor(StdDraw.WHITE);
        // double[] tx44 = { 0.25, 0.375, 0.125, 0.00 };
        // double[] ty44 = { 1.00, 0.875, 0.625, 0.75 };
        // StdDraw.filledPolygon(tx44, ty44);
        
        // StdDraw.setPenColor(StdDraw.GRAY);
        // double[] tx1 = { 0.00, 0.25, 0.25, 0.00 };
        // double[] ty1 = { 0.75, 0.75, 1.00, 1.00 };
        // StdDraw.filledPolygon(tx1, ty1);

     
        // double[] tx2 = { 0.75, 0.75, 1.00, 1.00 };
        // double[] ty2 = { 0.75, 1.00, 1.00, 0.75 };
        // StdDraw.filledPolygon(tx2, ty2);

        // double[] tx3 = { 0.75, 0.75, 1.00, 1.00 };
        // double[] ty3 = { 0.25, 0.00,  0.00, 0.25 };
        // StdDraw.filledPolygon(tx3, ty3);

        // double[] tx4 = { 0.25, 0.25, 0.00, 0.00 };
        // double[] ty4 = { 0.25, 0.00,  0.00, 0.25 };
        // StdDraw.filledPolygon(tx4, ty4);

        // 1.5.26
        // int n = Integer.parseInt(args[0]);
        // double p = Double.parseDouble(args[1]);
        // double min = Double.parseDouble(args[2]);
        // double max = Double.parseDouble(args[3]);

        // for (int i = 0; i < n; i++)
        // {
        //     double r = min + (max-min)*Math.random();
        //     if (Math.random() < p)
        //     {
        //         StdDraw.setPenColor(StdDraw.BLACK);
        //         StdDraw.filledCircle(Math.random(), Math.random(),r);
        //     }
        //     else 
        //     {
        //         StdDraw.setPenColor(StdDraw.WHITE);
        //         StdDraw.filledCircle(Math.random(), Math.random(),r);
        //     }
        // }
        
        // 1.5.27

        // int SAMPLING_RATE = 44100;
        // while (!StdIn.isEmpty())
        // {
        //     int pitch = Integer.parseInt(StdIn.readString());
        //     double duration = StdIn.readDouble();
        //     int mute;
        //     if (pitch == 12) mute = 0;
        //     else mute = 1;
        //     double hz = 440 * Math.pow(2, pitch/12.0)*mute;
        //     int n = (int) (SAMPLING_RATE*duration);
        //     double[] a = new double[n+1];
        //     StdDraw.enableDoubleBuffering();
        //     for ( int i = 0; i <= n; i++)
        //     {
        //         a[i] = Math.sin(2*Math.PI*i*hz/ SAMPLING_RATE);
        //         // StdOut.println(a[i]);
                
        //     }
           
        //     StdDraw.setXscale(0.0, 440.0);
        //     StdDraw.setYscale(-3.0, 3.0);
        //     // StdDraw.setCanvasSize(1200, 512);
        //     StdDraw.clear();
        //     for (int i = 0; i < a.length; i++)
        //     {
            
        //         StdDraw.point(i,a[i]);
        //     }
        //     StdDraw.show();

        //     StdAudio.play(a);
            
        // }

        // 1.5.28
        // String[] names = StdIn.readAllStrings();
        // int n = names.length;
        // int m = n/100;
        // int[] index = new int[n];

        // for (int i = 0; i <n ; i++)
        // {
        //     index[i] = i;
        // }
        
        // for (int i = 0; i < n; i++)
        // {
        //     int r = i + ((int) (Math.random()*(n-i)));
        //     int temp = index[i];
        //     index[i] = index[r];
        //     index[r] = temp;
        // }

        // for (int i = 0; i < m; i++)
        // {
        //     StdOut.println(names[index[i]]);
        // }


        // 1.5.29
        // assuming the terrain is provided as a matrix of numbers
        // String[] lines = StdIn.readAllLines();
        // int l = lines.length;
        // double[][] terrain = new double[l][];
        
        // for ( int i = 0; i < l; i++)
        // {
        //     String[] alpha = lines[i].split(" ");
        //     terrain[i] = new double[alpha.length];
        //     for (int j = 0; j < alpha.length; j++)
        //     {
        //         terrain[i][j] = Double.parseDouble(alpha[j]);
        //         // StdOut.print(terrain[i][j] + " ");
        //     }            
        //     // StdOut.println();
        // }

        // int k = terrain[0].length;
        // int peaks = 0;

        // for ( int i = 1; i <= l-2; i++)
        // {
        //     for ( int j = 1; j <= k-2; j++)
        //     {
        //         if ( terrain[i][j] > terrain[i][j-1])
        //         {
        //             if (terrain[i][j] > terrain[i-1][j])
        //             {
        //                 if (terrain[i][j] > terrain[i+1][j])
        //                 {
        //                     if (terrain[i][j] > terrain[i][j+1])
        //                     {
        //                         peaks++;
        //                     }
        //                 }
        //             }
        //         }
        //     }
        // }

        // StdOut.println(peaks);

        // 1.5.30
        // int n = Integer.parseInt(args[0]);
        // double lo = Double.parseDouble(args[1]);
        // double hi = Double.parseDouble(args[2]);

        // double[] seq = StdIn.readAllDoubles();

        // int l = seq.length;
        // int[] counter = new int[n];

        // for ( int i = 0; i < l; i++)
        // {
        //     if ( seq[i] > lo && seq[i] < hi )
        //     {
        //         counter[(int) (((seq[i] - lo)/(hi-lo))*n)]++;
        //     }
        // }       

        // StdDraw.setYscale(0.0, ((int) (0.5*l))); // 0.5*l just approximate length order
        // for (int i = 0; i <n; i++)
        // {
        //     double[] x = { 1.0*i/n + 0.25/n , 1.0*i/n + 0.25/n, 1.0*(i+1)/n - 0.25/n, 1.0*(i+1)/n - 0.25/n };
        //     double[] y = { 0.0, counter[i], counter[i], 0.0};
        //     StdDraw.filledPolygon( x, y );
        // }



        // 1.5.31

        // double R = Double.parseDouble(args[0]);
        // double r = Double.parseDouble(args[1]);
        // double a = Double.parseDouble(args[2]);

        // StdDraw.setXscale(-50.0, 50.0);
        // StdDraw.setYscale(-50.0, 50.0);

        // int n = 100000; // samples
        // StdDraw.enableDoubleBuffering();

        // for ( int i = 0; i < n ; i++)
        // {
        //     double t = n*1.0*i/100;
        //     double x = (R + r)*Math.cos(t) - (r + a)*Math.cos((R + r)* t/r);
        //     double y = (R + r)*Math.sin(t) - (r + a)*Math.sin((R + r)* t/r);
        //     StdDraw.point(x, y);
        // }
        // StdDraw.show();


        // 1.5.32
        // StdDraw.enableDoubleBuffering();

        // int hour = 10;
        // int min = 10;
        // int sec = 0;

        // while (true)
        // {
        //     StdDraw.clear();
        //     StdDraw.setXscale ( -1.5, 1.5);
        //     StdDraw.setYscale ( -1.5, 1.5);
            
        //     // clock
        //     for ( int i = 0; i < 12; i++)
        //     {
                
        //         StdDraw.setPenRadius(0.015);
        //         double x = Math.sin( 2 * Math.PI * i/12 );
        //         double y = Math.cos( 2 * Math.PI * i/12 );
        //         StdDraw.point(x,y);
        //     }

        //     // second hand
        //     StdDraw.setPenRadius(0.005);
        //     double sx =   0.8 * Math.sin( 2 * Math.PI * sec/60.0);
        //     double sy =   0.8 * Math.cos( 2 * Math.PI * sec/60.0);
        //     StdDraw.line(0.0, 0.0, sx, sy);

        //     // minute hand
        //     StdDraw.setPenRadius(0.01);
        //     double mx =   0.6 * Math.sin( 2 * Math.PI * (sec/60.0)/60);
        //     double my =   0.6 * Math.cos( 2 * Math.PI * (sec/60.0)/60);
        //     StdDraw.line(0.0, 0.0, mx, my);

        //     // hour hand
        //     StdDraw.setPenRadius(0.015);
        //     double hx =   0.4 * Math.sin( 2 * Math.PI * ((sec/60.0)/60.0)/12);
        //     double hy =   0.4 * Math.cos( 2 * Math.PI * ((sec/60.0)/60.0)/12);
        //     StdDraw.line(0.0, 0.0, hx, hy);


        //     sec++;
        //     StdDraw.pause(1000);

        //     StdDraw.show();
        // }


        // 1.5.33
        
        // double Ax = Double.parseDouble(args[0]);
        // double wx = Double.parseDouble(args[1]);
        // double Tx = Double.parseDouble(args[2]);
        // double Ay = Double.parseDouble(args[3]);
        // double wy = Double.parseDouble(args[4]);
        // double Ty = Double.parseDouble(args[5]);

        // StdDraw.enableDoubleBuffering();
        
        // while (true)
        // {
        //     StdDraw.setXscale ( -10.0, 10.0 );
        //     StdDraw.setYscale ( -10.0, 10.0 );
        //     StdDraw.setPenRadius(0.008);
        //     for (int i = 0; i < 5000; i++)
        //     { 
        //         double t = i / 1000.0;
        //         double x = Ax * Math.sin(wx*t + Tx);
        //         double y = Ay * Math.sin(wy*t + Ty);
        //         StdDraw.point(x,y);
        //         StdDraw.show();
        //     }
        // }

        // 1.5.34
        // StdDraw.setXscale(-1.0, 1.0); 
        // StdDraw.setYscale(-1.0, 1.0); 
        // StdDraw.enableDoubleBuffering(); 
        // double rx = 0.480, ry = 0.860; 
        // double vx = 0.015, vy = 0.023; 
        // double radius = 0.05; 
        // while(true)
        // { // Update ball position and draw it.
        //     if (Math.abs(rx + vx) + radius > 1.0) vx = -vx; if (Math.abs(ry + vy) + radius > 1.0) vy = -vy; rx += vx;
        //     ry += vy;
        //     // StdDraw.clear();
        //     StdDraw.setPenColor(StdDraw.BLACK);
        //     StdDraw.filledCircle(rx, ry, radius); 
        //     StdDraw.show();
        //     StdDraw.setPenColor(StdDraw.WHITE);
        //     StdDraw.filledCircle(rx, ry, radius); 
        //     StdDraw.setPenColor(StdDraw.BLACK);
        //     StdDraw.circle(rx, ry, radius);
        //     StdDraw.pause(20);
        // }

        // 1.5.36
        
        // while (true)
        // {
        //     int note = (int) (Math.random()*12);
        //     double time = 0.5 + Math.random()*.5;
        //     StdOut.println(note + " " + time);  
        // }  // played with playtune.java

        // 1.5.37

        // #1
        // int n = Integer.parseInt(args[0]); // size of the pattern
        // boolean flipx = true;
        // boolean flipy = false;
        // StdDraw.setXscale(0.0, n);
        // StdDraw.setYscale(0.0, n);
        // for (int i = 0; i < n; i++)
        // {
        //     flipx = flipy;
        //     for(int j = 0; j < n; j++)
        //     {
        //         double x0 = i;
        //         double y0 = j;
        //         if (flipy)
        //         {
        //             StdDraw.setPenColor(StdDraw.BLACK);
        //             StdDraw.filledSquare(x0 + 0.5, y0 + 0.5, 0.5);
                    // StdDraw.setPenColor(StdDraw.BLUE);
                    // double[] x = { x0 + 0.5, x0 + 0.0, x0 + 0.5, x0 + 1.0};
                    // double[] y = { y0 + 0.0, y0 + 0.5, y0 + 1.0, y0 + 0.5};
                    // StdDraw.filledPolygon(x, y);

                    // StdDraw.setPenColor(StdDraw.WHITE);
                    // double[] tx1 = { x0 + 0.00, x0 + 0.25, x0 + 0.25 };
                    // double[] ty1 = { y0 + 0.75, y0 + 0.75, y0 + 1.00 };
                    // StdDraw.filledPolygon(tx1, ty1);

                    // StdDraw.setPenColor(StdDraw.WHITE);
                    // double[] tx2 = { x0 + 0.75, x0 + 0.75, x0 + 1.00 };
                    // double[] ty2 = { y0 + 1.00, y0 + 0.75, y0 + 0.75 };
                    // StdDraw.filledPolygon(tx2, ty2);

                    // StdDraw.setPenColor(StdDraw.WHITE);
                    // double[] tx3 = { x0 + 0.75, x0 + 0.75, x0 + 1.00 };
                    // double[] ty3 = { y0 + 0.00, y0 + 0.25, y0 + 0.25 };
                    // StdDraw.filledPolygon(tx3, ty3);

        //             StdDraw.setPenColor(StdDraw.WHITE);
        //             double[] tx4 = { x0 + 0.25, x0 + 0.25, x0 +  0.00 };
        //             double[] ty4 = { y0 + 0.00, y0 + 0.25, y0 + 0.25 };
        //             StdDraw.filledPolygon(tx4, ty4);

        //         }
        //         // else 
        //         // {
        //         //     StdDraw.setPenColor(StdDraw.BLACK);
        //         //     double xi = 1.0*x/n + 1.0/(2*n);
        //         //     double yi = 1.0*y/n + 1.0/(2*n);
        //         //     StdDraw.filledSquare(xi, yi, r);
        //         // }
        //         flipy = !flipy;
        //     }
        //     flipy = !flipx;
        // }

        // #2
        // int n = Integer.parseInt(args[0]); // size of the pattern
        // boolean flipx = true;
        // boolean flipy = true;
        // StdDraw.setXscale(0.0, n);
        // StdDraw.setYscale(0.0, n);
        // for (int i = 0; i < n; i++)
        // {
        //     flipx = flipy;
        //     for(int j = 0; j < n; j++)
        //     {
        //         double x0 = i;
        //         double y0 = j;
        //         if (flipy)
        //         {
        //             StdDraw.setPenColor(StdDraw.BLACK);
        //             StdDraw.filledSquare(x0 + 0.5, y0 + 0.5, 0.5);
        //             StdDraw.setPenColor(StdDraw.GRAY);
        //             double[] x = { x0 + 0.5, x0 + 0.0, x0 + 0.5, x0 + 1.0};
        //             double[] y = { y0 + 0.0, y0 + 0.5, y0 + 1.0, y0 + 0.5};
        //             StdDraw.filledPolygon(x, y);

        //             StdDraw.setPenColor(StdDraw.WHITE);
        //             double[] tx1 = { x0 + 0.00, x0 + 0.25, x0 + 0.25 };
        //             double[] ty1 = { y0 + 0.75, y0 + 0.75, y0 + 1.00 };
        //             StdDraw.filledPolygon(tx1, ty1);

        //             StdDraw.setPenColor(StdDraw.WHITE);
        //             double[] tx2 = { x0 + 0.75, x0 + 0.75, x0 + 1.00 };
        //             double[] ty2 = { y0 + 1.00, y0 + 0.75, y0 + 0.75 };
        //             StdDraw.filledPolygon(tx2, ty2);

        //             StdDraw.setPenColor(StdDraw.WHITE);
        //             double[] tx3 = { x0 + 0.75, x0 + 0.75, x0 + 1.00 };
        //             double[] ty3 = { y0 + 0.00, y0 + 0.25, y0 + 0.25 };
        //             StdDraw.filledPolygon(tx3, ty3);

        //             StdDraw.setPenColor(StdDraw.WHITE);
        //             double[] tx4 = { x0 + 0.25, x0 + 0.25, x0 +  0.00 };
        //             double[] ty4 = { y0 + 0.00, y0 + 0.25, y0 + 0.25 };
        //             StdDraw.filledPolygon(tx4, ty4);

        //         }
        //         
        //         // flipy = !flipy;
        //     }
        //     // flipy = !flipx;
        // }

        
        


    }
}