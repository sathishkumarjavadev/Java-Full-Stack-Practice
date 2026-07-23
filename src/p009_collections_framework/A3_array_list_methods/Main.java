package p009_collections_framework.A3_array_list_methods;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<>();
		obj.add( 0, "iyoob");
		obj.add(1,  "sathish");//--> we can also use index, but we need to use it in the order
		obj.add(2, "ramesh");
		obj.add(3, "goutham");
		
		System.out.println(obj.contains("sathish"));
		System.out.println(obj.clone());
//		----------------
		
		ArrayList<Student> Students = new ArrayList<Student>();
		Student s1 = new Student(101, "Sathish");
		Students.add(s1);
		Student s2 = new Student(101, "Sathish");
		System.out.println(Students.contains(s2));
//		-----------------
	}

}
