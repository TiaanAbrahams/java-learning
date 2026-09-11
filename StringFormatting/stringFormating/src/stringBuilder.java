public class stringBuilder {
    public static void main(String[] args){
        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and goodbye");
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);
    }

    public static void printInformation(String string){
        System.out.println("This String: " + string);
        System.out.println("Length: " + string.length());

    }

    public static void printInformation(StringBuilder builder){
        System.out.println("This StringBuilder: " + builder);
        System.out.println("Length: " + builder.length());

    }
}
