package com.bridgelabz.basicprograms;

//1.4 To find the sum of command-line arguments and count the invalid integers entered.

public class SummationArguments {

	public static void main(String[] args) {
		int sum = 0;
		int countInvalid = 0;

		for (int i = 0; i < args.length; i++) {
			try {
				sum += Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
				countInvalid++;
			}
		}
		System.out.println("The Length of arguments : " + args.length);
		System.out.println("The sum of command-line arguments: " + sum);
		System.out.println("The count of invalid integers are : " + countInvalid);

	}

}
