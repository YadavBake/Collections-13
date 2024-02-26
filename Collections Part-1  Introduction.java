
												Collections Part-1 || Introduction	
											  =====================================
--------------------
	 Array's  
--------------------

  -> An array is an indexed collection of fixed number of homogeneous data elements.
  
  -> The main advantage of arrays is we can reprasent mutiple values by using single variable so that readability of 
	 the code will improved.
 
------------------------ 
 Limitations of Array's 
------------------------

	1. Array's are fixed in size that is once we creates an array there is no chance of increasing or decreasing the 
	   size based on our requirement due to this, to use array concept compulsory we should the size in advanced which 
	   may not possible always.

	2. Array can hold only  homogeneous (same type) data type elements.
  
		Ex. 
		
			Student s [] = new Student[10000]
			s[0] = new Student(); //valid 
			s[1] = new Customer();//invalid CE: incompatible types found: customer requiired: Student.	
			
		- we can solve this problem by using Object type arrays.

		Ex.
		
			Object [] a = new Object[10000];
			a[0] = new Student();//valid 
			a[1] = new Customer();//valid 
	
	3. Array concept is not implemented based on some standard data structure and hence a rediment method support is 
	   not available for every requirement we have to write the code explicitly which increases complixity of programming.


 -> To overcome  above problem of array's we should go for collections concept.
 
 1. Collections are growable in nature that is based on our requirement we can increase or decrease the size.
 
 2. Collections can hold both homogeneous(same type) and hetrogeneous(different type) object.
 
 3. Every collection class is implemented based some standard data structure hence for every requirement rediment method 
	support is available. Being a programmer we are responsible to use those methods & we are not responsible to implement
	those methods.
	
---------------------------------------------   
 Differences between Array's and Collections 
---------------------------------------------

	--------------------------------------------------------------------------------------
	|			Array's 				     |					Collection               | 
	|----------------------------------------|-------------------------------------------|
	|                                        |                                           |
	| 1. Array's are fixed in size that is   | 1. Collections are growable in nature	 |							
	|	once we creates an array we can't 	 | 	that is based on our requirement         |
	|	increase or decrease the size based	 | 	we can increase or decrease the          |
	|   our requirement.					 | 		seze.                                |
	--------------------------------------------------------------------------------------
	|2. With respect to memory array's are   | 2. With respect memory collections are    |
	|	not recomanded to use.				 | 	recomanded to use.                       |
	--------------------------------------------------------------------------------------
	|3. With respect to performance array's  | 3. With respect to performance collection |
	|	are recomanded to use 				 | 	are not recomanded to use.               |
	|                                        |                                           |
    |4. Array's can hold only homogeneous    | 4. Collections can hold both homogeneous  |
	|	data type elements.					 |	and hetrogeneous elements.	             |
	--------------------------------------------------------------------------------------
	|5. There is no underlaying datastructure| 5. Every collection class is implemented  |
	|	for array's and hence rediment method| 	 based on some standard datastructure 	 |
	|	support is not available. for every  |	 and hence a for every requirement       |
	|	requirement we have to write code 	 |	 rediment method support is available    |
	|	explicitly which increases complixity|	 being a programmer we can use these     |
	|	problemming.						 |	 methods directly and we are not         |
	|										 |	 responsible to implement those methods. |
	--------------------------------------------------------------------------------------
	|6. Array can hold both primtives and    | 6. Collections can hold only object types |
	|	objects. 							 |	 but not primtives.                      |
	|                                        |                                           |
	--------------------------------------------------------------------------------------
	
--------------	
  Collection 
--------------

 -> If we want to reprasent a group of individual objects as a single entity  then we should go for collection.
 
 ---------------------
  Collection Framwork 
 ---------------------

  -> It containes several classes and interfaces which can be used to reprasent a group of individual object as single 
	 entity.
	
  -> 


		--------------------------------------------------------------------------------------
        |			java	 				     |					C++		                 |
		|----------------------------------------|-------------------------------------------|
        |                                        |                                           |
        | 1.	Collection ------------------------->  Contianer 							 |
        |										 | 									         |
        |										 | 									         |
        |   									 | 									         |
        --------------------------------------------------------------------------------------
        |2. Collection Framework---------------------------> STL 						     |
        |										 | 		(Standard Template Library)          |
        --------------------------------------------------------------------------------------
	