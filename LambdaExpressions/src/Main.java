import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "alpha","bravo","charlie", "delta"
        ));

        for(String s: list){
            System.out.println(s);
        }

        System.out.println("_".repeat(15));
        list.forEach(s -> System.out.println(s));
        System.out.println("_".repeat(15));

        int result = calculation((a ,b) -> {return a + b;}, 5 , 2);
        var result2 = calculation((a,b) -> a/b,10.0,2.5);
        var result3 = calculation((a,b) ->
                a.toUpperCase(Locale.ROOT) + " " + b.toUpperCase(), "Ralph", "Kramden");

        var coords = Arrays.asList(
                new Double[]{14.1524, -15.333},
                new Double[]{23.1124, -51.000},
                new Double[]{23.2214, -21.224});

        coords.forEach(s -> System.out.println(Arrays.toString(s)));

        BiConsumer<Double, Double> p1 = (lat, lng) ->
                System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng);

        var firstPoint = coords.get(0);
        processPoint(firstPoint[0], firstPoint[1],p1);

        coords.forEach((s) -> processPoint(s[0], s[1], p1));
        coords.forEach((s) -> processPoint(s[0], s[1],(lat, lng) ->
                System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng) ));

        list.removeIf(s -> s.equalsIgnoreCase("bravo"));
        list.forEach(s -> System.out.println(s));
        list.addAll(List.of("echo", "easy","earnest"));
        list.forEach(s -> System.out.println(s));

        System.out.println("_".repeat(15));

        list.removeIf(s -> s.startsWith("ea"));
        list.forEach(s -> System.out.println(s));

        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        System.out.println("_".repeat(15));
        list.forEach(s -> System.out.println(s));

        String[] emptyString = new String[10];
        System.out.println(Arrays.toString(emptyString));

        Arrays.fill(emptyString, "");
        System.out.println(Arrays.toString(emptyString));

        Arrays.setAll(emptyString, (i) -> "" + (i + 1) + ". ");
        System.out.println(Arrays.toString(emptyString));

        Arrays.setAll(emptyString, (i) -> "" + (i + 1) + ". " +
                    switch (i){
                        case 0 -> "one";
                        case 1 -> "two";
                        case 2 -> "three";
                        default -> "";
                    }
                );
        System.out.println(Arrays.toString(emptyString));

        String[] names = {"Ann", "Jessica", "Tiaan", "Bob", "Leo"};
        String[] randomList = randomSelectedValues(15, names,
                () -> new Random().nextInt(0, names.length));
        System.out.println(Arrays.toString(randomList));
    }

    public static <T> T calculation(BinaryOperator<T> function, T value1, T value2){
        T result = function.apply(value1, value2);
        System.out.println("Operation result: " + " " + result);
        return result;
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumer){
        consumer.accept(t1 , t2);
    }

    public static String[] randomSelectedValues(int count, String[] values, Supplier<Integer> s){
        String[] selectedValues = new String[count];
        for(int i = 0; i < count; i++){
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }
}