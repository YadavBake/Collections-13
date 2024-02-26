
												Collections Part-2 || 9key interfaces
											 =========================================	

 -------------------------------------------
  9 Key interfaces of Collection Framework 
 ------------------------------------------- 
 
  1. Collection.
  2. List. 
  3. Set.
  4. SortedSet.
  5. NavigableSet.
  6. Queue.
  7. Map. 
  8. SortedMap.
  9. NavigableMap.
 
==========================================================================================================================

													 1. Collection(I).
												  ======================

 -> If you want to reprasent a group of individual object as a single entity then we should go for collection.
 
 -> Collection interface defines the most comman methods which are applicable for any collection object.
 
 -> In general collection interface is considard as root interface of collection framework.
 
 -> There is no concreate class which implements collection interface directly.
 
 -> Difference between Collection and Collections :-
 
	- Collection is an interface If we want to reprasent a group of individual object as a single entityt then we should
	  go for collection.
	  
	- Collections is an utility class prasent in java.util package to define several utility methods for collection 
	  object(liking sorting, searching etc.).
	  
==========================================================================================================================	  
	  
													2.List(I)
												  ============


 -> It is the child interface of collection.

 -> If we want to reprasent a group of individual objects as single entity where duplicates are allowed and insertion 
	order must be preserved then we should go for List(I).
	  	  
	  Collection(I)1.2v
		   ^
		   |
		   |
		   |
		 List(I)1.2v  
		   |
		   |-> ArrayList 1.2v
		   |-> LinkedList 1.2v
		   |-> Vector 1.0v<------ 
				 |			    |
				 |->stack 1.0v<-|// These classes are legacy classes. 

	Note: 

		- 1.2v version vector and stack classes are Re-engineered or update or modify to implement List interface.
		
		

==========================================================================================================================

												3. Set(I)
											 ===============

 -> It is the child interface of collection.

 -> If we want to reprasent a group of individual object as single entity where duplicates are not allowed and insertion
	order not required then we should go for Set(I).
	
			Collection(I)1.2v
		    	   ^
		    	   |
            	   |
            	   |
            	  Set(I)1.2v  
				   ^
				   |
				   |
				 HashSet 1.2v
				   |
				   |
				   |
				LinkedHashSet 1.4v 

==========================================================================================================================
							
												 4. SortedSet(I)
												=================

 -> It is the child interface of Set(I).

 -> If we want to reprasent a group of individual object as single entity where duplicates are not allowed and all object 
	should be inserted according to some shorting order then we should go for SortedSet.
	
								Collection(I)1.2v
                                	   ^
                                	   |
                                	   |
                                	   |
                                	  Set(I)1.2v  
                                	   ^
                                	   |
                                	   |
                                	SortedSet(I) 1.2v
									
==========================================================================================================================                                	   

										  5. NavigableSet(I)
										=====================

 -> It is the child interface of SortedSet(I).

 -> It containes several methods for navigation of purposes.

 ->  					
 
					Collection(I)1.2v
                    	   ^
                    	   |
                    	   |
                    	   |
                    	  Set(I)1.2v  
                    	   ^
                    	   |
                    	   |
                    	SortedSet(I) 1.2v
						   ^
						   |		
						   |
						NavigableSet(I)1.6v
						   ^
						   |
						   |
						 TreeSet 1.2v   
						 
						 
 -> Differences between List and Set :-

		------------------------------------------------------------------
		|		List(I)				  |			Set(I)					 |
		------------------------------------------------------------------								
		|1. duplicates are allowed 	  |	1. Duplicates are not allowed.   |
		|							  |	                                 |
		|2. Insertion order preserved |	2. Insertion order not preserved.|
		------------------------------------------------------------------								

==========================================================================================================================
											
												  6. Queue(I)
												==============

 -> It is the child interface of collection.

 -> If we want to reprasent a group of individual objects prior to processing then we should go for Queue(I).

 -> Useally Queue follows first in first order but based on our requirement we can implement our own priority order 
	also.
	
		Ex.
		
			- Before sending mail all mail ids we have to store in some dataStructure.
			
			- In which order we added mail ids in the same order only mail should be deliverd for requirement Queue(I)
			  best choice.
			  
 -> 
						Collection(I)1.2v
                        	   ^
					    	   |
                        	   |
                        	   |
                        	 Queue(I)1.5v  
                        	   ^
                        	   |
                        	   |
                        	PriorityQueue
                        	   ^
                        	   |		
                        	   |
                        	BlockingQueue
                        	   ^
                        	   |-> PriorityBlockingQueue
                        	   |-> LinkedBlockingQueue
							   |
 
 Note: 

	All the above interfaces (Collection, List, set, SortedSet, NavigableSet and Queue) ment for reprasenting a group
	individual objects.
	
	If we want to reprasent a group of object as key-value pairs then we should go for Map interface
	
