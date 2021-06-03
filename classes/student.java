public class student {
    int stid;
    String stname;
    int m1,m2,m3,total;
    public student(int sno,String name,int m1,int m2,int m3)
    {
        stid=sno;
        stname=name;
        total=m1+m2+m3;
    }
    public int getStid()
    {
        return stid;
    }
    public String getStname()
    {
        return stname;
    }
    public int getTotal()
    {
        return total;
    }
    public static void main(String[] args)
{
    student s=new student(112,"Adarsh",78,79,80);
    System.out.println(s.getStid());
    System.out.println(s.getStname());
    System.out.println(s.getTotal());
}    
}