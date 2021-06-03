package ArrayList;

import java.util.*;

public class duplicate
{
	public ArrayList getDuplicate(ArrayList bl)
	{
		ArrayList dup=new ArrayList();
		for(int i=0;i<bl.size();i++)
		{
			Object o=bl.get(i);
			if(o instanceof Integer)
			{
				Integer n=(Integer)o;
				if(Collections.frequency(bl,n)>1 &&!dup.contains(n))
				{
					dup.add(n);
				}
			}
		}
		return dup;
	}




	public ArrayList removeDuplicates(ArrayList bl)
	{
		ArrayList dup=new ArrayList();
		for(int i=0;i<bl.size();i++)
		{
			Object o=bl.get(i);
			Integer n=(Integer)o;
			if(!(Collections.frequency(bl, n)>1))
			{
				dup.add(n);
			}
		}
		return dup;
	}




	public static void main(String[] args) 
	{

		ArrayList al=new ArrayList();      //ArrayList is a dynamic Array which comes under util package.

		al.add(23);
		al.add(100);
		al.add(100);
		al.add(4);
		al.add(100);
		al.add(67);
		al.add(34);
		al.add(67);

		duplicate ob=new duplicate();
		ArrayList dl=ob.getDuplicate(al);
		System.out.println(dl);
		dl=ob.removeDuplicates(al);
		System.out.println(dl);
	}

}
