import java.util.*;
		class CollectionsReverseDemo
		{
			public  static void main(String args[])
			{
				ArrayList l = new ArrayList();
				l.add(15);
		        l.add(0);
		        l.add(20);
		        l.add(10);
		        l.add(5);
				System.out.println(l); //[15, 0, 20, 10, 5]
				Collections.reverse(l);
				System.out.println(l); //[5, 10, 20, 0, 15]
			}
		}
		
		
		
