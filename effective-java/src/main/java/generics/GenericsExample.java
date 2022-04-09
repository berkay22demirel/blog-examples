package generics;

import java.util.ArrayList;
import java.util.List;

class Vehicle extends Object {
}

class Car extends Vehicle {
}

class SportCar extends Car {
}

public class GenericsExample {

    public static void main(String[] args) {
        List<? extends Vehicle> vehicleList;
        List<? super Car> carList;

        //vehicleList = new ArrayList<Object>();  //false
        vehicleList = new ArrayList<Vehicle>();  //true
        vehicleList = new ArrayList<Car>();     //true
        vehicleList = new ArrayList<SportCar>();    //true

        carList = new ArrayList<Object>(); //true
        carList = new ArrayList<Vehicle>(); //true
        carList = new ArrayList<Car>();     //true
        //carList = new ArrayList<SportCar>();    //false
    }

    public void addExtend(List<? extends Car> carList) {
        Vehicle vehicle = carList.get(0);   //true
        Car car = carList.get(0);   //True
        //SportCar sportCar = carList.get(0);     //false

        Vehicle v = new SportCar();
        Car c = new SportCar();

        //carList.add(new Vehicle());     //false
        //carList.add(new Car());     //false
        //carList.add(new SportCar());     //false
    }

    public void addSuper(List<? super Car> carList) {
        //Vehicle vehicle = carList.get(0);       //false
        //Car car = carList.get(0);           //false
        //SportCar sportCar = carList.get(0);         //false

        //carList.add(new Vehicle());     //false
        carList.add(new Car());         //true
        carList.add(new SportCar());        //true
    }
}
