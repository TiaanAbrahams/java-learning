//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double firstValue = 20.00;
        double secondValue = 80.00;

        double totValue = 100.00 * (firstValue + secondValue);

        double remainder = totValue % 40.00;
        System.out.println("The Remainder is: " + remainder);

        boolean hasRemainder = remainder == 0.00 ? true : false;
        System.out.println("The remainder of " + totValue + " divided by 40.00 is: " + remainder);

        if(!hasRemainder)
            System.out.println("Got some remainder");
    }
}
