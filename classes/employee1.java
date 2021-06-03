public class employee1 {
    int id;
    String name;
    int sal;
    public employee1(int p,String q,int r)
    {
        id=p;
        name=q;
        sal=r;
    }
    
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;

    }
    public int getSal()
    {
        return sal;
    }
    public static void details(employee1 brr[])  // details() is a static method which can be accessed using class name
    {
        for(int i=0;i<brr.length;i++)
        {
            System.out.print(brr[i].getId());
            System.out.print(" "+brr[i].getName());
            System.out.print(" "+brr[i].getSal());
            System.out.println("");
        }
    }
        public static void main(String[] args)
        {
            employee1 e1=new employee1(12,"adarsh",2000000);
            employee1 e2=new employee1(19,"adarsh",2000000);
            employee1 e3=new employee1(16,"adarsh",2000000);
            employee1 arr[]=new employee1[3];
            arr[0]=e1;
            arr[1]=e2;
            arr[2]=e3;
employee1.details(arr);                     //static method can be accessed using class name
        }
    }
    
