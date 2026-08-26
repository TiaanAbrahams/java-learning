public class NextMain {

    public static void main(String[] args) {

        Object movie = Movie.getMovie("C", "Jaws");
            if(movie instanceof Comedy){
                ((Comedy) movie).watchMovie();
            }

            //com.watchMovie(); ;
    }
}
