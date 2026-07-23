package p009_collections_framework.A1_array_list_without_getter_setter;

public class Student {
	int id;
	String name;
	
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	

}
