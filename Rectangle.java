/*

author : oloop

exercise : 3.2.1

*/


// public class Rectangle
// {
//     private final double x, y;
//     private final double width;
//     private final double height;

//     public Rectangle ( double x0, double y0, double w, double h)
//     {
//         x = x0;
//         y = y0;
//         width = w ;
//         height  = h ;
//     }

//     public double area()
//     {
//         return width*height;
//     }

//     public double perimeter()
//     {
//         return 2* ( width + height);
//     }

//     public boolean intersects(Rectangle b)
//     {
//         if ( Math.abs(x - b.x) < width/2.0 + b.width/2.0 && Math.abs(y - b.y) < height/2.0 + b.height/2.0)
//         {
//             return true;
//         }

//         return false;

//     }

//     public boolean contains(Rectangle b)
//     {
//         if (x + width/2.0  >= b.x + b.width/2.0   &&
//             x - width/2.0  <= b.x - b.width/2.0   &&
//             y + height/2.0 >= b.y + b.height/2.0 &&
//             y - height/2.0 <= b.y - b.height/2.0    )
//         {
//             return true;
//         }

//         return false;
//     }

//     public void draw(Rectangle b)
//     {
//         StdDraw.rectangle( x  , y  , width/2.0,   height/2.0  );
//         StdDraw.rectangle( b.x, b.y, b.width/2.0, b.height/2.0);
//     }

//     public void draw()
//     {
//         StdDraw.rectangle( x  , y  , width/2.0,   height/2.0  );
//     }

//     public String toString()
//     {
//         return String.format("%4.2f, %4.2f, %4.2f, %4.2f",x  , y  , width,   height);
//     }

//     public static void main(String[] args)
//     {
//         // StdOut.print("x1 : ");
//         // double x1 =  StdIn.readDouble();
//         // StdOut.print("y1 : ");
//         // double y1 =  StdIn.readDouble();
//         // StdOut.print("w1 : ");
//         // double w1 =  StdIn.readDouble();
//         // StdOut.print("h1 : ");
//         // double h1 =  StdIn.readDouble();

//         // StdOut.print("x2 : ");
//         // double x2 =  StdIn.readDouble();
//         // StdOut.print("y2 : ");
//         // double y2 =  StdIn.readDouble();
//         // StdOut.print("w2 : ");
//         // double w2 =  StdIn.readDouble();
//         // StdOut.print("h2 : ");
//         // double h2 =  StdIn.readDouble();

//         // Rectangle r1 = new Rectangle(x1, y1, w1, h1);
//         // Rectangle r2 = new Rectangle(x2, y2, w2, h2);
//         // StdOut.println(r1.intersects(r2));
//         // StdOut.println(r1.contains(r2));    
//         // r1.draw(r2);

//         int n = Integer.parseInt(args[0]);
//         double min  = Double.parseDouble(args[1]);
//         double max = Double.parseDouble(args[2]);
        
//         double area = 0;
//         double perimeter = 0;

//         Rectangle[] rec = new Rectangle[n];

//         for ( int  i = 0; i < n; i++)
//         {
//             rec[i] = new Rectangle(StdRandom.uniform(0.0,1.0),
//                                         StdRandom.uniform(0.0,1.0),
//                                         StdRandom.uniform(min,max),
//                                         StdRandom.uniform(min,max) );
//             // area += r.area()/n;
//             // perimeter += r.perimeter()/n;
//             rec[i].draw();
//         }
//         double intersections = 0; 

//         for ( int  i = 0; i < n; i++)
//         {
//             int intersects = 0;
//             for ( int  j = 0; j < n; j++)
//             {
//                 if (rec[i].intersects(rec[j]) && i!=j)
//                 {
//                     intersects += 1.0;
//                     StdOut.println(rec[i]);
//                     StdOut.println(rec[j]);
//                     StdOut.println();
//                 }
//             }
//             StdOut.println(intersects  );
//             intersections += intersects;
//         }
//         StdOut.println(intersections/n);



//         // StdOut.printf("average area : %5.2f, average perimeter : %5.2f\n", area , perimeter);


//     }

// }


// execise 3.2.4

