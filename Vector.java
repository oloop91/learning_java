/*

author : oloop

*/

public class Vector {
    private final double[] coords;

    public Vector (double[] a) {
        // Make a defensive copy to ensure immutability
        coords = new double[a.length];
        for (int i =0; i< a.length; i++){
            coords[i] = a[i];
        }
    }

    public Vector plus(Vector that) {
        // Sum of this Vector and that
        double[] result = new double[coords.length];
        for(int i= 0; i < coords.length; i++) {
            result[i] = this.coords[i] + that.coords[i]; 
        }
        return new Vector(result);
    }

    public Vector scale(double alpha) {
        // Scale this vector by alpha
        double[] result = new double [coords.length];
        for ( int i = 0; i < coords.length; i++) {
            result[i] = alpha.coords[i];
        }
        return new Vector(result);
    }

    public Vector dot(Vector that) {
        // Dot product of this vector and that
        double sum = 0.0;
        for ( int i = 0 ; i < coords.length; i++) {
            sum +=  this.coords[i]*that.coords[i];
        }
        return sum ; 
    }

    public double magnitude() {
        return Math.sqrt(this.dot(this));
    }

    public Vector direction() {
        return this.scale(1/this.magnitude());
    }

    public double cartesian(int i) {
        return coords[i];
    }
}