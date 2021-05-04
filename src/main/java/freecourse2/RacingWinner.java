package freecourse2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RacingWinner {

    private Cars cars;
    private List<Car> winners = new ArrayList<>();

    public RacingWinner(Cars cars) {
        this.cars = cars;
    }

    public void checkRacingWinners() {
        List<Car> sortedCars = cars.getCars().stream()
                                    .sorted(Comparator.comparing(Car::getPosition).reversed())
                                    .collect(Collectors.toList());

        winners = sortedCars.stream()
                            .filter(car -> car.getPosition() == sortedCars.get(0).getPosition())
                            .collect(Collectors.toList());
    }

    public List<Car> getRacingWinners() {
        return winners;
    }
}
