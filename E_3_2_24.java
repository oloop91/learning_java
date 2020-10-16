/*

author : oloop

*/

public class E_3_2_24
{

    public static void main(String[] args)
    {
        Charge[] a = new Charge[3];
        a[0] = new Charge(0.4, 0.6, 50);
        a[1] = new Charge(0.5, 0.5, -5);
        a[2] = new Charge(0.6, 0.6, 50);

        Potential p = new Potential(a);
        
        for (int t = 0; t < 100; t++)
        {
            // Compute the picture.
            p.updatePotential();
            p.picture.show();
            a[1].increaseCharge(-2.0);
        }
    }

}