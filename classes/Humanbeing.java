public class Humanbeing {
    int legs=2;
    int nose=1;
    public void walking()
    {
        
        System.out.println("we can walk");
    }
    public void nose()
    {
        System.out.println("i can smell");
    }
    public static void main(String[] args) {
         Humanbeing adarsh=new Humanbeing();
        for(int i=0;i<10;i++)
        adarsh.walking();
        
}
}