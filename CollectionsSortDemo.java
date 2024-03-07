import java.util.*;
	class CollectionsSortDemo
	{
		public static void main(String args[])
		{
			ArrayList l = new ArrayList();
			l.add("Z");
			l.add("A");
			l.add("K");
			l.add("N");
			//l.add(new Integer(10));//ClassCastException
			//l.add(null);//NullPointerException
			System.out.println("Before Sorting :" +l); //Before Sorting :[Z, A, K, N]
			Collections.sort(l);
			System.out.println("After  Sorting :" +l);//After  Sorting :[A, K, N, Z]
		}
	}
	
	

