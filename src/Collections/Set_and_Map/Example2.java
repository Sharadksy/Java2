package Collections.Set_and_Map;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("Sharad");
        list.add("John");
        list.add("Rohan");
        list.add("Jordan");
        Set<Object> set = new HashSet<>();
        List<Object> linkedlist = new LinkedList<>(list);
        set.add(linkedlist);
        set.add("Khushi");
        System.out.println(set);
    }
}
