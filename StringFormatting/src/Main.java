//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "Tiaan";
        int age = 33;
        double balance = 1234.5;

        System.out.printf("%-13s|%d|R%.2f%n", name, age, balance);
        /*name must be left-aligned, width 8

        age must be printed as an integer

        balance must have 2 decimal places

        Use System.out.printf

        Include a newline at the end*/

    }
}