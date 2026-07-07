package P001_java_Basic;

/*
 * Topic: Variable Naming Rules
 *
 * Definition:
 * Variable names are identifiers used to store values.
 *
 * Rules:
 * ✓ Can start with a letter, _ or $
 * ✓ Can contain letters, numbers, _ and $
 * ✓ Cannot start with a number
 * ✓ Cannot contain spaces
 * ✓ Cannot use Java keywords
 * ✓ Variable names are case-sensitive
 *
 * Naming Convention:
 * ✓ Use camelCase
 * ✓ Meaningful names are preferred
 *
 * Interview Question:
 * Can a variable name start with a number?
 *
 * Answer:
 * No.
 */
public class C010_VariableNamingRules {

    public static void main(String[] args) {

        // Valid Variable Names
        int age = 24;
        int studentId = 101;
        int _count = 10;
        int $salary = 25000;

        System.out.println(age);
        System.out.println(studentId);
        System.out.println(_count);
        System.out.println($salary);
    }
}