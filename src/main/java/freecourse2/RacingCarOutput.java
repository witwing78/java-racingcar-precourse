package freecourse2;

public class RacingCarOutput {

    private static final String RESULT_TITLE = "실행결과";
    private static final String COLON = " : ";
    private static final String HYPHEN = "-";
    private static final String ENTER = "";
    private static final String CAR_NAME_LENGTH_CHECK_MSG = "자동차 이름은 5자 이하만 가능합니다.";

    public RacingCarOutput() {
    }

    public void printResultTitle() {
        System.out.println(ENTER);
        System.out.println(RESULT_TITLE);
    }

    public void printRacingResult(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.print(car.getName() + COLON);
            printMoveCount(car);
            System.out.println(ENTER);
        }
        System.out.println(ENTER);
    }

    public void printMoveCount(Car car) {
        if (car.isPositionZero()) {
            for (int i = 0; i < car.getPosition(); i++) {
                System.out.print(HYPHEN);
            }
        }
    }


}
