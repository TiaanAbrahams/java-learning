import Model.LPAStudent;
import Model.LPAStudentComparator;
import Model.Student;
import util.QueryList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Main {

    public static void main (String[] args) {
        int stdCount = 15;

        QueryList<LPAStudent> lpaStudents = new QueryList<>();
        for(int i = 0; i < stdCount; i++){
            lpaStudents.add(new LPAStudent());
        }
        lpaStudents.sort(Comparator.naturalOrder());
        printMoreList(lpaStudents);

        System.out.println("Matches");
        var matches = lpaStudents
                .getMatches("PercentComplete","50")
                .getMatches("Course", "Python");
        printMoreList(matches);

        System.out.println("Sort by LPAStudentComparator()");
        matches.sort(new LPAStudentComparator());
        printMoreList(matches);

        System.out.println("Ordered");
        matches.sort(null);
        printMoreList(matches);

    }

    public static void printMoreList(List<?> students){
        for(var s: students){
            System.out.println(s);
        }
    }

}