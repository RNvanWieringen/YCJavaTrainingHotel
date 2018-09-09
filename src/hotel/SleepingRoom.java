package hotel;

import hotel.reservation.Bookable;

public class SleepingRoom extends Room implements Bookable {

    public static final int amountOfPeople = 2;
    public static final int beds = 2;
    public static int roomPrice = 100;
    private boolean available = true;



    @Override
    public int getPrice() {
        return roomPrice;
    }

    @Override
    public boolean availability() {
        return available;
    }


    @Override
    public void setAvailable(boolean available){
        this.available = available;
    }
}
