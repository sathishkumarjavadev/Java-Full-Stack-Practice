package p009_collections_framework.I1_Linked_Hash_Set;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class Main {
	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		//add, remove, contains, size, isempty, clear, iterator
		set.add(10);
		set.add(3);
		set.add(54);
		set.add(31);
		set.add(2);
		set.add(50);
		set.add(50);//duplicate removed
		set.add(-10);	
		System.out.println(set);
		set.remove(2);//to remove the element
		System.out.println(set);
		System.out.println(set.contains(10));//to check the element present or not
		System.out.println(set.size());//to find the size
		System.out.println(set.isEmpty());//to check the set is empty or not
		//looping throughit 
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}		
		set.clear();//to empty the set
		set.add(-10);	
		System.out.println(set);
	}
}
/*
LinkedHashSet
 
duplicates - no
one null allowed - yes
insertion order - yes
uses hashing - yes
slightly slower - yes
*/