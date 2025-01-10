import java.util.Arrays;
import java.util.Date;

public class RegularUser extends User implements Postable, Likeable {
    private Post[] posts;

    public RegularUser(String userName, String email, String password) {
        super(userName, email, password);
        posts=new Post[10];
    }

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }



    @Override
    public void like() {

    }

    @Override
    public Post post(String content) {
        System.out.println(this.getUserName());
        Post p =new Post(content, this); //
        for (int i = 0; i <posts.length ; i++) {
            if (posts[i]==null){
                posts[i]=p;
                break;
            }
        }
        return  p;
    }
}
