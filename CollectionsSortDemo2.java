import java.util.*;
class CollectionsSortDemo2
{
	public static void main(String args[])
	{
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		System.out.println("Before Sorting :" +l); //Before Sorting :[Z, A, K, N]
		Collections.sort(l, new MyComparator());
		System.out.println("After  Sorting :" +l);//After  Sorting :[Z, N, K, A]
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1 = (String)obj1;
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}