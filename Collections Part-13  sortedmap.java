
												Collections Part-13 || sortedmap
											 =====================================

==============
 SortedMap(I)
==============

  > It is the child interface of Map.

  > If  you want to reprasent a group of Key-Value pairs according to some sorting order of Keys then we should go for 
	sortedmap.
	
  > Sorting is based on the Key but not based on value.
  
  > SortedMap defines the following specific method.
																						 -----------
   1. Object firstKey() --> 101								                             |101 --> A|
                                                                                         |         |
   2. Object lastKey()  --> 136                                                          |103 --> B|
                                                                                         |         |
   3. SortedMap headMap(Object key)(107) --> {101=A,103=B,104=C}                         |104 --> C|
                                                                                         |         |
   4. SortedMap tailMap(Object key)(107) --> {107=D,125=E,136=F}                         |107 --> D|                                        
                                                                                         |         |
   5. SortedMap subMap(Object key1 ,Object key2)(103,125)-->{103=B,104=C,107=D}          |125 --> E|    
                                                                                         |         |
   6. Comparator comparator() --> null                                                   |136 --> F|
                                                                                         -----------
                                                     
 ----------                                                    
  TreeMap                                                   
 ----------

  -> The underlaying Data Structure is RED-BLACK Tree.

  -> Insertion order is not preserved and it is based on some sorting order of keys.

  -> Duplicate Keys are not allowed but values can be duplicated.

  -> If we are depending on default natural Sorting order then Keys should be homogeneous and comparable otherwise we will 
	 get runtime exception saying ClassCastException.
	 
  -> If we are defining our own sorting by comaparator then Keys need not be homogeneous and comparable we can take 
	 hetrogeneous non-comparable objects also.

  -> Whether we are depending default natural sorting order or customized sorting order there are no restriction for values 
	 we can take hetrogeneous non-comparable objects also.

-------------------	 
  null Acceptance 	 
-------------------

	1. For non-empty TreeMap if we are trying to insert an entry with null key then we will get Runtime Exception saying 
	   NullPointerException.
	   
	2. For empty TreeMap as the first entry with null key is allowed but after inserting that entry if we are trying to 
	   insert any other entry then we will Runtime Exception saying NullPointerException.
	   
 Note:
 
	- The above nulll Acceptance rule applicable until 1.6v version only from 1.7v version onwords null is not allowed 
	  for key.
	  
	- But for values we can use null any number of times there is no restriction whether it is 1.6v or 1.7v version.
	
- - - - - - - -	
| Constructors| 	
- - - - - - - - 

	1. TreeMap t = new TreeMap();
			
		Meant for Default Natural Sorting Order.	
		
	2. TreeMap t = new TreeMap(Comparator c);
	
		Meant for Customized Sorting Order.
	
	3. TreeMap t = new TreeMap(Map m);
	
	4. TreeMap t = new TreeMap(SortedMap m);



  import java.util.*;
  class TreeMapDemo3
  {
		public static void main(String args[])
		{
			TreeMap m = new TreeMap();
			m.put(100,"ZZZ");
			m.put(103,"YYY");
			m.put(101,"XXX");
			m.put(104,106);
			//m.put(null,null);
			//m.put("FFFF","XXX");//CCE
			//m.put(null,"XXX");//NPE
			System.out.println(m);//{100=ZZZ, 101=XXX, 103=YYY, 104=106}
		}
  }

 > Demo program for customized Sorting ?

 

 import java.util.*;
 class TreeMapDemo1
 {
	 public static void main(String args[])
	 {
		 TreeMap t = new TreeMap(new MyComparator());
		 t.put("XXX",10);
		 t.put("AAA",20);
		 t.put("LLL",30);
         t.put("ZZZ",40);
		 System.out.println(m); //{ZZZ=30, XXX=10, LLL=40, AAA=20}
	 }
 }
 class MyComparator implements Comparator
 {
	 
	 public int compare(Object obj1, Object obj2)
	 {
		 String s1 = (String)obj1;
		 String s2 = (String)obj2;
		 return s2.compareTo(s1);
	 }
 }
		 
  





















	 
 
 
 
 
 
 
 
 
  
 
  
 
 
 
 
 
 
 
 
 
 
 