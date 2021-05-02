package freecourse2;

public class TestNumber implements RacingNumber {

    private int randomNumber;

    public TestNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    @Override
    public int create() {
        return this.randomNumber;
    }
}
