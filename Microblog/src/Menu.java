import java.util.Scanner;

public class Menu {

    private Scanner s;

    public Menu() { this.s = new Scanner(System.in); }

    public void mainMenu(Microblog microblog) {
        int menuChoice;
        do {
            System.out.println("Main Menu");
            System.out.println("1) Create a new user");
            System.out.println("2) Create a new post");
            System.out.println("3) Print all users");
            System.out.println("4) Print a user's posts");
            System.out.println("5) Print all posts");
            System.out.println("0) Quit");

            menuChoice = s.nextInt();
            s.skip("\n");

            if(menuChoice !=0) {
                menuProcess(menuChoice, microblog);
            }
        } while (menuChoice != 0);
    }

    public void menuProcess(int menuChoice, Microblog microblog) {
        switch (menuChoice) {
            case 1: // create user
                microblog.createUser();
                break;

            case 2: // create a post
                microblog.createPostContent(microblog.checkUser());
                break;

            case 3: // print all users
                microblog.printUsers(microblog.getUsers());
                break;

            case 4: // print a user's posts
                User currentUser = microblog.checkUser();
                currentUser.printUserPosts(currentUser.getUserPosts());
                break;

            case 5: // print all posts from all users
                microblog.printAllPosts();
                break;

            case 0: // quit
                break;

            default: mainMenu(microblog);
        }
    }
}
