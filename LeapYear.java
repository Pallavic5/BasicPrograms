package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		isLeapyear();
	}

	public static void isLeapyear() {
		int year = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Year: ");
		year = scanner.nextInt();
		if (year >= 1582) {
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				System.out.println(year + " is a Leap Year ");
			} else {
				System.out.println(year + " is not a Leap Year ");
			}
		} else {
			System.out.println("It is Invalid Year.");
		}

	}

}
