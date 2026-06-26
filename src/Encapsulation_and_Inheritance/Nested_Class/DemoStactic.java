package Encapsulation_and_Inheritance.Nested_Class;

public class DemoStactic {
    public static void main(String[] args) {
        Outer outer = new Outer();
         Outer.Inner inner = new Outer.Inner();
         inner.fun();

    }
}

class Outer{
//    static int x=0;
    static void greet(){

    }

    static class Inner{
        void fun(){
            System.out.println("Hello");
            greet(); // Only accessible when greet is static variable
        }
    }
}
