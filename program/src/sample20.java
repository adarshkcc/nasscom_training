
public class sample20  extends Thread   //light weight component which performs unit of work
{

	public void run()
	{
		for(int i=0;i<=10;i++)
			System.out.println(i+"   "+currentThread().currentThread().getName());
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		sample20 obj=new sample20();
		System.out.println(obj.getName());
		System.out.println(obj.getId());
		System.out.println(obj.getState());
		System.out.println(obj.isAlive());
		System.out.println(obj.getPriority());
	
		obj.setName("adarsh thread");
		System.out.println(obj.getName());
		
		obj.setPriority(8);
		System.out.println(obj.getPriority());
		
		
		System.out.println(obj.isAlive());
		
		obj.start();    // it will call predefined run method 
		
//		try {
//			obj.join();
//			
//		}
//		catch(InterruptedException e)
//		{
//			e.printStackTrace();
//		}
		
		System.out.println(obj.isAlive());
		System.out.println(obj.getState());
		
		sample20 o=new sample20();
		o.setName("raj ");
		o.start();
		o.start();
		o.start();
		o.start();
		
	}

}
