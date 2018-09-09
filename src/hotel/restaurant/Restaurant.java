package hotel.restaurant;

import hotel.customer.Customer;
import hotel.exception.NoFishInTheTankException;
import hotel.exception.NoTableException;
import hotel.reservation.Bookable;
import hotel.reservation.Booking;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Restaurant {

    private ArrayList<Booking> bookedTables = new ArrayList<>();
    private ArrayList<Table> tables = new ArrayList<>();

    private FishTank fishTank = new FishTank(10);

    public void bookTable(Customer customer, Restaurant restaurant, LocalDateTime checkinDate, LocalDateTime time) throws NoTableException{
        Bookable availableTable = null;
        ArrayList<Table> tables = restaurant.getTables();
        for(Table table : tables){
            if(table.availability()){
                availableTable = table;
                break;
            }
        }
        if(availableTable != null){
            Booking bookingTable = new Booking(customer, checkinDate, time, availableTable);
            bookedTables.add(bookingTable);
            System.out.println("Table is booked");
        }else{
            throw new NoTableException();
        }
    }


    public boolean orderOneFish() throws NoFishInTheTankException {
            fishTank.takeFish();
            return true;
    }

    public ArrayList<Booking> getBookedTables() {
        return bookedTables;
    }

    public void setBookedTables(ArrayList<Booking> bookedTables) {
        this.bookedTables = bookedTables;
    }

    public ArrayList<Table> getTables() {
        return tables;
    }

    public void setTables(ArrayList<Table> tables) {
        this.tables = tables;
    }
}
