public enum Weekdays {
    SUNDAY("Weekend"),
    MONDAY("Weekday"),
    TUESDAY("Weekday"),
    WEDNESDAY("Weekday"),
    THURSDAY("Weekday"),
    FRIDAY("Weekday"),
    SATURDAY("Weekend");

    private final String type;

    Weekdays(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void getWeekday(){
        switch (this){
            case FRIDAY -> System.out.println("The weekend is about to start");
            case SATURDAY -> System.out.println("Its the weekend baby!");
            case SUNDAY -> System.out.println("Sunday is the day to rest");
            default -> System.out.println("Its not a weekday");
        };
    }

    public Weekdays getNextDay(){
        Weekdays[] weekdays = Weekdays.values();
        return weekdays[(ordinal() +1) % weekdays.length];
    }
}
