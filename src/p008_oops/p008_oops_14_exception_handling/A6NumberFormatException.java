package p008_oops.p008_oops_14_exception_handling;

public class A6NumberFormatException {
public static void main(String[] args) {
	String str = "ABC";
	
	int number;
	try {
		number = Integer.parseInt(str);
		System.out.println(number);
	} catch (NumberFormatException e) {
		System.err.println("please enter a valid number");
	}
	finally {		
		System.out.println("Program ended");
	}
}
}




//What is NumberFormatException?
//
//A NumberFormatException occurs when Java tries to convert 
//a String into a numeric type, 
//but the String does not contain a valid number.
//
//Interview Questions
//1. What is NumberFormatException?
//
//It is a runtime exception that occurs when a String cannot be converted into a numeric type.
//
//2. Which method commonly throws NumberFormatException?
//
//Examples include:
//
//Integer.parseInt();
//Double.parseDouble();
//Float.parseFloat();
//Long.parseLong();
//3. How can you avoid NumberFormatException?
//Validate user input before parsing.
//Use a try-catch block when parsing user-provided values.