
	 import java.util.*;
	 import static java.util.Arrays.*;
	 class ArraysSearchDemo
	 {
		 public static void main(String args[])
		 {
			 int [] a = {10,5,20,11,6};
			 Arrays.sort(a); // sort by natural order 
			 System.out.println(Arrays.binarySearch(a,6));//1
			 System.out.println(Arrays.binarySearch(a,14));//-5
			 
			 String[] s = {"A","Z","B"};
			 Arrays.sort(s);
			 System.out.println(binarySearch(s,"Z"));//2
			 System.out.println(binarySearch(s,"S"));//-3	
			 
			 Arrays.sort(s, new  MyComparator());
			 System.out.println(binarySearch(s,"Z",new MyComparator()));//0
			 System.out.println(binarySearch(s,"S",new MyComparator()));//-2
			 System.out.println(binarySearch(s,"M"));//unpridictable result 
			 
		 }
	 }
	 
	 class MyComparator implements Comparator
	 {
		 public int compare(Object obj1, Object obj2)
		 {
			 String s1  = (String)obj1;
			 String s2 = (String)obj2;
			 return s2.compareTo(s1);
		 }
	 }
