

import java.util.*;
class HashtableDemo
{
	public static void main(String args[])
	{
		
		Hashtable h = new Hashtable(25);// output:{23=E, 16=F, 15=D, 6=C, 5=A, 2=B}
		h.put(new Temp(5),"A");
		h.put(new Temp(2),"B");
		h.put(new Temp(6),"C");
		h.put(new Temp(15),"D"); //15%11=4
		h.put(new Temp(23),"E"); //23%11=1 
		h.put(new Temp(16),"F"); //	16%11=5
		//h.put("Durga",null); //	NullPointerException
		
		System.out.println(h);//{6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
	}
}
class Temp 
{
	int i;
	Temp(int i)
	{
		this.i=i;
	}
	public int hashCode()
	{	
		//return i; ouput : {6=C, 16=F, 5=A, 15=D, 2=B, 23=E} 
		//return i%9; // output: {16=F, 15=D, 6=C, 23=E, 5=A, 2=B}
		return i;
	}
	public 	String toString()
	{
		return i+"";
	}
}	