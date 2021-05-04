package freecourse2;

public class CarName {

    private static final int CAR_NAME_MAX_LENGTH = 5;
    private static final String CAR_NAME_LENGTH_CHECK_MSG = "자동차 이름은 5자 이하만 가능합니다.";
    private String name;

    public CarName(String name) {
        if (name.length() > CAR_NAME_MAX_LENGTH) {
            throw new IllegalArgumentException(CAR_NAME_LENGTH_CHECK_MSG);
        }
        this.name = name;
    }

    public String getCarName(){
        return this.name;
    }
}