public class Rectangle
{
    private final double xl, yl;
    private final double xr,yr;

    public Rectangle ( double x0, double y0, double w, double h)
    {
        xl = x0 - w/2;
        yl = y0 - h/2;
        xr = xl + w;
        yr = yl + h;
    }

    public double area()
    {
        return (xr - xl)*(yr - yl);
    }

    public double perimeter()
    {
        return 2* ( (xr - xl) + (yr - yl));
    }

    public boolean intersects(Rectangle b)
    {
        if ( Math.abs((xr + xl)/2.0 - (b.xr + b.xl)/2.0) < (xr - xl)/2.0 + (b.xr - b.xl)/2.0 && Math.abs((yr + yl)/2.0 - (b.yr + b.yl)/2.0) < (yr - yl)/2.0 + (b.yr - b.yl)/2.0)
        {
            return true;
        }

        return false;

    }

    public boolean contains(Rectangle b)
    {
        if( xr  >= b.xr  &&
            xl  <= b.xl  &&
            yr  >= b.yr  &&
            yl  <= b.yl    )
        {
            return true;
        }

        return false;
    }

    public void draw(Rectangle b)
    {
        StdDraw.rectangle( (xr + xl)/2.0,   (yr + yl)/2.0   , (xr - xl)/2.0,   (yr - yl)/2.0  );
        StdDraw.rectangle( (b.xr + b.xl)/2.0, (b.yr + b.yl)/2.0, (b.xr - b.xl)/2.0, (b.yr - b.yl)/2.0);
    }

    public void draw()
    {
        StdDraw.rectangle( (xr + xl)/2.0,   (yr + yl)/2.0   , (xr - xl)/2.0,   (yr - yl)/2.0  );

    }

    public String toString()
    {
        return String.format("%4.2f, %4.2f, %4.2f, %4.2f",(xr + xl)/2.0,   (yr + yl)/2.0  , (xr - xl),   (yr - yl));
    }

    public static void main(String[] args)
    {
        // StdOut.print("x1 : ");
        // double x1 =  StdIn.readDouble();
        // StdOut.print("y1 : ");
        // double y1 =  StdIn.readDouble();
        // StdOut.print("w1 : ");
        // double w1 =  StdIn.readDouble();
        // StdOut.print("h1 : ");
        // double h1 =  StdIn.readDouble();

        // StdOut.print("x2 : ");
        // double x2 =  StdIn.readDouble();
        // StdOut.print("y2 : ");
        // double y2 =  StdIn.readDouble();
        // StdOut.print("w2 : ");
        // double w2 =  StdIn.readDouble();
        // StdOut.print("h2 : ");
        // double h2 =  StdIn.readDouble();

        // Rectangle r1 = new Rectangle(x1, y1, w1, h1);
        // Rectangle r2 = new Rectangle(x2, y2, w2, h2);
        // StdOut.println(r1.intersects(r2));
        // StdOut.println(r1.contains(r2));    
        // r1.draw(r2);

        int n = Integer.parseInt(args[0]);
        double min  = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);
        
        double area = 0;
        double perimeter = 0;

        Rectangle[] rec = new Rectangle[n];

        for ( int  i = 0; i < n; i++)
        {
            rec[i] = new Rectangle(StdRandom.uniform(0.0,1.0),
                                        StdRandom.uniform(0.0,1.0),
                                        StdRandom.uniform(min,max),
                                        StdRandom.uniform(min,max) );
            // area += r.area()/n;
            // perimeter += r.perimeter()/n;
            rec[i].draw();
        }
        double intersections = 0; 

        for ( int  i = 0; i < n; i++)
        {
            int intersects = 0;
            for ( int  j = 0; j < n; j++)
            {
                if (rec[i].intersects(rec[j]) && i!=j)
                {
                    intersects += 1.0;
                    StdOut.println(rec[i]);
                    StdOut.println(rec[j]);
                    StdOut.println();
                }
            }
            StdOut.println(intersects  );
            intersections += intersects;
        }
        StdOut.println(intersections/n);



        // StdOut.printf("average area : %5.2f, average perimeter : %5.2f\n", area , perimeter);


    }

}