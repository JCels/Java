/*
Date: June 6th, 2016
Purpose: Java Excersise
Program: Reverse a String
*/

public class reverseString {

	static String string = "abc";

	public static String reverse(String c){

		String reversedString = " ";
		for(int i = 0; i < string.length(); i++){
			reversedString = string.charAt(i)  + reversedString;
		}
		System.out.println(reversedString);
		return reversedString;

	}
	public static void main(String[] args) {
		reverse(string);
	}
}