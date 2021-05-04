package freecourse2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {

    private Cars cars;
    private int tryNumbers;

    public RacingGame() {
        readInput();
    }

    public RacingGame(Cars cars, int tryNumbers){
        this.cars = cars;
        this.tryNumbers = tryNumbers;
    }

    private void readInput() {
        RacingCarInput racingCarInput = new RacingCarInput();
        cars = new Cars(racingCarInput.getCarNames());
        tryNumbers = racingCarInput.getTryNumbers();
    }

    public void play() {
        RacingCarOutput racingCarOutput = new RacingCarOutput();
        racingCarOutput.printResultTitle();
        for (int i=0 ; i<tryNumbers; i++) {
            cars.move();
            racingCarOutput.printRacingResult(cars);
        }
    }
    public void end() {
    }

}
