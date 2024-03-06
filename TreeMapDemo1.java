 import java.util.*;
 class TreeMapDemo1
 {
	 public static void main(String args[])
	 {
		 TreeMap t = new TreeMap(new MyComparator());
		 t.put("XXX",10);
		 t.put("AAA",20);
		 t.put("ZZZ",30);
         t.put("LLL",40);
		 System.out.println(t);
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