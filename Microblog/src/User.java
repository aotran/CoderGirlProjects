public class User {
    private String username;
    private int id;
    private String email;
    private String realFirstName;
    private String realLastName;
    private String avatar;

    public User(String username, int id, String email, String realFirstName, String realLastName) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.realFirstName = realFirstName;
        this.realLastName = realLastName;
        this.avatar =  "https://muscathome.com/uploads/profile_images/default.png";
    }

    public String getUsername() {
        return username;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}