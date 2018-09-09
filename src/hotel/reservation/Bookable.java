package hotel.reservation;


public interface Bookable {

    public int getPrice();
    public boolean availability();


    void setAvailable(boolean available);
}
