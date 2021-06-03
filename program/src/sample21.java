class addition
{
	public synchronized void add(int x)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(x+" "+(x+i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}
}
class adarsh extends Thread
{
	addition a;
	public adarsh(addition a)
	{
		this.a=a;
	}
	public void run()
	{
		a.add(10);
	}
}
class Raju extends Thread
{
	addition a;
	public Raju(addition a)
	{
		this.a=a;
	}

	public void run()
	{
		a.add(5);
	}
}

public class sample21 
{


	public static void main(String[] args) 
	{

		addition a=new addition();
		Raju o=new Raju(a);
		o.start();
		adarsh o1=new adarsh(a);
		o1.start();
	}

}
