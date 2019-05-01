import java.sql.Timestamp;

public class Post {

    private String content;
    private User blogger;
    private String webLink;
    private static int counter = 0;
    private int postId;
    private long postTime;

    public Post() {
        this.postId = counter;
        counter++;
    }

    public Post(User blogger, String s) {
        this.blogger = blogger;
        this.content = s;
        this.postId = counter;
        counter++;
    }

    public long getPostId() {
        return postId;
    }

    public User getBlogger() {
        return blogger;
    }

    public void setBlogger(User blogger) { this.blogger = blogger; }

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPostTime() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        this.postTime = timestamp.getTime();
    }

    @Override
    public String toString() {
        if(webLink != null) { return this.blogger + ":\n" + this.content + " \n" + this.webLink; }
        else { return this.blogger + ":\n" + this.content; }
    }
}