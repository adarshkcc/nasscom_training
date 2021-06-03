package practice;

public class str {
	public String replace(String s,char c,char p)  // replacing the character e with a
	{
		int i=0;
		char s1[]=s.toCharArray();
		for(char c1:s1)
		{
	if(c1==c)
	{
		s1[i]=p;
	i++;
	}
	else
	{
		
		i++;
	}
		
	}
		
		return new String(s1);  // convert character array to string
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text=new String("hello everyone");
		String text1="hello everyone";
		String text2=text;
		if(text==text1)
	System.out.println("true");
		else
			System.out.println("false");
		if(text==text2)
			System.out.println("true");
				else
					System.out.println("false");
	
		String str[]=text.split(" ");
		for(String s:str)
			System.out.println(s);
		char ch[]=text.toCharArray();
		for(char c:ch)
			System.out.println(c);

		
		str o=new str();
		System.out.println(o.replace("hello everyone",'e','a'));
	
	}

}
