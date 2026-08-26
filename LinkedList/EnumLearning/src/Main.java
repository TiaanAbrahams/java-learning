public class Main {
    static void main(String[] args) {
        Weekdays day = Weekdays.FRIDAY;

        day.getWeekday();

        day = day.getNextDay();
        System.out.println(day.getNextDay());

        System.out.println(day.getType());
    }
}
