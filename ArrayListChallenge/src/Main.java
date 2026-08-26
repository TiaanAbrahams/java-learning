import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> groceries = new ArrayList<>();

        System.out.println("Enter a number for the option you want. \n" +
                "0 - to Shutdown \n" +
                "1 - to add item(s) \n"+
                "2 - to remove any items");



        boolean condition_1 = true;

        String item = "";

        while(condition_1){
            System.out.print("Enter Value here: ");
            switch (scanner.nextInt()){
                case 0: {
                    condition_1 = false;
                    System.out.println("Ending...");
                    break;
                }
                case 1: {
                    while (true) {
                        System.out.print("Enter the item(s) you want to add: ");
                        item = scanner.next().toUpperCase();
                        if (!item.equalsIgnoreCase("back") || groceries.contains(item)) {
                            if(!groceries.contains(item)) {
                                groceries.add(item);
                                System.out.println("Item added: " + item);
                            }else{
                                System.out.println("Grocery list already has " + item);
                            }
                        }
                        groceries.sort(Comparator.naturalOrder());
                        System.out.println(groceries);

                        if (item.equalsIgnoreCase("Back")) {
                            break;

                        }
                    }
                    break;
                }

                case 2:{
                    while (true) {
                        if(groceries.isEmpty()){
                            System.out.println("There are no groceries in the list \n" +
                                    "Please select option 1 to add items the list");
                            break;
                        }
                        System.out.print("Enter the item(s) you want to remove: ");
                        item = scanner.next().toUpperCase();

                        if(groceries.contains(item)){
                            groceries.remove(item);
                            System.out.println("Item Removed: " + item);
                            System.out.println(groceries);
                        }else if(!groceries.contains(item) && !item.equalsIgnoreCase("Back")){
                            System.out.println(item + " is not in the Groceries list");
                        }

                        if (item.equalsIgnoreCase("Back")) {
                            break;

                        }
                    }
                    break;
                }
                default:
                    System.out.println("Please enter the correct option");
            }

        }

    }

}
