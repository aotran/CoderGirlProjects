import java.sql.Timestamp;

public class Post {
    
    private String content;
    private User blogger;
    private String webLink;
    private static int counter = 0;
    private int postId;
    private long postTime;

    public Post(User blogger, String s) {
        counter++;
        this.blogger = blogger;
        this.content = s;
        this.postId = counter;
    }

    public String getContent() {
        return content;
    }

    public long getPostId() {
        return postId;
    }

    public User getBlogger() {
        return blogger;
    }

    public String getWebLink() {
        return webLink;
    }
    
    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPostTime() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        this.postTime = timestamp.getTime();
    }
}