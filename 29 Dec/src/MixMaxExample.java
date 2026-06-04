import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MixMaxExample {
   public static void main(){
       List<Integer> number = Arrays.asList(1000,203,33,45,95);
       System.out.println("Minimum Value");
       final Optional<Integer> a = number.stream().min(Comparator.naturalOrder());
       System.out.println(a.get());
       System.out.println("Maximum Value");
       final Optional<Integer> b = number.stream().max(Comparator.naturalOrder());
       System.out.println(b.get());

   }

}
