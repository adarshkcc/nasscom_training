public class marks 
{
    public static void main(String[] arg)
    {
        Rahul a=new Rahul();
        a.calculatePercentage(100,a.getMarks());
    }
    
}
abstract class student
{
    public void calculatePercentage(int total,int marks)
    {
        double res=((marks*100)/100);
        System.out.println(res);
    }
public abstract int getMarks();
}
class Adarsh extends student
{
    public int getMarks()
    {
        return 80;
    }
}
class Rahul extends student
{
    public int getMarks()
    {
        return 70;
    }
}
class Ravi extends student
{
    public int getMarks()
    {
        return 75;
    }
}
