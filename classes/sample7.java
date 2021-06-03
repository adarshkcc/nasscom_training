public class sample7 {
    private int getNatural(int x)
    {
        int s=0;
        for(int i=1;i<10;i++)
        {
         s=s+i;
    }
    return s;
    
}
public void getTable()
{
    int res=this.getNatural(10);  //to access private method in public method we use this keyword
    for(int i=1;i<10;i++)
    {
        System.out.println(res*i);
    }
}
}