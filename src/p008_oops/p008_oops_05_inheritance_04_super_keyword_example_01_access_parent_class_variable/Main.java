package p008_oops.p008_oops_05_inheritance_04_super_keyword_example_01_access_parent_class_variable;

public class Main {

    public static void main(String[] args) {

        Child c = new Child();

        c.display();
    }
}

//What is super?
//
//super refers to the immediate parent class object.
//
//It is used to:
//
//Access parent class variables
//Access parent class methods
//Call parent class constructors