
public class Main {
    public static void main(String[] args) {

        Node alice = new Node("Alice");
        Node charlie = new Node("Charlie");
        Node bob = new Node("Bob");
        Node tiaan = new Node("Tiaan");

        SearchTree list = new SearchTree(null);

        System.out.println(list.addItem(bob));
        System.out.println(list.addItem(charlie));
        System.out.println(list.addItem(alice));
        System.out.println(list.addItem(tiaan));


        System.out.println("*".repeat(20) + " List");

        //list.traverse(null);
        System.out.println("*".repeat(20));
        list.removeItem(tiaan);
        //list.traverse(bob);
    }
}