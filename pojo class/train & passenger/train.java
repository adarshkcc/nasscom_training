public class train {
    int trainid;
    String trainname;
    int ticketfare;
passenger p;
    public int getTrainId()
    {
        return trainid;
    }
    public void setTrainId(int trainid)
    {
        this.trainid=trainid;
    }
    public String TrainName()
    {
        return trainname;
    }
    public void setTrainName(String trainname)
    {
        this.trainname=trainname;
    }
    public int getTicketFare()
    {
        return ticketfare;
    }
    public void setTicketFare(int ticketfare)
    {
        this.ticketfare=ticketfare;
    }
    public passenger getP()
    {
        return p;
    }
    public void setP(passenger p)
    {
        this.p=p;
    }
    public void getDetails()
    {
        System.out.println(this.trainid+" "+this.trainname+" "+this.ticketfare+" "+p.getPassengerName()+" "+p.getPassengerDestination()+" "+p.getPassengerTicket());
    }
    
}