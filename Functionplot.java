/*

author : oloop

*/

public class Functionplot {
    public static void plot(Function f, double a, double b, int n) {
        double[] y = new double[n+1];
        double delta = (b-a) /n ;
        for ( int i = 0; i <= n; i++ ) {
            y[i] = f.evaluate(a + delta*i);
        }
        StdStats.plotPoints(y);
        StdStats.plotLines(y);
    }

    public static void main(String[] args) {
        Function f1 = new Square();
        Function f2 = new GaussianPDF();
        plot(f1, 0, 1, 10);
        plot(f2, 0, 1, 10);
    }
}