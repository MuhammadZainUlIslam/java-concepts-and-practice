import java.util.Arrays;
import java.util.*;
import java.util.stream.LongStream;

public class ParallelStreamExample {

    public static void main(){
        long[] longArray = new long[20000];
        for(int i=0; i<longArray.length; i++){
            longArray[i] = i+1;
        }



        //Calculating Sum Using Sequential Stream
        long startTime = System.currentTimeMillis();
        long sequentialSum = Arrays.stream(longArray).map(ParallelStreamExample::factorial).sum();
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential Stream");
        System.out.println(sequentialSum);
        System.out.println(endTime-startTime+"ms");

        startTime = System.currentTimeMillis();
        long parallelSum = Arrays.stream(longArray).parallel().map(ParallelStreamExample::factorial).sum();
        endTime =System.currentTimeMillis();
        System.out.println("Parallel Stream");
        System.out.println(parallelSum);
        System.out.println(endTime - startTime+"ms");

    }


    public static long factorial(long number){
        return LongStream.rangeClosed(1, number).reduce(1, (long a, long b) -> a*b);
    }
}
