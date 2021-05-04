package freecourse2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    @Test
    @DisplayName("우승자 구하기 테스트")
    public void getWinnersTest(){

        //이름 , 랜덤 이동 횟수
        List<String> carNames = Arrays.asList("car1","car2","car3");
        Cars cars = new Cars(carNames);

        //랜덤 이동 횟수 : i= 0,1,2 => 3,4,5
        for (int i = 0; i < carNames.size(); i++) {
            cars.getCars().get(i).setRacingNumber(new TestNumber(i+3));
        }

        RacingGame racingGame = new RacingGame(cars,3);
        racingGame.play();

        ArrayList<String> winnerCarsName = new ArrayList<>();
        RacingWinner racingWinner = new RacingWinner(cars);
        racingWinner.checkRacingWinners();

        for (Car car: racingWinner.getRacingWinners()) {
            winnerCarsName.add(car.getName());
        }

        assertThat(winnerCarsName).contains("car2");
        assertThat(winnerCarsName).contains("car3");

    }

}