/*

author : oloop

exercise : 3.2.27

*/

public class Dragon
{
    public static String reverse(String s)
    {
        int n = s.length();
        char[] a = new char[n];
        for ( int i =0; i < n; i++)
        {
            char temp = s.charAt(n-i-1);
            if (temp == "L".charAt(0))
            {
                a[i] = "R".charAt(0);
            }
            else if (temp == "R".charAt(0))
            {
                a[i] = "L".charAt(0);
            }
            else 
            {
                a[i] = temp;
            }
        }
        return new String(a);
    }

    public static String nogard(int n)
    {
        if ( n == 0 )
        {
            return "F";
        }
        
        return dragon(n-1) + "R" + nogard(n-1);
    }

    public static String dragon(int n)
    {
        if ( n == 0 )
        {
            return "F";
        }
        
        return dragon(n-1) + "L" + nogard(n-1);
    }

    public static void drawDragon(int n)
    {
        String instructions = dragon(n);
        StdDraw.setCanvasSize(800, 800);
        StdDraw.setYscale(-3,3);
        StdDraw.setXscale(-2,5);


        Turtle t = new Turtle(0.5, 0.5, 0);
        for ( int i = 0; i < instructions.length(); i++)
        {
            if (instructions.charAt(i) == "F".charAt(0))
            {
                t.goForward(0.01);
            }
            else 
            {
                if (instructions.charAt(i) == "L".charAt(0))
                {
                    t.turnLeft(90);
                }
                else 
                {
                    t.turnLeft(-90);
                }
                
            }
        }
    }


    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdOut.println(dragon( n ) );
        drawDragon(n);
    }
}



/*


Dragon curves. Write a program to print the instructions for drawing the dragon curves of order 0 through 5. The instructions are strings of F, L, and R
characters, where F means “draw line while moving 1 unit forward,” L means “turn left,” and R means “turn right.” A dragon curve of order n is formed when you fold a strip of paper in half n times, then unfold to right angles. The key to solving this problem is to note that a curve of order n is a curve of order n1 followed by an L followed by a curve of order n1 traversed in reverse order, and then to figure out a similar description for the reverse curve.
F FLF
FLFLFRF
            FLFLFRFLFLFRFRF
Dragon curves of order 0, 1, 2, and 3




Suppose that the file input.txt contains the two strings F and F. What does the following command do (see exercise 1.2.35)?

% java Dragon < input.txt | java Dragon | java Dragon
    public class Dragon
    {
        public static void main(String[] args)
        {
            String dragon = StdIn.readString(); 
            String nogard = StdIn.readString(); 
            StdOut.print(dragon + "L" + nogard); 
            StdOut.print(" "); 
            StdOut.print(dragon + "R" + nogard); 
            StdOut.println();
        } 
    }





*/
