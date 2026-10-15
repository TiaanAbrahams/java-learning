import Model.LPAStudent;
import Model.Student;
import util.QueryList;
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
        //printList(students);
        printMoreList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for(int i = 0; i < stdCount; i++){
            lpaStudents.add(new LPAStudent());
        }
        //printList(lpaStudents);
        printMoreList(lpaStudents);

        testList(new ArrayList<String>(List.of("Able","Barry","Charlie")));
        testList(new ArrayList<Integer>(List.of(1,2,5)));

        var queryList = new QueryList<>(lpaStudents);
        var matches = queryList.getMatches(
                "Course", "Python");

        printMoreList(matches);

        var students2021 =
                //Little confisud how the static method is called. Is it because the return type is QueryList?
                //Think it's because the QueryList class has a List argument constructor
                QueryList.getMatches(students,"YEARSTARTED","2021");
        System.out.println("-".repeat(20));
        printMoreList(students2021);
    }

//    public static <T extends Student> void printList(List<T> students){
//        for(var s: students){
//            System.out.println(s.getYearStarted() + ": " + s);
//        }
//        System.out.println();
//    }

    public static void printMoreList(List<? extends Student> students){

        for(var s: students){
            System.out.println(s.getYearStarted() + ": " + s);
        }
        System.out.println();
    }
    public static void testList(List<?> list){
        for(var element: list){
            if(element instanceof String s){
                System.out.println("Element is a String " + s.toUpperCase());
            }else if(element instanceof Integer i){
                System.out.println("Element is a Integer " + i.floatValue());
            }
        }
    }

//    public static void testList(List<String> list){
//        for(var element: list){
//            System.out.println("String: " + element.toUpperCase());
//        }
//    }
//    public static void testList(List<Integer> intlist){
//        for(var element: list){
//            System.out.println("Integer: " + element.floatValue());
//        }
//    }
}