/*
Use LinkedList functionality to create a list of places, ordered by distance from the starting point.
Use ListIterator to move both backwards and forwards through this ordered itinararty of places.
Create a type that has a field for a town and distance from the start - Sydney is the start
Create an itinerary of places or towns to visit - Create a linked list of type towns instead of strings
Create a linked list ordered by the starting point - Starting at Sydney
No duplicate places to be in your list
Create interactive program using scanner

Available actions (Select word or letter)
(F)orward
(B)ackward
(L)ist Places
(M)enu
(Q)uit
*/

package dev.challenge;
import javax.xml.stream.Location;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Locations sydney = new Locations("Sydney", 0);
    Locations adelaide  = new Locations("Adelaide", 1374);
    Locations aliceSprings = new Locations("Alice Springs", 2771);
    Locations brisbane = new Locations("Brisbane", 917);
    Locations darwin = new Locations("Darwin", 3972);
    Locations melbourne = new Locations("Melbourne", 877);
    Locations perth = new Locations("Perth", 3923);

    LinkedList<Locations> locationAndDistance = new LinkedList<>();
        locationAndDistance.add(sydney);
        locationAndDistance.add(adelaide);
        locationAndDistance.add(aliceSprings);
        locationAndDistance.add(brisbane);
        locationAndDistance.add(darwin);
        locationAndDistance.add(melbourne);
        locationAndDistance.add(perth);

    ListIterator<Locations> iterator;
    orderLinkedList(locationAndDistance);
    iterator = locationAndDistance.listIterator();
    while(true){
        System.out.print("Enter Value: ");
        String option = scanner.nextLine();


        switch (option){
            case "Q","q": {
                System.out.println("Program is ending...");
                break;
            }
            case "M","m": {
                System.out.println("""
                        Available actions (Select word or letter)
                        (F)orward
                        (B)ackward
                        (L)ist Places
                        (M)enu
                        (Q)uit""");
                break;
            }
            case "L", "l":{
                iterator = locationAndDistance.listIterator(0);
                Locations place;
                while(iterator.hasNext()){
                    place = iterator.next();
                    System.out.println("Place: " + place.getPlace() + " Distance: " + place.getDistance());
                }
                break;
            }
            case "b","B": {
                if(iterator.hasPrevious()) {
                    Locations placeReverse;
                    placeReverse = iterator.previous();
                    System.out.println("Place: " + placeReverse.getPlace() + " Distance: " + placeReverse.getDistance());
                }
                break;
            }
            case "f","F":{

                if(iterator.hasNext()){
                    Locations placeFoward;
                    placeFoward = iterator.next();
                    System.out.println("Place: " + placeFoward.getPlace() + " Distance: " + placeFoward.getDistance());
                    }
                    break;
            }
        }
        if(option.equalsIgnoreCase("q")){
            break;
        }

        }
    }
    private static void orderLinkedList(LinkedList<Locations> list){
        int cnt =0;
        Locations temp;

        while(cnt < list.size() -1){

            int distance1 = list.get(cnt).getDistance();
            int distance2 = list.get(cnt +1).getDistance();

            if(distance1 > distance2){
                temp = list.get(cnt);
                list.set(cnt, list.get(cnt+1));
                list.set(cnt+1, temp);
                cnt = 0;
            }

            cnt++;
        }

    }
}
