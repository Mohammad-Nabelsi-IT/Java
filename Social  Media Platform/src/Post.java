import java.util.Date;

public class Post  {
    static  int count = 100;
    private int postId;
    private String content;
    private Date timestamp;

    private  User createdBy;

    public Post( String content,  User user) {
        this.postId = ++count;
        this.content = content;
        this.timestamp = new Date();
        this.createdBy = user;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return
                "postId=" + postId +
                        ", content='" + content + '\'' +
                        ", timestamp='" + timestamp + '\'' +
                        ",USer='" + createdBy + '\'' +
                        '}';
    }

    public void post() {
        System.out.println("post");
    }

    public class Comment{
    private String content;
    private User user;

         public Comment(String content, User user) {
             this.content = content;
             this.user = user;
         }

         public String getContent() {
             return content;
         }

         public void setContent(String content) {
             this.content = content;
         }

         public User getUser() {
             return user;
         }

         public void setUser(User user) {
             this.user = user;
         }

         @Override
         public String toString() {
             return "comment{" +
                     "content='" + content + '\'' +
                     ", user=" + user +
                     '}';
         }
     }
}
