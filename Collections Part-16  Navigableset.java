
											Collections Part-16 || Navigableset
										 ========================================

----------------------------------------------------
  1.6v version Inhancements in Collection Fremwork	
----------------------------------------------------

 -> As the part of 1.6v version the following two concept introduced in Collection Framework . 
 
		1. NavigableSet
		2. NavigableMap
		
---------------
  NavigableSet		
---------------

  > It is the child interface of SortedSet and it define several methods for Navigation purposes. 

					
					Collection(I)1.2v
					   |
					   |->Set(I)1.2v 
							|
							|->SortedSet(I)1.2v 
									|
									|->NavigableSet(I)1.6v 
											|
											|->TreeSet 1.2v 

--------------------------------------------
 NavigableSet defines the following methods 											
--------------------------------------------
											
  > floor(e)
	
		- return highest element which is <=e.
		
	lower(e)
	
		- return highest element which is <e.
		
	ceiling(e)
	
		- return lowest element which is >=e.
		
	higher(e)
		
		- return lowest element which is > e.
		
	pollFirst()

		- remove and return first element.
		
	pollLast()
	
		- remove and return last element.
		
	descendingSet()
	
		- It return NavigableSet in reverse order.
		
		
 > 

	TreeSet t = new TreeSet();
	
	TreeSet<Integer> t = new TreeSet<Integer>();
		
	
  Ex. 

	import java.util.*;
	class NavigableSetDemo
	{
		public static void main(String args[])
		{
			TreeSet<Integer> t = new TreeSet<Integer>();
			t.add(1000);
			t.add(2000);
			t.add(3000);
			t.add(4000);
			t.add(5000);
			System.out.println(t);//[1000, 2000, 3000, 4000, 5000]
			System.out.println(t.ceiling(2000));//2000
			System.out.println(t.higher (2000));//3000
			System.out.println(t.floor  (3000));//3000
			System.out.println(t.lower  (3000));//2000
			System.out.println(t.pollFirst());//1000
			System.out.println(t.pollLast ());//5000
			System.out.println(t.descendingSet());//[4000, 3000, 2000]
			System.out.println(t);//[2000, 3000, 4000]	
		}
	}
		
	

----------------
  NavigableMap	
----------------

	> NavigableMap is the child interface of SortedMap.
	
	> It defines several methods for Navigation purposes.
	
	
					Map(I)1.2v
					 |
					 |->SortedMap(I)1.2v
							|
							|->NavigableMap(I)1.6v 
									|
									|-> TreeMap 1.2v
		
 
 --------------------------------------------
  NavigableMap defines the following methods 
 --------------------------------------------  
		
		
	floorKey(e)
	
		- return highest element which is <=e.
		
	lowerkey(e)
	
		- return highest element which is <e.
		
	ceilingkey(e)
	
		- return lowest element which is >=e.
		
	higherkey(e)
		
		- return lowest element which is > e.
		
	pollFirstEntry()

		- remove and return first element.
		
	pollLastEntry()
	
		- remove and return last element.
		
	descendingMap()
	
		- It return NavigableSet in reverse order.	
		
		
		
		
	import java.util.*;
	class NavigableMapDemo
	{
		public static void main(String args[])
		{
			TreeMap<String,String> t = new TreeMap<String,String>();
			t.put("b","banana");
			t.put("c","cat");
			t.put("a","apple");
			t.put("d","dog");
			t.put("g","gun");
			System.out.println(t);//{a=apple, b=banana, c=cat, d=dog, g=gun}
			System.out.println(t.ceilingKey("c"));//c
			System.out.println(t.higherKey ("e"));//g
			System.out.println(t.floorKey  ("e"));//d
			System.out.println(t.lowerKey  ("e"));//d
			System.out.println(t.pollFirstEntry());//a=apple
			System.out.println(t.pollLastEntry ());//g=gun
			System.out.println(t.descendingMap());//{d=dog, c=cat, b=banana}
			System.out.println(t);//{b=banana, c=cat, d=dog}	
		}
	}		
	
	
 ====================
  Utilities classes  
 ====================

  1. Collections 
 ----------------
	
	-> Collections class defines several Utilities methods for Collection Objects like a Sorting,Searching,Reversing ect.
	

 > Sorting element of List ?

	- Collections class defines the following two Sort methods.

	--------------------------------------
	|1. public static void  sort(List l);|
	--------------------------------------
	
		- To sort based on Default Nature Sorting Order.
		
		- In this case List should compulsory containe Homogeneous and comparable objects otherwise we will get Runtime 
		  Exception saying ClassCastException.
		  
		- List should not containe null otherwise we will get NullPointerException.
	
	---------------------------------------------------
	|2. public static void sort(List l, Comparator c);|
    ---------------------------------------------------

		- To Sort based on Customizes Sorting order.

 > Demo program Sorting elements of list of According Default Natural Sorting Order.
		
		
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
	
 > Demo program to Sort Elements of List according to Customized Sorting. 	
	
	
	import java.util.*;
	class CollectionsSortDemo2
	{
		public static void main(String args[])
		{
			ArrayList l = new ArrayList();
			l.add("Z");
			l.add("A");
			l.add("K");
			l.add("N");
			System.out.println("Before Sorting :" +l); //Before Sorting :[Z, A, K, N]
			Collections.sort(l, new MyComparator());
			System.out.println("After  Sorting :" +l);//After  Sorting :[Z, N, K, A]
		}
	}
	
	class MyComparator implements Comparator
	{
		public int compare(Object obj1, Object obj2)
		{
			String s1 = (String)obj1;
			String s2 = obj2.toString();
			return s2.compareTo(s1);
		}
	}

			
	
	
	
	
	
	
	
	