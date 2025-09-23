package JAVA_DSA_Learning.Multithreading.parallelStreams;
import java.util.stream.IntStream;

public class LargeDataParallel {
    public static void main(String[] args){
        long sum = IntStream.rangeClosed(1,1_000_000).sum();
        System.out.println("Sum: "+sum);

        // Parallel Stream fast
        System.out.println("Parallel Stream Fast ");
        long fastSum = IntStream.rangeClosed(1,1_000_000).parallel().sum();
        System.out.println("Fast Sum: "+fastSum);
    }
}
