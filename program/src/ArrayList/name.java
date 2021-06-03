package ArrayList;
import java.util.*;
public class name 
{
	public ArrayList getName(ArrayList bl)
	{
	ArrayList cl=new ArrayList();
	//Object o=new Object();                
	for(int i=0;i<bl.size();i++)
	{
	Object o=bl.get(i);
	if(o instanceof String)
	{
		//String s=(String)o
		if(o.toString().startsWith("ad"))
			cl.add(o);
	}
	}
		return cl;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();      //ArrayList is a dynamic Array which comes under util package.
		
		al.add("adarsh");
		al.add(100);
		al.add("aditya");
		al.add(4.5f);
		al.add(false);
		al.add("ashutosh");
		
		name ob=new name();
		ArrayList dl=ob.getName(al);
		System.out.println(dl);

	}

}
