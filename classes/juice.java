public class juice
{
    public void preparejuice()                            //static polymorphism-compile time polymorphism;
    {
        System.out.println("apple");
    }
    public void preparejuice(String fruit)
    {
        System.out.println(fruit);
    }
    public static void main(String[] args)
    {
        new juice().preparejuice();
        new juice().preparejuice("mango");
    }
}