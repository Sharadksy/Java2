package Generics;

public class Example1 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(10);
        Box<String> b2 = new Box<>("Sharad");
        System.out.println(b1.getValue()+"10");
        b1.setValue(5);
        System.out.println(b2.getValue());
    }
}
class Box<T> {
    private T value;

    Box(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
