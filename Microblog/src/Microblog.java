import java.util.ArrayList;
import java.util.Scanner;

public class Microblog {

    private Scanner s;
    private ArrayList<Post> blog = new ArrayList();
    private ArrayList<User> userList = new ArrayList();

    public Microblog(){
        this.s = new Scanner(System.in);
    }

    public ArrayList getAllPosts() {
        return blog;
    }

    public void printAllPosts() {
        for (Post post: blog) {
            System.out.println(post.toString());
        }
    }

    public void addPost(Post newPost) {
        blog.add(newPost);
    }

    public ArrayList getUsers() { return userList; }

    public void printUsers(ArrayList<User> userList) {
        for (User user: userList) {
            System.out.println(user.getUsername() + "\n");
        }
    }

    public void addUser(User newUser) {
        userList.add(newUser);
    }

    public Post createPostContent(User user) {
        Post newPost = new Post();
        newPost.setBlogger(user);
        String checkContent;
        do{
            System.out.println("What would you like to post?");
            newPost.setContent(s.nextLine());
            System.out.println("Is this correct? If so, enter 'y'.");
            newPost.toString();
            checkContent = s.nextLine();
        }while(!checkContent.toLowerCase().equals("y"));
        User.allPosts.add(newPost);
        blog.add(newPost);
        return newPost;
    }

    public User createUser() {
        User user = new User();
        System.out.println("What is your username?");
        user.setUsername(s.nextLine());
        System.out.println("What is your first name?");
        user.setRealFirstName(s.nextLine());
        System.out.println("What is your last name?");
        user.setRealLastName(s.nextLine());
        System.out.println("What is your email?");
        user.setEmail(s.nextLine());
        userList.add(user);
        return user;
    }

    public User checkUser() {
        User currentUser = null;
        do {
            System.out.println("What username?");
            String username = s.nextLine();
            for (User user : userList) {
                if (username.equals(user.getUsername())) {
                    currentUser = user;
                } else {
                    System.out.println("That user does not exist.");
                }
            }
        } while (currentUser == null);
        return currentUser;
    }
}
