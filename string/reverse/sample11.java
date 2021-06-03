public class sample11 {
    public static void main(String[] args)
    {
        Integer obj=new Integer(100);
        System.out.println(obj.intValue());
        Float f=new Float(4.49);
        System.out.println(f.floatValue());
        

        String str=new String("welcome to java world");
        
        System.out.println(str.equalsIgnoreCase("Welcome to java world"));
        System.out.println(String.valueOf(100));
        System.out.println(String.valueOf(4.5f));
        System.out.println(str.substring(8));
        String arr[]=str.split(" ");
        for(String s:arr)
        {
            System.out.println(s);
        }
        char brr[]=str.toCharArray();   //it will convert string to character array
        for(char ch:brr)
        System.out.println(ch);

        // to reverse a string and to chek string is palindrome



        char ch[]=new char[str.length()];
        int i=0;
        
        for(int l=str.length()-1;l>=0;l--)           //reverse order
        {
        System.out.print(str.charAt(l));
         
         ch[i]=str.charAt(l);
         i++;
         
        }
      //  String s=new String(ch);        //it will convert character array to string
        
        
    if(str.equals(ch))                          // to check palindrome or not
    {
        System.out.println("");
    System.out.println("palindrome ");
    }
    else
    {
        System.out.println("");
    System.out.println("not palindrome");
    
    }
}
    
}