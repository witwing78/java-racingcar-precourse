package freecourse2;

public class Car {

    private int position;
    private String name;
    RacingNumber racingNumber ;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public void move(RacingNumber racingNumber) {
        if(racingNumber.create() >= 4)
            position ++;
    }

    public int getPosition() {
        return position;
    }
}
