import java.util.ArrayList;
import java.util.Observable;

public class Blog extends Observable {

    private ArrayList<String> blogPosts;
    private String url;
    private String name;

    public Blog( String url, String name, ArrayList<String> blogPosts) {
        this.blogPosts = blogPosts;
        this.url = url;
        this.name = name;
    }

    public void addBlogPost(String post) {
        blogPosts.add(post);
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Blog {" +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", lastBlogPost='" + blogPosts.get(blogPosts.size() - 1) + '\'' +
                '}';
    }
}
