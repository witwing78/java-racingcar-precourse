package freecourse2;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars;

    public Cars(List<String> carNames) {
        Car car;
        cars = new ArrayList<Car>();
        for (String name: carNames) {
            car = new Car(name);
            cars.add(car);
        }
    }

    public List<Car> getCars(){
        return cars;
    }


}
