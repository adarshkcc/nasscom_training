
public class sample16 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s=new String("hello welcome to java world");
		String arr[]=s.split(" ");
		System.out.println(arr.length);
		String a[]=new String[arr.length];
		int i=0;

		for(String b:arr)
		{

			a[i]=b;

			i++;
		}

		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i].charAt(a[i].length()-1));
		}

	}

}
