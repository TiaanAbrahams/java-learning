package util;
import Model.LPAStudent;
import Model.Student;
import java.util.*;

public class QueryList  <T extends Student & QueryItem>  extends ArrayList<T>{
    public QueryList() {
    }
    public QueryList(List<T> items) {
        super(items);
    }
    /*Having trouble understanding the depth of how this method could be static with
    changing the return type*/
    public static <S extends QueryItem> List<S> getMatches(List<S> items, String field, String value){
        List<S> matches = new ArrayList<>();

        for(var item: items){
            if(item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }

    public QueryList<T> getMatches(String field, String value){
        QueryList<T> matches = new QueryList<>();

        for(var item: this){
            if(item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }

}
