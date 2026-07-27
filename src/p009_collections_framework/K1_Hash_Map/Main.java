package p009_collections_framework.K1_Hash_Map;

import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "sathish");
		map.put(2, "santhosh");
		//we used same key , but it will print the updated value only
		map.put(3, "santhiseh");
		map.put(3, "santhish");
		
		System.out.println(map);
		System.out.println(map.size());//returns the size of the Hashmap
		System.out.println(map.get(1));//returns the value based on key
		System.out.println(map.get(20));//returns null because no key is there
		map.remove(1);//removes the value based on the key
		System.out.println(map);
		System.out.println(map.containsKey(2));//returns true or false 
		System.out.println(map.containsValue("sathish"));//returns true or false
		System.out.println(map.isEmpty());//checks whether the map is empty or not
		System.out.println(map.isEmpty());//returns true or false
		System.out.println("===========================================");
		System.out.println(map.keySet());//returns only the key present
		System.out.println(map.values());//returns only the value present
		System.out.println(map.entrySet());//returns both the key and value present
		
		map.clear();//it removes every element in the map
		
	}

}
//important rule :
//	1. Keys must be unique.
//	2. Values can be duplicated.