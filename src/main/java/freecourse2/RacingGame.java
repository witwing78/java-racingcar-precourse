package freecourse2;

import java.util.List;
import java.util.Scanner;

public class RacingGame {

    public RacingGame() {
        readInput();
    }

    private void readInput() {
        RacingCarInput racingCarInput = new RacingCarInput();
        List<String> carNames = racingCarInput.getCarNames();
        int tryNumbers = racingCarInput.getTryNumbers();
    }

    public void play() {
    }

    public void end() {

    }
}