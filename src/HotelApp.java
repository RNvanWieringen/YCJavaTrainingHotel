import hotel.Hotel;
import hotel.Room;
import hotel.SleepingRoom;
import hotel.StorageRoom;
import hotel.customer.BusinessCustomer;
import hotel.customer.PrivateCustomer;
import hotel.exception.NoFishInTheTankException;
import hotel.exception.NoRoomException;
import hotel.exception.NoTableException;
import hotel.restaurant.Restaurant;
import hotel.restaurant.Table;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class HotelApp {

    public static void main(String[] args){
        Hotel hilton = new Hotel("Hilton");


        Restaurant hiltonRestaurant = new Restaurant();

        SleepingRoom executiveSuite = new SleepingRoom();
        SleepingRoom normalRoom     = new SleepingRoom();
        SleepingRoom onePersonRoom  = new SleepingRoom();
        StorageRoom  storageRoom    = new StorageRoom(100);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(executiveSuite);
        rooms.add(normalRoom);
        rooms.add(onePersonRoom);
        rooms.add(storageRoom);

        hilton.setRestaurant(hiltonRestaurant);
        hilton.setRooms(rooms);

        ArrayList<Table> tables = new ArrayList<>();
        Table table1 = new Table();
        Table table2 = new Table();
        tables.add(table1);
        tables.add(table2);

        hiltonRestaurant.setTables(tables);

        PrivateCustomer privateCustomer   = new PrivateCustomer("Frits", "frits@bing.com", false);
        BusinessCustomer businessCustomer = new BusinessCustomer("Ben", "ben@bing.com");







        try{
            hilton.bookRoom(privateCustomer, LocalDateTime.of(2018, 9, 7, 20, 0),
                    LocalDateTime.of(2018, 9, 8, 20, 0));

            hilton.bookTable(businessCustomer, hiltonRestaurant,
                    LocalDateTime.of(2018, 9, 7, 19, 0),
                    LocalDateTime.of(2018, 9, 7, 19, 0));

            hiltonRestaurant.orderOneFish();

        }catch (NoTableException e){
            e.printStackTrace();

        }catch(NoFishInTheTankException n){
            n.printStackTrace();

        }catch(NoRoomException r){
            r.printStackTrace();

        }

        System.out.println(hilton.getBookings());
        System.out.println(hilton.getRestaurant().getBookedTables());








    }
}
