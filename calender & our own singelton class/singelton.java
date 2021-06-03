public class singelton
 {                                                  //we can create our own singleton class
  
    private static singelton single=null;
    private singelton()
     {   
        }
    
        public static singelton getInstance() // in this object is created created because whenever we have private constructor we cannot use new keyword at the time of object creation


        {
            if(single==null)
            single=new singelton();
            
            return single;
        }
        public void display()
        {
            System.out.println("raj");
        }
        public static void main(String[] arg)
        {
            singelton.getInstance().display();
        }
    
}