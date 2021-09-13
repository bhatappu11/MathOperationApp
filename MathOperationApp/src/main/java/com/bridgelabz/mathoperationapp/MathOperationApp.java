package com.bridgelabz.mathoperationapp;

public class MathOperationApp {

	@FunctionalInterface
	interface IMathFunction{
		int calculate(int a, int b);
		static void printResult(String operation, int a, int b, IMathFunction function) {
			System.out.println(operation+" : "+function.calculate(a, b));
		}
	}
	public static void main(String[] args) {
		IMathFunction add = (a,b) -> a+b;
		IMathFunction subtract = (a,b) -> a-b;
		IMathFunction division = (a,b) -> a/b;
		
		IMathFunction.printResult("Addition", 3, -5, add);
		IMathFunction.printResult("Subtraction", 9, 4, subtract);
		IMathFunction.printResult("Division", 45, 5, division);
		
	}

}
