package hotel.reservation;

import hotel.Room;
import hotel.customer.Customer;

import java.time.LocalDateTime;
import java.util.Collections;

public class Booking {

    private Customer customer;
    private LocalDateTime checkin;
    private LocalDateTime checkout;
    private Bookable bookable;


    public Booking(Customer customer, LocalDateTime checkin, LocalDateTime checkout, Bookable bookable){
        this.customer = customer;
        this.checkin  = checkin;
        this.checkout = checkout;
        this.bookable = bookable;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDateTime checkin) {
        this.checkin = checkin;
    }

    public LocalDateTime getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDateTime checkout) {
        this.checkout = checkout;
    }

    public Bookable getBookable() {
        return bookable;
    }

    public void setBookable(Bookable bookable) {
        this.bookable = bookable;
    }


    @Override
    public String toString(){
        return "Customer: " + customer.getName() + " made a booking from: " + checkin + " until " + checkout;
    }
}
