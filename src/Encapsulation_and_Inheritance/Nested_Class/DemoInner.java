package Encapsulation_and_Inheritance.Nested_Class;

public class DemoInner {
    Outer2 outer = new Outer2();
    Outer2.Inner inner = outer.new Inner();
}

class Outer2{
    class Inner{

    }
}
