package p003_operators;

public class C042_Task1_Grade_System {
public static void main(String[] args) {
	int marks = 85;

	if (marks >= 90 ) {
		System.out.println("A");}
	else if (marks >= 75) { System.out.println("B");}
	
	else if( marks >= 50 ) {System.out.println( "C");}
	else {System.out.println("Fail");}
	
	int age = 15;

	if (age >= 60 ){System.out.println( "Senior Citizen");}
	else if (age >= 18) {System.out.println( "Adult");}
	else if( age >= 13) {System.out.println("Teenager");} 
	else System.out.println("Child");
	//to find the largest number, Find the largest number using if-else-if.
	int a = 25;
	int b = 150;
	int c = 30;
	if (a > b && a > c) {
	    System.out.println("a is greater");
	}
	else if (b > a && b > c) {
	    System.out.println("b is greater");
	}
	else {
	    System.out.println("c is greater");
	}
}}
