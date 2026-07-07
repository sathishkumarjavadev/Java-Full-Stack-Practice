package P001_java_Basic;

/*
 * Topic: Final Variable
 *
 * Definition:
 * A variable declared with the 'final' keyword is called a final variable.
 *
 * Key Points:
 * ✓ Once assigned, its value cannot be changed.
 * ✓ Used to create constants.
 * ✓ Must be initialized either at declaration or in a constructor.
 * ✓ Common convention: use UPPER_CASE names for constants.
 *
 * Interview Question:
 * What is the difference between a normal variable and a final variable?
 *
 * Example:
 * Normal Variable -> Value can be changed.
 * Final Variable  -> Value cannot be changed.
 */

public class C007_FinalVariable {

    public static void main(String[] args) {

        int age = 24;          // Normal Variable
        age = 25;              // Allowed

        final int YEAR = 2026; // Final Variable

        System.out.println("Age = " + age);
        System.out.println("Year = " + YEAR);

        // YEAR = 2027; // Compile Time Error
    }
}