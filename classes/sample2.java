public class sample2 {
    int x;
    public sample2()       //constructor :- it has same name as class name, it is used to initialize an object,it has no void.
    {
        x=50;
        System.out.println(x);
    }
    public static void main(String[] args)
    {
        sample2 obj=new sample2();
       // System.out.println(obj.x);
    }
}