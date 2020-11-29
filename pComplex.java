/*

author : oloop

*/

public class pComplex {
    
    private final double r;
    private final double theta;

    public pComplex(double re, double im ) {
        r = Math.sqrt(re*re + im*im);
        theta = Math.atan2(im,re);
    }

    public pComplex plus(pComplex b) {
        // Returns the sum of this number and b 
        double real = re() + b.re();
        double imag = im() + b.im();
        return new pComplex(real, imag);
    }

    public pComplex times(pComplex b){
        double radius  = r*b.r;
        double angle = theta + b.theta;
        return new pComplex(radius*Math.cos(angle), radius*Math.sin(angle));
    }

    public double abs() {
        return r;
    }

    public double re() {return r * Math.cos(theta);}
    public double im() {return r * Math.sin(theta);}

    public String toString() { 
        return re()+ " + " + im() + "i"; 
    }

    public static void main(String[] args) {
        pComplex z0 = new pComplex(1.0,1.0);
        pComplex z = z0;
        z = z.times(z).plus(z0);
        z = z.times(z).plus(z0);
        StdOut.println(z);
    }

}