package JAVA_DSA_Learning.Multithreading.parallelStreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GroupingDataInParallel {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());

        Map<Boolean,List<Integer>> groupedNumbers = numbers.parallelStream()
                .collect(Collectors.partitioningBy(num->num%2 == 0 ));
        System.out.println("Even Numbers: "+groupedNumbers.get(true));
        System.out.println("Odd Numbers: "+groupedNumbers.get(false));
    }
}
