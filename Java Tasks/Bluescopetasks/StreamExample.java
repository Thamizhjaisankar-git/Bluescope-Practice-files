// package Bluescopetasks;

import java.util.*;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 10, 2, 8, 3, 7);

        int result = numbers.stream()
                .filter(n -> n > 5)
                .sorted()
                .map(n -> n * 2)
                .reduce(0, Integer::sum);

        System.out.println("Final Result: " + result);
    }
}
