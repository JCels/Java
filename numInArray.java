/*
 * Date: June 10th, 2016
 * Author: Jasmien Sofie Cels 
 * Purpose: Java Exercise for Beginners — Arrays, For Loops
 * Program: Count how many times a number occurs in an integer array
 */

public class numInArray {

	public static void main(String[] args) {

		// declare an array of integers	
		int[] numberline;

		//Set array to store X elements
		numberline = new int[5];

		//initialize elements
		numberline[0] = 3;
		numberline[1] = 5;
		numberline[2] = 4;
		numberline[3] = 3;

		//Set counter to zero
		int counter = 0;
		int x = 3;

		for(int i = 0; i < 5; i++){
			if( numberline[i] == x) {
				//Increment counter by one if the value at element i is equal to x
				counter += 1;
			}

		}
		System.out.println(counter);
	}
	
}