
public class string {

	public static void main(String[] args) 
	{

		String s= new String("Adarsh world");
		String str="";
		for(int l=s.length()-1;l>=0;l--)
		{
			System.out.print(s.charAt(l));
			str=str+s.charAt(l);
		}
		System.out.println();
		if(str.equals(s))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		char b[]=s.toCharArray();
		for(char a:b)
		{
			System.out.println(a);
		}
		String arr[]=s.split(" ");
		for(String brr:arr)
		{
			System.out.println(brr);
		}
	}

}

