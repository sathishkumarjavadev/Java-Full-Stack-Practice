package p008_oops.p008_oops_06_method_overriding_example_02;

public class Main{
	 public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
	}
}

//Rules of Method Overriding
//Rule 1
//
//Method name must be same.
//Rule 2
//
//Parameters must be same.
//Rule 3
//
//Return type should be same (or compatible).
//
//
//
//Interview Question
//Difference Between Overloading and Overriding
//Overloading	, Overriding
//Same method name	, Same method name
//Different parameters	, Same parameters
//Same class	, Parent & Child classes
//Compile-time polymorphism	, Runtime polymorphism