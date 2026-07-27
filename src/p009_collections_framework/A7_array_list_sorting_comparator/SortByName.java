package p009_collections_framework.A7_array_list_sorting_comparator;

import java.util.Comparator;

public class SortByName implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2)
	{
		return s2.getName().compareTo(s2.getName());
	}
}
