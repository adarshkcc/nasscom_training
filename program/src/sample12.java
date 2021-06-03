
public class sample12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=new String("Adarsh@1");
for(int i=0;i<s.length();i++)
{
	if(!Character.isLetterOrDigit(s.charAt(i)))            // always use character class instead of ASCII value
	{
		System.out.println(s.charAt(i));                  // Character.isLetter(s.charAt(i)),Character.isDigit(s.charAt(i);character.isLetterOrDigit()
	}
}
	}

}
