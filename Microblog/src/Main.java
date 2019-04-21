import java.util.Scanner;

public class Main {
    Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        //establishing array of users
        Microblog[] userList = new Microblog[3];
        for (int i = 0; i < userList.length; i++) {
            userList[i] = new Microblog(new User("test" + i, i, "email"+i+"@gmail.com", "First"+i, "Last"+i));
        }

        for (int i = 0; i < userList.length; i++) {
            for (int j = 0; j < 5; j++) {
                userList[i].getPosts()[j] = new Post(userList[i].getUser(), "example post data " + j);
            }
        }

        for (int i = 0; i < userList.length; i++) {
            userList[i].printBlog(userList[i].getPosts());
        }

    }
}