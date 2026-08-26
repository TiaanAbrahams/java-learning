//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printInformation("Tiaan");
        printInformation("");
        printInformation("\t \n");

        String helloWorld = "Hello World";
        System.out.printf("Index of 'r' = %d%n",helloWorld.indexOf("r"));
        System.out.printf("Index of 'world' = %d%n",helloWorld.indexOf("World"));

    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if(string.isEmpty()){
            System.out.println("The string is empty");
            return;
        }

        if(string.isBlank()){
            System.out.println("This string is blank");
        }
        System.out.printf("The first char = %c%n", string.charAt(0));
        System.out.printf("The Last char = %c%n", string.charAt(length-1));
    }
}