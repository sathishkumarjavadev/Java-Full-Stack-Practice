package p008_oops.p008_oops_12_access_modifiers_999_experiment_03_different_package;

import p008_oops.p008_oops_12_access_modifiers_999_experiment_02_different_class_same_package.*;

public class Teacher {

	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println(obj.a);//accessing the public variable
//		System.out.println(obj.b);//the variable is private , we cant able to access
//		System.out.println(obj.c);//the variable is protected , we cant able to access
//		System.out.println(obj.d);//the variable is default which can be accessed only within the sam package 
	}
}



//note:
//Student.java will remain in the experiment_02 package itself, 
//we are going to access them 
//accessing from package to package


// easy to remember 
//we are importing the different package and accessing the public variable 