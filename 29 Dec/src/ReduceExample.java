import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String [] args){
        List<Integer> reduceExample = Arrays.asList(1,2,3,4,5,6,7,8);
       final Integer sum = reduceExample.stream().reduce(0, (a,b)->a+b);
       final Integer subtract =reduceExample.stream().reduce(0,(a,b) -> a-b);


        System.out.println(sum);
        System.out.println(subtract);


    }
}
