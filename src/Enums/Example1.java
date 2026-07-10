package Enums;

public class Example1 {
    public static void main(String[] args) {
        TShirtSize size = TShirtSize.MEDIUM;
        if(size == TShirtSize.LARGE){
            System.out.println("Your size is large");
        } else {
            System.out.println("Size not matched");
        }
    }
}

enum TShirtSize{
    SMALL,
    MEDIUM,
    LARGE
}
