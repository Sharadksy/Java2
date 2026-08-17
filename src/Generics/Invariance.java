package Generics;

import java.util.ArrayList;
import java.util.List;

public class Invariance {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
       // List<Animal> animals = dogs; This is invariance but safe, as it gives compile time error


        // Below is the covariance in array. They aren't allowing animal object to be assigned to animal.
//        Dog[] dogs = new Dog[10];
//        Animal[] animals = dogs;
//
//        animals[0] = new Dog();
//        animals[1] = new Dog();
//        animals[2] = new Dog();
//        animals[3] = new Dog();
//        animals[4] = new Dog();
//        animals[5] = new Animal();
//        for(Animal an: animals){
//            if (an==null){
//                continue;
//            }
//            an.eat();
//        }
//    }
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
}

