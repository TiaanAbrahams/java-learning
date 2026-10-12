public class Student implements Comparable{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
    public int compareTo(Object o){
        Student castStudent = (Student) o;
        return name.compareTo(castStudent.name);
    }
}
