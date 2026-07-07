package p008_oops.p008_oops_05_inheritance_04_super_keyword_example_01_access_parent_class_variable;

public class Child extends Parent {

    String name = "Child";

    void display() {

        System.out.println(name);
        System.out.println(super.name);
    }
}