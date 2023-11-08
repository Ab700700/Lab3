import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("The drop","Kevin","30210",100,120);
        Movie m3 = new Movie("The drop2","Jeff","A100",150,150);
        Movie m4 = new Movie("The drop5","Jeff","A200",120,110);
        Movie m2 = new Movie("The drop3","Alex","S10029",200,120);

        User u1 = new User("Hello1","aa@aa.com",null,null);
        User u2 = new User("H3","a@a.com",null,null);
        List<User> users = new ArrayList<>();
        List<Media> media = new ArrayList<>();
        List<Movie> moviesCat = new ArrayList<>();
        media.add(m1);
        media.add(m2);
        media.add(m3);
        moviesCat.add(m1);
        moviesCat.add(m2);
        moviesCat.add(m3);
        moviesCat.add(m4);
        media.add(m4);
        users.add(u1);
        users.add(u2);
        Store s1 = new Store(users,media);
        s1.addMedia(m1);
        System.out.println("----store----");
        System.out.println(s1.displayMedias());
        System.out.println("--------");
        System.out.println(m4.recommendSimilarMovies(moviesCat));
        Review r1 = new Review("Hello1",5,"great");
        Review r2 = new Review("Hello12",4,"good");
        Review r3 = new Review("Hello13",3,"mid");
        List<Review> r = new ArrayList<>();
        r.add(r1);
        r.add(r2);
        r.add(r3);

        Review rev1 = new Review("Hello1",5,"great");
        Review rev2 = new Review("Hello12",5,"great");
        Review rev3 = new Review("Hello13",5,"great");
        List<Review> lr2 = new ArrayList<>();
        lr2.add(rev1);
        lr2.add(rev2);
        lr2.add(rev3);

        Book b1 = new Book("The jungle book","Rudyard kipling","3003",35,10,r);
        Book b2 = new Book("Sherlock holmes","Arthur doyle","3003",40,5,lr2);
        Novel n = new Novel("Sherlock holmes","Arthur doyle","3003",40,5,lr2,"none");
        AcademicBook acB = new AcademicBook("Academic Book","Name","100",200,5,r,"science");
        s1.addMedia(n);
        s1.addMedia(b1);
        s1.addMedia(acB);
        System.out.println(b1.getAverageRating());
        System.out.println(b1.isBestSeller());

        System.out.println(s1.displayMedias());
        System.out.println(s1.searchBook("The jungle book"));
        List<Media> med = new ArrayList<>();
        User user = new User("Hello1","aa@aa.com",med,med);

        // watch = add to cart, user has two movies in his cart.

        m4.watch(user);
        user.addToCart(b1);
        user.addToCart(m1);
        user.addToCart(m1);
        user.removeFromCart(m1);
        System.out.println("----Cart---");
        System.out.println(user.getShoppingCart());
        user.checkout();
        System.out.println(user.getPurchaseMediaList());
        System.out.println(acB.getMediaType());
        System.out.println(n.getMediaType());
        //System.out.println(m1.toString());

        Music mu1 = new Music("Up&Up","coldplay","1001001",10,"coldplay");
        Music mu2 = new Music("A sky full of starts","coldplay","1001001",15,"coldplay");
        Music mu3 = new Music("Music2","auteur","1001002",9,"artistName");
        Music mu4 = new Music("Music3","auteurMusic3","1001003",15,"artistMusic3");
        List<Music> muCat= new ArrayList<>();
        muCat.add(mu1);
        muCat.add(mu2);
        muCat.add(mu3);
        muCat.add(mu4);

        System.out.println(mu1.generatePlaylist(muCat));

        System.out.println(mu1.getMediaType());

        System.out.println(mu1.toString());




    }
}
