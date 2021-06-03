
public class exception {

	public static void main(String[] args) 
	{
		try
		{
			String str=new String("surya");
			System.out.println(str.charAt(10));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("index not found");
		}
		try
		{
			int arr[]=new int[-5];
			System.out.println(arr.length);
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("size error");

		}
		try
		{
			String s=null;                    // it is most dangerous exception if we do not handle this exception then our code will crash
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("String error");
		}

		try
		{
			int n=Integer.parseInt("surya");
			System.out.println(--n);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Format Error");
		}


		try
		{
			int n1=100,n2=0;
			System.out.println(n1/n2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("expression error");	
		}
		
		
		try
		{
			int ar[]=new int[5];
			ar[6]=6;                      // accessing the 7th element in an array of size 5
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("could not assingn the value");
		}


	}


}
