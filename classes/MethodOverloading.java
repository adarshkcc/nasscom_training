public class MethodOverloading
 {

    public void details(int age)
    {
        System.out.println(age);
    }
    public void details(String name)
    {
        System.out.println(name);
    }
    public void details()
    {
        System.out.println("India");
    }
    public static void main(String[] args)
    {
        MethodOverloading s=new MethodOverloading();
        s.details();
        s.details("Adarsh");
        s.details(21);
    }
 }
