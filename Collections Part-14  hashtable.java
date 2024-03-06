
												Collections Part-14 || hashtable
											======================================

 ============
  Hashtable 
 ============

  -> The underlaying DataStructure for Hashtable is Hashtable.
  
  -> Insertion order is not preserved and it is based on HashCode of keys.

  -> Duplicate keys are not allowed and values can be duplicated.
  
  -> Hetrogeneous object are allowed for both Keys and values.
  
  -> null is not allowed for both keys and values otherwise we will get Runtime Exception saying NullPointerException.
  
  -> It implements Serializable and Cloneable interfaces but not RandomAccess.
  
  -> Every method prasent in hashtable is synchronized and hence hashtable table object is Thread safe.
  
  -> Hashtable is the best choice if our frequent operation is search operation.
  
  - - - - - - - -  
  |Constructors |
  - - - - - - - - 
  
   1. Hashtable h = new Hashtable();
   
		Creates an empty Hashtable object with default initialCapacity 11 and default fillRatio 0.75 .
   
   2. Hashtable h = new Hashtable(int initialCapacity);
   
   3. Hashtable h = new Hashtable(int initialCapacity, float fillRatio);
   
   4. Hashtable h = new Hashtable(Map m);
   
	
	
	
	import java.util.*;										         10|----------|				
	class HashtableDemo                                                |          |
	{                                                                  |----------|
		public static void main(String args[])                        9|          |
		{                                                              |----------|
			                                                          8|          |
			Hashtable h = new Hashtable();                             |----------|
			h.put(new Temp(5),"A");                                   7|          |
			h.put(new Temp(2),"B");                                    |----------|
			h.put(new Temp(6),"C");                                   6|6=C       |
			h.put(new Temp(15),"D"); //15%11=4                         |----------|
			h.put(new Temp(23),"E"); //23%11=1                        5|5=A       |
			h.put(new Temp(16),"F"); //	16%11=5                        |----------|
			System.out.println(h);//{6=C, 16=F, 5=A, 15=D, 2=B, 23=E} 4|15=D,16=F |//from top to bottom,from right to left
		}                                                              |----------|
	}                                                                 3|          |
	                                                                   |----------|
	class Temp                                                        2|2=B       |
	{                                                                  |----------|
		int i;                                                        1|23=E      |
		Temp(int i)                                                    |----------|
		{                                                             0|          |
			this.i=i;                                                  ------------
		}
		public int hashCode()
		{
			return i;
		}
		public 	String toString()
		{
			return i+"";
		}
	}	
	
 -> If we change hashCode() method of Temp class as :


		public int hashCode()
		{
			return i%9;
		}
		
		output is 
		
		{16=F,15=D,6=C,23=E,5=A, 2=B}

import java.util.*;												 10|----------|				
class HashtableDemo                                                |          |
{                                                                  |----------|
	public static void main(String args[])                        9|          |
	{                                                              |----------|
		                                                          8|          |
		Hashtable h = new Hashtable();                             |----------|
		h.put(new Temp(5),"A");                                   7| 16=F     |
		h.put(new Temp(2),"B");                                    |----------|
		h.put(new Temp(6),"C");                                   6|6=C,15=D  |
		h.put(new Temp(15),"D"); 		                           |----------|
		h.put(new Temp(23),"E"); 		                          5|5=A,23=E  |
		h.put(new Temp(16),"F"); 		                           |----------|
		//h.put("Durga",null); //	NullPointerException          4|		  |//from top to bottom,from right to left
		                                                           |----------|
		System.out.println(h);//{16=F,15=D,6=C,23=E,5=A, 2=B}     3|          |
	}                                                              |----------|
}                                                                 2|2=B       |
class Temp                                                         |----------|
{                                                                 1|	      |
	int i;                                                         |----------|
	Temp(int i)                                                   0|          |
	{                                                              ------------
		this.i=i;
	}
	public int hashCode()
	{
		return i%9;
	}
	public 	String toString()
	{
		return i+"";
	}
}		
	
  
 > If we configure initialCapacity as 25 that is :
 
	Hashtable h = new Hashtable(25);// output:{23=E, 16=F, 15=D, 6=C, 5=A, 2=B}

  

				24|----------|
			      |          |
                  |----------|
                23|23=E      |
                  |----------|
                16|16=F      |
                  |----------|
                15|15=D      |
                  |----------|
                 6|6=C       |
                  |----------|
                 5|5=A 		 |
                  |----------|
                 4|		     |
                  |----------|
                 3|          |
                  |----------|
                 2|2=B       |
	              |----------|
                 1|	         |
                  |----------|
                 0|          |
                  ------------
				  
