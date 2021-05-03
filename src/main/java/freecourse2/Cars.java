package freecourse2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cars {

    private List<Car> cars;
    private Car car;


    public Cars(List<String> carNames) {

        cars = new ArrayList<Car>();
        for (String name: carNames) {
            car = new Car(name.trim());
            cars.add(car);
        }

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
