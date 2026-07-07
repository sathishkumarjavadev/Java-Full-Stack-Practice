package p002_datatypes;

public class C001_PrimitiveDataTypes {
	/*
	 * Revision Summary:
	 * * Definition:
 * Primitive data types are predefined data types
 * provided by Java to store simple values.
	 * byte    -> Whole number
	 * short   -> Whole number
	 * int     -> Most commonly used integer type
	 * long    -> Large integer values
	 * float   -> Decimal values
	 * double  -> More precise decimal values
	 * char    -> Single character
	 * boolean -> true or false
	 */
	 public static void main(String[] args) {

	        byte age = 24;
	        short year = 2026;
	        int salary = 25000;
	        long population = 8000000000L;

	        float percentage = 85.5f;
	        double price = 999.99;

	        char grade = 'A';
	        boolean isPlaced = true;

	        System.out.println("byte = " + age);
	        System.out.println("short = " + year);
	        System.out.println("int = " + salary);
	        System.out.println("long = " + population);

	        System.out.println("float = " + percentage);
	        System.out.println("double = " + price);

	        System.out.println("char = " + grade);
	        System.out.println("boolean = " + isPlaced);
	    }
}
