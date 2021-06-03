package practice;

public class Duplicate {
	
	public void removeDuplicate(String r)
	{
		
	String a="";
		String p="";
		char ch[]=r.toCharArray();
		for(int i=0;i<r.length();i++)
		{
			a=r.substring(i,i+1);
		
			p=r.substring(i+1,r.length());
			
			if(p.contains(a))
					{
				break;
				
					}
			//else
			//{
				System.out.print(ch[i]);
			//}
		
		}
		
	}

	public static void main(String[] args) 
	{
		String s=new String("hi this is sample test");
		
		Duplicate ob=new Duplicate();
		ob.removeDuplicate(s);
	}

}
