/*

author : oloop

*/

public class Playtune
{
    public static void main(String[] args)
    {
        int SAMPLING_RATE = 44100;
        // StdDraw.enableDoubleBuffering();
        while (!StdIn.isEmpty())
        {
            int pitch = StdIn.readInt(); // Integer.parseInt(StdIn.readString());
            double duration = StdIn.readDouble();
            int mute;
            if (pitch == 12) mute = 0;
            else mute = 1;
            double hz = 440 * Math.pow(2, pitch/12.0)*mute;
            int n = (int) (SAMPLING_RATE*duration);
            double[] a = new double[n+1];
            for ( int i = 0; i <= n; i++)
            {
                a[i] = Math.sin(2*Math.PI*i*hz/ SAMPLING_RATE);
                // StdOut.println(a[i]);
            }
            // StdDraw.setXscale(0.0, 440.0);
            // StdDraw.setYscale(-1.5, 1.5);
            // // StdDraw.setCanvasSize(1200, 512);
            // StdDraw.clear(StdDraw.BLACK);
            
            // for (int i = 0; i < a.length; i++)
            // {
            //     StdDraw.setPenRadius(0.005);
            //     StdDraw.setPenColor(StdDraw.GREEN);
            //     StdDraw.point(i,a[i]);
            // }
            // StdDraw.show();

            StdAudio.play(a);
            
        }

        







    }
}