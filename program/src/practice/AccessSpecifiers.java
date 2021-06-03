package practice;

public class AccessSpecifiers 
{
public int amt11=30;     //we can access public Specifiers in any class
public int amt21=50;

private int a=40;       //we cannot access private Specifiers in another class
private int b=70;       // to access private Specifiers in another class we should use getters and setters method

public int calculate()
{

	int  total=amt11+amt21;
	return total;
}

public int Total()
{
	int total=a+b;
	return total;
}
	public static void main(String[] args) 
	{
		AccessSpecifiers obj=new AccessSpecifiers();
//		System.out.println(obj);
		obj.amt11=30;
		obj.amt21=70;
		System.out.println(obj.calculate());
		
		obj.a=60;
		obj.b=90;
		
		System.out.println(obj.Total());
		
 

	}

}
