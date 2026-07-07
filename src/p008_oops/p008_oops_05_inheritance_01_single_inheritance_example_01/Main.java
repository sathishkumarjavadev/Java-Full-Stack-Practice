package p008_oops.p008_oops_05_inheritance_01_single_inheritance_example_01;

public class Main {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();//own method from the parent side 
		d.eat(); //inherited method from the child side
		d.sleep();
	}
}


//Dog object can access:
//
//Its own methods (bark())
//Parent methods (eat())