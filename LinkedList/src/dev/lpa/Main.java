package dev.lpa;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");

        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

       /* removeMoreElements(placesToVisit);
        System.out.println(placesToVisit);*/

        /*getElements(placesToVisit);
        printItinerary3(placesToVisit);*/

        testIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list ){
        list.addFirst("darwin");
        list.addLast("Hobart");
        // queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //Stack Methods
        list.push("Allice Springs");
    }

    private static void removeMoreElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Brisbane");
        System.out.println(list);

        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

        String p4 = list.poll();
        System.out.println(p4 + " was removed");
    }
    private static void getElements(LinkedList<String> list){
        System.out.println("Retrieved Element = " + list.get(4));
        System.out.println("First Element = " + list.getFirst());
        System.out.println("Lest Element = " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("darwin"));
        System.out.println("Melbourne is at position: " + list.indexOf("Melbourne"));

        System.out.println("Element from element() " + list.element());

        System.out.println("Element from peek() " + list.peek());
        System.out.println("Element from peek() " + list.peekFirst());
        System.out.println("Element from peekLast() " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        for(int i = 1; i < list.size(); i++){
            System.out.println("--> from: " +list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();

        for(String i: list){
            System.out.println("--> From: " + previousTown + " to " + i);
            previousTown = i;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();

        ListIterator<String> iterator = list.listIterator(1);

        while(iterator.hasNext()){
            var i = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + i);
            previousTown = i;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list){
        var iterator = list.listIterator();

        while(iterator.hasNext()){
            if(iterator.next().equalsIgnoreCase("Brisbane")){
                iterator.add("Cape Town");
            }
        }

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        System.out.println(list);
    }
}
