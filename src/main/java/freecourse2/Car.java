package freecourse2;

public class Car {

    private int position;
    RacingNumber racingNumber ;

    public Car() {
    }

    public void move(RacingNumber racingNumber) {
        if(racingNumber.create() >= 4)
            position ++;
    }

    public int getPosition() {
        return position;
    }
}
