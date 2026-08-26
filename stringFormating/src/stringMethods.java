public class stringMethods {
    public static void main(String[] Args){
        String birthDate = "16/12/1992";
        int startingIndex = birthDate.indexOf("1992");

        System.out.printf("Starting Index = %d%n", startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        String newDate = String.join("/","25","12","1992");
        System.out.println(newDate);
    }
}
