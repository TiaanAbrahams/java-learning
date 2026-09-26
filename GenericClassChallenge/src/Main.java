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

        mappables.add(new UtilityLine("Australia Main pipe", UtilityLine.UsageType.SEWAGE));

        for(var i: mappables){
            Mappable.mapIt(i);
        }
    }
}