package P001_java_Basic;

/*
 * /*
 * Static Variable:
 * ----------------
 * A static variable belongs to the class.
 * It can be accessed without creating an object.
 *
 * Access using:
 * ClassName.variableName
 * *
 * Definition:
 * A variable declared with the 'static' keyword is called a static variable.
 *
 * Key Points:
 * ✓ Belongs to the class, not to objects.
 * ✓ Shared among all objects of the class.
 * ✓ Memory is allocated only once.
 * ✓ Can be accessed using ClassName.variableName.
 *
 * Interview Question:
 * What is the difference between an Instance Variable and a Static Variable?
 */

public class C006_StaticVariable {

    static String company = "OpenAI"; // Static Variable

    public static void main(String[] args) {

        System.out.println("Company = " + company);

        // Recommended way
        System.out.println("Company = " + C006_StaticVariable.company);
    }
}