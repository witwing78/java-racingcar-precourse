package freecourse2;

public class Car {

    private int position;
    private String name;
    private static final int MOVE_NUMBER = 4;
    private RacingNumber racingNumber ;

    public Car() {
    }

    public Car(String name) {
        this.name = new CarName(name.trim()).getCarName();
    }

    public void move(RacingNumber racingNumber) {
        if(racingNumber.create() >= MOVE_NUMBER)
            position ++;
    }

    public void move() {
        if(racingNumber == null) {
            racingNumber = new RandomNumber();
        }
        move(racingNumber);
    }

    public String getName(){
        return name;
    }
    public int getPosition() {
        return position;
    }
    public boolean isPositionZero(){
        return (getPosition() > 0);
    }

    public void setRacingNumber(RacingNumber racingNumber) {
        this.racingNumber = racingNumber;
    }

}
