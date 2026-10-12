package Collections.Set_and_Map;
import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // Initial size:16

        // Initial Capacity
        Set<Integer> set2 = new HashSet<>(100);

        // Capacity, Load Factor
        Set<Integer> set3 = new HashSet<>(100,0.8f);

        // Using another collection
        Set<Integer> set4 = new HashSet<>(List.of(1,2,3,4,5,6,7));

        Set<Integer> set5 = new HashSet<>(Arrays.asList(4,5,3,7,6,4));
        System.out.println(set5);

        // Same functions are applicable for LinkedHashSet
    }
}
