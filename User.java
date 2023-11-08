import java.util.List;

public class User {
    private String username;
    private String email;

    private List<Media> purchaseMediaList;

    private List<Media> shoppingCart;

    public User(String username, String email, List<Media> purchaseMediaList, List<Media> shoppingCart) {
        this.username = username;
        this.email = email;
        this.purchaseMediaList = purchaseMediaList;
        this.shoppingCart = shoppingCart;
    }

    public void addToCart(Media media){
            shoppingCart.add(media);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public void setPurchaseMediaList(List<Media> purchaseMediaList) {
        this.purchaseMediaList = purchaseMediaList;
    }

    public List<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void removeFromCart(Media media){
            shoppingCart.remove(media);
    }

    public void checkout(){
        this.purchaseMediaList = this.shoppingCart;
        this.shoppingCart=null;
    }
}
