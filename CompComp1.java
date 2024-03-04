import java.util.*;						
	class MyComparator implements Comparator     
	{                                        
		                             
		public int compare(Object obj1, Object obj2)     
		{                                    
			Employee e1 = (Employee)obj1;
			Employee e2 = (Employee)obj2;
			
			String s1 = e1.name;
			String s2 = e2.name;
			
			return s1.compareTo(s2);	
			
		}
	}

	class CompComp1
	{
		public static void main(String args[])
		{
			Employee e1 = new Employee("nag",100);
			Employee e2 = new Employee("baliah",200);
			Employee e3 = new Employee("chiru",50);
			Employee e4 = new Employee("Venki",150);
			Employee e5 = new Employee("nag",100);
			
			TreeSet t1 = new TreeSet(new MyComparator());
    		t1.add(e1);
            t1.add(e2);
            t1.add(e3);
            t1.add(e4);
	        t1.add(e5);
			System.out.println(t1);
		}
    }