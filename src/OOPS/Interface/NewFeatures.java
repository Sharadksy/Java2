package OOPS.Interface;

public class NewFeatures {
    public static void main(String[] args) {
        Announce announce = new Announce();
        announce.supportStatement();
        announce.greet();
    }
}

// Default Methods --> Methods that can be defined in the interface
interface Supportable{
    default void supportStatement(){
        System.out.println("We stand in solidarity");
    }
    void greet();
}
class Announce implements Supportable{
    @Override
    public void greet() {
        System.out.println("Thank You!!");
    }

    // We can override default method too.
//    @Override
//    public void supportStatement(){
//        System.out.println("We firmly stand with demands");
//    }
}
