
												Collections Part-4 || Array list
											 =====================================

  -> Useally we can use collections to hold and transfer object from one location to anothre location(Container) to 
	 to provide support for these requirement every collection class by default implements Serializable and Cloneable
	 interfaces.
	 
  -> ArrayList and Vector classes implements RandomAccess interface so that any Random element we can access with the 
	 same speed.
	 
	 
 ------------------------
  RandomAccess interface
 ------------------------

 -> RandomAccess interface prasent in java.util package and it doesn't cotain amy method t is marker interface.

 -> Where required ability will be provided automatically by the JVM.


		import java.util.*;
		class ArrayListDemo1
		{
			public static void main(String args[])
			{
				ArrayList al = new ArrayList();
				LinkedList ll = new LinkedList();
				System.out.println(al instanceof Serializable);// true 
				System.out.println(ll instanceof Cloneable);// true 
				System.out.println(al instanceof RandomAccess);// true 
				System.out.println(ll instanceof RandomAccess);// false
			}
		}
		
 -> ArrayList is the best choice if our frequent operation is retrivel operation (Because ArrayList implements
	RandomAccess interface).
	
 -> ArrayList is thr wrost choice if our frequent operation is insertion and remove(deletion) in the midal.
 
 -------------------------------------------
  Differences between ArrayList and Vector 
 -------------------------------------------
		
		------------------------------------------------------------------------------------
		|		ArrayList 									Vector 						   |	
		------------------------------------------------------------------------------------		
		|                                         |                                        |
		|1. Every method prasent in the ArrayList |1. Every Method prasent in the Vector   |
		|   Is non-synchronized 				  |	 Is synchronized.                      |
		|                                         |                                        |
		|2. At a time multiple Thread allowed to  |2. At a time only one thread is allowed |
		|	operate on ArrayList Object and hence |	 to operate on Vector object and Hence |	
		|	a it is not thread safe.			  |	 a it is thread safe.                  |
		|                                         |                                        |
		|3. Relatevily performance is high because|3. Relatevily performance is low because|  
		|	thread are not required to wait to 	  |	 thread are required to wait to operate|	
		|   operate on ArrayList object.		  |	 on Vector Object.                     |
		|                                         |                                        |
		|4. Introduced in 1.2v version and it is  |4. Introduced in 1.0v version and it is | 
		|	non-legacy.							  |	  legacy.							   |			
		------------------------------------------------------------------------------------



 -> How to get synchronized version of ArrayList object ?
 
	- By default ArrayList is non-synchronized but we can get synchronized version of ArrayList object by using 
	  synchronizedList() method of Collections class.
 
			--------------------------------------------
			|public static List synchronizedList(List l)|
			--------------------------------------------
 
	Ex. 
	
	 ArrayList al = new ArrayList();
	 
	 List l1 = Collection.synchronizedList(l);
		  |								   |				
		synchronized 				non-synchronized 
		
		
    - Similarly we can get synchronized version of Set and Map objects by using the following methods of Collections class :

			public static Set synchronizedSet(Set s )
			public static Set synchronizedMap(Map m )


 -------------
  LinkedList
 -------------

  -> The underlaying Data Structure is Double or Doubly LinkedList. 
	
  -> Insertino order is perserved.
  
  -> Duplicates object are allowed.
  
  -> Hetrogeneous object allowed.
  
  -> null insertion is possible.
  
  -> LinkedList implements Serializable and Cloneable interfaces but RandomAccess.
  
  -> LinkedList is the best choice if our frequent operatation is insertion or deletion in the medal.
  
  -> LinkedList is the wrost choice if our frequent operatation is retrivel operatation.
  
 --------------- 
  Constructors. 
 ---------------

  1. LinkedList ll = new LinkedList();
  
		- Creates an empty LinkedList object.
		
  2. LinkedList ll = new LinkedList(Collection c);

		- Creates an equievelent LinkedList object for the given collection.
		

----------------------------------		
 LinkedList class specific method 		
----------------------------------

  -> Useally we can use LinkedList to develops statcks and Queue to provide support for this requirement LinkedList 
	 class defines the following specific methods :
	 
		1. void addFirst(Object o)
		2. void addLast(Object o);
		3. Object getFirst()
		4. Object getLast()
		5. Object removeFirst()
		6. Object removeLast()
		
	
	import java.util.*;
	class LinkedListDemo
	{
		public static void main(String args[])
		{
			LinkedList l = new LinkedList();
			l.add("Baake");
			l.add(30);
			l.add(null);
			l.add("Baake");// [Baake,30,null Baake]
			l.set(0,"Software");//[Software,30,null,Baake]
			l.add(0,"Venky"); //[venky,Software,30,null,Baake]
			l.removeLast();//[venky,Software,30,null]
			l.addFirst("CCC");//[CCC,venky,Software,30,null]
			System.out.println(l); //[CCC, Venky, Software, 30, null]
		}
	}


















 
  




		