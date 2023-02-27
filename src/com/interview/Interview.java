package com.interview;

import java.util.Scanner;

public class Interview {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter String");
		String input = "";
		input = sc.nextLine();
		input=input.toLowerCase();
		StringBuilder str = new StringBuilder(input);
		if(input.length()%2==0) {
			System.out.println("string is not palindrome");
			return;
		}
		if(str.reverse().toString().equals(input)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("string is not palindrome");
		}
		

	}

}
