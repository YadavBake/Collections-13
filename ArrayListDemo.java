import java.util.*;
	class ArrayListDemo
	{
		public static void main(String args[])
		{
			ArrayList al  = new ArrayList();
			al.add("A");
			al.add(10);
			al.add("A");
			al.add(null);
			System.out.println(al); // [A,10,A,null]
			al.remove(2);
			System.out.println(al); // [A,10,null]
			al.add(2,"M");
			al.add("N");
			System.out.println(al); // [A,10,M,null,N]
		}
	}
  