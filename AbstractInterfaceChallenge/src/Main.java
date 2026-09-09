
public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);

        System.out.println(list.addItem(new Node("Bob")));
        System.out.println(list.addItem(new Node("Alice")));
        System.out.println(list.addItem(new Node("Charlie")));
        System.out.println(list.addItem(new Node("Tiaan")));

        System.out.println(list.getRoot().getValue());

        System.out.println("*".repeat(20) + " List");
        list.traverse();

        System.out.println(list.removeItem(new Node("Jan")));

        System.out.println("*".repeat(20) + " List");
        list.traverse();
    }
}