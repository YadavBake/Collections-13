
										   Collections Part-7 || Set interface||ShortedSet
										===================================================

----------
  Set(I) 
----------
						
										  Collection(I)(1.2v)[Methods 12]
												|
												|
											Set(I)(1.2v)
												|
												|
								-------------------------------------
								|									|	
								|									|
							HashSet(1.2v)					  SortedSet(I)(1.2v)
								|									|
								|									|
							LinkedHashSet(1.4v)				  NavigableSet(I)(1.6v)
																	|
																TreeSet(1.2v)		
						

 -> Set is child interface of Collection.

 -> If you want to reprasent a group of individual object as single entity where duplicates are not allowed and insertion 
	order not preserved.
	
 -> Set interface doesn't contain any new method and we have to use only collection interface methods.
 
 
 ------------
  HashSet(C)
 ------------

  -> The underlaying Data Structure is Hashtable.
  
  -> Duplicate objects are not allowed.
  
  -> Insertion order is not preserved and it is based on hashCode of objects.
  
  -> null insertion is possible (only once).
  
  -> Hetrogeneous object are allowed.
  
  -> Implements Serializable, Cloneable but not RandomAccess interface.
  
  -> HashSet is the best choice if our frequent operation is Search operation.
  
  
 Note*:
 
	- In HashSet duplicates are not allowed if we are trying to insert duplicates then we won't get any compile time 
	  or Runtime error and add() method simply returns false.
	  
	  
	  HashSet h = new HashSet();
	  System.out.println(h.add("A"));//true 
	  System.out.println(h.add("A"));// false 
	  
--------------	  
 Constructors 
--------------

  1. HashSet h = new HashSet();// The default initial capacity is 16 and default fill Ratio(Load factor) = 0.75

		- Creates an empty HashSet object with default initial capacity 16 and default fill Ratio or Load Factor is 0.75.


  2. HashSet h = new HashSet(int initialCapacity);
  
		- Creates an empty HashSet object with specified initial capacity and default fill ratio is 0.75.
		
  3. HashSet h = new HashSet(int initialCapacity, float fillRatio);
  
	    - Creates an empty HashSet object with specified initial capacity and default fill ratio.
		
  4. HashSet h = new HashSet(Colletion c);
  
		- Creates an equivelent HashSet for the given Collection.
		
		- This constructor ment for interconversion between collection objects.
		
		
 Note: 
 
	----------------------------
	 Fill Ratio or Load Factor 
	---------------------------- 
		
		-> After filling how much ratio a new HashSet object will be created, This ratio is called Fill Ratio or Load 
		   Factor for Example Fill Ratio 0.75 means after filling 75% ratio a new HashSet object will be created.
  
  Ex. 
  
  
	import java.util.*;
	class HashSetDemo
	{
		public static void main(String args[])
		{
			
			HashSet h = new HashSet();
			h.add("B");
			h.add("C");
			h.add("D");
			h.add("Z");
			h.add(null);
			h.add(10);
			System.out.println(h.add("Z")); //false 
			System.out.println(h); //[insertion order are not fix ] 
		}
	}
	output:
	
	false
    [null, B, C, D, Z, 10]
			
		
  
  
 ---------------- 
  LinkedHashSet
 ----------------

  -> It is the child class of HashSet.
  
  -> It is exactly same as HashSet(Including constructor and methods) except the following differences.
  
  
		-----------------------------------------------------------------
		|	HashSet									LinkedHashSet
		------------------------------------------------------------------------
		| 								    |									|
		|1. The underlaying Data Structure  | 1. The underlaying Data Structure |
		|	is Hashtable.					|    is a combination of LinkedList	|
		|									|    and Hashtable.	                |
		|                                   |                                   |
		|2. Insertion order is not priserved| 2. Insertion order is preserved.  |
		|                                   |                                   |
		|3. Introduced in 1.2v version.		| 3. Introduced in 1.4v version.    |
		|                                   |                                   |
		
 -> In the above program if we replace HashSet with LinkedHashSet then the output is:
 
	
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
	
		false
		[B, C, D, Z, null, 10]

	- That is insertion order is preserved.
	
 Note:

	> In general we can use LinkedHashSet to develop Cache based application where duplicates are not allowed and 
	  insertion	is preserved.
	
	
 -----------	
  SortedSet
 -----------
    
  > SortedSet is the child interface of Set(I).

  > IF we want to reprasent a group of individual objects According to some sorting order without duplicates then we
	should go for SortedSet.

  > SortedSet interface defines the following specific methods.	
	
 ---------
  Methods 
 ---------
																								-----
   1. Object first() //=> 100                                                                   |100|
                                                                                                |   |
		- returns first element of the SortedSet.                                               |101|
                                                                                                |   |
   2. Object last() // => 120	                                                                |102|
                                                                                                |   |
		- returns last element of the SortedSet.                                                |104|
                                                                                                |   |
   3. SortedSet headSet (Object obj)//(106) => [100,101,102,104]                                |106|
                                                                                                |   |
		- returns SortedSet whose elements are less then obj.                                   |110|
                                                                                                |   |
                                                                                                |115|
   4. SortedSet tailSet(Object Obj) //(>=106)//=? [106,110,115,120]                             |   |
	                                                                                            |120|
		- returns SortedSet whose elements are > = obj.                                         -----
   
   5. SortedSet subSet(Object obj1, Object obj2)//(>=101,<115) //=> [101,102,104,106,110]
   
	   - returns SortedSet Whose elements are >= obj1 and < obj2.
   
   6. Comparator comparator() //
		
		return Comparator object that describes underlaying sorting technique. If we are using default natural sorting
		order then we will get null.
		
		
  Note: 

	> The default natural sorting for numbers is Ascending order.
	
	> And for String objects is Alphabetical order.
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

























 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  