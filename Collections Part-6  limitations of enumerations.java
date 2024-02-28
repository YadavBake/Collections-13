
											Collections Part-6 || limitations of enumerations
										 =======================================================

------------------------------
  Limitations of Enumeration 
------------------------------

 -> We can apply Enumeration concept only for legacy classes and it is not a universal cursor.

 -> By using Enumeration we can get only read Access and we can't perform remove operation.

 -> To overcome above limitations we should go for Iterator.


--------------
 Iterator (I)
--------------

 -> We can apply Iterator concept for any collection object and hence a it is universal cursor.
 
 -> By using Itertor we can perform both read and remove operations.
 
 -> We can Iterator object by using iterator() method of Collection interface.
 
	    ----------------------------
		|public Iterator iterator()|
		----------------------------
		
		
		Eg:
		
			Iterator itr = c.iterator();	
						   |
						   |->// 'c' is any collection object.
						   
---------						   
 Methods 
---------

	1. public boolean hashNext()
	2. public Object next()
	3. public void remove()


	import java.util.*;
	class IteratorDemo
	{
		public static void main(String args[])
		{
			
			ArrayList al = new ArrayList();
			for(int i=0; i<=10;i++)
			{
				al.add(i);
			}
			System.out.println(al);//[0,1,2,3,4,5,6,7,8,9,10]
			Iterator itr = al.iterator();
			while(itr.hasNext())
			{
				Integer i = (Integer)itr.next();
				if(i%2==0)
				{
					System.out.println(i);//0,2,4,6,8,10
				}
				else {
					itr.remove();
				}
			}
			System.out.println(al); //[0,2,4,6,8,10]
		}
	}
	output: 
	[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	0
	2
	4
	6
	8
	10
	[0, 2, 4, 6, 8, 10]
	
-------------------------	
 Limitations of Iterator
-------------------------

 -> By using Enumeration and Iterator we can always move only towords forward direction and we can't move towords 
	backwords direction this are single direction cursors buth Bedirectional cursors.
	
 -> By Iterator we can perform only read and remove operations and we can't perform replacement and addition of new 
	objects.
	
 -> To overcome above limitations we should go for ListIterator.
 
 --------------
  ListIterator
 --------------

 -> By using ListIterator we can move either to the forword direction or to the backward direction and hence it is 
	Bedirectional cursor.
	
 -> By using ListIterator we can perform replacement and Addition of new object in addition to read and remove operations.
 
  -> We can create ListIterator by using listIterator() method of List interface.
  
			------------------------------------
			|public ListIterator listIterator()|
			------------------------------------
			
			Eg:
			
				ListIterator ltr = l.listIterator();
								   |
								   |->// Any List object 

----------
  Methods 
----------

 -> ListIterator is the child interface Iterator and hence all method prasent in iterator by default available to the 
	ListIterator.
 
 
			Iterator(I)
               ^
               |
               |
               |
            ListIterator(I) 
               
 
 -> ListIterator defines the following Nine method.
 
 
	1. public boolean hasNext()|
	2. public Object next()    |=> //This three method ment for forward mement or operation
	3. public int nextIndex()  |
	
	4. public boolean hashPrevious()|
	5. public Object previous()     |=> //This three method ment for backward mement or operation
	6. public int indexPrevious()   |

	7. public void remove()		|
	8. public void add(Object o)|=> // This methods are extra operations.
	9. public void set(Object o)|
	
	
	
	import java.util.*;
	class ListIteratorDemo
	{
		public static  void main(String args[])
		{
			LinkedList l = new LinkedList();
			l.add("BalaKrishana");
			l.add("Venki");
			l.add("Chiru");
			l.add("naga");
			System.out.println(l); //[BalaKrishana,Venki,Chiru,naga]
			ListIterator ltr = l.listIterator();
			while (ltr.hasNext())
			{
				String s = (String)ltr.next();
				
				if(s.equals("Venki"))
				{
					ltr.remove(); //[BalaKrishana,Chiru,naga]
				}
				else if(s.equals("naga"))
				{
					ltr.add("chaitu");//[BalaKrishana,Chiru,naga,chaitu]
				}
				else if(s.equals("Chiru"))
				{
					ltr.set("charan"); //[BalaKrishana,charan,naga,chaitu]
				}
			}
			System.out.println(l); //[BalaKrishana,charan,naga,chaitu]
		}
	}
	
	[BalaKrishana, Venki, Chiru, naga]
	[BalaKrishana, charan, naga, chaitu]


Note:  The most powerful cursor is ListIterator but it's limitations is it is applicable only for List object.			

-------------------------------------
 Compairision table of three cursors 
-------------------------------------
	
	--------------------------------------------------------------------------------------------------------------------
	|	Property 			 |		Enumeration 			|		Iterator			   |			ListIterator   |
	--------------------------------------------------------------------------------------------------------------------
	|1. Where we can apply 	 |	1. Only for legecy classes  | 1. for any Collection object |1. only for List object    |
	--------------------------------------------------------------------------------------------------------------------
	|2. It is legacy ?		 |	2. Yes(1.0v)				| 2. No (1.2v)				   |2. No (1.2v).		       |
	--------------------------------------------------------------------------------------------------------------------
	|3. Movement ?			 |	3. Single Direction (only   | 3. Single Direction (only    |3. Bidirectional.          |
	|						 |	   forward direction)       |    forward direction).       |                           |
	--------------------------------------------------------------------------------------------------------------------
	|4. Allowed operation.	 |	4. Only read operation 		| 4. read and remove operation |4. read,remove,replce,add. |
    --------------------------------------------------------------------------------------------------------------------
	|5. How we can get ? 	 |	5. By using elements method | 5. By using iterator() of	   |5. By usig listIterator()  |   
	|						 |	   of Vector class 			|	collection interface	   |  of List interface.       |
    --------------------------------------------------------------------------------------------------------------------
	|6. Methods 			 |	6. hasMoreElments()			| 6. hasNext()				   |6. Nine method is here.	   |
	|						 |	   nextElement()			|	next(),remove()            |                           |
	-------------------------------------------------------------------------------------------------------------------|
    
 ------------------------------------
  Intrenal Implementation of Cursors 
 ------------------------------------ 

						Vector v = new Vector();

	Enumeration(I) --------> Enumeration 	e = v.elements(); System.out.println(e.getClass().getName());
	
	
	Iterator(I) -----------> Iterator itr = v.iterator();System.out.println(itr.getClass().getName());
	
		
	ListIterator(I) -------> ListIterator ltr = v.listIterator();System.out.println(ltr.getClass().getName());


		import java.util.*;
		class CursorsDemo
		{
			
			public static void main(String args[])
			{
				Vector v = new Vector();
				 Enumeration 	e = v.elements();         
                 Iterator itr = v.iterator();         
                 ListIterator ltr = v.listIterator();
				 System.out.println(e.getClass().getName());                
                 System.out.println(itr.getClass().getName());
                 System.out.println(ltr.getClass().getName());
			}
		}

		output:
		
		java.util.Vector$1
		java.util.Vector$Itr
		java.util.Vector$ListItr
		















 