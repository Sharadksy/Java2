package OOPS.Interface;

public class MultiInherit {
    public static void main(String[] args) {
        Myself self = new Myself();
        self.myName();
        self.myAge();
    }
}
interface Name{
    void myName();
}
interface Age{
    void myAge();
}
class Myself implements Name,Age{
    @Override
    public void myName(){
        System.out.println("Sharad Sharma");
    }
    @Override
    public void myAge(){
        System.out.println(20);
    }
}
