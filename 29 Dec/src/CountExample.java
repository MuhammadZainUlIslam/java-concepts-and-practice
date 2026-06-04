import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CountExample {
    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(22,21,23,33,23,43,55,21,91,10);
        final long a = numbers.stream().count();
        System.out.println(a);
    }
}
