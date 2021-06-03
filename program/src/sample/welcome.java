package sample;
import java.util.Scanner;
public class welcome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		x=sc.nextInt();

		welcome ob=new welcome();
		ob.display("welcome", x);
	}
	public void display(String s,int n)
	{
		System.out.print(s.substring(0,n-1));
		for(int i=0;i<n;i++)
		{
			System.out.print(s.substring(n-1));
		}


	}

}
