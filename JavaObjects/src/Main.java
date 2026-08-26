public class Main {
    public static void main(String[] args) {
        Computer pc1 = new Laptop("Windows");
        Computer pc2 = new Desktop("Linux");

        pc1.startup();
        pc1.startup();
    }
}
