public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film.");
    }
    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case'S' -> new SciFi(title);
            case'C' -> new Comedy(title);
            case'A' -> new Adventure(title);
            default -> new Movie(title);
        };
    }
}

