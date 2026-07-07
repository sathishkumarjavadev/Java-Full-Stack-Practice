package p008_oops.p008_oops_14_exception_handling;

public class A9ThrowsExample {

    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Not Eligible");
        }
        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        checkAge(16);
    }
}


//What is throws?
//
//The throws keyword is used to declare that a method may throw an exception.
//
//Think of it as a warning.
//
//"This method might throw an exception. Whoever calls this method should be prepared to handle it."