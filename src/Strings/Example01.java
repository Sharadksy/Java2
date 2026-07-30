package Strings;

public class Example01 {
    public static void main(String[] args) {
//        String s1 = "Sharad"; // Literal
//        String s2 = "Sharad";
//
//        System.out.println(s1==s2); // True
//
//        String s3 = new String("Sharma");
//        String s4 = new String("Sharma");
//
//        System.out.println(s3==s4); // False

        String s1 = "Sharad";
        String s2 = "Sharad";

        System.out.println(s1.equals(s2));

        String s3 = new String("Sharma");
        String s4 = new String("Sharma");

        System.out.println(s3.equals(s4));
    }
}
