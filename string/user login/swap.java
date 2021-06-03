public class swap 
{
    public static void main(String[] args)
    {
    String s= "SUrYaNarayan";
    String uppercase="";
    String lowercase="";

    // to print uppercase in right and lowercase in left
    for(int i=0;i<s.length();i++)                   
    {
        if(s.charAt(i)>=65 && s.charAt(i)<=90)
        {
            uppercase=uppercase+s.charAt(i);
        }
        else
        lowercase=lowercase+s.charAt(i);    
    
}
System.out.println(lowercase+uppercase);

// to swap every 2nd character if length of string is even
if(s.length()%2==0)
{
    String swap="";
for(int i=0;i<s.length();i=i+2)
{
    
    swap=swap+s.charAt(i+1);
    swap=swap+s.charAt(i);
    
}
System.out.println(swap);
}
    }
}