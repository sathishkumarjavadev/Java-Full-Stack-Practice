package p009_collections_framework.A2_array_list_with_getter_setter;

import java.util.ArrayList;

public class ArrayListWithGetterSetter {
	public static void main(String[] args) {
		
		ArrayList<Student> obj = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Sathish");
		
		Student s2 = new Student();
		s2.setId(3);
		s2.setName("Nithish");
		
		obj.add(s1);
		obj.add(s2);
		
		for(Student s :obj)
		{
			System.out.println(s.getId() + " " + s.getName());
		}	
	}
}