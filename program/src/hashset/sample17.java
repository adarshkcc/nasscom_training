package hashset;
import java.util.*;
public class sample17 {

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();  // hashset dont have index concept
		// hashset function are add,isEmpty,contains,clear,remove,iterator
		hs.add(100);
		hs.add("Adarsh");
		hs.add("Surya");
		hs.add(true);
		hs.add(false);
		hs.add(4.9f);
		hs.add("56");
		hs.add(100);
		System.out.println(hs);


		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}
		System.out.println(" ");
		LinkedHashSet lhs=new LinkedHashSet();

		lhs.add(100);
		lhs.add("Adarsh");
		lhs.add("Surya");
		lhs.add(true);
		lhs.add(false);
		lhs.add(4.9f);
		lhs.add("56");
		lhs.add(100);

		System.out.println("linked hashset");
		System.out.println(lhs);


		Iterator it=lhs.iterator();
		while(it.hasNext())
		{
			Object o=it.next();
			System.out.println(o);

		}

		TreeSet ts=new TreeSet();  //treeSet contains homogeneous element. linked/hashset/treeset does not contain duplicate element
		ts.add(100);               //treeset set follow ascending order.
		ts.add(100);
		ts.add(34);
		ts.add(67);
		ts.add(67);
		ts.add(4);
		ts.add(56);

		System.out.println();
		System.out.println("treeSet");

		System.out.println(ts);

		Iterator its=ts.iterator();

		while(its.hasNext())
		{
			Object o=its.next();
			System.out.println(o);
		}
	}

}
