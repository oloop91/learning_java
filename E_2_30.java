/*

author : oloop

*/

public class E_2_30
{
    public static boolean LeapYear(int n)
    {
        int year = n;
        boolean isLeapYear;
        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);
        return isLeapYear;
    }

    public static int DayofWeek(int d, int m, int y)
    {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }


    public static void print_head()
    {
        String week = "  S  M Tu  W Th  F  S";
        StdOut.println(week);
    }

    public static void print_days(int m, int y)
    {
        int n = daysinmonth(m,y);
        int d1 = DayofWeek( 1, m, y);
        for ( int i = 0; i < d1; i++)
        {
            StdOut.printf("   ");
        }

        for ( int i = 1; i <=n; i++)
        {
            StdOut.printf("%3d",i);
            if ( DayofWeek( i, m, y) == 6) StdOut.println();
        }
        StdOut.println();

    }

    public static int daysinmonth(int m, int y)
    {
        int[] x = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (LeapYear(y) & (m == 2)) return x[m] + 1;
        else return x[m];
    }

    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        print_head();
        print_days(m, y);

       
    }


}