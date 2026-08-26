import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        ArrayList<ProductForSale> products = new ArrayList<>();

        products.add(new Gun("Glock 17", 19000, "Gun"));
        products.add(new Gun("Sig P320", 21000, "Gun"));
        products.add(new Gun("Daniel Defence", 62000, "Gun"));


        System.out.println(addItem("Glock 17", 2));
        System.out.println(addItem("Sig p320", 3));
    }

    public static ArrayList<OrderItem> addItem(String product, int quantity){
        ArrayList<OrderItem> orderedItems = new ArrayList<>();
        orderedItems.add(new OrderItem(quantity,product));

        return orderedItems;
    }
}
