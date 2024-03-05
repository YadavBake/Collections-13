
										Collections Part-11 || Map || Hashmap || linked Hashmap
									  -----------------------------------------------------------

---------
  Map(I)
---------

	
    
    													Map(I) 1.2v
    													  |										  -------------- 	
    													  |										  |	Dictionary |	
    			----------------------------------------------------------------------------------|-----^------|
    			|					|					|					 |					  |	    |      |
    			|					|					|					 |					  |	 	|      |
    	   	 HashMap 1.2v	 WeakHashMap 1.2v 	IdentityHashMap 1.4v     SortedMap(I)1.2v		  |	Hashtable  |
    	 		|															 |					  |		|      |
    	  LinkedHashMap 1.4v 											 NavigableMap(I) 1.6v	  |	Properties |
    																		 |					  --------------	
    																	  TreeMap 1.2v	 			1.0v legacy
																									classes 
  
  > Map is not child interface of Collection.
  
  > If we want to reprasent a group of objects as KEY-VALUE pairs. Than we should go for Map.
  
  
									-----------------
									| Key 	values  |																   
                                    |--------------	|
	                                ||101	Durga |<---- Entry 
	                                |-------------- |
	                                |-------------- |
	                                ||102	Ravi  | |
	                                |-------------- |
	                                |-------------- |
	                                ||103 	Shiva | |
	                                |-------------- |
	                                |-------------- |
	                                ||104 	Pavan | |
	                                |-------------- |
	                                -----------------
  
  >	Both keys and values are object only.
  
  > Duplicate keys are not allowed but values can be duplicated.
  
  > Each KEY-VALUE pair is called Entery hence  Map is considard as a collection of entry objects .
  
  
 ----------------------- 
  Map interface Methods 
 -----------------------

  > 1. 	Object put(Object key, Object value)
		------
		  |
		old value 

	- To add one KEY-VALUE pair to the Map.

	- If the key is already prasent then old value will be replaced with new value and returns old value 
	
		Ex. 
			m.put(101,"Durga"); // and returns null
			m.put(102,"Shiva");//and returns null 
			m.put(!01,"Ravi");//and returns Durga 
			
			
			-----------------------------
			|101,Durga replace with Ravi|
			|102,Shiva 					|
			-----------------------------
			
	2. 	m.putAll(Map m);		
		Object get(key);
			
			- returns the value associated with specified key.
			
	3	Object remove(key);
		
			- remove the entry associated with specified key.
			
	4	boolean containsKey(key);
		
	5	boolean constainsValue(value);
	6	boolean isEmpty();
	7	int size();
	8	void clear();
	9   Set keySet()<--------
	10  Collection values() |//-> This three methods by default considard as  Collection views of Map.
	11  Set setEntry()<------
	
 -----------------
  Entry interface
 -----------------

  > Map is a group of KEY-VALUE pairs and each KEY-VALUE pair is called an Entry hence a Map is considard as a collection 
	of Entry objects.
	
  > Without exisiting Map object there is no chance of exisiting entry object hence Entry interface is define inside Map 
	interface.
	
	Ex. 

	interface Map 
	{
		interface Entry
		{
			Object getKey();<------------------
			Object getValue();				   |//->This three method are entry specific method and we can apply only on 
			Object setValue(Object newObject)<--// entry object.
		}
	}

------------
  HashMap 	
------------

  > The underlaying Data Structure is Hashtable.
  
  > Insertion order is not preserved and it is based on hashCode of keys.
  
  > Duplicate keys are not allowed but values can be duplicated.
  
  > Hetrogeneous object are allowed for the key and value.
  
  > null is allowed for key(only once).
  
  > null is allowed for value (any number of times).
  
  > HashMap implements Serializable and Cloneable interfaces and but RandomAccess.
  
  > HashMap is the best choice if our frequent operation is search operation.
	
 ---------------------	
  HashMap Constructor 	
 ---------------------
 
   1. HashMap m = new HashMap();
   
		- Creates empty HashMap object with default initialCapacity 16 and default fillRatio 0.75.
   
   
   2. HashMap m = new HashMap(int initialCapacity);
   
		- Creates an empty HashMap object with specified initialCapacity and default fillRatio 0.75 .
   
   3. HashMap m = new HashMap(int initialCapacity, float fillRatio);
   
   4. HashMap m = new HashMap(Map m);
   
   

   import java.util.*;
   class HashMapDemo
   {
	   public static void main(String args[])
	   {
		   HashMap m = new HashMap();
		   m.put("chiranjeevi",700);
		   m.put("balaiah",800);
		   m.put("venkatesh",200);
		   m.put("nagarjun",500);
		   System.out.println(m); //{nagarjun=500, balaiah=800, chiranjeevi=700, venkatesh=200}
		   System.out.println(m.put("chiranjeevi",1000));
		   Set s = m.keySet();
		   System.out.println(s);
		   Collection c = 	m.values();
		   System.out.println(c);
		   Set s1 = m.entrySet();
		   System.out.println(s1);
			Iterator itr = s1.iterator();
			while(itr.hashNext())
			{
				Map.Entry m1 = (Map.Entry)itr.next();
				System.out.println(m1.getKey()+"....."+m1.getValue());
				if(m1.getKey().equals("nagarjun"))
				{
					m1.setValue(10000);
				}
			}
			System.out.println(m);
	   }
   }
   
   output:
   
   {nagarjun=500, balaiah=800, chiranjeevi=700, venkatesh=200}
   700
   [nagarjun, balaiah, chiranjeevi, venkatesh]
   [500, 800, 1000, 200]
   [nagarjun=500, balaiah=800, chiranjeevi=1000, venkatesh=200]
   nagarjun.....500
   balaiah.....800
   chiranjeevi.....1000
   venkatesh.....200
   {nagarjun=10000, balaiah=800, chiranjeevi=1000, venkatesh=200}
   		   
		   
 > Differences between HashMap and Hashtable

		-------------------------------------------------------------------------------------------
		|            HashMap					 |			Hashtable							  |
		-------------------------------------------------------------------------------------------
		|									     |											      |
		|1. Every method prasent in HashMap is   | 1. Every Method prasent in Hashtable is        |
		|	not synchronized.				     |   synchronized.	                              |
		|	                                     |                                                |
		|2. At a mutiple threads are allowed to  | 2. At a only one thread is allowed is          |
		|	operate on HashMap object and hence  |    allowed to operate on Hashtable and 	      |
		|	a it is not thread safe.		     |   hence it is thread safe.	                  |
		|                                        |                                                |
		|3 Relatively performance is high 	     | 3. Relatively performance is low because       |
		|  because thread are not required to    |	   thread are required to wait to operate	  |
		|  wait to operate on HashMap object.    |   on Hashtable object.	                      |
		|                                        |                                                |
		|4. null is allowed for both KEY-VALUE.  | 4. null is not allowed for keys and values     |
		|									     |   otherwise we will get NullPointerException.  |
		|                                        |                                                |
		|5. Introduced in 1.2v version and it is | 5. Introduced in 1.0v version and it is legacy.|
		|	not legacy.                          |                                                |
		-------------------------------------------------------------------------------------------
		
 > How to get synchronized version of HashMap object ?

	- By default HashMap is non-synchronized but we can get synchronized version of HashMap by using synchronizedMap()
	  method of Collections class 


	import java.util.*;
	class HashMapDemo1
	{
		public static void main(String args[])
		{
			HashMap m = new HashMap();
			Map m1 = Collections.synchronizedMap(m);
				|								 |
			synchronized				non-synchronized
			
		}
	}