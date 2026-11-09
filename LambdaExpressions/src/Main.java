import java.util.ArrayList;
import java.util.List;

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

        int result = calculation((a ,b) -> a + b, 5 , 2);
    }

    public static <T> T calculation(Operation<T> function, T value1, T value2){
        T result = function.operate(value1, value2);
        System.out.println("Operation result: " + " " + result);
        return result;
    }
}