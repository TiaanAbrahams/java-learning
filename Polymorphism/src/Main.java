import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
        Movie theMovie = Movie.getMovie("Adventure","Star Wars");
        theMovie.watchMovie();
         **/

        Scanner s = new Scanner(System.in);
        String inputType = "";

        while (true) {
            System.out.println("Enter movie type: A -> Adventure, C -> Comedy, S -> SciFi");
            inputType = s.nextLine();
             System.out.printf("Typed: %s%n", inputType);

             if("qQ".contains(inputType)){
                 break;
             }
            System.out.println("Enter movie name");
            String inputMovieName = s.nextLine();

            Movie theMovie = Movie.getMovie(inputType, inputMovieName);
            theMovie.watchMovie();
        }

    }



}