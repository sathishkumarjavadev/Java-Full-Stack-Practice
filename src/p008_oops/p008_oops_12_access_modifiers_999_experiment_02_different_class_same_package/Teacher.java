package p008_oops.p008_oops_12_access_modifiers_999_experiment_02_different_class_same_package;

public class Teacher {
	public static void main(String[] args) {
		Student obj = new Student();
//		System.out.println("Public :" + obj.a);
//		System.out.println("Private :" + obj.b);
//		System.out.println("Protected :" + obj.c);
		System.out.println("Default :" + obj.d);
	}

}
// type : same package with different classes