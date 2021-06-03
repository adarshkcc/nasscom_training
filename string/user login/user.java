public class user 
{
    public static void main(String[] arg)
    {
        String user=new String("WEL@surya1");
        String pwd=new String("hello");
        String cpwd=new String("hello");

        int i=0;
        if(pwd.equals(cpwd))
        {
        i++;
        
         if(user.length()>5)
        {
        i++;
        
        }
         if(user.contains("@"))
        {
        i++;
        }
         if(user.startsWith("WEL"))
        {
        i++;
        }
        char ch[]=user.toCharArray();   // it will convert string to chracter array
        for(char c:ch)
        {
            if(c>=48 && c<=57)         // ASCII range for digit
        
            i++;
        }
    }
    
if(i==5)
System.out.println("login success");
else
System.out.println("login failed");
    }
    
}