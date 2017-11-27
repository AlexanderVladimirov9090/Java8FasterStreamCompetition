import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

/**
 * Created on 20.11.17.
 *
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *
 *          This class is a test to see wich one is faster, distinct List or Set.
 *          The idea is to create 3 million random integers, then extract the distinct values using two differnt approaches.
 *          First is using distinct() end result to be a list with no duplicated values.
 *          Second is using a toSet() to create Set which is collection with no duplicated values.
 *
 */
public class RaceOfListAndSet {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i <= 3000000; i++) {
            list.add(new Random().nextInt());
        }

        Long listStartTime = System.currentTimeMillis();
        list.stream().distinct().collect(Collectors.toList());
        System.out.println("Time Passed List");
        System.out.println(System.currentTimeMillis() - listStartTime);

        Long setStartTime = System.currentTimeMillis();
        list.stream().collect(toSet());
        System.out.println("Time Passed Set");
        System.out.println(System.currentTimeMillis() - setStartTime);
    }
}
