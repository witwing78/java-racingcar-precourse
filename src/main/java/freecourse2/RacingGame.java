package freecourse2;

public class RacingGame {

    private Cars cars;
    private int tryNumbers;

    public RacingGame() {
        readInput();
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
