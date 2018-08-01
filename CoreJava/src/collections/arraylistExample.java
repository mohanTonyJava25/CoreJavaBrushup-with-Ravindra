package collections;

import java.util.*;

public class arraylistExample {
 public static void main(String args[])
 {
	  ArrayList<Integer> list = new ArrayList<Integer>();
    	  
//	array list allows duplicates and it is in order . 
//	check the example. 
//	array list is growable in size. you can check it with the list.size  
//	this is sample example of arraylist  
// arraylist inital size is 10 elements it will grow while adding the elements. 	  
	  
	try {
		list.add(24);
		list.add(25);
		list.add(24);
		list.add(12);
		list.add(25);
		list.add(24);
		list.add(50);
		list.add(49);
		list.add(35);
		list.add(35);
		list.add(35);
		list.add(49);
		list.add(49);
		list.remove(35);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	    for( int i=0; i<list.size(); i++)
	    {
	System.out.println(list.get(i));
	
	    }
	System.out.println(list.size());
	
	  
 }   
 
}
