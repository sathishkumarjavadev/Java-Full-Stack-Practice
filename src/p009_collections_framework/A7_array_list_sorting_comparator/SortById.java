package p009_collections_framework.A7_array_list_sorting_comparator;
import java.util.*;

public class SortById implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2)
	{
		return s1.getId() - s2.getId();
	}
}
