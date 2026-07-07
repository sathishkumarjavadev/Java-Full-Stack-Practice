package p008_oops.p008_oops_05_inheritance_04_super_keyword_example_02_access_parent_class_methods;

public class Child extends Parent{
    void show() {
        System.out.println("Child Method");
    }
    void display() {
        //this is the method we are using to call the all functions 
    	show();
        super.show();
    }
}
