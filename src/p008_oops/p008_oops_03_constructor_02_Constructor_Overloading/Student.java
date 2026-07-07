package p008_oops.p008_oops_03_constructor_02_Constructor_Overloading;

class Student {

    Student() {
        System.out.println("Default Constructor");
    }

    Student(String name) {
        System.out.println("Name: " + name);
    }

    Student(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