------------				  
 Properties 
------------

 -> In our program if any thing which changes frequently (like username, password, mailids, number etc.again and again) 
	are recommended to hard code in java program because if there is any change to reflect that change recompilation,
	rebuild,and redeploye application are required even sometimes server re-start also required which creates a big 
	business impact to to the client.
	
 -> We can overcome this problem by using properties file. Such type variable thing we have to configure in the properties
	file.
	
 -> From that properties file we have to read into java program and we can use those properties.
 
 -> The main advantage of this approach is if there is a change in properties file reflect that change just redeployment 
	is enough which won't create any bussiness impact to the client.

 -> We can use java properties object to hold properties which are coming from properties file.

		-------------------									  -----------------	
		|				  |									  |				  |
	    |                 |                                   |               |
	    | Uname = "Scott" |                                   | -----------   |
        |                 |------------------------------------>|property |   |
        | pwd = tiger     |                                   | |object   |   |--->1.Compile 
        |                 |                                   | -----------   |--->2.ReBuild
        | DBURL= ".."     |                                   |               |--->3.ReDeploye 
        |                 |                                   | ;;            |--->4.ReStartServer 
        |                 |                                   | ;;;;          |
        |                 |->// Re-Deploying                  | ;;;code       |
        |                 |                                   |               |
        |                 |                                   |               |
		-------------------									  -----------------
		  abc.properties											.java 
		  
		  
 -> In normal Map(like HashMap, Hashtable, TreeMap ) Key and Value  can be any type but in the case Properties Key and 
	Value should be String type.
	
-------------
 Constructor
-------------

  1. Properties p = new Properties(); 
		
---------
 Methods 
---------

  1. String getProperty(String pname)
  
		- To get value associated with the specified property.
		
		- If the specified property not available then these method returns null.

  2. String setProperty(String pname,String pvalue)	
       |
	return old value 

		- To set a new Property.
		- If the specified property already available then old value will be replaced with new value and returns old value.

  3. Enumeration propertyNames()	
  
		- returns all property names prasent in properties object.

  4. void load(InputStream is)

		- To load properties from properties file into java properties object.
		
  5. void store(OutputStream os,String comment )
  
		- To store properties from java properties object into properties file.

		
		-------------------	
        |				  |	
        |                 | 	load()				-------------		
        | 				  |------------------------>| 			|
        | 	properties    |                         |			|
        | 		file	  |                         | java 		|
        | 				  |							| properties|
        | 				  |							|  object   |
        | 				  |<------------------------|			|
        |                 | 	store() 			|			|
        |                 |							-------------
        |                 | 					
        |                 | 						Properties p = new Properties()
        -------------------	
          abc.properties


 
  import java.util.*;
  import java.io.*;
  class PropertiesDemo
  {
	  public static void main(String args[]) throws Exception
	  {
		  Properties p = new Properties();
		  FileInputStream fis = new FileInputStream("abc.properties");
		  p.load(fis);
		  System.out.println(p);
		  String s = p.getProperty("Venki");
		  System.out.println(s);
		  p.setProperty("nag","88888");
		  FileOutputStream fos = new FileOutputStream("abc.Properties");
		  p.store(fos,"Updated by Durga for SCJP Demo class");
	  }
  }
		  
		  
  import java.util.*;
  import java.io.*;
  class PropertiesDemo
  {
	  public static void main(String args[]) throws Exception
	  {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("db.properties");
		p.load(fis);
		String url = p.getProperty("url");
		String user = p.getProperty("user");
		String pwd = p.getProperty("pwd");
		Connection con = DriverManager.getConnection(url,user,pwd);
		;;;;;;;;;;
	  }
  }