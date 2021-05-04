package freecourse2;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cars {

    private List<Car> cars;

    public Cars(List<String> carNames) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        cars = Stream.generate(() -> new Car(carNames.get(atomicInteger.getAndIncrement())))
                     .limit(carNames.size())
                     .collect(Collectors.toList());
    }

    public List<Car> getCars(){
        return cars;
    }

    public void move() {
        for (Car car: cars) {
            car.move();
        }
    }

}
