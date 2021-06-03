package threads;
import java.util.*;
public class threadAssignment extends Thread
{
public synchronized void removeElement(ArrayList al)
{
ArrayList cl=new ArrayList();

	for(int i=0;i<al.size();i++)
	{
		Object o=al.get(i);
		Integer n=(Integer)o;
		if(n==5)
		{
			al.remove(i);
			i--;
			
			
		}
	}
System.out.println(al);
}
public void run()
{
	ArrayList bl=new ArrayList();
	 int arr[]= {5,7,6,5,5,5,9,3,4};
	for(int i:arr)
	{
		bl.add(i);
	}
	this.removeElement(bl);
}
public static void main(String[] args)
{
	threadAssignment a1=new threadAssignment();
	threadAssignment a2=new threadAssignment();
	threadAssignment a3=new threadAssignment();
	
	a1.start();
	a2.start();
	a3.start();
}
}
