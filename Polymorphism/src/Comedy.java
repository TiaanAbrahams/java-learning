public class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Everyone laughs",
                "Happy ending");
    }

    public void watchComedy(){
        System.out.printf("We are watching a %s movie", getClass().getSimpleName());
    }
}