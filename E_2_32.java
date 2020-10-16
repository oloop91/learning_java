/*

author : oloop

*/


public class E_2_32
{
    public static double[] superpose(double[] a, double[] b, double awt, double bwt)
    { // Weighted superposition of a and b.
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++)
            c[i] = a[i]*awt + b[i]*bwt;
        return c;
    }
    
    public static double[] tone(double hz, double t)
    {   
        int SAMPLING_RATE = 44100;
        int n = (int) (SAMPLING_RATE * t);
        double[] a = new double[n+1];
        for (int i = 0; i <= n; i++)
        a[i] = Math.sin(2 * Math.PI * i * hz / SAMPLING_RATE);
        return a;   
    }

    public static double[] note(int pitch, double t)
    { // Play note of given pitch, with harmonics.
        double hz = 440.0 * Math.pow(2, pitch / 12.0);
        double[] a = tone(hz, t);
        double[] hi = tone(2*hz, t);
        double[] lo = tone(hz/2, t);
        double[] h = superpose(hi, lo, 0.5, 0.5);
        return superpose(a, h, 0.5, 0.5);
    }

    public static double[] chord(int pitch[], double wt[], double t)
    {
        int n = pitch.length;
        double[][] chordnotes = new double[n][];
        for ( int i = 0; i < n; i++)
        {
            chordnotes[i] = note(pitch[i],t);
        }
        double[] c = new double[chordnotes[0].length];
        for ( int i = 0; i < chordnotes[0].length; i++)
        {
            double sum = 0.0;
            for ( int j = 0; j < n; j++)
            {
                sum += chordnotes[j][i]*wt[j];
            }
            c[i] = sum;
        }

        return c;

    }
    
    public static void main(String[] args)
    { // Read and play a tune, with harmonics.
        while (!StdIn.isEmpty())
        { // Read and play a note, with harmonics.
            int n = StdIn.readInt();
            int[] pitch = new int[n];
            double[] wt = new double[n];
            for ( int i = 0; i < n; i ++)
                pitch[i] = StdIn.readInt();

            for ( int i = 0; i < n; i ++)
                wt[i] = StdIn.readDouble();

            double duration = StdIn.readDouble();
            double[] a = chord(pitch , wt , duration);
            StdAudio.play(a);
        }
    }
}