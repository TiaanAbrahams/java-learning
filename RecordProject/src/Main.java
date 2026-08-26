//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent(switch(i){
                                    case 1 -> "Marry";
                                    case 2 -> "Carol";
                                    case 3 -> "Tim";
                                    case 4 -> "Harry";
                                    case 5 -> "Lisa";
                                    default -> "No name provided";},

                                    "C000" + i ,
                                    "05/07/2001",
                                    "Java Masterclass" );
            System.out.println(s);
        }
    }
}