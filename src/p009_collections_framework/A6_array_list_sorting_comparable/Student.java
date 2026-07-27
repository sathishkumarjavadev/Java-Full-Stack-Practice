package p009_collections_framework.A6_array_list_sorting_comparable;



public class Student implements Comparable<Student> {
	
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
//	public Student(double d) {
//		// TODO Auto-generated constructor stub
//	}
	//getters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	//setters
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println(id+" "+name);
	}
//	1st method
//	public int compareTo(Student other) {
//		return this.id - other.id;
//	}
//	2nd method (standard approach)	
	public int compareTo(Student other) {
	return Integer.compare(this.id, other.id) ;
	}
}

	/*
 * Think of Comparable as a Rule Book

Imagine you are organizing a race.

You tell the judge:

"Rank everyone by height."

The judge now has a rule.

If tomorrow you say:

"Rank everyone by age."

The order changes because the rule changed.

Comparable is exactly that rule.

It tells Java:

"Whenever you sort Student objects, compare them using this field."

 */