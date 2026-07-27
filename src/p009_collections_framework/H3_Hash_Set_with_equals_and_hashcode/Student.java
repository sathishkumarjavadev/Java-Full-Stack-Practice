package p009_collections_framework.H3_Hash_Set_with_equals_and_hashcode;

import java.util.Objects;

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
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
}
