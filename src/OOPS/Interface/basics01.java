package OOPS.Interface;

public class basics01 {
    public static void main(String[] args) {
        B b = new B();
        b.ride();
    }
    interface A{
        void ride();
    }
}
class B implements basics01.A {
    @Override
    public void ride() {
        System.out.println("Riding at 80 km/hr");
    }
}
