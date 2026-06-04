import java.util.Arrays;
import java.util.List;

public class DistinctExample {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Ahmad","Muhammad","Muhammad","Ahmad","Iqbal","Iqball");
        System.out.println("----List Before Distinct----");
        names.stream().forEach(System.out::println);
        System.out.println("----List After Distinct Method----");
        names.stream().distinct().forEach(System.out::println);
    }
}
