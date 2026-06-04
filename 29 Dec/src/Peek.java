import java.util.Arrays;
import java.util.List;

public class Peek {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(6,5,4,3,2,1);

        final List<Integer> SquaredList = numbers.stream().map(n-> n*n).peek(System.out::println).toList();
    }
}
