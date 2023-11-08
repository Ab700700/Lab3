import java.util.List;

public class Store {
    private List<User> users;
    private List<Media> medias;

    public Store(List<User> users, List<Media> medias) {
        this.users = users;
        this.medias = medias;
    }

    public void AddUser(User user){
        users.add(user);
    }

    public List<User> displayUsers(){
        return users;
    }
    public List<Media> displayMedias(){
        return medias;
    }

    public void addMedia(Media media){

        medias.add(media);
    }


    public Book searchBook(String title){
        Book f = new Book();
            for(int i = 0 ; i<medias.size() ; i++){
                if(medias.get(i).getTitle()==title) f= (Book) medias.get(i);
            }
        return f;
    }
}
