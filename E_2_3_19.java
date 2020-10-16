/*

author : oloop

*/

public class E_2_3_19
{

    public static String[] combination(String[] a)
    {
        if ( a.length == 0) 
        {
            String[] c = {""};
            return c;
        }
        

        String[] c1 = combination(E_2_3_20.remove(a,0));

        String[] c2 = new String[c1.length];

        for ( int i = 0; i < c1.length; i++)
        {
            c2[i] = a[0] + c1[i];
        }

        String[] c3 = E_2_3_20.add(c1,c2);

        return c3;

    }

    public static void comb(int n)
    {
        String[] a = E_2_3_20.get_alphabets(n);
        String[] c = combination(a);
        for ( int i = 0; i < c.length; i++)
        {
            StdOut.println(c[i]);
        }
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        comb(n);

    }


}