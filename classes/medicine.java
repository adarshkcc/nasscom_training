public class medicine 
{
    int id;
    String name;
    int price;
    String disease;
    public medicine(int x,String y,int z,String t)
    {
        id=x;
        name=y;
        price=z;
        disease=t;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getPrice()
    {
        return price;
    }
    public String getDisease()
    {
        return disease;
    }
    public static void getIdByDisease(medicine b[])   //s is fever disease           public int[] getIdbyDisease(String s)
                                                                               //
    {
        for(int i=0;i<b.length;i++)
        {
            if(b[i].getDisease()=="fever")
            {
                System.out.println(b[i].getId());
            }
        }
        
    }   
            
        

    
    public static void main(String[] args)
    {
        medicine m1=new medicine(101,"paracetamol",5,"fever");
        
        medicine m2=new medicine(102,"paracetamol",5,"cold");
        
        medicine m3=new medicine(103,"paracetamol",5,"fever");
        
        medicine m4=new medicine(104,"paracetamol",5,"pain");
        medicine a[]=new medicine[4];
        a[0]=m1;
        a[1]=m2;
        a[2]=m3;
        a[3]=m4;
        medicine.getIdByDisease(a);
    }
}