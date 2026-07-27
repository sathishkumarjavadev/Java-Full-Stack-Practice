package p009_collections_framework.H3_Hash_Set_with_equals_and_hashcode;

import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
		
		HashSet<Student> set = new HashSet<>();
		
		Student s1 = new Student(1, "sathish");
		Student s2 = new Student(2, "santhosh");
		
		set.add(s1);
		set.add(s2);
		set.add(s2);//it avoids the duplicate objects
		
		System.out.println("total set is : "+set.size());
		
		for(Student s:set) {
			s.display();
		}
	}
}