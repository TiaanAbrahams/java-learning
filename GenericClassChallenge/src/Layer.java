import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Layer<T>{
    private List<T> element = new ArrayList<>();

    public void addElement(T t){
        element.add(t);
    }

    public void renderLayer(){

    }
}
