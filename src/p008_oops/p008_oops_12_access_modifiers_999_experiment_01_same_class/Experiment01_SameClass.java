package p008_oops.p008_oops_12_access_modifiers_999_experiment_01_same_class;

public class Experiment01_SameClass {
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	int d = 40;
	
	void display()
	{
		System.out.println("Public "+a);
		System.out.println("Private "+b);
		System.out.println("Protected "+c);
		System.out.println("Default "+d);
	}
	
	public static void main(String[] args) {
		Experiment01_SameClass boo = new Experiment01_SameClass();
		boo.display();
	}
}


//🎯 Rule #2
//
//Inside the same package, different classes can access public, protected, and default members.
//
//Only private is restricted to its own class.