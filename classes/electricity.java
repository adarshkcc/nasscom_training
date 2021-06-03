abstract class electricity1 
{
    public void calculatebill(int prev,int pres,int unitprice)
    {
        int units=pres-prev;
        System.out.println("total bill="+(units*unitprice));
    }
    public abstract int getUnitprice();// a method withot a body, it cannot be private,cannot create object for abstract class,it cannot be made final
    
}
class agriculture extends electricity1
{
    public int getUnitprice()
    {
        return 2;
    }
}
class residential extends electricity1
{
    public int getUnitprice()
    {
        return 5;
    }
}
public class electricity
{
    public static void main(String[] args)
    {
agriculture ob=new agriculture();
ob.calculatebill(1500,1600,ob.getUnitprice());
    }
}