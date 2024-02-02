package jatin;
import java.util.*;
import java.util.Enumeration;


public class FirstArrayList {
	public static void main(String args[])
	{
		Vector students = new Vector();
		students.add("Jatin");
		students.add("Mukesh");
		students.add("Ramesh");
		students.add("Bhavesh");
		System.out.println("1."+students);
		Iterator itr = students.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		ListIterator itr2 = students.listIterator();
		System.out.println("2.");
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		System.out.println("3.");
		while(itr2.hasPrevious())
		{
			System.out.println(itr2.previous());
		}
		Enumeration enumeration = students.elements();
		System.out.println("4.");
		while(enumeration.hasMoreElements())
		{
			System.out.println(enumeration.nextElement());
		}
	}
}
