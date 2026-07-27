package p009_collections_framework.A7_array_list_sorting_comparator;

public class Student {
	
	private int id;
	private String name;
	
	public Student() {
	
	}
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public void display() {
		System.out.println(id+ " " +name);
	}
	}