
import java.util.*;
	class HashSetDemo
	{
		public static void main(String args[])
		{
			LinkedHashSet h = new LinkedHashSet();
			//HashSet h = new HashSet();
			h.add("B");
			h.add("C");
			h.add("D");
			h.add("Z");
			h.add(null);
			h.add(10);
			System.out.println(h.add("Z")); //false 
			System.out.println(h); //[] 
		}
	}