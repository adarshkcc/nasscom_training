package threads;

class Table
{
	public synchronized void displayTable(int x)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(x+"*"+i+"="+(x*i));
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
	Table t;
	public adarsh(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.displayTable(5);
	}
}
class raj extends Thread
{
	Table t;
	public raj(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.displayTable(10);
	}
}


public class synchronize {

	public static void main(String[] args) {
		
		Table t=new Table();
		adarsh t1=new adarsh(t);
		raj t2 =new raj(t);
		t1.start();
		t2.start();

	}

}
