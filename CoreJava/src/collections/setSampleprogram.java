package collections;

import java.util.*;

public class setSampleprogram {

	 public static void main(String args[])
	 {
		
		 System.out.println("Set Example program");
		 
		 Set<String> s = new HashSet<String>();
//		 set example
//		hashset wont allow the  duplicates 
//		hashset is unordered elements there no guranty for the elements in the order in Hash Set
//          
		 s.add("hello");
		 s.add("world");
		 s.add("hello");
		 s.add("hello");
		 
		
			 System.out.println(s.toString());
		 
	 }
}
