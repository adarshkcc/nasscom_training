package ArrayList;
import java.util.*;
public class arraylist {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();      //ArrayList is a dynamic Array which comes under util package.

		al.add("adarsh");
		al.add(100);                       //ArrayList stores duplicate element.
		al.add("aditya");                
		al.add(100);
		al.add(false);
		al.add("ashutosh");

		System.out.println(al);

		System.out.println(al.get(0));

		al.add(1,"raj");
		System.out.println(al);

		System.out.println(al.size());

		System.out.println(al.contains("raj"));

		System.out.println(al.isEmpty());

		System.out.println(al.indexOf("ashutosh"));

Object o=al.get(1);

		al.remove(2);
		System.out.println(al);

		al.clear();	
		System.out.println(al);



	}

}
