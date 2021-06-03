public class sample10 {                  //multilevel inheritance
public static void main(String[] args)
{
    ravi obj=new raj(); //only super class is accessed i.e displayA and displayB not displayC 
    obj.displayB();

    
}    
}
class rahul
{
    public void displayA()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }
    }
}
class ravi extends rahul
{
    public void displayB()
    {
        for(int i=10;i>=0;i--)
        {
            System.out.println(i);
        }
    }
}
class raj extends ravi
{
    public void displayC()
    {
    for(int i=0;i<10;i++)
    {
        System.out.println(i%2);
    }
}
}