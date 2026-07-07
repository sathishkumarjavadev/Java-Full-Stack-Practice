package p002_datatypes;

/*
 * Topic: Non-Primitive Data Types
 *
 * Definition:
 * Non-Primitive data types store the reference (address)
 * of an object rather than the actual value.
 *
 * Examples:
 * 1. String
 * 2. Array
 * 3. Class
 * 4. Object
 *
 * Key Points:
 * ✓ Created by programmers or provided by Java
 * ✓ Can store null
 * ✓ Have methods and properties
 * ✓ Store object references
 *
 * Interview Question:
 * Difference between Primitive and Non-Primitive Data Types?
 *
 * Primitive     -> Stores actual value
 * Non-Primitive -> Stores reference/address
 */

public class C003_NonPrimitiveDataTypes {

	public static void main(String[] args) {

		// String
		String name = "Sathish";

		// Array
		int[] marks = {85, 90, 95};

		// Object
		C003_NonPrimitiveDataTypes obj = new C003_NonPrimitiveDataTypes();

		System.out.println("Name = " + name);

		System.out.println("Marks:");
		for (int mark : marks) {
			System.out.println(mark);
		}

		System.out.println("Object = " + obj);
	}
}