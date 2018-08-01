package collections;

import java.util.*;

public class mapExample {
	
	public static void main(String args[])
	{
		
//		In the inheritance tree of the Map interface, there are several implementations but only 3 major, common, and general purpose implementations - they are HashMap and LinkedHashMap and TreeMap. Let’s see the characteristics and behaviors of each implementation:
//			HashMap: this implementation uses a hash table as the underlying data structure. It implements all of the Map operations and allows null values and one null key. This class is roughly equivalent to Hashtable - a legacy data structure before Java Collections Framework, but it is not synchronized and permits nulls. HashMap does not guarantee the order of its key-value elements. Therefore, consider to use a HashMap when order does not matter and nulls are acceptable.  
//			LinkedHashMap: this implementation uses a hash table and a linked list as the underlying data structures, thus the order of a LinkedHashMap is predictable, with insertion-order as the default order. This implementation also allows nulls like HashMap. So consider using a LinkedHashMap when you want a Map with its key-value pairs are sorted by their insertion order.  
//			TreeMap: this implementation uses a red-black tree as the underlying data structure. A TreeMap is sorted according to the natural ordering of its keys, or by a Comparator provided at creation time. This implementation does not allow nulls. So consider using a TreeMap when you want a Map sorts its key-value pairs by the natural order of the keys (e.g. alphabetic order or numeric order), or by a custom order you specify.
	Map<Integer, String> mapHttpErrors = new HashMap<>();
	Map<String, String> mapContacts = new LinkedHashMap<>();
	Map<String, String> mapLang = new TreeMap<>();
	 
	mapHttpErrors.put(200, "OK");
	mapHttpErrors.put(303, "See Other");
	mapHttpErrors.put(404, "Not Found");
	mapHttpErrors.put(500, "Internal Server Error");
	 
	System.out.println(mapHttpErrors);
	
	
	 
	mapContacts.put("0169238175", "Tom");
	mapContacts.put("0904891321", "Peter");
	mapContacts.put("0945678912", "Mary");
	mapContacts.put("0981127421", "John");
	 
	System.out.println(mapContacts);
	
	 
	mapLang.put(".c", "C");
	mapLang.put(".java", "Java");
	mapLang.put(".pl", "Perl");
	mapLang.put(".cs", "C#");
	mapLang.put(".php", "PHP");
	mapLang.put(".cpp", "C++");
	mapLang.put(".xml", "XML");
	 
	System.out.println(mapLang);
	
	
	}
	
	
	
}
