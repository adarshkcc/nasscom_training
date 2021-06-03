import java.util.Scanner;
public class userclient {

	public static void main(String[] args) throws userexception
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int balance=2000;
		System.out.println("enter the pin");
		int pin=sc.nextInt();
		if(pin==1234)
		{
			System.out.println("enter amount");
			int amt=sc.nextInt();
			if(amt>balance)
			{
				throw new userexception();
			}
			else
			{
				System.out.println("cash received:"+(balance-amt));
			}
	
		}
		else
			System.out.println("invalid pin");
	}
	
	

}
