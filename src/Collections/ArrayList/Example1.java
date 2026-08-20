package Collections.ArrayList;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.List;

public class Example1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();

        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        list1.add("Hello"); // Throws exception
//
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//
//        Field field = ArrayList.class.getDeclaredField("elementData");
//        field.setAccessible(true);
//        Object[] elementData = (Object[]) field.get(list);
//        System.out.println("ArrayList Capacity: " + elementData.length);
//
//        list.add(1);
//        elementData = (Object[]) field.get(list);
//        System.out.println("ArrayList Capacity: " + elementData.length);

    }
}