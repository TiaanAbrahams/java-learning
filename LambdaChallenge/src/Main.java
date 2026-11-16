import java.util.*;

public class Main{
    public static void main(String[] args) {
        String[] names = {"Tiaan", "jan", "corne","PIET","JASON", "Bob", "Anna"};

        Arrays.setAll(names, i -> names[i].toUpperCase());
        Random random = new Random();

        Arrays.setAll(names, b -> names[b] +" " +(char)(random.nextInt(26) + 65) + ".");

        Arrays.setAll(names, c -> {
            String[] name = names[c].split(" ");
            String reversed = new StringBuilder(name[0]).reverse().toString();
            return name[0] + " " + name[1] + " " + reversed;
        });

        Arrays.asList(names).forEach(i -> System.out.println(i));

        List<String> newList = new ArrayList<>(List.of(names));
        newList.removeIf(s -> s.substring(0, s.indexOf(" ")).equals(s.substring(s.lastIndexOf(" ") + 1)));

        System.out.println("\n---->Printing new list:");
        newList.forEach(s -> System.out.println(s));
    }
}