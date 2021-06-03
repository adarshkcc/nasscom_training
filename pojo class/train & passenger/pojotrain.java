public class pojotrain {
    public static void main(String[] args)
    {
        passenger obj=new passenger();
        obj.setPassengerName("adarsh");
        obj.setPassengerTicket("yes");
        obj.setPassengerDestination("varanasi");

        train t=new train();
        t.setTrainId(11231);
        t.setTrainName("kashi vishwanath express");
        t.setTicketFare(50);
        t.setP(obj);
        t.getDetails();
    }
    
}