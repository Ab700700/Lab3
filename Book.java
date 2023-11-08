import java.util.List;

public class Book extends Media {
    private int stock;
    private List<Review> reviews;

    public Book() {
    }

    public Book(String title, String auteur, String ISBN, double price, int stock, List<Review> reviews) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = reviews;
    }

    public  void addReview(Review r){
        reviews.add(r);
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public double getAverageRating(){
        int ra = 0;
        for(int i = 0; i<reviews.size();i++){
            ra+= reviews.get(i).getRating();
        }
        return ra / reviews.size();
    }

    public void purchase(User user){
        user.addToCart(this);
        stock--;
    }

    public boolean isBestSeller(){
        return this.getAverageRating()>= 4.5;
    }

    public void restock(int quantity){
            stock+=quantity;
    }

    public String getMediaType(){
        if(this.getAverageRating()>=4.5)return "Bestselling Book";
        else return "Book";
    }

    @Override
    public String toString() {
        return "Book{" +
                "stock=" + stock +
                ", reviews=" + reviews +
                '}';
    }
}
