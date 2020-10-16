/*

author : oloop

*/

import java.awt.Color;

public class perceptron
{

	public static boolean sign(double[] w, double[] x)
	{
		double dot = 0.0;
		for ( int i = 0; i < w.length; i++)
		{
			dot += w[i]*x[i];
		}
		return (dot > 0);
	}
	
	public static boolean allgood(double[] w0, double[] w, double[][] points)
	{
		boolean flag = true;
		for ( int i = 0; i < points.length; i++)
		{
			flag = flag && (sign(w,points[i])^sign(w0,points[i]));
		}
		return flag;
	}

	public static double[] newPerceptron(double[] w0, double[] w, double[][] points)
	{
		double[] w1 = new double[w.length];
		double[] x = new double[3];
		for (int i = 0; i < points.length; i++)
		{
			if (sign(w,points[i]) != sign(w0,points[i]))
			{
				x = points[i];
				break;
			}
		}
		for(int i = 0; i < w.length; i++)
		{
			if ( sign(w0,x)) w1[i] = w[i] + x[i];
			else w1[i] = w[i] - x[i];
		}
		return w1;
	}

	public static void drawPerceptronlines(double[] w, double[] w0, double xmin, double xmax, double ymin, double ymax)
	{
		StdDraw.setPenColor(new Color(210,20,42));
		StdDraw.line(-(w[2] + w[1]*ymin)/w[0],  ymin, xmin, -(w[2] + w[0]*xmin)/w[1]);		
		
		StdDraw.setPenColor(new Color(0,255,42));
		StdDraw.line(-(w0[2] + w0[1]*ymin)/w0[0], ymin, xmin, -(w0[2] + w0[0]*xmin)/w0[1]);
	}


	public static void drawPoints(double[] w0, double[][] a)
	{

		StdDraw.setPenRadius(0.005);
		for(int i =0 ; i < a.length; i++)
		{		
			if (sign(w0, a[i]))
			{
				StdDraw.setPenColor(StdDraw.BLUE);
				StdDraw.circle(a[i][0],a[i][1],0.005);
			}
			else
			{
				StdDraw.setPenColor(StdDraw.RED);
				StdDraw.square(a[i][0],a[i][1],0.005);
			}
		
		}
		return;	
	}
	


	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]); // random n point in a unit square
		double[] w0 = new double[3];
		w0[0] = Double.parseDouble(args[1]);
		w0[1] = Double.parseDouble(args[2]);
		w0[2] = Double.parseDouble(args[3]);
		double[][] points = new double[n][3];
		double xmin, xmax, ymin, ymax;
		xmin = -2;
		xmax =  2;
		ymin = -2;
		ymax =  2;
		for (int i = 0; i < n; i++)
		{
			points[i][0] = StdRandom.uniform(xmin, xmax);
			points[i][1] = StdRandom.uniform(ymin, ymax);
			points[i][2] = 1;
		}
		double[] w = {0, 0, 0};
		StdDraw.enableDoubleBuffering();
		StdDraw.setYscale(xmin, xmax);
		StdDraw.setXscale(ymin, ymax);
		while(!allgood(w0,w,points))
		{
			w = newPerceptron(w0, w, points);
			StdDraw.clear();
			drawPoints(w0, points);
			drawPerceptronlines(w, w0, xmin, xmax, ymin, ymax);
			StdDraw.pause(100);
			StdDraw.show();
			
		}
		
		
	}
}
