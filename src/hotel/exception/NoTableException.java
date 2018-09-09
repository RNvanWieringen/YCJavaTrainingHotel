package hotel.exception;

public class NoTableException extends Exception {
    public NoTableException(){
        super("No tables available!!!");
    }

}
