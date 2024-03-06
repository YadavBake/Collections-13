
												Collections Part-12 || linked Hashmap
											 ==========================================

=================
  LinkedHashMap 
=================
	
	> It is the child class HashMap.
	
	> It is exctly HashMap (including Methods and constructor) except the following differences.
 
		-------------------------------------------------------------------------------------------
        |            HashMap					 |			Hashtable							  |
        -------------------------------------------------------------------------------------------
        |									     |											      |
        |1. The underlaying Data Structure is    |1. Underlaying is combination of LinkedList and |
        |	Hashtable.							 |	 Hashtable(Hybrid DataStructure).			  |
        |										 |												  |
        |2. Insertion order is not preserved and |2. Insertion order is preserved.				  |	
        |	it based on hasCode of keys			 |												  |	
        |										 |												  |						
        |3. Introduced in 1.2v version 			 |3. Introduced in 1.4v version 				  |
        -------------------------------------------------------------------------------------------

 > In the below HashMap program if we replace HashMap with LinkedHashMap then output is :

		{chiranjeevi=700, balaiah=800, venkatesh=200, nagarjun=500}
	
	that is Insertion order is preserved.
	
   import java.util.*;
   class HashMapDemo1
   {
	   public static void main(String args[])
	   {
		   LinkedHashMap m = new LinkedHashMap();
		   m.put("chiranjeevi",700);
		   m.put("balaiah",800);
		   m.put("venkatesh",200);
		   m.put("nagarjun",500);
		   System.out.println(m); 
		   //System.out.println(m.put("chiranjeevi",1000));
		   Set s = m.keySet();
		   //System.out.println(s);
		   Collection c = 	m.values();
		   //System.out.println(c);
		   Set s1 = m.entrySet();
		   //System.out.println(s1);
			Iterator itr = s1.iterator();
			while(itr.hasNext())
			{
				Map.Entry m1 = (Map.Entry)itr.next();
				//System.out.println(m1.getKey()+"....."+m1.getValue());
				if(m1.getKey().equals("nagarjun"))
				{
					m1.setValue(10000);
				}
			}
			//System.out.println(m);
	   }
   }
   
  
 Note:

	> LinkedHashMap and LinkedHashSet are commanly used for developing catche based application.
	

 > Difference between '==' operator and .equals() methods.
	
	- In general '==' equal operator meant for reference compairson (Address compairson) where as .equals() method meant
	  for content compairson.
	  
	  
		Ex. 
															  -------	
			Integer I1 = new Integer(10);				I1--->| 10  |
			Integer I2 = new Integer(10);					  -------
			System.out.println(I1==I2);
			System.out.println(I1.equals(I2));				  -------
			                                            I2--->| 10  |
                                                        	  -------
															  
===================															  
  IdentityHashMap	
===================

  > It is exctly same as HashMap (including Method and constructors) except the following difference.
  
	- In the case of normal HashMap JVM will use .equals() method to identify duplicate keys, which is meant for content
	  compairson.
	  
	- But in the case IdentityHashMap JVM will use '==' operator to identify duplicate keys, which is meant for reference
	  or address compairson.
  

		import java.util.*;
		class IdentityHashMapDemo
		{
			public static void main(String args[])
			{
														  -------	
                                                    I1--->| 10  |
				HashMap m = new HashMap();          	  -------
				Integer I1 = new Integer(10);       
				Integer I2 = new Integer(10);       	  -------
				m.put(I1,"Pawan");                  I2--->| 10  |
				m.put(I2,"Kalyan");                 	  -------
				System.out.println(m);//{10=Kalyan}	10=pawan replace with kalyan
			}
		}
		
		
		import java.util.*;
		class IdentityHashMapDemo1
		{
			public static void main(String args[])
			{
																		  -------	
                                                                    I1--->| 10  |
				IdentityHashMap m = new IdentityHashMap();          	  -------
				Integer I1 = new Integer(10);                       
				Integer I2 = new Integer(10);                       	  -------
				m.put(I1,"Pawan");                                  I2--->| 10  |
				m.put(I2,"Kalyan");                                 	  -------
				System.out.println(m); //{10=Pawan, 10=Kalyan}
	
			}
		}
		

		I1 and I2 are duplicate keys because I1.equals(I2) returns true.
		
		If we replace HashMap with IdentityHashMap then I1 and I2 are not duplicate keys because I1==I2 returns false.
		
		In this case output is {10=Pawan, 10=Kalyan}

===============
  WeakHashMap
===============

  > It is exctly same as HashMap except the following difference.

	- In the case of HashMap even though Object doesn't have any reference it is not eligible for GC if it is associated 
	  with HashMap that is HashMap dominates GarbageCollector.
	  
	- But in the case of WeakHashMap,If object doesn't containe any references it is eligible for GC even though object 
	  associated withe WeakHashMap. That is GarbageCollector dominates WeakHashMap.
  
  
  
  
	import java.util.*;
	class WeakHashMapDemo
	{
		public static void main(String args[]) throws Exception 
		{
		
			HashMap m = new HashMap();
			Temp t = new Temp();
			m.put(t,"durga");
			System.out.println(m); //{Temp=durga}
			t=null;
			System.gc();
			Thread.sleep(5000);
			System.out.println(m);//{Temp=durga}
		}
	}

	class Temp 
	{
		public String toString()
		{
			return "temp";
		}
		public  void finalize()
		{
			System.out.println("finalize method called");
		}
	}

 > In the above example Temp object not eligible for GC because it is associated with HashMap. In this case output is 	

		{temp=durga}
        {temp=durga}


 > In the below program if we replace HashMap with WeakHashMap then Temp object eligible for GC. In this case output is 
 
	{temp=durga}
	finalize method called
	{}
	

	import java.util.*;
	class WeakHashMapDemo
	{
		public static void main(String args[]) throws Exception 
		{
		
			WeakHashMap m = new WeakHashMap();
			Temp t = new Temp();
			m.put(t,"durga");
			System.out.println(m); //{Temp=durga}
			t=null;
			System.gc();
			Thread.sleep(5000);
			System.out.println(m);//{Temp=durga}
		}
	}

	class Temp 
	{
		public String toString()
		{
			return "temp";
		}
		public  void finalize()
		{
			System.out.println("finalize method called");
		}
	}
	output 
	
	
	





































  
															  