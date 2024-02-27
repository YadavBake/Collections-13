import java.util.*;
class LinkedListDemo
{
	public static void main(String args[])
	{
		LinkedList l = new LinkedList();
		l.add("Baake");
		l.add(30);
		l.add(null);
		l.add("Baake");
		l.set(0,"Software");
		l.add(0,"Venky");
		l.removeLast();
		l.addFirst("CCC");
		System.out.println(l);
	}
}