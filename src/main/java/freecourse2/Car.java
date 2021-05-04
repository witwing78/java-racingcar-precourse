package freecourse2;

public class Car {

    private int position;
    private String name;
    private static final String CAR_NAME_LENGTH_CHECK_MSG = "자동차 이름은 5자 이하만 가능합니다.";
    private static final int CAR_NAME_MAX_LENGTH = 5;
    private static final int MOVE_NUMBER = 4;
    private RacingNumber racingNumber ;

    public Car() {
    }

    public Car(String name) {
        validateName(name);
        this.name = name.trim();
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
    public boolean isCarNameSize(String carName){
        return (carName.length() > CAR_NAME_MAX_LENGTH);
    }
    public void setRacingNumber(RacingNumber racingNumber) {
        this.racingNumber = racingNumber;
    }

    public void validateName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(CAR_NAME_LENGTH_CHECK_MSG);
        }
    }


}
