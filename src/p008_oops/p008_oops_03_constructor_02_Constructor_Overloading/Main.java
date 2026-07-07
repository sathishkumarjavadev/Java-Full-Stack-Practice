package p008_oops.p008_oops_03_constructor_02_Constructor_Overloading;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Sathish");
        Student s3 = new Student("Sathish", 23);
    }
}
//hints to remember --> class name will be the same name for the functions or methods also
// why constructor overloading --> Each constructor serves a different requirement.