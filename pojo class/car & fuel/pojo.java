public class pojo {
    public static void main(String[] args)
    {
        fuel obj=new fuel();
        obj.setFueltype("petrol");
        obj.setFuelprice(77);

        car bmw=new car();
        bmw.setCarid(1133);
        bmw.setCarmodel("bmw");
        bmw.setF(obj);
        bmw.getDetails();
    }
}