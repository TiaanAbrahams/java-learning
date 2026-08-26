//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);

        System.out.println(printer.addToner(-60));

        System.out.println(printer.getTonerLevel());

        System.out.println(printer.printPages(7));
    }
}