package P001_java_Basic;

/*
 * Instance Variable:
 * ------------------
 * 1. A variable declared inside a class but outside any method,
 *    constructor, or block is called an instance variable.
 *
 * 2. Instance variables belong to an object (instance) of the class.
 *
 * 3. Each object gets its own copy of instance variables.
 *
 * 4. Instance variables receive default values if not initialized.
 *
 * 5. To access instance variables, we generally create an object.
 */

public class C005_InstanceVariable {

    int age = 24;              // Instance Variable
    String name = "Sathish";   // Instance Variable

    public static void main(String[] args) {

        // Creating an object
        C005_InstanceVariable obj = new C005_InstanceVariable();

        // Accessing instance variables using object reference
        System.out.println("Name = " + obj.name);
        System.out.println("Age = " + obj.age);
    }
}