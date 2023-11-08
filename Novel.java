import java.util.List;

public class Novel extends Book{
    private String genre;

    public Novel(String title, String auteur, String ISBN, double price, int stock, List<Review> reviews, String genre) {
        super(title, auteur, ISBN, price, stock, reviews);
        this.genre = genre;
    }

    public String getMediaType(){

    if(super.getAverageRating()>=4.5)return "Bestselling";
    else return "Novel";
    }


//    public String toString(){
//
//    }


}
