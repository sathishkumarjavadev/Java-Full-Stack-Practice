package p009_collections_framework.A2_array_list_with_getter_setter;

public class Student {
	
	private int id;
	private String name;
	
	//default constructor
	public Student()
	{
		
	}
	//parameterized constructor
	public Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	//Getter
	public int getId() 
	{
		return id;
	}
	//Setter
	public void setId(int id)
	{
		this.id = id;
	}
	//Getter
	public String getName() {
		return name;
	}
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println(id+" "+name);
	}
}