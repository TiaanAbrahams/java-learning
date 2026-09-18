import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Goodwood Municipality", UsageType.GOVERMENT));
        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERMENT));
        mappables.add(new Building("Sydney Opera house", UsageType.ENTERTAIMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORTS));

        Iterator<Mappable> i = mappables.iterator();
        while (i.hasNext()){
            Mappable.mapIt(i.next());
        }
    }
}