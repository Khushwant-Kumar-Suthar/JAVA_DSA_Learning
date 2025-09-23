package JAVA_DSA_Learning.Multithreading.parallelStreams;

import java.util.List;

public class CreateParallelStream {
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        // Sequential Stream
        System.out.println("Sequential Stream: ");
        numbers.stream().forEach(num-> System.out.print(num+" "));

        System.out.println("\n\nParallel Stream: ");
        // parallel Stream
        numbers.parallelStream().forEach(num-> System.out.print(num+" "));
    }
}
