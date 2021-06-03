public class sample {
    public void get(Humanbeing x)
    {
        System.out.println(x);    //it will print memory location
        x.walking();             //calling the methods of humanbeing class
        
    }
    public static void main(String[] args)
    {
        sample ob=new sample();
        ob.get(new Humanbeing());
    }
    
}