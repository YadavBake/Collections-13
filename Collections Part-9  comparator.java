
													Collections Part-9 || comparator
												  ====================================

 -------------
  Comparator  
 -------------

  > Comparator prasent in java.util package and it defines two methods compare() and equals().

		------------------------------------------------
		|1. public int compare(Object obj1, Object obj2)|
		------------------------------------------------
					|
					|-> return -ve(negative) if and only if obj1 has to come before obj2.
					|
					|-> return +ve(positive) if and only if obj1 has to come after obj2.
					|
					|-> return 0(Zero) if and only if obj1 and obj2 are equal.
					
		
		--------------------------------------
		|2. public boolean equals(Object obj)|
		--------------------------------------
		
		
  > Whenever we are implmenting Comparator interface compulsory we should provide implementation only for compare() 
	method and we are not required to provide implementation for equals() method because it is already available to 
	our class from Object class through inheritance.
	
	Ex. 
			Object {
			
   ---------->equals(){}
  |			}
  | 		 ^
  | 		 |
  |			 |	
  |	class MyCompartor implements Comparator
  ------>	
	{
		compare()
		{
		}
	}
	
  > Write a program to insert Integer objects into the TreeSet where the sorting order decending order ?


		import java.util.*;
		class TreeSetDemo3  
		{
			
			public static void main(String args[])
			{
				TreeSet t = new TreeSet(new MyComparator()); //line -1 
				t.add(10);
				t.add(0); //=>+ve compare(0,10)
				t.add(15);//-ve compare(15,10)
																			
				t.add(5);//=> +ve compare(5,10)                             			10		
						 //=> -ve compare(5,0)                              			 |
				                                                            	------------------		 
				t.add(20);//=> -ve compare(20,10)                           	|				 |
						  //=> -ve compare(20,15)	                            15			     0
				                                                            	|				 |
				t.add(20);//=> -ve compare(20,10)                           ----------		---------
						  //=> -ve compare(20,15)                           |		 | 		|		|
						  //=> 0   compare(20,20)                           20				5
				
				System.out.println(t);
			}
		}
		class MyComparator implements Comparator
		{
			public int compare(Object obj1, Object obj2)
			{
				Integer I1 = (Integer)obj1;
				Integer I2 = (Integer)oj2;
				if(I1<I2)
				{
					return +1 ;
				}
				else if(I1>I2)
				{
					return -1;
				}
				else
				{
					return 0;
				}
			}
		}
						
						
		> At line - 1 if we are not passing comparator object then internally JVM will call compareTo() method which is 
		  ment for default Natural Sorting order in this case the output [0,5,10,15,20].
		  
		> At line - 1 if we are passing comparator object then JVM will call compare() method which is ment for customized
		  sorting in this case the ouput [20,15,10,5,0].
	
// Default Natural Sorting order [Ascending order][0,5,10,15,20]

 -> Various possible implementations of compare() method ?


		
		import java.util.*;
		class TreeSetDemo3  
		{
			
			public static void main(String args[])
			{
				TreeSet t = new TreeSet(new MyComparator());
				t.add(10);
				t.add(0);
				t.add(15);
				t.add(5);
				t.add(20);
				t.add(20);
				System.out.println(t);
			}
		}
		class MyComparator implements Comparator
		{
			public int compare(Object obj1, Object obj2)
			{
				Integer I1 = (Integer)obj1;
				Integer I2 = (Integer)obj2;
				
				return I1.compareTo(I2);// Default Natural Sorting order [Ascending order][0,5,10,15,20]
				
				return -I1.compareTo(I2);//[Descending order][20, 15, 10, 5, 0]
				
				return  I2.compareTo(I1);//);//[Descending order] [20, 15, 10, 5, 0]
				
				return -I2.compareTo(I1);//[Ascending order][0,5,10,15,20]
				
				return +1; // [Insertion order ][10, 0, 15, 5, 20, 20]

				return -1;//;//[reverse of Insertion order ][20, 20, 5, 15, 0, 10]
				
				return 0;//[only first element will be inserted and all remaning are duplicates.][10]

			}
		}
								
						
			