package Enums;

public class Example3 {
    public static void main(String[] args) {
        Experiment x1 = new Experiment();
        int age = Experiment.ex.age;
        System.out.println(age);

    }
}

class Experiment{
    String name;
    int age = 10;
    public static Experiment ex = new Experiment();
}
