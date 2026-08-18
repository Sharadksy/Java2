package Generics;

import java.util.ArrayList;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Car());
        setUp(vehicles);

//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car());
//        cars.add(new Car());
//        setUp(cars);
    }
//    static void setUp(List<? extends Vehicle> value){
//        for (Vehicle v : value){
//            v.fuel();
//            v.On();
//        }
//        // In this function, I cannot add another element in value i.e, I can't do "value.add(new Animal())" even though value is Animal or its child type.
//        // It is because of preventing runtime exception. Suppose a cat class also inherits Animal and the function is given cat list in main method they there will be error.
//    }

    static void setUp(List<? super Vehicle> value){
        value.add(new Vehicle());

         for (Object obj : value){
             Car veh = (Car) obj;
             veh.fuel();
         }
    }
}

class Vehicle{
    void fuel(){
        System.out.println("Refiling....");
    }
    void On(){
        System.out.println("Vehicle is on...");
    }
}

class Car extends Vehicle {
    @Override
    void fuel(){
        System.out.println("Fuel tank is refiling");
    }
    @Override
    void On() {
        System.out.println("Engine is on");
    }
}

