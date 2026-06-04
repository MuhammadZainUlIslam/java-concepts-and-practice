import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(22,32,21,12,222);
        final Optional<Integer> withGet = numbers.stream().filter(a -> a%2 == 0).findFirst();


        System.out.println(withGet.get());
    }
}
