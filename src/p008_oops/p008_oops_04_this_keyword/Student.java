package p008_oops.p008_oops_04_this_keyword;

public class Student {
	String name;
	int age ;
    Student(String name) {
        this.name = name;
    }
    void display() {
        System.out.println(name);
    }
    Student(String name, int age){
    	this.name=name;
    	this.age=age;
    }
    void display2() {
    	System.out.println(name+" "+age);
    }
    public static void main(String[] args) {

        Student s1 = new Student("Sathish");
        Student s2 = new Student("sathish", 25); 
        s1.display();
        //s2.display2("sathish", 22); we have already passed values while creating the objects 
        //passing them again will not make any changes , just call it as empty constructor
        s2.display2();
    }

}
//Interview Question

//What does this refer to?

//Answer: this refers to the current object of the class.