package p002_datatypes;

/*
 * Topic: Type Casting
 *
 * Definition:
 * Converting one data type into another data type
 * is called Type Casting.
 *
 * Types:
 * 1. Implicit Casting (Widening)
 * 2. Explicit Casting (Narrowing)
 *
 * Interview Question:
 * Why is explicit casting required?
 *
 * Answer:
 * To prevent accidental data loss when converting
 * a larger data type to a smaller data type.
 */

public class C004_TypeCasting {

    public static void main(String[] args) {

        // Implicit Casting
        int num = 100;
        double value = num;

        System.out.println("Implicit Casting");
        System.out.println("int value = " + num);
        System.out.println("double value = " + value);

        // Explicit Casting
        double amount = 99.99;
        int result = (int) amount;

        System.out.println("\nExplicit Casting");
        System.out.println("double amount = " + amount);
        System.out.println("int result = " + result);
    }
}