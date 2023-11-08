import java.util.List;

public class AcademicBook extends Book{

    private String subject;

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, List<Review> reviews, String subject) {
        super(title, auteur, ISBN, price, stock, reviews);
        this.subject = subject;
    }

    public String getMediaType(){
        List<Review> r  = super.getReviews();
        int a = 0 ;
        for(int i = 0 ; i<r.size();i++){
            a+=r.get(i).getRating();
        }
        if(a/r.size()>=4.5) return "Bestselling AcademicBook";
        else return "AcademicBook";

    }


//    public String toString(){
//
//    }
}
