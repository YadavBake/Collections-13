
										Collections Part-17 || searching elements of list
									 ======================================================

------------------------------
  Searching elements of List 									 
------------------------------

 > Collections class defines the following BinarySearch methods. 
 
	
 
 
	1. public static int binarySearch(List l,Object target)
				   |
				  index
				   or 
				  insertion point 

		- If the list is sorted according to Default Natural Sorting Order then we have to use this method.

					    -------------------
                    l-->|Z |A |	M |	K |	a |
                    	-------------------
						
								     -1 -2  -3  -4 -5 ---> // unsuccessful search returns Insertion point 
								    -------------------
					Sorted List l-->|A |K |	M |	Z |	a |	
                                	-------------------
									  0  1  2   3   4 --> //Successfull search returns Index Number 
									  
									 
									 
	2. public static int binarySearch(List l , Object target,Comparator c);									
	
	
		- We have to use this method if the list is sorted According to Customized sorting order.
		
=============
 Conclutions 
=============

 1. The above search methods enternally will use binarySearch algorithm.

 2. Successful search returns index.

 3. Unsucessful search returns insertion point.

 4. Insertion point is the location where we can place target element in the sorted list.

 5. Before calling Binary Search method compulsory List should be sorted.Otherwise we will get unpredictable results.

 6. If the List is sorted According to Comparator then at the time of Search operation also we have to pass Same 
	Comparator Object otherwise we will get unpredictable results.
	
	
	Ex.

	import java.util.*;
	class CollectionsSearchDemo
	{
		public static void main(String args[])
		{
			ArrayList l = new ArrayList();
			l.add("Z");
			l.add("A");
			l.add("M");
			l.add("K");
			l.add("a");
			System.out.println(l);//[Z, A, M, K, a]
			//	Collections.sort(l);
			System.out.println(l);//[A, K, M, Z, a]
			System.out.println(Collections.binarySearch(l,"Z"));//3
			System.out.println(Collections.binarySearch(l,"J"));//-2
		}
	}
	
	
		    -------------------
        l-->|Z |A |	M |	K |	a |
        	-------------------
				
					     -1 -2  -3  -4 -5 ---> // unsuccessful search returns Insertion point	
					    -------------------	
		Sorted List l-->|A |K |	M |	Z |	a |		
		            	-------------------	
						  0  1  2   3   4 --> //Successfull search returns Index Number 	
						  	
						 		
		Collections.binarySearch(l,"Z"));//3	
		Collections.binarySearch(l,"J"));//-2	
			

	Ex.


	import java.util.*;
	class CollectionsSearchDemo2
	{
		public static void main(String args[])
		{
			ArrayList l = new ArrayList();
			l.add(15);
			l.add(0);
			l.add(20);
			l.add(10);
			l.add(5);
			System.out.println(l); //[15,0,20,10,5]
			Collections.sort(l, new MyComparator());
			System.out.println(l);//[20,15,10,5,0]
			System.out.println(Collections.binarySearch(l,10 ,new MyComparator())); //2
			System.out.println(Collections.binarySearch(l,13,new MyComparator())); //-3
			System.out.println(Collections.binarySearch(l,17));// unpredictable results
			
		}
	}
	
	class MyComparator implements Comparator
	{
		public int compare(Object obj1, Object obj2)
		{
			Integer I1 = (Integer)obj1;
			Integer I2 = (Integer)obj2;
			return I2.compareTo(I1);
		}
	}
	
	
	
        -------------------
    l-->|15 |0 |20 |10 |5 |
    	-------------------
    		
    			     -1 -2  -3  -4 -5 ---> // unsuccessful search returns Insertion point	
    			    -------------------	
    Sorted List l-->|20 |15 |10 |5 |0 |		
                	-------------------	
    				  0  1  2   3   4 --> //Successfull search returns Index Number 	
    				  	
    	Collections.binarySearch(l,10,new MyComparator()));//2				 		
        Collections.binarySearch(l,13,new MyComparator()));//-3	
		Collections.binarySearch(l,17));//unpredictable results
		Collections.binarySearch(l,17,new MyComparator()));//-2
		
		

 Note: 
 
	> For the list of n elements, In the case of Binary Search Method.
	
	
	   -> For List of 'n' elements 	
	    	
	    1. Successful results range : 0 to n-1 
	    
	    2. UnSuccessful results range : -(n+1) to -1
	    
	    3. Total results range : -(n+1) to (n-1) 	
	    	
	
	Ex. 
	
	3- elements 
 
      -1    -2   -3     -4 
    ------------------
	| A  |  K  |  Z  |	
	------------------
	  0     1     2
	
	1. Successful results range : 0 to 2 
	
	2. UnSuccessful results range : -4 to -1

	3. Total results range : -4 to 2 	
		
		
		
----------------------------
 Reversing Element of List 	
---------------------------- 
		
	> Collections class defines the following reverse method to reverse element of list.	
		
		
	----------------------------------------
	|1. public static void reverse(List l);|
	----------------------------------------
		
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
		
		
	-------------------------------	
	 reverse() vs  reverseOrder()	
	-------------------------------	
		
	 > We can use reverse() method to reverse order of elements of List.

	 > Where as we can use reverseOrder() method to get reversed Comparator.
		
		Comparator c1 = Collections.reverseOrder(Comparator c)
				   |										|
			Descending order 						Ascending order 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	

	
	
		
		
		
		
		
		
		
		
		
		
		