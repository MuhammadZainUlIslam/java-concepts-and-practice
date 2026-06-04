import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(5,2,7,-11,-22,1,3);
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        List<String> letters = Arrays.asList("Zain","Sami","Zain","Ali","Ahmad Altaf");
        letters.stream().distinct().map(String::toUpperCase).sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
        System.out.println("-----------Limit In Stream-------");
        List<Integer> limit = Arrays.asList(12,20,25,29,1,19,24);
        limit.stream().sorted(Comparator.reverseOrder()).limit(5).forEach(System.out::println);
        System.out.println("-----------Limit and Filtered Stream-------");
        limit.stream().sorted(Comparator.reverseOrder()).filter(n->n%2 == 0).limit(5).forEach(System.out::println);

    }
}
