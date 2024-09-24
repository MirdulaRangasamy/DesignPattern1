/**
 * @Placed com.exterro.creational
 */
package com.exterro.creational;

/**
 * @author mrangasamy
 *
 * @date 28-May-2024
 */
class Calculator{
	private static Calculator calc = new Calculator();
	private Calculator() {}
	public static Calculator getCalculator() {
		return calc;
	}
	public int add(int num1, int num2) {
		return num1+num2;
	}
	public int sub(int num1, int num2) {
		return num1-num2;
	}
	public int multiply(int num1, int num2) {
		return num1*num2;
	}
	public int divide(int num1, int num2) {
		return num1/num2;
	}
	public int power(int num1, int num2) {
		return (int)Math.pow(num1, num2);
	}
}

public class SingletonDemo {
	public static void main(String[] args) {
		Calculator calc = Calculator.getCalculator();
		System.out.println(calc.add(3, 8));
		System.out.println(calc.multiply(3, 8));
		System.out.println(calc.power(3, 3));
	}
	
}
