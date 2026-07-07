package p003_operators;

/*
 * Topic: Relational Operators
 *
 * Definition:
 * Relational operators are used to compare two values.
 *
 * Output:
 * true or false
 *
 * Operators:
 * >
 * <
 * >=
 * <=
 * ==
 * !=
 *
 * Interview Question:
 * What is the difference between = and == ?
 *
 * =  -> Assignment Operator
 * == -> Comparison Operator
 */

public class C007_RelationalOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("a > b  = " + (a > b));
		System.out.println("a < b  = " + (a < b));
		System.out.println("a >= b = " + (a >= b));
		System.out.println("a <= b = " + (a <= b));
		System.out.println("a == b = " + (a == b));
		System.out.println("a != b = " + (a != b));
	}
}