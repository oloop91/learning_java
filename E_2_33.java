/*

author : oloop
Benford's law

*/

public class E_2_33
{
    public static double log10(double x)
    {
        return Math.log(x)/Math.log(10);
    }

    public static int fdigit(int n)
    {
        int p = (int) log10(n);
        // System.out.println(p + " " + log10(n) + " " + Math.pow(10,p));
        return (int) (n/Math.pow(10,p));

    }

    public static int fdigit2(int n)
    {
        double p = log10(n);

        return (int) (Math.pow(10, p - (int) p)); 
    }

    public static int[] dist(int[] a)
    {
        int[] counter = new int[10];
        int n = a.length;

        for ( int i = 0; i < n; i++ )
        {
            // System.out.println(a[i]);
            // System.out.println(fdigit(a[i]));
            counter[fdigit(a[i])%10]++;  // due to double implementation log10(1000)
                                         // is 2.9999999996 and not 3
            
        }

        return counter;
    }

    public static int max(int[] a)
    {
        int max = Integer.MIN_VALUE;
        for ( int i = 0; i < a.length; i++)
        {
            if ( a[i] > max ) max = a[i];
        }
        return max;
    }


    public static void drawhist(int[] c)
    {
        int n = c.length;
        StdDraw.setYscale( 0.0, 1.1*max(c));
        StdDraw.setXscale( 0.0, n+1 );
        for ( int i = 1; i < n; i++)
        {
            StdDraw.filledRectangle(i, c[i]/2, 0.25, c[i]/2);
        }

    }

    public static int bnumber()
    {
        double[] p_dist = {0.32, 0.15, 0.13, 0.09, 0.08, 0.07, 0.06, 0.06, 0.04};
        int n = p_dist.length;
        int num = 0;
        double r = Math.random();
        double sum = 0.0;
        for (int j = 0; j < n; j++)
        { // Find interval containing r.
            sum += p_dist[j];
            if (r < sum) { num = j; break; }
        }
        return num;
    }

    public static int b_fullnumber() // between 1 and 1000;
    {
        int leading_num = bnumber();
        int second_number = (int) (Math.random()*11);
        int third_number = (int) (Math.random()*11);

        int num = leading_num;

        if ( second_number != 10 ) num = num*10 + second_number;
        if ( third_number != 10 ) num = num*10 + third_number;
 
        return num;

    }

    public static void main(String[] args)
    {
        int[] numbers = StdIn.readAllInts();
        int[] count = dist(numbers);
        drawhist(count);

        for ( int i = 1; i < count.length; i++)
        {
            StdOut.printf("%2d : %3.2f\n",i,1.0*count[i]/numbers.length);
        }
    }


}