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
    }
}