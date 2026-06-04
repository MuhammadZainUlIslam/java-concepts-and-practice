import java.util.*;
import java.util.stream.IntStream;


public class ConvertToStream {
    public static void main(String[] args){
        int[] premitiveArray = {1,2,3,4};
        int[] objectArray  = {2,3,4,5,6};

        final IntStream intStream = Arrays.stream(premitiveArray);
        intStream.forEach(System.out::println);
        final IntStream integerStream = Arrays.stream(objectArray);
        System.out.println("---------");
        integerStream.forEach(System.out::println);
        System.out.println("---------");
        System.out.println("Big List");



        List<Integer> bigList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        bigList.stream().filter(n-> n%2 == 0).forEach(System.out::println);
    }
}
