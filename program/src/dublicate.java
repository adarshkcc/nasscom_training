
public class dublicate {
	public void getDublicate(String s)
	{
		char c;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.indexOf(s.charAt(i),i+1)!=-1)
			{
				if(s.indexOf(s.charAt(i))<i) continue;
				System.out.println(s.charAt(i));
			}
//			c=s.charAt(i);
//			for(int j=i+1;j<s.length()-1;j++)
//			{
//				if(c==s.charAt(j))
//				{
//					System.out.println(c);
//					break;
//				}
//			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dublicate ob=new dublicate();
		ob.getDublicate("suryanarayana");

	}

}
