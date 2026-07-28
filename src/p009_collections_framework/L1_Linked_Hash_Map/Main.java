package p009_collections_framework.L1_Linked_Hash_Map;

import java.util.LinkedHashMap;

public class Main 
{
	public static void main(String[] args) 
	{		
		LinkedHashMap<Integer, String> obj = new LinkedHashMap<>();
		obj.put(1, "sathish");
		obj.put(2, "santhis");
		obj.put(3, "sunfeast");
		
		System.out.println(obj);// to print everything
		System.out.println(obj.get(2));//to print based on index
		System.out.println(obj.remove(3));//to remove the object
		System.out.println(obj.containsKey(2));
		System.out.println(obj.containsValue("sathish"));
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());
		System.out.println(obj.keySet());
		System.out.println(obj.values());
		System.out.println(obj.entrySet());
		
	}
}

// only insertion order is there 

//map.put()
//map.get()
//map.remove()
//map.containsKey()
//map.containsValue()
//map.size()
//map.isEmpty()
//map.clear()
//
//map.keySet()
//map.values()
//map.entrySet()
//
//Iterator

//
//| Feature              | HashMap | LinkedHashMap |
//| -------------------- | ------- | ------------- |
//| Key-Value            | ✅      | ✅            |
//| Duplicate Keys       | ❌      | ❌            |
//| Duplicate Values     | ✅      | ✅            |
//| One null Key         | ✅      | ✅            |
//| Multiple null Values | ✅      | ✅            |
//| Insertion Order      | ❌      | ✅            |
//| Sorted               | ❌      | ❌            |
