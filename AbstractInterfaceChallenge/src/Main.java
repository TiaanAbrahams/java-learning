
public class Main {
    public static void main(String[] args) {

        Node alice = new Node("Alice");
        Node charlie = new Node("Charlie");
        Node bob = new Node("Bob");
        Node tiaan = new Node("Tiaan");
        Node mike = new Node("Mike");
        Node zara = new Node("Zara");
        Node john = new Node("John");
        Node peter = new Node("Peter");

        SearchTree list = new SearchTree(null);

        System.out.println(list.addItem(bob));
        System.out.println(list.addItem(charlie));
        System.out.println(list.addItem(alice));
        System.out.println(list.addItem(tiaan));
        System.out.println(list.addItem(mike));
        System.out.println(list.addItem(zara));
        System.out.println(list.addItem(john));
        System.out.println(list.addItem(peter));


        System.out.println("*".repeat(20) + " List");

        //list.traverse(null);

        list.removeItem(tiaan);
        System.out.println("*".repeat(20));
        list.traverse(bob);
    }
}