import Model.LPAStudent;
import Model.Student;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main (String[] args) {
        int stdCount = 10;

        List<Student> students = new ArrayList<>();
        for(int i = 0; i < stdCount; i++){
            students.add(new Student());
        }
        students.add(new LPAStudent());
        printList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for(int i = 0; i < stdCount; i++){
            lpaStudents.add(new LPAStudent());
        }
        printList(lpaStudents);
    }

    public static <T extends Student> void printList(List<T> students){
        for(var s: students){
            System.out.println(s.getYearStarted() + ": " + s);
        }
        System.out.println();
    }
}