==========================================================================================================================

														  7. Map(I)
														==============
															
 -> Map is not child interface of Collection.

 -> If we want to reprasent a group of object as key-value pairs then we should go for Map interface. 
										
															
	    Key     Value 										
	-------------------										
	| --------------- |									
	| |Rollno| Name | |									
	| --------------- |										
	| | 101 | Durga | |									
	| --------------- |									
	| --------------- |										
	| |102 | Ravi   | |									
	| --------------- |								
	| --------------- |									
    | |103 | Shiva  | |
    | --------------- |
    -------------------
	
 -> Both key and value are object only.

 -> Duplicates keys are not allowed but values can be duplicated.
 
							
							Map(I) 1.2v
							  ^
							  |
							  |
						    HashMap 1.2v
							  |
							  |--> LinkedHashMap 1.4v
							  |
							  |
						 WeakHashMap 1.2v
							  |
							  |
						IdentityHashMap 1.4v  Dictionary(Abstract class) 1.0v
							  |			   				^
							  |			 			    |
							  |			 |---------------
						 Hashtable-------| 1.0v
							 |
							 |-> Properties	1.0v


==========================================================================================================================
													
												8. SortedMap(I)
											  ==================


 -> It is the  child interface of Map.

 -> If you want to reprasent a group of key-value pairs according to some Sorting order of keys then we should go for 
	SortedMap interface.
	
 -> In SortedMap the Sorting should be based on key but not based on value.


							Map(I)1.2v
							  ^
							  |
							  |
						  SortedMap(I)1.2v
							  	
==========================================================================================================================
				
												 9. NavigableMap(I)
											  ========================

 -> It is the child interface of SortedMap interface.

 -> It defines several methods for Navigation purposes.

 ->  
												 
				Map(I)1.2v				 
				  ^				 
            	  |
            	  |
              SortedMap(I)1.2v
				  |
				  |
			  NavigableMap(I)1.6v
				  |
				  |
				TreeMap 1.2.  

==========================================================================================================================

 Note: 
 
	- The following legacy charcters prasent in collection framework.
	
		Enumeration(I)
		Dictionary(Ac)
		Vector(C)
		Stack(C)
		Hashtable(C)
		Properties(C)



												Collection(I) 1.2v 
													 |
			----------------------------------------------------------------------------------------
			|									  |												   |
			|									  |												   |	
		  List(I) 1.2v							Set(I)1.2v										Queue(I) 1.5v 	
			|									   |											   |	
			|									   |											   |	
   --------------------------				-------------------							 --------------------
   |		     |		|---|----|			|				  | 						|			 	|.....
 ArrayList   LinkedList | Vector |		  HashSet 1.2v	   SortedSet(I)1.2v		  PriorityQueue	 BlockingQueue 1.5v
  1.2v			1.2v	|	 |   |			|					|					 1.5v		 |->PriorityBlockingQueue
						|  Stack |		LinkedHashSet 1.4v  NavigableSet(I) 1.6v				 |->LinkedBlockingQueue
						----------								|									   1.5
						1.0v and 							 TreeSet 1.2 
						legecy class 






													Map(I) 1.2v
													  |										  -------------- 		
													  |										  |	Dictionary |	
			----------------------------------------------------------------------------------|-----|------|
			|					|					|					 |					  |	    |      |
			|					|					|					 |					  |	 	|      |
	   	 HashMap 1.2v	 WeakHashMap 1.2v 	IdentityHashMap 1.4v     SortedMap(I)1.2v		  |	Hashtable  |
	 		|															 |					  |		|      |
	  LinkedHashMap 1.4v 											 NavigableMap(I) 1.6v	  |	Properties |
																		 |					  --------------			
																	  TreeMap 1.2v	 			1.0v legacy
																								classes 

  For default natural Sorting order

	1. Then we use Comparable interface
	
  For customized Sorting Order 
  
	2. Then we use Comparator interface.
	
	
  -> If want object one by one from the collection then we should go for cursors concept 

		1. Enumeration
		2. Iterator
		3. ListIterator.
		
 -> If you want utility classes.
		
		1. Collections 
		2. Array 




























	












	