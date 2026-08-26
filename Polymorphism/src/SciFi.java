public class SciFi extends Movie {
    public SciFi(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Aliens come to our planet",
                "Humans fight aliens",
                "Planet blows up");
    }
    public void watchSciFi(){
        System.out.printf("We are watching a %s movie", getClass().getSimpleName());
    }
}