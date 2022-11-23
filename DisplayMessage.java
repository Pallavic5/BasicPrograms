package com.bridgelabz.basicprograms;

import java.util.Scanner;

//1.1 Write a program to display any message:

public class DisplayMessage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any message: ");
		String message = scanner.nextLine();
		System.out.println("Message Display: " + "\n" + message);
	}

}
