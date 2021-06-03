public class sample9 {
    public static void main(String[] args)
    {
        son t=new son();
        t.buildhouse();
    }
}
class father        //super class
{
    int f=10;
}
class son extends father //sub class
{
    int sp=5;
    public void buildhouse()
    {
    System.out.println(f+sp);
}
}