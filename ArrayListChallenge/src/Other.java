import java.util.ArrayList;
import java.util.List;

public class Other {
    public static void main(String[] args) {
        ArrayList<String> g = new ArrayList<>(List.of("Banana", "Bread", "Eggs"));
        String item = "Bread";

        if(g.remove(item)){
            System.out.println(item + " removed from list");
        }

        System.out.println(g);
    }
}
