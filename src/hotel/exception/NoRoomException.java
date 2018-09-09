package hotel.exception;

public class NoRoomException extends Exception {

    public NoRoomException(){
        super("No rooms available!!!");
    }
}
