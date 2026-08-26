package dev.lpa;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class Main {
    static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.TUES;
        System.out.println(day);

        for(int i = 0; i < 10; i++){
           day = getRandomDay();
//            System.out.printf("Name is %s, Ordinal Value = %d%n", day, day.ordinal());
//
//            if(day.equals(DaysOfTheWeek.FRI)){
//                System.out.println("Found Friday!!!");
//            }
            switchDayOfWeek(day);
       }
    for(Topping topping: Topping.values()){
        System.out.println(topping.name() + " : " + topping.getPrice());
    }

    }

    public static DaysOfTheWeek getRandomDay(){
        int randomInt = new Random().nextInt(7);
        var dayOfWeek = DaysOfTheWeek.values();
        return dayOfWeek[randomInt];
    }

    public static void switchDayOfWeek(DaysOfTheWeek weekDay){
        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay){
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() + " day is Day " +
                    weekDayInteger);
        }
    }
}
