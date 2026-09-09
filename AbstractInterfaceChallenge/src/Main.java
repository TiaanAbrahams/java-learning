
public class Main {
    public static void main(String[] args) {

        Node bob = new Node("Bob");
        Node bob = new Node("Bob");
        Node bob = new Node("Bob");
        MyLinkedList list = new MyLinkedList(bob);
        System.out.println(list.addItem(bob));
        System.out.println(list.addItem(new Node("Alice")));
        System.out.println(list.addItem(new Node("Charlie")));
        System.out.println(list.addItem(new Node("Tiaan")));

        //System.out.println(list.getRoot().getValue());

        System.out.println("*".repeat(20) + " List");

        list.traverse(bob);

    }
}