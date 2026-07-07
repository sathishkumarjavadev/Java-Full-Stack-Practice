package p008_oops.p008_oops_07_polymorphism_02_runtime_polymorphism;

public class Main {
	 public static void main(String[] args) {
		
	Animal a = new Dog();
	a.sound();
	 }
}

//
//Important Interview Question
//Can we do this?
//Dog d = new Animal();
//
//❌ No
//
//Reason:
//
//Parent object cannot be stored inside a child reference.
//
//Compiler error.
//
//This is valid:
//Animal a = new Dog();
//
//✅ Parent reference → Child object


//final thing to remember child object can be stored in the parent obj , 
//but parent object cannot be stored in the child object 
//@override keyword is there dont forget to revide