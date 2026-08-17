package Generics;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
       List<Animal> animals = new ArrayList<>();
       animals.add(new Animal());
       animals.add(new Animal());
       fun(animals);

//       List<Dog> dogs = new ArrayList<>();
//       dogs.add(new Dog());
//       dogs.add(new Dog());
//       fun(dogs);

    }
    static void fun(List<?> values){
//        for (Object obj : values){
//            System.out.println(obj.getClass().getName());
//        }
        Object obj = values.get(0);
        System.out.println(obj.toString());
    }
}
class Animal{
    void eat(){
        System.out.println("Eating");
    }
    void walk(){
        System.out.println("Walking");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Bark");
    }
}
