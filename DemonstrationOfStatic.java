package com.bridgelabz.basicprograms;

// 1.6 Write a program to demonstrate static variables, methods, and blocks.

public class DemonstrationOfStatic {
	// static variable
	static int a = 5;
	static int b;

	public static void main(String[] args) {
		System.out.println("After Static Block Main Method Called.");
		operation(10);
	}

	// static method
	public static void operation(int c) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

	// static block
	static {
		System.out.println("Static Block Initialized.");
		b = a * 4;
		System.out.println("b variable is initialized : " + b);
	}

}
