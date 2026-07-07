package p003_operators;

/*
 * Topic: Logical Operators
 *
 * Definition:
 * Logical operators are used to combine
 * multiple conditions.
 *
 * Operators:
 * &&  -> AND
 * ||  -> OR
 * !   -> NOT
 *
 * Output:
 * true or false
 *
 * Interview Question:
 * Difference between && and || ?
 *
 * && -> All conditions must be true
 * || -> Any one condition must be true
 */

public class C011_LogicalOperators {
	public static void main(String[] args) {
		int age = 20;
		int marks = 80;
		System.out.println((age >= 18 )&& (marks >= 35));
		System.out.println(age >= 18 || marks < 35);
		System.out.println(!(age < 18));
	}
}