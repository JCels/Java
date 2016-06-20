package minerva;

import java.util.*;

public class interactiveCalculator {
	
	public static int add(int x, int y) {
			int sum = x + y; 
			return sum;
		}
	
	public static int subtract(int x, int y){
		int difference = x- y;
		return difference;
	}
	
	public static int multiply(int x, int y){
		int product = x * y;
		return product;
	}
	
	public static int divide(int x, int y) {
		int quoitent = x/y;
		return quoitent;
	}
		

	public static void main(String[] args) {
		
		Scanner operationInput = new Scanner(System.in);
		
		System.out.println("Choose arithmatic operation: add, subtract, multiply, divide");
		
		String operation = operationInput.next();
		//System.out.println(operation);
		
		System.out.println("Type in first number");
		
		int x = operationInput.nextInt();
		//System.out.println(x);
		System.out.println("Type in second number");
		int y = operationInput.nextInt();
		//System.out.println(y);
		
		
		
		// Decision structure to determine which operation needs to be performed as specified by user input 
		if(operation.equals("add")){
			int answer = add(x,y);
			System.out.println("The answer is : " + answer);
		}
		else if(operation.equals("subtract")){
			int answer = subtract(x,y);
			System.out.println("The answer is : " + answer);
			
		} else if(operation.equals("multiply")){
			int answer = multiply(x,y);
			System.out.println("The answer is : " + answer);
			
		} else if(operation.equals("divide")){
			int answer = divide(x,y);
			System.out.println("The answer is : " + answer);
		} else {
			System.out.println("Invalid operation chosen");
		}
	
	}

}
