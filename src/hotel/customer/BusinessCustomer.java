package hotel.customer;

public class BusinessCustomer extends Customer{
    private int amountOfDeductableTax;

    public BusinessCustomer(String name, String email){
        super(name, email);
    }


    public int getAmountOfDeductableTax() {
        return amountOfDeductableTax;
    }

    public void setAmountOfDeductableTax(int amountOfDeductableTax) {
        this.amountOfDeductableTax = amountOfDeductableTax;
    }
}
