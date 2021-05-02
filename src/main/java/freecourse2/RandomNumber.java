package freecourse2;

import java.util.Random;

public class RandomNumber implements RacingNumber {

    private Random random;

    public RandomNumber() {
        random = new Random();
    }

    @Override
    public int create() {
        return random.nextInt(10);
    }
}
