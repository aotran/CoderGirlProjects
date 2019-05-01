import java.util.ArrayList;

public class User {
    private String username;
    private static int id = 0;
    private int userId;
    private String email;
    private String realFirstName;
    private String realLastName;
    private String avatar;
    static ArrayList<Post> allPosts = new ArrayList();

    public User() {
        this.id = userId;
        id++;
        this.avatar =  "https://muscathome.com/uploads/profile_images/default.png";
    }

    public User(String username, String email, String realFirstName, String realLastName) {
        this.id = userId;
        id++;
        this.username = username;
        this.email = email;
        this.realFirstName = realFirstName;
        this.realLastName = realLastName;
        this.avatar =  "https://muscathome.com/uploads/profile_images/default.png";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRealFirstName() {
        return realFirstName;
    }

    public void setRealFirstName(String realFirstName) {
        this.realFirstName = realFirstName;
    }

    public String getRealLastName() {
        return realLastName;
    }

    public void setRealLastName(String realLastName) {
        this.realLastName = realLastName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public ArrayList<Post> getUserPosts() {
        return allPosts;
    }

    public void printUserPosts(ArrayList<Post> posts) {
        for (Post post: posts) {
            System.out.println(post.toString());
        }
    }

    @Override
    public String toString() {
        return username;
    }
}