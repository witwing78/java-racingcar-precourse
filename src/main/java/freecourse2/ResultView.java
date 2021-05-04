package freecourse2;

import java.util.Iterator;
import java.util.List;

public class ResultView {

    private static final String RESULT_TITLE = "실행결과";
    private static final String COLON = " : ";
    private static final String HYPHEN = "-";
    private static final String ENTER = "";
    private static final String COMMA = ",";
    private static final String WINNER_MSG = "가 최종우승 했습니다.";

    public ResultView() {
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

    public void printWinners(List<Car> winners){
        int i=0;

        for (Car car : winners) {
            if(i != 0) System.out.print(COMMA);
            System.out.print(car.getName());
            i++;
        }
        System.out.print(WINNER_MSG);
    }
}
