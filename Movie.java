import java.util.ArrayList;
import java.util.List;

public class Movie extends Media {
    private int duration;

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public void watch (User user){
        user.addToCart(this);
    }

    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog){
        List<Movie> s = new ArrayList<>();
        for(int i = 0 ; i<movieCatalog.size();i++){
            if(this.getAuteur() == movieCatalog.get(i).getAuteur()){
                s.add(movieCatalog.get(i));
            }
        }
        return s;
    }

    public String getMediaType(){
        if(duration>=120) return "Long Movie";
        else return "Movie";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                '}'+super.toString();
    }
}
