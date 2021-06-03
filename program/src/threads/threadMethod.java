package threads;

public class threadMethod extends Thread
{
	public void Raj()
	{
		for(int i=0;i<=10;i++)
		System.out.println(i);
		
		try {
			Thread.sleep(1000);
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public void run()
	{
		this.Raj();
	}

	public static void main(String[] args) 
	{
		threadMethod o=new threadMethod();
		System.out.println(o.getName());
		System.out.println(o.getId());
		System.out.println(o.getName());
		System.out.println(o.getState());
		System.out.println(o.isAlive());
		System.out.println(o.getPriority());

		o.setName("adarsh");
		o.setPriority(3);

		System.out.println(o.getName());
		System.out.println(o.getPriority());

		o.start();
		System.out.println(o.isAlive());
		try {
			o.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		threadMethod o1=new threadMethod();
		o1.start();
		

	}

}
