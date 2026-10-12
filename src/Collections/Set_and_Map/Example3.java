package Collections.Set_and_Map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Example3 {
    public static void main(String[] args){
        Map<Object,Object> map = new HashMap<>();
        List<Object> linkedlist = new LinkedList<>();
        linkedlist.add("Sharad");
        linkedlist.add("Sharma");
        linkedlist.add("Rohan");
        linkedlist.add("Rahul");
        map.put(101,linkedlist);
        System.out.println(map);
    }
}
