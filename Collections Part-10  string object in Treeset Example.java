
										Collections Part-10 || string object in Treeset Example
									  ===========================================================


  > Write a program to insert String object in to  the TreeSet Where All elements should be inserted according to 
	reverse of Alphabetical order.
	
	
		import java.util.*;
		class TreeSetDemo5
		{
			public static void main(String args[])
			{
	
				TreeSet t = new TreeSet(new MyComparator());
				
				t.add("Roja");
				t.add("Shobharani");
				t.add("Rajakumari");
				t.add("GangaBhavani");
				t.add("Rammulmaa");
				System.out.println(t);// [GangaBhavani, Rajakumari,Rammulmaa,Roja,Shobharani]
			}
		}
			
		class MyComparator implements Comparator
		{
			public int compare(Object obj1,Object obj2)
			{
				String s1 =  (String)obj1; // String s1 = obj1.toString();
				String s2 = (String)obj2;  // String s2 =  obj2.toString();
				
				return -s1.compareTo(s2);
				
				//return s2.compareTo(s1);
			}
		}
		
		
  > Write a program to insert StringBuffer object into the TreeSet where sorting order is Alphabetical order ?

		import java.util.*;
		class TreeSetDemo5
		{
			public static void main(String args[])
			{
	
				TreeSet t = new TreeSet(new MyComparator());
				t.add(new StringBuffer("A"));
				t.add(new StringBuffer("Z"));
				t.add(new StringBuffer("K"));
				t.add(new StringBuffer("L"));
				
				System.out.println(t);// [A,K,L,Z]
			}
		}
			
		class MyComparator implements Comparator
		{
			public int compare(Object obj1,Object obj2)
			{
				String s1 = obj1.toString();
				Strin = obj2.toString();
				
				return s1.compareTo(s2);
			}
		} //[A, K, L, Z]
	
  Note:

	> If we are depending on default natural sorting order compulsory object should be homogeous and compairable otherwise 
	  we will get Runtime Exception saying ClassCastException.
	  
	> If we are defining our on sorting by comparetor then objects need not be compairable and homogeous that is we can 
	  add hetrogeneous non-compairable objecs also.


  > Write a program to insert String and StringBuffer object into TreeSet where sorting order is increasing length order 
	If two object having same length then considard there Alphabetical order ?
	
	import java.util.*;
		class TreeSetDemo7
		{
			public static void main(String args[])
			{
	
				TreeSet t = new TreeSet(new MyComparator());
				t.add("A");
				t.add(new StringBuffer("ABC"));
				t.add(new StringBuffer("AA"));
				t.add("XX");
				t.add("ABCD");
				t.add("A");
				
				System.out.println(t);// [A,AA,XX,ABC,ABCD]
			}
		}
			
		class MyComparator implements Comparator
		{
			public int compare(Object obj1,Object obj2)
			{
				String s1  = obj1.toString();
				String s2  = obj2.toString();
				
				int l1 = s1.length();
				int l2 = s2.length();
				
				if(l1<l2)
				{
					return -1;
				}
				else if(l1>l2)
				{
					return +1;
				}
				else 
				{
					return s1.compareTo(s2); //[A, AA, XX, ABC, ABCD]
					//return 0;//[A, AA, ABC, ABCD]
					
				}
			}
		}
				
 
 > Comparable Vs Comparator


   1. For pre-defined comparable classes default natural sorting order already available if we are not seticefied with
	  that default natural sorting order then we can define out own sorting by using comparator.
	  
   2. For pre-defined non-comparable classes(Like StringBuffer) default natural sorting order not already available 
	  we can define our own sorting by using comparator.
	  
   3. For our own classes like employee,The person who is writing the class is responsible to define default natural	
	  sorting(D.N.S.O) order by implementing comparable interface.
	  
	  The person who is using our class, if is not saticified with default natural sorting order (D.N.S.O) then he can 
	  define  his own sorting by using comparator.



	----------------		----------------		----------------
	|			   |	    |			   |        |			   |
	| Pre-define   |        | Pre-define   |        |   our own    |
	| compairable  |        |noncompairable|        | 			   |
	| classes.	   |        | classes.	   |        | 	classes.   |
	|   String     |        | StringBuffer |        |   Employee   |
	----------------	    ----------------        ----------------
		| |                 	| |               		  |
		| |	                	| |	              		  |	
		| |	                	| |	              		  |	
		| |                 	| |         -------------------------------  
	 Comparator              Comparator     |  							  |  	        
										 The person who				The person who 
										 is writing this 			is using this 
											class 						class 
											  |							  |
										Comparable					 Comparator 
										(D.N.S.O)					(Customized Sorting )


  -> 
  
	import java.util.*;							class CompComp
	class Employee implements Comparable        {
	{                                           	public static void main(String args[])
		String name;                            	{
		int eid;                                		Employee e1 = new Employee("nag",100);
		                                        		Employee e2 = new Employee("baliah",200);
		Employee(String name, int eid)          		Employee e3 = new Employee("chiru",50);
		{                                       		Employee e4 = new Employee("Venki",150);
			this.name=name;                     		Employee e5 = new Employee("nag",100);
			this.eid=eid;                       		
		}                                       		TreeSet t = new TreeSet();
		public String toString()                		t.add(e1);
		{                                       		t.add(e2);
			return name+"__"+eid;               		t.add(e3);
		}                                       		t.add(e4);
		public int compareTo(Object obj)        		t.add(e5);
		{                                       		System.out.println(t); //[chiru__50, nag__100, Venki__150, baliah__200]
			int eid1 = this.eid;                		}
			Eployee e = (Employee)obj;          	}	
			int eid2 = e.eid;                   		
			if(eid1 <eid2)                              
			{                                           
				return -1;                              
			}                                           
			else if(eid1>eid2)                  		
			{                                   	   
				return +1;                      
			}
			else 
			{
				return 0;
			}
		}
	}
	
	
	
	import java.util.*;										class CompComp			
	class MyComparator implements Comparable                {
	{                                                       	public static void main(String args[])
		                                                    	{
		public int compare(Object obj1, Object obj2)        		Employee e1 = new Employee("nag",100);
		{                                                   		Employee e2 = new Employee("baliah",200);
			Employee e1 = (Employee)obj1;                   		Employee e3 = new Employee("chiru",50);
			Employee e2 = (Employee)obj2;                   		Employee e4 = new Employee("Venki",150);
			                                                		Employee e5 = new Employee("nag",100);
			Strig s1 = e1.name;                             		
			Strig s2 = e2.name;                             		TreeSet t1 = new TreeSet(new MyComparator());
			                                                		t1.add(e1);
			return s1.compareTo(s2);	                            t1.add(e2);
			                                                        t1.add(e3);
		}                                                           t1.add(e4);
	}                                                               t1.add(e5);
                                                            		System.out.println(t1);
	                                                        	}
	                                                        }	//[baliah__200, chiru__50, nag__100,Venki__150]
	
