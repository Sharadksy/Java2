package Collections.Set_and_Map;
import java.util.*;
public class Example5 {
    public static void main(String[] args) {
        // TREE SET
        TreeSet<Integer> s1 = new TreeSet<>();

        Set<Integer> s2 = new TreeSet<>(List.of(2,7,1,9,8,7));

        s1.add(5);
        s1.add(7);
        s1.add(3);
        s1.add(9);
        s1.add(10);

       // SortedSet Interface --> O(log N)
//
//        System.out.println(s1.headSet( 7)); // toElement is exclusive
//        System.out.println(s1.first()); // print the first node
//        System.out.println(s1.last());  // prints the last node
//        s1.add(8); // adds the element
//        System.out.println(s1);
//        System.out.println(s1.subSet(3, 9)); // fromElement is inclusive and toElement is exclusive
//        System.out.println(s1.tailSet(7)); // fromElement is inclusive


        // NavigableSet Interface
//        System.out.println(s1.lower(7)); // prints the greatest value lower than e
//        System.out.println(s1.floor(7)); // prints the greatest value lower than or equal to given number
//        System.out.println(s1.ceiling(4)); // smaller number greater than the given number
//        System.out.println(s1.pollFirst()); // returns and remove the first node
//        System.out.println(s1.pollLast()); // returns and remove the last node
//        System.out.println(s1);
//        System.out.println(s1.descendingSet());
        Iterator<Integer> it = s1.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
    }
}
