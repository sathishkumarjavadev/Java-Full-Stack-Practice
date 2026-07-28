package p009_collections_framework.M1_Tree_Map_example;

import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
//		it is an syntax
//		TreeMap<key, Value> map = new TreeMap<>();
		
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1, "sathish");
		map.put(2, "santhosh");
		map.put(3, "nithish");
		map.put(4, "sathya");
		map.put(5,  null);
		
		System.out.println(map.values());
		System.out.println(map.get(2));
		System.out.println(map.get(6));
		
		//these 2 lines will show you the exact use of the getOrDefault
		System.out.println(map.getOrDefault(5, "Not Found"));
		System.out.println(map.getOrDefault(6, "Not Found"));
		
	}

}
/*
//==========
1. put() 2. get() 3. remove() 4. containsKey() 5. containsValue()
6. size() 7. isEmpty() 8. clear() 9. keySet() 10. values() 11. entrySet()

for-each
Iterator

TreeMap Special Methods ⭐

TreeMap has a few methods that HashMap doesn't have.

1. firstKey() 2. lastKey() 3. higherKey() 4. lowerKey() 5. ceilingKey() 6. floorKey()

These are very similar to what you learned in TreeSet.
//==========
*/

//| Feature                | HashMap | LinkedHashMap | TreeMap |
//| ---------------------- | ------- | ------------- | ------- |
//| Key-Value              | ✅      | ✅            | ✅      |
//| Duplicate Keys         | ❌      | ❌            | ❌      |
//| Duplicate Values       | ✅      | ✅            | ✅      |
//| One `null` Key         | ✅      | ✅            | ❌      |
//| Multiple `null` Values | ✅      | ✅            | ✅      |
//| Insertion Order        | ❌      | ✅            | ❌      |
//| **Sorted by Key**      | ❌      | ❌            | ✅      |



//Comparable vs Comparator
/*
----------------------------|-----------------------------------|
Comparable					|Comparator							|
One default sorting rule	|Multiple sorting rules				|
compareTo() method			|compare() method					|
Implemented inside the class|Implemented in a separate class	|
Modifies the original class	|Original class remains unchanged	|
================================================================|
*/