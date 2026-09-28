import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mappable cederberg = new Park("Cederberg", "-32.4167 19.2500");
        cederberg.render();

        Layer<Mappable> map = new Layer<>();
        map.addElement(cederberg);

        map.renderLayer();

    }
}