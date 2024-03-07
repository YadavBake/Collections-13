
												  Collections Part-18 || Arrays
												=================================

========== 
   Arrays 
==========

	-> Arrays class is an Utility class to define several Utility methods for Arrays or Array Objects.
	

--------------------------------
  1. Sortig Elements of Array:
--------------------------------

	> Arrays class define the following Sort methods to sort elements of primitive and object type arrays.
	


		1. public static void sort(primitive [] p);
		
			- To Sort According to Natural Sorting Order.
							
		2. public static void sort(Object[] o);
		
			- To Sort According to Natural Sorting Order.
		
		3. public static void sort(Object [] o, Comparator c);  
		
			- To Sort According to customized Sorting order.
			
			
	Ex. 

		import java.util.Arrays;
		import java.util.Comparator;
		class ArraysSortDemo
		{
			public static void main(String args[])
			{
				int [] a = {10,5,20,11,6};
				System.out.println("Primitive Arrays before Sorting : ");
				for(int a1:a)
				{
					System.out.println(a1); // 10,5,20,11,6
				}
				Arrays.sort(a);
				System.out.println("Primitive Arrays After  Sorting : ");
				for(int a1:a)
				{
					System.out.println(a1);// 5,6,10,11,20
				}
				String [] s = {"A","Z","B"};
				System.out.println("Object Arrays before Sorting : ");
				for(String a2: s)
				{
					System.out.println(a2); //A,Z,B
				}
				Arrays.sort(s);
				System.out.println("Object  Arrays After  Sorting : ");
				for(String a2:s)
				{
					System.out.println(a2); //A,B,Z
				}
				Arrays.sort(s,new MyComparator());
				System.out.println("Object Array After Sorting by comparator :");
				for(String a2:s)
				{
					System.out.println(a2); //Z,B,A
				}
			}
		}
		class MyComparator implements Comparator
		{
			public int compare(Object obj1, Object obj2)
			{
				String s1 = obj1.toString();
				String s2 = obj2.toString();
				return s2.compareTo(s1);
			}
		}
		

  Note: 

	 - We can sort primitive arrays only based on Default Natural Sorting Order. Where as we can Object Arrays Either 
	   based on Default Natural Sorting Order or Based on Customized Sorting Order.
	   
-----------------------------------	   
  Searching The elements of Array	
-----------------------------------

 - Arrays class defines the following Binary Search Methods.
 
	1. public static int binarySearch(primitive[]p,primitive target);
	
	2. public static int binarySearch(Object[]a, Object target);
	
	3. public static int binarySearch(Object[]a, Object target, Comparator c);
	
	
 Note: 
 
	- All rules of Arrays class Binary Search methods are exctly same as Collections class Binary Search methods.
	
	
	 import java.util.*;
	 import static java.util.Arrays.*;
	 class ArraysSearchDemo
	 {
		 public static void main(String args[])
		 {
			 int [] a = {10,5,20,11,6};
			 Arrays.sort(a); // sort by natural order 
			 System.out.println(Arrays.binarySearch(a,6));//1
			 System.out.println(Arrays.binarySearch(a,14));//-5
			 
			 String[] s = {"A","Z","B"};
			 Arrays.sort(s);
			 System.out.println(binarySearch(s,"Z"));//2
			 System.out.println(binarySearch(s,"S"));//-3	
			 
			 Arrays.sort(s, new MyComparator());
			 System.out.println(binarySearch(s,"Z",new MyComparator()));//0
			 System.out.println(binarySearch(s,"S",new MyComparator()));//-2
			 System.out.println(binarySearch(s,"M"));//unpridictable result 
			 
		 }
	 }
	 
	 class MyComparator implements Comparator
	 {
		 public int compare(Object obj1, Object obj2)
		 {
			 String s1  = (String)obj1;
			 String s2 = (String)obj2;
			 return s2.compareTo(s1);
		 }
	 }



	    -------------------
    l-->|10 |5 |20 |11 |6 |
    	-------------------
    		
    			     -1 -2  -3  -4 -5   -6 ---> // unsuccessful search returns Insertion point
    			    -------------------	
    Sorted List l-->|5 |6 |10 |11 |20 |		
                	-------------------	
    				  0  1  2   3   4 --> //Successfull search returns Index Number 	

		Arrays.	binarySearch(a,6);// 1
		Arrays.	binarySearch(a,14);// -5	


														
                                                            -----------
	    -----------											|A |Z | B |		
		|A |Z | B |                                     	-----------
    	-----------                                     	
		                                                	 -1 -2  -3  -4 	
		 -1 -2  -3  -4 	                                	-----------	
		-----------	                                    s-->|Z |B | A |		
	s-->|A |B | Z |		                                    -----------
        -----------                                     	  0  1  2 
		  0  1  2 
		Arrays.	binarySearch(s,"Z");// 2				binarySearch(s,"Z",new MyComparator()); // 0
		Arrays.	binarySearch(a,"S");// -3				binarySearch(s,"S",new MyComparator()); // -2
														binarySearch(s,"n"); // unpridictable result 

  ------------------------------
   Conversion of Array to List  
  ------------------------------
  
	- 
	
		---------------------------------------
		|public static List asList(Object[] a)|
		---------------------------------------
	
	- Stricaly speeking this won't create an Indipendent List object for the exisiting Array we are getting  List view.
		
		String [] s = {"A","Z","B"};
		
		List l Arrays.asList(s);
											
		s[0] ="K";
		System.out.println(l);// K,Z,B
		
		l.add("M"); |//RE: UnsupportedOperationException
		l.remove(1);|//RE: UnsupportedOperationException
		
		l.set(1,"N"); //valid 
		
		l.set(1,new Integer(10)); // RE: ArrayStoreException
		
										--------------------			
						String[]s----->	|   -----------	   |	
                                        |   |A |Z | B |	   |	
						List l -------->|   -----------	   |	
										--------------------
  
	- By using Array reference if we performe any change automatically that change will be reflected to the List Similarly 
	  by using List reference if we performe any change that change will be reflected automatically to the Array.
  
	- By using List reference we can't performe any operation which veries or change the size otherwise we will get 
	  Runtime Exception saying UnsupportedOperationException.
			
				Ex. 
				
				l.add("M"); |//RE: UnsupportedOperationException
	            l.remove(1);|//RE: UnsupportedOperationException
                
	            l.set(1,"N"); //valid 
  
	- By using List reference we are not allowed to replace with Hetrogeneous objects otherwise we will get Runtime 
	  Exception saying ArrayStoreException.
	  
			Ex. 
			
				l.set(1,new Integer(10)); // RE: ArrayStoreException
				
				
		import java.util.*;
		class ArraysAsListDemo
		{
			public static void main(String args[])
			{
				String [] s = {"A","Z","B"};
	            List l Arrays.asList(s);
                System.out.println(l);// [A,Z,B]									
                s[0] ="K";
                System.out.println(l);// [K,Z,B]
                l.set(1,"L");
				for (String s1 :s )
				{
					System.out.println(s1); // K,L,B
				}
				l.add ("Durga");//RE: UnsupportedOperationException
				l.remove(2);//RE: UnsupportedOperationException
				l.set(1,new Integer(10)); // RE: ArrayStoreException
			}
		}
  