public class sample1 {
    public static void main(String[] args) {
        
    
    Humanbeing brr[]=new Humanbeing[20];   // want to create 20 object
    for(int i=0;i<brr.length;i++)
    {
        brr[i]=new Humanbeing();   //object creation for each index
        brr[i].walking();        //calling object for each index
    }
}
}