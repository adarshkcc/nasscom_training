import java.util.Scanner;
public class Program {

	public void Number(String s)
	{
		if(s.equals("e"))
		{
			for(int i=0;i<=100;i++)
			{
				if(i%2==0)
					System.out.println(i);
			}
		}
		else
		{
			for(int i=0;i<=100;i++)
			{
				if(i%2!=0)
					System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("which no.do you want");
String s=sc.next();
Program ob=new Program();
ob.Number(s);

byte a=10,b=20,c;
c=(byte)(a+b);
System.out.println(c);

	}

}
