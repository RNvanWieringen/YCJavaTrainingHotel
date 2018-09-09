package hotel;

import hotel.customer.Customer;
import hotel.exception.NoRoomException;
import hotel.exception.NoTableException;
import hotel.reservation.Bookable;
import hotel.reservation.Booking;
import hotel.restaurant.Restaurant;
import hotel.restaurant.Table;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Hotel {

    private String name;
    private Restaurant restaurant;
    private ArrayList<Room> rooms;
    private ArrayList<Booking> bookings = new ArrayList<>();

    public Hotel(String hotelName){
        this.name = hotelName;
    }




    public void bookRoom(Customer customer, LocalDateTime checkinDate, LocalDateTime checkoutDate) throws NoRoomException{
        Bookable availableRoom = null;
        for(Room room : rooms) {
            if(room instanceof SleepingRoom && ((SleepingRoom)room).availability()) {
                availableRoom = (Bookable)room;
                break;
            }
        }

        if(availableRoom != null) {
            Booking booking = new Booking(customer, checkinDate, checkoutDate, availableRoom);
            availableRoom.setAvailable(false);
            bookings.add(booking);
            System.out.println("Sleepingroom is booked.");
        } else {
            throw new NoRoomException();
//            try{
//                throw new NoRoomException();
//            } catch (Exception e){
//                  e.printStackTrace();
//            }
        }
    }

    public void bookTable(Customer customer, Restaurant restaurant, LocalDateTime checkinDate, LocalDateTime time) throws NoTableException{
        restaurant.bookTable(customer, restaurant, checkinDate, time);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

}
