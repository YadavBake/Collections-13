import java.util.*;
	class ListIteratorDemo
	{
		public static  void main(String args[])
		{
			LinkedList l = new LinkedList();
			l.add("BalaKrishana");
			l.add("Venki");
			l.add("Chiru");
			l.add("naga");
			System.out.println(l); //[BalaKrishana,Venki,Chiru,naga]
			ListIterator ltr = l.listIterator();
			while (ltr.hasNext())
			{
				String s = (String)ltr.next();
				
				if(s.equals("Venki"))
				{
					ltr.remove(); //[BalaKrishana,Chiru,naga]
				}
				else if(s.equals("naga"))
				{
					ltr.add("chaitu");//[BalaKrishana,Chiru,naga,chaitu]
				}
				else if(s.equals("Chiru"))
				{
					ltr.set("charan"); //[BalaKrishana,charan,naga,chaitu]
				}
			}
			System.out.println(l); //[BalaKrishana,charan,naga,chaitu]
		}
	}
	
	[BalaKrishana, Venki, Chiru, naga]
	[BalaKrishana, charan, naga, chaitu]