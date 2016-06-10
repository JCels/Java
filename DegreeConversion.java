/*
 * Date: June 10th, 2016
 * Purpose: Java Exercise for Beginners
 * Program: Celcius/Fahrenheit conversion
 */

public class DegreeConversion {
	
	// Manipulate degrees here
	static double c = 0;
	static double f = 32;
	
	public static double cToF(double c) {
		double f = c * 1.8 + 32; 
		return f ;
	}
	
	public static double fToC(double f) {
		double c = (f-32) / 1.8;
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println(cToF(c));
		System.out.println(fToC(f));
	}
}