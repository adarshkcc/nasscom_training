
public class vowels 
{
	public void Display(String brr[])
	{
		for(int i=0;i<brr.length;i++)
		{
			if((brr[i].contains("a"))&& (brr[i].contains("e"))&&( brr[i].contains("i"))&& (brr[i].contains("o"))&& (brr[i].contains("u")))
			{
				System.out.println(brr[i]);
				
			}
		
		}
	}

	public static void main(String[] args) 
	{
		String arr[]= {"Suryavansi","education","Adarsh"};
		vowels ob=new vowels();
		ob.Display(arr);

	}

}
