import java.util.*;
		class TreeSetDemo5
		{
			public static void main(String args[])
			{
	
				TreeSet t = new TreeSet(new MyComparator());
				
				t.add("Roja");
				t.add("Shobharani");
				t.add("Rajakumari");
				t.add("GangaBhavani");
				t.add("Rammulmaa");
				System.out.println(t);// [GangaBhavani, Rajakumari,Rammulmaa,Roja,Shobharani]
			}
		}
			
		class MyComparator implements Comparator
		{
			public int compare(Object obj1,Object obj2)
			{
				String s1 =  (String)obj1; // String s1 = obj1.toString();
				String s2 = (String)obj2;  // String s2 =  obj2.toString();
				
				return -s1.compareTo(s2);
				
				//return s2.compareTo(s1);
			}
		}