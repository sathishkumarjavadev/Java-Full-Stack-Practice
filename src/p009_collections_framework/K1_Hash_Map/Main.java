package p009_collections_framework.K1_Hash_Map;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "sathish");
		map.put(2, "santhosh");
		//we used same key , but it will print the updated value only
		map.put(3, "santhiseh");
		map.put(3, "santhish");
		//method 1 using the keyset
		for(Integer key:map.keySet())//end is fixed with keyset
		{
			System.out.println(key + "->" + map.get(key));
		}
		System.out.println("===========================================");
		
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
		System.out.println(map.keySet());//returns only the key present(index)
		System.out.println(map.values());//returns only the value present
		System.out.println(map.entrySet());//returns both the key and value present
//		(think like we are making an entry , one single entry contains one complete data)
		
//		map.clear();//it removes every element in the map
		System.out.println("===========================================");
//		method 2 using the entryset(******standard******)
		System.out.println("Traversing using the for loop entryset");
		for(HashMap.Entry<Integer, String> obj : map.entrySet()) {
			System.out.println(obj.getKey()+" "+ obj.getValue());			
		}
		System.out.println("===========================================");		
//		method 3 same as method 2 , just using the while loop
		Iterator<HashMap.Entry<Integer,String>> itr = map.entrySet().iterator();
		System.out.println("Traversing using the while loop entryset");
		while(itr.hasNext()) {
			HashMap.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " -> " +entry.getValue()	);
		}
		System.out.println("===========================================");		
	}
}

//use only the "entryset"
//important rule :
//	1. Keys must be unique.
//	2. Values can be duplicated.

//Why do professionals prefer entrySet()?
//keySet()		
//1. Gets only keys	
//2.Calls get()again 	
//3.Good for simple tasks  	
//entrySet()	
//1. Gets key and value together	
//2. No extra lookup 	
//3. Preferred in interviews and real projects

//⭐ Interview Question
//
//Which is better for iterating over both keys and values?
//
//Answer:
//
//entrySet() is preferred because it gives direct access to both the key and value without performing an additional lookup using get().
//
//That's a strong interview answer.
//==========================================================================
//⭐ Interview Shortcut
//
//If an interviewer asks:
//
//What is the role of hashCode() and equals() in HashMap?
//
//You can answer:
//
//hashCode() is used to locate the bucket where the key should be stored or searched. 
//If multiple keys are present in the same bucket due to a collision, equals() is used to identify the exact matching key.
//
//That is a solid interview answer.