import java.util.*;
public class sample15 {
	public ArrayList getNames(ArrayList brr)
	{
		ArrayList cl=new ArrayList();
		for(int i=0;i<brr.size();i++)
		{
			Object o=brr.get(i);
			if(o instanceof String)
			{
				String s=(String)o;
				if(s.substring(0,2).equals("su"))
				{
					cl.add(s);
				}
			}
		}
		return cl;
	}
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(4.5f);
		al.add("surya");
		al.add(false);
		al.add("suraj");
		sample15 ob=new sample15();
ArrayList dl=ob.getNames(al);
System.out.println(dl);
		
	//	ArrayList dl=new ArrayList();
		
		
//		for(int i=0;i<al.size();i++)
//		{
//			Object o=al.get(i);
//			if(o instanceof String)
//			//	System.out.println(o.toString()+("---"+o.toString().length()));
//			{
//				if(o.toString().startsWith("su"))
//					System.out.println(o);
//			}
//		}
//		
//		System.out.println(al);
//		
//		System.out.println(al.size());
//		System.out.println(al.get(1));
//		System.out.println(al.contains("adarsh"));
//		System.out.println(al.indexOf(false));
//		System.out.println(al.isEmpty());
//		
//		al.add(1,"Adarsh");
//		System.out.println(al);
//		al.remove(0);
//		al.remove("surya");
//		System.out.println(al);
//		al.clear();
//		System.out.println(al);
		
	}

}
