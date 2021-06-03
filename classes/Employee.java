public class Employee 
{
    
    public void EmployeeDetails(int empId,String empNm,int empSal)
    {
        System.out.print( empId );
        System.out.print(" "+empNm );
        System.out.print(" "+empSal );
        System.out.println();
    }
    public static void main(String[] details)
    {
        Employee emp1=new Employee();
        emp1.EmployeeDetails(12,"Adarsh",1000000);
        Employee emp2=new Employee();
        emp2.EmployeeDetails(13,"RAj",50000);
        Employee emp3=new Employee();
        emp3.EmployeeDetails(14,"rahul",25000);
        Employee emp4=new Employee();
        emp4.EmployeeDetails(15,"Rajnish",100000);
        Employee emp5=new Employee();
        emp5.EmployeeDetails(16,"Ravi",100000);
    }
    
}