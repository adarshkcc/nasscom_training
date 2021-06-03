package ArrayList;
import java.util.*;

public class sample18 {

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
 
Iterator itr=al.iterator();
while(itr.hasNext())
{
	Object o=itr.next();
	bank b=(bank)o;
	System.out.println(b.getAccid()+" "+b.getAccname()+" "+b.getAccbal());
}
	}

}