------------------------------------------								
 Comparison of Comparable and Comparator 
------------------------------------------

		 ----------------------------------------------------------------------------------------			
		 |	Comparable													Comparator      		|
		 ----------------------------------------------------------------------------------------		
		 |											 |											|
		 |1. It is meant for Default Natural sorting | 1. It is meant for Customized sorting    |
		 |	 order.									 |	 order.	                                |
		 |                                           |                                          |
		 |2. Prasent in java.lang package.			 | 2. prasent in java.util package.         |
		 |                                           |                                          |
		 |3. It defines only one method compareTo(). | 3. It defines two methods comapre() and  |
		 |											 |	 equals().		                        |
		 |                                           |                                          |
		 |4. String and all Wrapper classes implement| 4. The only implemented classes of       |
		 |	 comparable interface.					 |	 comparator Collator() and 	            |
		 |											 |    RuleBasedCollator()                   |
		 -----------------------------------------------------------------------------------------
		
			
	
---------------------------------------------								
 Comparison table of Set implemented classes  
---------------------------------------------

		------------------------------------------------------------------------------------------------------------
		|Property 							HashSet			LinkedHashSet 			      TreeSet				   |
		------------------------------------------------------------------------------------------------------------
		|							   |			       |						  |							   |
	    |1. underlating Data Structure |   Hashtable	   |	LinkedList+Hashtable  |  Balanced Tree	           |
	    |                              |                   |                          |                            |
        |2. Duplicate objects.	       |  Not Allowed      |    Not Allowed 		  |	 Not Allowed 	           |
        |                              |                   |                          |                            |
        |3. Insertion order.		   |  Not Preserved    |	Preserved			  |	Not Preserved              |
        |                              |                   |	                      |                            |
	    |4. Sorting order 			   |  Not Applicable   |  Not Applicable 		  |	Applicable                 |
	    |                              |                   |	                      |                            |
	    |5. Hetrogeneous object 	   |	Allowed 	   |	Allowed 			  |	Not Allowed                |
        |                              |                   |                          |                            |
        |6. null Acceptance 		   | Allowed only once |     Allowed 		   	  |	For empty TreeSet as first |	 
		|							   |				   |						  |	element null is allowed.   |			
        ------------------------------------------------------------------------------------------------------------
  NOte: 

	> For empty TreeSet as the first element null is allowed but this rule is applicable until 1.6v version only from 
	  1.7v version onwords null is not allowed even as the first element.
        
        
        
        
        
        
        
        
        







 
		