/*
 * Date: June 10th, 2016
 * Purpose: Java Exercise for Beginners
 * Program: Simple Calculator— add, subtract, multiply, divide
 */

public class simpleCalc {

	static int x = 10;
	static int y = 5;

	public static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	public static int sub(int x, int y) {
		int diff = x - y ;
		return diff;
	}

	public static int mult(int x, int y) {
		int product = x * y;
		return product;
	}

	public static int divide(int x, int y) {
		int quotient = x/y;
		return quotient;
	}

	// Test the function outcomes here
	public static void main(String[] args) {
		System.out.println(sub(x,y));
	}

}