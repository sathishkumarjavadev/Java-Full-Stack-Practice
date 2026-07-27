package p009_collections_framework.H2_Hash_Set_without_equals_and_hashcode;

public class Student {
	int id;
	String name;
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	void display() 
	{
		System.out.println(id+" "+name);
	}
	@Override
	public boolean equals(Object obj) 
	{
	    Student otherobj = (Student) obj;
	    return ((this.id == otherobj.id) && (this.name.equals(otherobj.name)));
	}
}