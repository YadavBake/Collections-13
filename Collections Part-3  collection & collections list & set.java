
									Collections Part-3 || collection & collections|| list & set
								 =================================================================

 ------------------
  1. Collection(I)  
 ------------------

 -> If you want to reprasent a group of individual object as single entity then we should go for collection.

 -> Collection interface defines the most comman methods which are applicable for any collection object.

  Methods 
----------

	1. boolean add(Object o);
	2. boolean addAll(Collection c);
	3. remove(Objcet o);
	4. removeAll(Collection c);
	5. boolean retainAll(Collection c); :- To remove all objects except those present in c.
	6. void clear();
	7. boolean contains(Object o);
	8. boolean containsAll(Collection c);
	9. boolean isEmpty();
   10. int size();
   11. Object[] toArray();
   12. Iterator iterator();


 Note: 

	- There is no concrete class which implements collection interface directly.
	
--------------
  2. List(I)	 
--------------  

 -> List(I) is child interface of collection.
 
 -> If we want to reprasent a group of individual object as a single entity where duplicates are allowed and insertion 
	order must be preserved then we should go for List interface.
	
 -> We can preserved insertion order with respect to index and we can differentiate duplicates object by using index hence 
	a index will paly very important role in List(I).

		---------------------------------
		| A  | B  |  C  |  D  |  E |  A |///--> list element 
		---------------------------------
		  0     1    2     3     4    5 //--> index number 
		  
		  
 -> List interface defines the following specific methods : 
	
	void add(int index, object o);
	boolean addAll(int index, Collection c);
	Object remove(int index);
	Object get(int index);
	Object set(int index,object o); :- To replace the element present at specified index with provided object and return 
									   old object.
	int indexOf(object obj); :- returns index of first occurrence 'o'
	int lastIndexOf(object obj)
	ListIterator listIterator();
 
				
				Collection(I)// Parent 
				   ^
				   |
				   |
				   |
				 List(I)// child   
				   |
	--------------------------------
	|			  | 			   |
  ArrayList	  LinkedList		Vector
								   |	
								Stack   
								
  ---------------								
   2.1 ArrayList 
  ---------------	
  
   -> The underlaying Data Structure is Resizeable array or growable array.
   
   -> Duplicates are allowed insertion order is preserved.
   
   -> Hetrogeneous object are allowed (Except TreeSet and TreeMap every where Hetrogeneous object are allowed ).
   
   -> null insertion is possible.
   
  ---------------------------- 
   Constructors for ArrayList 
  ----------------------------

   1. ArrayList al = new ArrayList();

		- Creates an empty ArrayList object with default initial capacity 10.

		- Once ArrayList reaches it's max capacity then new ArrayList object  will be created with 
				
			   ---------------------------------------	
			   |newCapacity = (currentCapacity*3/2)+1|
			   ---------------------------------------	
		
	- once object reaches it is max capacity after that new ArrayList will be created and 'l' re-assign to new ArrayList
	  object and old one is elgible to garbage collector.
		
		---------------------------------------------
   l-X->|	|	|	|	|	|	|	|	|	|	|	| //  default capacity is 10 
	|	---------------------------------------------
	|	
	|	
	|	-----------------------------------------------------------------------------------------
    |-->|	|	|	|	|	|	|	|	|	|	|	||	|	|	|	|	|	|	|	|	|	|	| // capacity is 25 
        -----------------------------------------------------------------------------------------
  
  
	2. ArrayList al = new ArrayList(int initialCapacity);
	
		- Creates an empty ArrayList object with specified initial capacity.
		
	3. ArrayList al  = new ArrayList(Collection c);
	
		- Creates an equivelent ArrayList object for the given collection.
		
		
		
		
 Ex. 

	import java.util.*;
	class ArrayListDemo
	{
		public static void main(String args[])
		{
			ArrayList al  = new ArrayList();
			al.add("A");
			al.add(10);
			al.add("A");
			al.add(null);
			System.out.println(al); // [A,10,A,null]
			al.remove(2);
			System.out.println(al); // [A,10,null]
			al.add(2,"M");
			al.add("N");
			System.out.println(al); // [A,10,M,null,N]
		}
	}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  