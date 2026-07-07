package p003_operators;

/*
 * Topic: Arithmetic Operators
 *
 * Definition:
 * Arithmetic operators are used to perform
 * mathematical calculations on numbers.
 *
 * Operators:
 * +  Addition
 * -  Subtraction
 * *  Multiplication
 * /  Division
 * %  Modulus (Remainder)
 *
 * Interview Question:
 * What is the difference between / and % ?
 *
 * / -> Returns Quotient
 * % -> Returns Remainder
 */

public class C001_ArithmeticOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("Addition = " + (a + b));
		System.out.println("Subtraction = " + (a - b));
		System.out.println("Multiplication = " + (a * b));
		System.out.println("Division = " + (a / b));
		System.out.println("Modulus = " + (a % b));
	}
}