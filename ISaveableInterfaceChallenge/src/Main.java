import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] Args){
        iSaveable monster = new Monster("Tiaan", 50, 100);
        iSaveable danger = new Monster("Danger", 50, 100);

        System.out.println(monster.write().get(0));
    }
}
