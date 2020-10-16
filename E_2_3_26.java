/*

author : oloop

*/

public class E_2_3_26
{

    public static void draw_towers()
    {
        StdDraw.filledRectangle(0.20, 0.02,  0.14, 0.01 );
        StdDraw.filledRectangle(0.50, 0.02,  0.14, 0.01 );
        StdDraw.filledRectangle(0.80, 0.02,  0.14, 0.01 );
        StdDraw.filledRectangle(0.20, 0.43, 0.005, 0.40 );
        StdDraw.filledRectangle(0.50, 0.43, 0.005, 0.40 );
        StdDraw.filledRectangle(0.80, 0.43, 0.005, 0.40 );
    }

    public static void draw_disc(int d, double x, double y)
    {
        // d is disc number
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledRectangle(x,y,(d)/20.0*0.12, height);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.rectangle(x,y,(d)/20.0*0.12, height);
        StdDraw.text(x,y, Integer.toString(d));
        
    }

    // private static int[][] t = {{19,17,15,13,11,9,7,5,3,1,0,0,0,0,0,0,0,0,0,0},{ 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, { 20,18,16,14,12,10,8,6,4,2,0,0,0,0,0,0,0,0,0,0}};

    private static int[][] t = {{9,7,5,3,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{ 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, { 10,8,6,4,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};

    // private static int[][] t = {{19,17,15,13,11,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},{  9,8,7,6,5,4,3,2,1,0,0,0,0,0,0,0,0,0,0,0}, { 20,18,16,14,12,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};


    private static double height = 0.02;

    // private static boolean flag = false;

    public static void refresh_discs()
    {
        draw_towers();
        
        for ( int i = 0; i < t.length; i++)
        {
            int h = 0;
            for ( int j = 0; j < t[0].length; j++)
            { 
                if ( t[i][j] != 0 ) 
                {
                    // StdOut.println(t[i][j]);
                    draw_disc(t[i][j],0.2 + i*0.3 ,0.03 + height + 2 * height *h);
                    h++;
                }
            }
        }


    }

    public static int[] message_parser(String s)
    {
        String[] info = s.split(" ");
        int n = Integer.parseInt(info[0]);
        // StdOut.println(" n : " + n);
        int[] c = new int[2];
        c[0] = n;
        if ( info[1].equals("left")) c[1] = 0;
        else c[1] = 1;
        return c; 
    }

    public static int tower_move(int q, int m)
    {
        // t is the old tower, m is the move
        if ( m == 0) m = -1;
        int k = (q + m)%3;
        if ( k == -1 ) return 2;
        else return k;

    }

    public static void move(int n, int m)
    {
        // n is the disc number, m is the move left(0) or right(1)
        int q = 0;
        for ( int i = 0; i < 3; i++)
            for ( int j = 0; j < t[0].length; j++)
            {
                if ( t[i][j] == n) 
                {
                    t[i][j] = 0;
                    q = i;
                    break;
                }
            }
        
        int t_new = tower_move(q,m);

        for ( int i = 0; i < t[0].length; i++ )
        {
            if ( t[t_new][i] == 0)
            {
                t[t_new][i] = n;

                break;
            }
        }

    }

    public static void change_towers(String s)
    {
        int[] c = message_parser(s);
        move(c[0],c[1]);

    }

    public static void animate_hanoi()
    {
        StdDraw.setCanvasSize(1200,500);
        StdDraw.enableDoubleBuffering();
        StdDraw.clear();
        refresh_discs();
        StdDraw.show();
        while ( !StdIn.isEmpty())
        {
            StdDraw.pause(1);
            String s = StdIn.readLine();
            // StdOut.println(s);
            change_towers(s);
            StdDraw.clear();
            refresh_discs();
            // int sum = 0;
            // for ( int i = 0; i < 10; i++)
            // {
            //     sum += t[1][i];
            // } 

            // if ( sum == 45 ) flag = true;

            // if ( flag )
            // {
            //     StdOut.printf("%3d %3d %3d", 0, 1, 2);
            //     StdOut.println();
            //     for( int j = t[0].length - 1 ; j >= 0; j--)
            //     {
            //         StdOut.printf("%3d %3d %3d", t[0][j], t[1][j], t[2][j]);
            //         StdOut.println();
            //     }
            //     StdDraw.pause(10000);
            // }


            StdDraw.show();
            
        }
    }


    public static void main(String[] args)
    {
        // int n = Integer.parseInt(args[0]);
        animate_hanoi();
        // draw_towers();
        // draw_disc(9,0.5,0.5);
        // refresh_discs();
    }

}