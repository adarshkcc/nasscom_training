
public class Buffer {
	public static void main(String[] args)
	{
		StringBuffer s=new StringBuffer("welcome to java world");       // string buffer is mutable i.e it can be changed
		
		s.insert(15," adarsh");
		System.out.println(s);
		
		
		s.append(" and python world");
		System.out.println(s);
		
		s.deleteCharAt(0);
		System.out.println(s);
		
		s.delete(0,6);
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
				
	}

}
