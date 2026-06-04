import java.util.Arrays;
import java.util.List;
import java.util.*;

public class FlatMap {
    public static void main (String[] args){
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Abdullah", "Adnan"),
                Arrays.asList("Asghar","Danial"),
                Arrays.asList("Farhan","Zohaib"));
        //listOfLists.stream().flatMap(list->list.stream()).forEach(System.out::println);
        listOfLists.stream().flatMap(Collection::stream).map(String::toUpperCase).filter(n-> n.startsWith("D")).forEach(System.out::println);
    }

}
