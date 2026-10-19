package Collections.Set_and_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example6 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"Sharad Sharma");
        map.put(102,"Rohan");
        map.put(103,"Asif");

//        System.out.println(map.size());

//        Set<Map.Entry<Integer,String>> entries = map.entrySet();
//        System.out.println();
        for(Map.Entry<Integer,String> entry : map.entrySet()){   // // By this we can assign a map's key, values to a set
            if (entry.getKey() == 102){
                entry.setValue("Akshit");
            }
            System.out.println(entry);
        }
        System.out.println(map);
//        Set<Integer> keys = map.keySet();
//        for(int data : keys){
//            System.out.println(data);
//        }

    }
}
