import java.util.Scanner;
public class account 
{
    int id;
    String accname;
    int accbal;
    
    public  account(int x,String y,int z)
    {
        
        id=x;
        accname=y;
        accbal=z;
        
        
    }
    public int getId()
    {
        return id;
    }
    public String getAccname()
    {
        return accname;
    }
    public int getAccbal()
{
return accbal;
}
public static void getBalanceRange(account b[],int ran)
{
for(int i=0;i<b.length;i++)
{
    if(b[i].getAccbal()<ran)
    {
        System.out.print(b[i].getId() +" ");
        System.out.print(b[i].getAccname() +" ");
        System.out.print(b[i].getAccbal() +" ");
        System.out.println("");
    }
}
}
    
    public static void main(String[] args)
    {
String k="yes";

Scanner sc=new Scanner(System.in);
int i=0;
account arr[]=new account[4];
while(k.charAt(0)=='y')
{
    System.out.println("enter the id");
    int id=sc.nextInt();
    System.out.println("enter the name");
    String nm=sc.next();
    System.out.println("enter the balance");
    int bal=sc.nextInt();
    account detail=new account(id,nm,bal);
arr[i]=detail;
i++;
    System.out.println("do you want to continue");
     k=sc.next();
if(k.charAt(0)!='y')
{

    
System.out.println("enter salary range");
int r=sc.nextInt();

account.getBalanceRange(arr,r);
}
}
}


    }
