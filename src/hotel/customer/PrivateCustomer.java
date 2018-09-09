package hotel.customer;

public class PrivateCustomer extends Customer {
    private boolean travelingWithChildren;


    public PrivateCustomer(String name, String email, boolean travelingWithChildren){
        super(name, email);
        this.travelingWithChildren = travelingWithChildren;
    }


}
