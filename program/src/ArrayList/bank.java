package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class bank 
{
	int accid;
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public int getAccbal() {
		return accbal;
	}
	public void setAccbal(int accbal) {
		this.accbal = accbal;
	}
	String accname;
	int accbal;
	public static void main(String[] args) 
	{
		bank obj1=new bank();
		
		bank obj2=new bank();
		obj2.setAccbal(2000);
		obj2.setAccid(45);
		obj2.setAccname("raj");
		
		bank obj3=new bank();
		obj3.setAccbal(5600);
		obj3.setAccid(56);
		obj3.setAccname("surya");
		
		obj1.setAccid(112);
		obj1.setAccbal(3000);
		obj1.setAccname("adarsh");
		
		ArrayList<bank> al=new ArrayList();
al.add(obj1);
al.add(obj2);
al.add(obj3);
Object ol=al.get(1);
bank bl=(bank)ol;
System.out.println(bl.getAccbal());
 
Iterator itr=al.iterator();
while(itr.hasNext())
{
	Object o=itr.next();
	bank b=(bank)o;
	System.out.println(b.getAccid()+" "+b.getAccname()+" "+b.getAccbal());
}
	}
	
	

}
