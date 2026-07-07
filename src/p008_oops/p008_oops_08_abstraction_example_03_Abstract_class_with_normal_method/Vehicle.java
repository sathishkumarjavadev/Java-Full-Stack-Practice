package p008_oops.p008_oops_08_abstraction_example_03_Abstract_class_with_normal_method;

abstract class Vehicle 
{
	abstract void start();
	void stop() {
		System.out.println("Vehicle Stopped");
	}
}

//Abstract Class  → Can have abstract + normal methods
//Abstract Method → No body
//Object Creation → Not allowed
//Child Class     → Must implement abstract methods
