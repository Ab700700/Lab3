import java.util.ArrayList;
import java.util.List;

public class Music extends Media {
    private String artist;

    public Music() {
    }

    public Music(String artist) {
        this.artist = artist;
    }

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public void listen(User user){
        user.addToCart(this);
    }

    public List<Music> generatePlaylist(List<Music> musicCatalog){
        System.out.println(musicCatalog);
        List<Music> s = new ArrayList<>();
        for(int i = 0 ; i<musicCatalog.size();i++){
            if(this.getAuteur() == musicCatalog.get(i).getAuteur()){
                s.add(musicCatalog.get(i));
            }
        }
        return s;
    }

    public String getMediaType(){
        if(super.getPrice()>=10) return "Premium Music";
        else return "Music";
    }

    @Override
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' +
                '}';
    }
}
