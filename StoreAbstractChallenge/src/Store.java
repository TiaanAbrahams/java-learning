import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private static ArrayList<OrderItem> itemsOrdered = new ArrayList<>();
    private static ArrayList<ProductForSale> products = new ArrayList<>();


    public static void main(String[] args) {
        products.add(new Gun("Glock 17", 16_000, "Gun"));
        products.add(new Gun("Sig P320", 21_000, "Gun"));
        products.add(new Gun("Daniel Defence v7", 55_000,"Gun"));
        products.add(new Ammo("PMC Bronze .223", 750,"Ammo"));
        products.add(new Ammo("Federal Champion 9mm", 450,"Ammo"));
        products.add(new Ammo("Winchester 9mm", 350, "Ammo"));


        System.out.println("""
                    Enter the following:
                    *Exit
                    *Order
                    *Viewcart
                    *viewproducts
                    """);
        Scanner scanner = new Scanner(System.in);
        boolean option = true;
        while(option){

            switch (scanner.nextLine().toLowerCase()){
                case "exit" -> {
                    option = false;
                    break;}

                case "order" -> {while(true){
                    System.out.println("""
                            Enter 0 - 5 to order:
                            (0) - Glock 17
                            (1) - Sig P320
                            (2) - Daniel Defence v7
                            (3) - PMC Bronze .223
                            (4) - Federal Champion 9mm
                            (5) - Winchester 9mm
                            (111) - To exit
                            """);
                            int orderIterm = scanner.nextInt();
                            if(orderIterm == 111) {
                                break;
                            }

                            System.out.println("Enter quantity");
                            int quant = scanner.nextInt();

                            if(quant == 111){
                                break;
                            }else{
                                addOrder(products.get(orderIterm),quant);
                                continue;
                            }
                    }

                }
                case "viewcart" ->{
                    viewCart();
                    break;
                }

                case "viewproducts" ->{
                    listItemsForSale();
                    break;
                }
            }
        }

    }

    public static void addOrder(ProductForSale product, int quantity){
        itemsOrdered.add(new OrderItem(product, quantity));
    }

    public static void listItemsForSale(){
        for(ProductForSale product: products){
            getProduct(product);
        }
    }

    public static void viewCart(){
        double total = 0;
        for(OrderItem item: itemsOrdered){
            item.product().printPricedItem(item.quantity());
            total += item.product().getSalesPrice(item.quantity());
        }
        System.out.println("Total: R" + total);
    }
    public static void getProduct(ProductForSale product){
        product.showDetails();
    }
}