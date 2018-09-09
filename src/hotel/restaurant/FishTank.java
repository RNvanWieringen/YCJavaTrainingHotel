package hotel.restaurant;

import hotel.exception.NoFishInTheTankException;

public class FishTank {
    private int amountOfFishes;

    public FishTank(int amountOfFishes){
        if(amountOfFishes < 0){
            throw new IllegalArgumentException("Amount of Fish must be at least 0!");
        }
        this.amountOfFishes = amountOfFishes;
    }

    public void takeFish() throws NoFishInTheTankException{
        System.out.println(amountOfFishes);
        if(amountOfFishes > 0){
            amountOfFishes--;
        }else{
            throw new NoFishInTheTankException();
        }

    }

    public int getAmountOfFishes() {
        return amountOfFishes;
    }

    public void setAmountOfFishes(int amountOfFishes) {
        if(amountOfFishes < 0){
            throw new IllegalArgumentException("Amount of Fish must be at least 0!");
        }else{
            this.amountOfFishes = amountOfFishes;
        }
    }
}
