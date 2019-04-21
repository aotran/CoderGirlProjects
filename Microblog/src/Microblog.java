public class Microblog {

    private User user;
    private Post[] blog = new Post[100];

    public Microblog(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Post[] getPosts() {
        return blog;
    }

    public void printBlog(Post[] blog) {
        for(int i = 0; i < blog.length; i++) {
            if(blog[i] == null) { break; }
            else {
                System.out.println(blog[i].getContent());
                System.out.println("- " + blog[i].getBlogger().getUsername());
            }
        }
    }

}
