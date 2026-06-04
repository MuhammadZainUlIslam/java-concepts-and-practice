import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String [] args){
        List<String> elements = Arrays.asList("Adil","Aftab","Akbar");
        elements.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
