	
									Collections Part-5 || Difference between Array list & linked list
								  =====================================================================


 -----------------------------------------------------
  What is difference between ArrayList and LinkedList
 -----------------------------------------------------

	
				--------------------------------------------------------------------------------------
                |			ArrayList				     |					LinkedList               |
                |----------------------------------------|-------------------------------------------|
				|										 |											 |
                |1. ArrayList is the best choice if our  | 1. LinkedList is the best choice if our   |
                |   frequivent operation is retrivel 	 |	 frequivent operation is insertion or    |
                |	operation.							 |	 deletion in the midel.	                 |
                |----------------------------------------|-------------------------------------------|
                |2. ArrayList is the wrost choice if our | 2. LinkedList is wrost choice if our      |
                |	frequivent operation is insertion or |	 frequivent  is retrivel operation       |
                |	deletion in the midel because .	     |                                           |
                |	internally several shift operation   |                                           |
                |	are performed                        |                                           |
                |----------------------------------------|-------------------------------------------|
				|3. In ArrayList the element will be     |3 In LinkedList the element won't be stored|
				|	stored in consecutive memory   		 |	consecutive memory locations and hence   |
                |   locations and hence retrivel 		 |	retrivel operation will become complex or| 
                |	operation will become easy.			 |	defficult.                               |
				|                                        |                                           |
                |                                        |											 |	
				|										 |											 |
				--------------------------------------------------------------------------------------
                
 --------
  Vector 
 --------

 -> The underlaying Data Structure is resizable array or growable array.

 -> Insertion order is preserved.

 -> Duplicates are allowed.

 -> Hetrogeneous object are allowed.

 -> null insertion is possible.

 -> It implements Serializable, Cloneable and RandomAccess interface.

 -> Every Method prasent in the Vector is synchronized and hence Vector object Thread safe.


-------------
 Constructor 
-------------

 1. Vector v = new Vector(); // with initial capacity is 10 

	- Creates an empty object with initial capacity 10.
	
	- Once Vector reaches it's max capacity then a new Vector object will be created with 
			
			-------------------------------------
			|New Capacity = Current Capacity * 2| 
			-------------------------------------
			
 2. Vector v = new Vector(int initialcapacity)

	- Creates an empty Vector object with specified initial capacity.

 3. Vector v = new Vector(int initialcapacity, int incrementalcapacity);
 

		Vector v = new Vector(1000,5)
		
 4. Vector v = new Vector(Collection c)
	
	- Creates an equivelent Vector object for the given collection.
	
	- This constructor ment for inter convertion between collection objects.
	
------------------------
 Vector specific Method 
------------------------

 - To add objects. 
 
	1. add(Object o)---Collection interface method .
	2. add(int index,object o)----List interface method .
	3. addElement(Object o)---Vector method . 
	
 - To remove object. 	
		
	1. remove(Object o) --Collection interface method 
 	2. removeElement(Object o)-- Vector class method 
	3. remove(int index)-- List interface method
	4. removeElementAt(int index) ---Vector class method 
	5. clear() ---Collection interface method 
	6. removeAllElements()---Vector class method 
	
	
  - To  get objects. 
  
  
	1. Object get (int index) --- List interface method 
	2. Object elementAt(int index) ---Vector class method 
	3. Object firstElement()---Vector class method 
	4. Object lastElement()---Vector class method 
	

  - other Method.
  
	1. int size()
	2. int capacity()
	3. Enumeration elements()


 Ex. 
 
	import java.util.*;
	class VectorDemo
	{
		public static void main(String args[])
		{
			Vector v = new Vector();
			System.out.println(v.capacity()); //10
			for(int i = 1; i<=10;i++)
			{
				v.addElement(i);
			}
			System.out.println(v.capacity());//10
			v.addElement("A");
			System.out.println(v.capacity()); //20
			System.out.println(v);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
		}
	}
	//Output:
	10
	10
	20
	[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
	

 -------
  Stack 
 -------

 -> It is the child class of Vector.
 
 -> It is the specialy designed class for Last In First Out (LIFO) order.
 
 -------------
  Constructor 
 -------------

	1. Stack s = new Stack 
	
 ---------	
  Methods 
 ---------
 
  1. Object push(Object o)
	
		- To insert an object into the stack.	
  
  2. Object pop()
  
		- To remove	and return top of the Stack.
		
  3. Object peak()
  
		- To return top of the stack without removal.
  
  4. boolean empty()
  
		- return true if the stack 	is empty.
  
  5. int search(Object o)
  
		- return  offest if the element is available otherwise returns -1.

		
				
				offset->|	    |<-Index 
						|-------|
					1	|   C   | 3 
						|-------|
					2 	|   B   | 2 
						|-------| 
					3 	|   A   | 1 
						|-------|
				
				
					s.search("A") => 3 
					s.search("z") => -1 
				

	Ex. 
	
		import java.util.*;
		class StackDemo
		{
			public static void main(String args[])
			{
				Stack s = new Stack();
				s.push("A");
				s.push("B");
				s.push("C");
				System.out.println(s);// 
				System.out.println(s.search("A"));
				System.out.println(s.search("Z"));
			}
		}
		output: 
		[A, B, C, ]
		3
		-1	

		offset->|	    |<-Index 
        		|-------|
        	1	|   C   | 3 
        		|-------|
        	2 	|   B   | 2 
        		|-------| 
        	3 	|   A   | 1 
        		|-------|
        
        
        	s.search("A") => 3 
        	s.search("z") => -1 

-----------------------------
  The Thread cursors of java 
-----------------------------

 -> If you want to get objects one by one from the collection then we should go for cursor.

 -> There are Three type ofcursors available in the java.


	1. Enumeration 
	2. Iterator
	3. ListIterator
	
	
  1. Enumeration 

		- We can use enumeration to get objects one by one from legacy collection object.
		
		- We can create enumeration object by using elements() method of Vector class.
		
		
				public Enumeration elements();
				
				
			  Enumeration e = v.elements().
							 
							 
							 
 Methods 

	- public boolean hashMoreElements().
	- public Object nextElement()
	
	Vector v = new Vector();
	for(int i= 0; i<=10;i++)
	{
		v.addElement(i);
	}
	System.out.println(v);//[0,1,2,3,4,5,6,7,8,9,10]
	
	Enumeration e = v.elements();
	while(e.hashMoreElements())
	{
		Integer i  = (Integer)e.nextElement();
		if(i%2 ==0)
		{
			System.out.println(i);//[0,2,4,6,8,10]
		}
	}
	System.out.println(v);//[0,1,2,3,4,5,6,7,8,9,10]
	
	


















 

































 
	

		
		
                
                
                
                
                
                
               