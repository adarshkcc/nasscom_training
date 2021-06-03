public class car {
    int carid;
    String carmodel;
    fuel f;
    public int getCarid()
    {
        return carid;
    }
    public void setCarid(int carid)
    {
        this.carid=carid;
    }
    public String getCarmodel()
    {
        return carmodel;
    }
    public void setCarmodel(String carmodel)
    {
        this.carmodel=carmodel;
    }
    public fuel getF()
    {
        return f;
    }
    public void setF(fuel f)
    {
        this.f=f;
    }
    public void getDetails()
        {
            System.out.println(this.carid+" "+this.carmodel+" "+ f.getFueltype()+" "+f.getFuelprice());
        }
    
    
}