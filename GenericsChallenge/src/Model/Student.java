package Model;
import util.QueryItem;

import java.util.Comparator;
import java.util.Locale;
import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {
    private String name;
    private String course;
    private int yearStarted;
    private int stdID;
    protected static Random random = new Random();
    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++","Java","Python"};

    public Student(){
        int lastIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(5)] + " " + (char)lastIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2020, 2026);
        stdID = random.nextInt(1000,1200);
    }

    @Override
    public String toString(){
        return "ID:%-15d %-15s %-15s %-15d".formatted(stdID, name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {

        String fName = fieldName.toUpperCase();
        return switch (fName.toUpperCase()){
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == Integer.parseInt(value);
            default -> false;
        };
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.stdID, other.stdID);
    }
}
