package p009_collections_framework.L2_Linked_Hash_Map_example;

import java.util.LinkedHashMap;

public class Main 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, String> obj = new LinkedHashMap<>();
		obj.put(3, "C");
		obj.put(1, "A");
		obj.put(2, "B");
		obj.put(5, "E");
		obj.put(4, "D");
		
		System.out.println(obj);
		System.out.println(obj.get(2));
		System.out.println(obj.remove(2));
		System.out.println(obj.containsKey(1));
		System.out.println(obj.containsValue("E"));
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());
		System.out.println(obj.keySet());
		System.out.println(obj.values());
		System.out.println(obj.entrySet());
		obj.clear();
		System.out.println(obj);
		
	}
}