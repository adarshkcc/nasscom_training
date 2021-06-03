public class sample12 {
    public void add(String s1,String s2)
    {
        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        System.out.println(n1+n2);
    }
    public static void main(String[] args)
    {
        sample12 s=new sample12();
        s.add("12","8");


        
    }
}