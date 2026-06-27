package Encapsulation_and_Inheritance.Nested_Class;

public class DemoStactic {
    public static void main(String[] args) {
        Outer outer = new Outer();
         Outer.Inner inner = new Outer.Inner(outer);
         inner.fun();
         Bankaccount bank = new Bankaccount();
        System.out.println(bank.computeInterest(1000, 0.09));

    }
}

class Outer{
    static int x=0;
    int y = 0;
    void sayYes(Outer.Inner inner){
        System.out.println(inner.num);
    }

    static class Inner{
        Outer outer;
        int num = 2;
        Inner(Outer outer){
            this.outer = outer;
        }
        void fun(){
            System.out.println("Hello");
            System.out.println(outer.y);
        }
    }
}

class Bankaccount{
    static class InterestCalculator{
        static private double calculateYearly(double principal, double rate){
            return principal*rate;
        }
    }
    public double computeInterest(double principal, double rate){
        return InterestCalculator.calculateYearly(principal,rate);
    }
}
