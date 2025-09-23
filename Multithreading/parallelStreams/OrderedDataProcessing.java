package JAVA_DSA_Learning.Multithreading.parallelStreams;

import java.util.List;

public class OrderedDataProcessing {
    public static void main(String [] args){
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        // parallel Stream (Random order)
        System.out.println("Parallel Stream random Order: ");
        numbers.parallelStream().forEach(num-> System.out.print(num+" "));

        System.out.println("\nOrdered Output: ");
        numbers.parallelStream().forEachOrdered(num-> System.out.print(num+" "));
    }
}
