package p008_oops.p008_oops_11_static_keyword_01_static_variable;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student("sathish");
		Student s2 = new Student("ramesh");
		Student.college = "sasa";
		//if we want to change the value of the static variable that is belongs to the class 
		
		s1.display();
		s2.display();
	}
}
//note:
//	1. static variables are not belongs to the objects , so wnenever we want to change the value , 
//	we need to use the class reference
//	2. it cannot be called by using the object reference ,
//  3. it is called by using the class reference
