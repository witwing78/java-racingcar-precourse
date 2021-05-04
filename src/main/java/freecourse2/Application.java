package freecourse2;

public class Application {

    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        racingGame.readInput();
        racingGame.play();
        racingGame.end();
    }

}
