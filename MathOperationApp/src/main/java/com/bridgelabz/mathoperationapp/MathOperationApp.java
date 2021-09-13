package com.bridgelabz.mathoperationapp;

public class MathOperationApp {

	@FunctionalInterface
	interface IMathFunction{
		int calculate(int a, int b);
	}
	public static void main(String[] args) {
		IMathFunction add = (a,b) -> a+b;
		IMathFunction subtract = (a,b) -> a-b;
		IMathFunction division = (a,b) -> a/b;
		
		System.out.println("Addition: "+add.calculate(3, -5));
		System.out.println("Subtraction: "+subtract.calculate(9, 4));
		System.out.println("Division: "+division.calculate(45, 5));

	}

}
