package hotel.restaurant;

import hotel.reservation.Bookable;

public class Table implements Bookable {

    private boolean availability = true;

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public boolean availability() {
        return availability;
    }

    @Override
    public void setAvailable(boolean available) {

    }


    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
