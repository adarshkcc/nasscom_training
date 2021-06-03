package sample;

public class password {

	public static void main(String[] args) 
	{
		String user=new String("surya");
		String pwd=new String("ayrus");
		StringBuffer sb=new StringBuffer(pwd);
		
		if(user.equals(sb.reverse().toString()))
			System.out.println("login success");
		else
			System.out.println("login failed");
		

	}

}
