import freecourse2.Car;
import freecourse2.RacingNumber;
import freecourse2.RandomNumber;
import freecourse2.TestNumber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.assertj.core.api.Assertions.assertThat;


public class CarTest {

    RacingNumber racingNumber;
    Car car;

    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @Test
    @DisplayName("4이상이면 1씩 증가, 3이하면 0 리턴")
    void moveTest() {

        racingNumber = new TestNumber(3);
        car.move(racingNumber);
        assertThat(car.getPosition()).isEqualTo(0);

        racingNumber = new TestNumber(4);
        car.move(racingNumber);
        assertThat(car.getPosition()).isEqualTo(1);

        racingNumber = new TestNumber(5);
        car.move(racingNumber);
        assertThat(car.getPosition()).isEqualTo(2);

    }

}
