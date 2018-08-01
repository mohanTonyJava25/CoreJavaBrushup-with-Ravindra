package collections;
import java.util.*;

public class linkedlist {

   public static void main(String args[])
   {
	   
//	   Difference between ArrayList and LinkedList
//	   ArrayList and LinkedList both implements List interface and maintains insertion order. Both are non synchronized classes.
//
//	   But there are many differences between ArrayList and LinkedList classes that are given below.
//
//	   ArrayList	LinkedList
//	   1) ArrayList internally uses dynamic array to store the elements.	LinkedList internally uses doubly linked list to store the elements.
//	   2) Manipulation with ArrayList is slow because it internally uses array. If any element is removed from the array, all the bits are shifted in memory.	Manipulation with LinkedList is faster than ArrayList because it uses doubly linked list so no bit shifting is required in memory.
//	   3) ArrayList class can act as a list only because it implements List only.	LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
//	   4) ArrayList is better for storing and accessing data.	LinkedList is better for manipulating data.
	   
	LinkedList<Integer> list = new LinkedList<Integer>();
	LinkedList<String> list1 = new LinkedList<String>();
	Integer i = 35;
	
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
		
		list.remove(i);
		list1.add("Hello");
		list1.add("World");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("sample catch the out of bound exception");
		e.printStackTrace();
	
	}
             for( int i1=0; i1<list1.size(); i1++)
                  {
                   System.out.println(list1.get(i1));

                  }

                 for( int i1=0; i1<list.size(); i1++)
               {
                  System.out.println(list.get(i1));

               }
       
                  System.out.println(list.size());

               }
      }
