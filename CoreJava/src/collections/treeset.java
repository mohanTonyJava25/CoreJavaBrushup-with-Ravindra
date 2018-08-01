package collections;

import java.util.Set;
import java.util.TreeSet;

public class treeset {
	public static void main(String args[])
	{
		 Set<Integer> s = new TreeSet<Integer>();
		 Set<String> s1 = new TreeSet<String>();
		 
//		 set doesn't allow the duplicates and 
//		 set is order s of elemetns it will guranty the order s in formate. 
            s.add(24);
			s.add(25);
			s.add(24);
			s.add(12);
			s.add(25);
			s.add(24);
			s.add(50);
			s.add(49);
			s.add(35);
			s.add(35);
			s.add(35);
			s1.add("Hello");
			s1.add("World");
		
				 System.out.println(s.toString());
				 System.out.println(s1.toString());
			 
	}
}
