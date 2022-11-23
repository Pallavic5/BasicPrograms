package com.bridgelabz.basicprograms;

//1.3 Write a program to check two strings are equal or not. 

import java.util.Scanner;

public class EqualityCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a First String: ");
		String firstString = scanner.nextLine();
		System.out.println("Enter a Second String: ");
		String secondString = scanner.nextLine();
		if (firstString.equals(secondString)) {
			System.out.println("Strings are equal.");
		} else {
			System.out.println("Strings are not equal.");
		}

	}

}
