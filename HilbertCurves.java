/*

author : oloop

exercise : 3.2.28

*/

public class HilbertCurves
{
    
    // public static String treblih(int n)
    // {
        
    //     if ( n == 1)
    //     {
    //         return b + "FLFLF";
    //     }

    //     String h =  treblih(n-1) + "LF" + 
    //                 hilbert(n-1) + "RF" + 
    //                 hilbert(n-1) + "LF" + 
    //                 treblih(n-1) ;

    //     return h;
    
    // }


    // public static String hilbert(int n)
    // {
        
        
    //     if ( n == 1)
    //     {
    //         return b + "LFRFRF"; 
    //     }
        
    //     String h =  treblih(n-1) + "RFR" + 
    //                 hilbert(n-1) + "LF" + 
    //                 hilbert(n-1) + "FR" + 
    //                 treblih(n-1) ;

    //     return h;
    // }

    // public static void drawHilbert(int n)
    // {
    //     String instructions = hilbert(n, true);
    //     StdDraw.setCanvasSize(800, 800);
    //     StdDraw.setYscale(-3,3);
    //     StdDraw.setXscale(-2,5);


    //     Turtle t = new Turtle(0.5, 0.5, 0);
    //     for ( int i = 0; i < instructions.length(); i++)
    //     {
    //         if (instructions.charAt(i) == "F".charAt(0))
    //         {
    //             t.goForward(0.2);
    //         }
    //         else 
    //         {
    //             if (instructions.charAt(i) == "L".charAt(0))
    //             {
    //                 t.turnLeft(90);
    //             }
    //             else 
    //             {
    //                 t.turnLeft(-90);
    //             }
                
    //         }
    //     }
    // }



    public static void treblih(int n,Turtle t)
    {

        if (n == 1)
        {
            t.goForward(1);
            t.turnLeft(90);
            t.goForward(1);
            t.turnLeft(90);
            t.goForward(1);
            return;
        }

        hilbert(n-1,t);
        if (n%2 == 0)
        {
            t.turnLeft(90);
        }
        t.goForward(1);
        if (n%2 == 1)
        {
            t.turnLeft(90);
        }
        treblih(n-1,t);
        if (n%2 == 0)
        {
            t.turnLeft(-90);
        }
        t.goForward(1);
        if (n%2 == 0)
        {
            t.turnLeft(-90);
        }
        treblih(n-1,t);
        if (n%2 == 1)
        {
            t.turnLeft(90);
        }
        t.goForward(1);
        if (n%2 == 0)
        {
            t.turnLeft(90);
        }
        hilbert(n-1,t);
        return;

    }

    public static void hilbert(int n,Turtle t)
    {


        if (n == 1)
        {
            t.goForward(1);
            t.turnLeft(-90);
            t.goForward(1);
            t.turnLeft(-90);
            t.goForward(1);
            return;
        }
        

        treblih(n-1,t);
        if (n%2 == 0)
        {
            t.turnLeft(-90);
        }
        t.goForward(1);
        if (n%2 == 1)
        {
            t.turnLeft(-90);
        }
        hilbert(n-1,t);
        if (n%2 == 0)
        {
            t.turnLeft(90);
        }
        t.goForward(1);
        if (n%2 == 0)
        {
            t.turnLeft(90);
        }
        hilbert(n-1,t);
        if (n%2 == 1)
        {
            t.turnLeft(-90);
        }
        t.goForward(1);
        if (n%2 == 0)
        {
            t.turnLeft(-90);
        }
        treblih(n-1,t);
        return;
    }

    public static void drawHilbert(int n,Turtle t)
    {
        if(n%2 == 1) t.turnLeft(90);
        hilbert(n,t);
    }




    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdDraw.setYscale(0,Math.pow(2,n));
        StdDraw.setXscale(0,Math.pow(2,n));
        
        StdDraw.setPenRadius(0.006);
        Turtle t = new Turtle(0.5, 0.5, 0);
        // hilbert(n,t);
        drawHilbert(n,t);
    }
}