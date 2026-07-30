package Strings;
//import java.lang.StringBuilder;

public class Example02 {
    public static void main(String[] args) {
     StringBuilder sb = new StringBuilder("Hello");

     sb.append(" I am ");
     sb.insert(11,"Sharad");
     System.out.println(sb.indexOf("S"));
     System.out.println(sb);
     sb.repeat("S",2);
     System.out.println(sb);
     sb.replace(4,6,"True");
     System.out.println(sb);
    }
}
