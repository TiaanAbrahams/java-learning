import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;

public class Main{
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println();
        String[] names = {"Tiaan", "bob", "Anna", "Sharon", "timmy"};

        List<Function<String, String>> funtions = new ArrayList<>(List.of(
                    //Make all names uppercase
                String::toUpperCase,

                s -> {
                    // Adding random initial
                    String middleNameChar =  (char) ((random.nextInt(26) + 65)) + ". ";
                    return s + " " + middleNameChar;
                },

                s ->{
                    //Reverse name and add as surname
                    StringBuilder reverseName = new StringBuilder();
                    return String.format("%s %s", s, reverseName.append(s).reverse());}
        ));

        applyFuntions(funtions, names);
        Arrays.asList(names).forEach(System.out::println);
    }

    public static void applyFuntions(List<Function<String, String>> functions, String[] names){
        for(int i = 0; i < names.length; i++){
            for(int j = 0 ; j < functions.size(); j++){
                System.out.println(names[i].transform(functions.get(j)));
            }
        }
    }
}