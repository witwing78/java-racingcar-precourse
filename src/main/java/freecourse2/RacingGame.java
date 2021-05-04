package freecourse2;

import java.util.List;

public class RacingGame {

    private Cars cars;
    private int tryNumbers;
    private ResultView resultView;

    public RacingGame() {
    }

    public RacingGame(Cars cars, int tryNumbers){
        this.cars = cars;
        this.tryNumbers = tryNumbers;
    }

    public void readInput() {
        InputView inputView = new InputView();
        cars = new Cars(inputView.getCarNames());
        tryNumbers = inputView.getTryNumbers();
    }

    public void play() {
        resultView = new ResultView();
        resultView.printResultTitle();
        for (int i=0 ; i<tryNumbers; i++) {
            cars.move();
            resultView.printRacingResult(cars);
        }
    }

    public void end() {
        RacingWinner racingWinner = new RacingWinner(cars);
        racingWinner.checkRacingWinners();
        List<Car> winners = racingWinner.getRacingWinners();
        resultView.printWinners(winners);
    }

}
