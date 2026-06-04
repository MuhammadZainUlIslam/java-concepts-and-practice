import java.util.ArrayList;
import java.util.*;
import java.util.function.Consumer;







interface Greetings{
    void sayHello();
}
interface Functions{
    int operations(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        Set<String> results = new HashSet<>();



   /*
    ArrayList<Integer> s1 = new ArrayList<>();
    s1.add(1);
    s1.add(2);
    s1.add(3);
    s1.add(4);
    s1.add(5);
    s1.add(6);
        s1.add(7);
        s1.add(8);
        s1.add(9);
        s1.add(10);
        s1.add(11);
        s1.add(12);
        System.out.println("----Whole list---");
    s1.forEach(n ->{

        System.out.println(n);
    });
        System.out.println("----Even list---");
    s1.forEach(n->
    {
        if(n%2 == 0 ){
            System.out.println(n);
        }
    });

    */

    }

}


        /*

  // Difference B/W anonymous class and lamda expressions use
        Greetings g = () -> {
            System.out.println("Hi");
            System.out.println("How are you!");

        };
        g.sayHello();



         Greetings g1 = new Greetings() {
            @Override
            public void sayHello() {
                System.out.println("Hi brother");
                System.out.println("How are you");
            }
        };

g1.sayHello();
    }
}

*/
