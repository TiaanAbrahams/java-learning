public class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant cene",
                "Something bad happens",
                "Scarry music");
    }

    public void watchAdventure(){
        System.out.printf("We are watching a %s movie", getClass().getSimpleName());
    }
}