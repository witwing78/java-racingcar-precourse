package freecourse2;

public class Car {

    private int position;
    private String name;
    RacingNumber racingNumber ;

    public Car() {
    }

    public Car(String name) {
        this.name = name.trim();
    }

    public void move(RacingNumber racingNumber) {
        if(racingNumber.create() >= 4)
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
    public boolean isCarNameSize(String carName){
        return (carName.length() > 5);
    }
    public void setRacingNumber(RacingNumber racingNumber) {
        this.racingNumber = racingNumber;
    }
}
