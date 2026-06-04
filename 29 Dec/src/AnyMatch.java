import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AnyMatch {
    public static void main(String[] args){
        List<Integer> number = Arrays.asList(21,221,23,29,1);
       final boolean b = number.stream().anyMatch( n -> n%2 == 0);
        System.out.println(b);
    }
}
