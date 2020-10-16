/* 
author : oloop
*/

public class exercises_1_2
{
    public static void main(String[] args)
    {
        // 1.2.1
        // double theta = Double.parseDouble(args[0]);
        // double sin = Math.sin(theta);
        // double cos = Math.cos(theta);
        // double value = sin*sin + cos*cos;
        // System.out.println(value);
        // System.out.println(sin*sin);
        // System.out.println(cos*cos);
        // Double k = 6.022e23;
        // System.out.println(k);
        // Long round_value = Math.round(6.022);
        // System.out.println(round_value);
        // 1.2.3
        // boolean a = Boolean.parseBoolean(args[0]);
        // boolean b = Boolean.parseBoolean(args[1]);
        // System.out.println((!(a && b) && (a || b)) || ((a && b) || !(a || b)));
        // 1.2.4
        // System.out.println(a + " , " + b + " -> " + " " + (a^b));
        // 1.2.7
        // System.out.println(2 + "bc");
        // System.out.println(2 + 3 + "bc");
        // System.out.println((2+3) + "bc");
        // System.out.println("bc" + (2+3));
        // System.out.println("bc" + 2 + 3);
        // 1.2.9
        // System.out.println((char) ('a' + 4));
        // 1.2.10
        // int a = Integer.MAX_VALUE;
        // System.out.println(a);
        // System.out.println(a+1);
        // System.out.println(2-a);
        // System.out.println(-2-a);
        // System.out.println(2*a);
        // System.out.println(4*a);
        
        // 1.2.11
        // double a = 3.14159;
        // System.out.println(a);
        // System.out.println(a+1);
        // System.out.println(8/(int) a);
        // System.out.println(8/a);
        // System.out.println((int) (8/a));
        
        // 1.2.12-13
        // System.out.println(Math.sqrt(2)*Math.sqrt(2)==2);
        
        // 1.2.14
        // int a, b ;
        // a = Integer.parseInt(args[0]);
        // b = Integer.parseInt(args[1]);
        // System.out.println((a%b == 0) || (b%a == 0));

        // 1.2.15
        // int a,b,c;
        // a = Integer.parseInt(args[0]);
        // b = Integer.parseInt(args[1]);
        // c = Integer.parseInt(args[2]);
        // boolean isTriangle = ( (a + b > c) && (b+c > a) && (c+a > b) );
        // System.out.println(isTriangle);

        // 1.2.16
        // double G, mass1, mass2, r;
        // G = 423.3;
        // mass1 = 3.34;
        // mass2 = 423.3;
        // r = 423.3;
        // double force = G * mass1 * mass2 / (r * r);
        // System.out.println(force);

        // 1.2.17
        // int a = 1; 
        // System.out.println(a);
        // a = a + a; 
        // System.out.println(a);
        // a = a + a; 
        // System.out.println(a);
        // a = a + a;
        // System.out.println(a);
        // boolean b = true; 
        // System.out.println(b);
        // b = !b;
        // System.out.println(b);
        // b = !b;
        // System.out.println(b);
        // b = !b;
        // System.out.println(b);
        // int c = 2; 
        // System.out.println(c);
        // c = c * c; 
        // System.out.println(c);
        // c = c * c;
        // System.out.println(c);
        // c = c * c;
        // System.out.println(c);

        // 1.2.18

        // double r = Math.random();
        // int a, b ;
        // a = Integer.parseInt(args[0]);
        // b = Integer.parseInt(args[1]);
        // int output = a + (int)((b-a+1)*r);
        // System.out.println(output);


        // 1.2.19

        // double r = Math.random();
        // int a = (int) (7*Math.random());
        // int b = (int) (7*Math.random());
        // System.out.println(a+b);
    
        // 1.2.20
        // double t = Double.parseDouble(args[0]);
        // double sin2t = Math.sin(2*t);
        // double sin3t = Math.sin(3*t);
        // System.out.println(sin2t + sin3t);

    
        // 1.2.23
        // int m, d;
        // m = Integer.parseInt(args[0]);
        // d = Integer.parseInt(args[1]);
        // boolean isbetween = (m == 3 && d >20) || (m==6 && d<20) || m==4 || m==5;
        // System.out.println(isbetween);

        // 1.2.24
        // double P,t,r;
        // P = Double.parseDouble(args[0]);
        // t = Double.parseDouble(args[1]);
        // r = Double.parseDouble(args[2]);
        // double value = P*(Math.exp(r*t));
        // System.out.println(P);
        // System.out.println(Math.exp(r*t));
        // System.out.println(value);

        //1.2.26
        // double x,y;
        // x = Double.parseDouble(args[0]);
        // y = Double.parseDouble(args[1]);
        // double r = Math.sqrt(x*x + y*y);
        // double theta = Math.atan2(y, x);
        // System.out.println("r = " + r + " , " + "theta = "+ theta);

        //1.2.27 Gausian Random Number
        // double u,v;
        // u = Math.random();
        // v = Math.random();
        // double r = Math.sin(2 * Math.PI * v)*Math.pow((-2 * Math.log(u)), 1/2);
        // System.out.println(r);

        //1.2.28
        // double x,y, z ;
        // x = Double.parseDouble(args[0]);
        // y = Double.parseDouble(args[1]);
        // z = Double.parseDouble(args[2]);

        // boolean isOrder = !((x>=y)^(y>=z));
        // System.out.println(isOrder);

        //1.2.29
        // int m,d,y;
        // m = Integer.parseInt(args[0]);
        // d = Integer.parseInt(args[1]);
        // y = Integer.parseInt(args[2]);

        // int y0,x0,m0,d0 ;
        // y0 = y - (14-m)/12;
        // x0 = y0 + y0 / 4 - y0/100 + y0/400;
        // m0 = m + 12* ( (14-m)/12 ) - 2;
        // d0 = (d + x0 + (31*m0)/12 )%7;
        // System.out.println(d0);

        // 1.2.30
        // double a,b,c,d,e;
        // a = Math.random();
        // b = Math.random();
        // c = Math.random();
        // d = Math.random();
        // e = Math.random();
        // double average = (a+b+c+d+e)/5.0;
        // double min = Math.min(Math.min(Math.min(Math.min(a,b),c),d),e);
        // double max = Math.max(Math.max(Math.max(Math.max(a,b),c),d),e);
        // System.out.println("average : "+ average);  
        // System.out.println("max : "+max);
        // System.out.println("min : "+min);
        
        // 1.2.33
        // double x1,x2,y1,y2; // latitude and longitude in degrees
        // x1 = Double.parseDouble(args[0]);
        // y1 = Double.parseDouble(args[1]);
        // x2 = Double.parseDouble(args[2]);
        // y2 = Double.parseDouble(args[3]);
        // double d = 60 * Math.toDegrees(Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1 - y2))));
        // System.out.println(d);

        //1.2.34
        // int a,b,c;
        // a = Integer.parseInt(args[0]);
        // b = Integer.parseInt(args[1]);
        // c = Integer.parseInt(args[2]);
        // System.out.println( Math.min(Math.min(a,b),c) + " , " + Math.max(Math.min(a,b),c) + " , " + Math.max(Math.max(a,b),c) );

        // 1.2.35


    }


}