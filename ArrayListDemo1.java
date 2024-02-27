		import java.util.*;
		class ArrayListDemo1
		{
			public static void main(String args[])
			{
				ArrayList al = new ArrayList();
				LinkedList ll = new LinkedList();
				System.out.println(al instanceof Serializable);// true 
				System.out.println(ll instanceof Cloneable);// true 
				System.out.println(al instanceof RandomAccess);// true 
				System.out.println(ll instanceof RandomAccess);// false
			}
		}