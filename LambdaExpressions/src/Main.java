import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "alpha","bravo","charlie", "delta"
        ));

        for(String s: list){
            System.out.println(s);
        }

        System.out.println("_".repeat(15));
        list.forEach(s -> System.out.println(s));
        System.out.println("_".repeat(15));

        int result = calculation((a ,b) -> {return a + b;}, 5 , 2);
        var result2 = calculation((a,b) -> a/b,10.0,2.5);
        var result3 = calculation((a,b) ->
                a.toUpperCase(Locale.ROOT) + " " + b.toUpperCase(), "Ralph", "Kramden");
    }

    public static <T> T calculation(Operation<T> function, T value1, T value2){
        T result = function.operate(value1, value2);
        System.out.println("Operation result: " + " " + result);
        return result;
    }
}