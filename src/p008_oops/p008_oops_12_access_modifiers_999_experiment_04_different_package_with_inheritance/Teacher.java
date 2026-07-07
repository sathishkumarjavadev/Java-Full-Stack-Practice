package p008_oops.p008_oops_12_access_modifiers_999_experiment_04_different_package_with_inheritance;

import p008_oops.p008_oops_12_access_modifiers_999_experiment_02_different_class_same_package.Student;

public class Teacher extends Student {

	void display() {
		System.out.println(this.c);
	}
	 void display2() {
	        System.out.println(c);
	    }

	public static void main(String[] args) {
		//extra method
		
		Teacher obj = new Teacher();
		System.out.println(obj.a);
		System.out.println(obj.c);
		
		obj.display();
		obj.display2();
	}
}
//note:
//protected can be accessed:
//✅ Same Package
//OR
//✅ Different Package + Inheritance