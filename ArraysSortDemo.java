import java.util.Arrays;
		import java.util.Comparator;
		class ArraysSortDemo
		{
			public static void main(String args[])
			{
				int [] a = {10,5,20,11,6};
				System.out.println("Primitive Arrays before Sorting : ");
				for(int a1:a)
				{
					System.out.println(a1); // 10,5,20,11,6
				}
				Arrays.sort(a);
				System.out.println("Primitive Arrays After  Sorting : ");
				for(int a1:a)
				{
					System.out.println(a1);// 5,6,10,11,20
				}
				String [] s = {"A","Z","B"};
				System.out.println("Object Arrays before Sorting : ");
				for(String a2: s)
				{
					System.out.println(a2); //A,Z,B
				}
				Arrays.sort(s);
				System.out.println("Object  Arrays After  Sorting : ");
				for(String a2:s)
				{
					System.out.println(a2); //A,B,Z
				}
				Arrays.sort(s,new MyComparator());
				System.out.println("Object Array After Sorting by comparator :");
				for(String a2:s)
				{
					System.out.println(a2); //Z,B,A
				}
			}
		}
		class MyComparator implements Comparator
		{
			public int compare(Object obj1, Object obj2)
			{
				String s1 = obj1.toString();
				String s2 = obj2.toString();
				return s2.compareTo(s1);
			}
		}
				