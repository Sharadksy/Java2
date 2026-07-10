package OOPS;

public class Test2 {
    public static void main(String[] args) {
        Name.x.who();
        System.out.println();
    }
}

class Name{
    static Who x;
}
class Who{
    void who(){

    }
}

// System --> class --> PrintStream out
// PrintStream class --> println method
