import java.util.Observable;
import java.util.Observer;

public class Reader implements Observer {

    private String name;
    private String lastNotification;

    public Reader(String name) {
        this.name = name;
    }

    public String getLastNotification() {
        return this.lastNotification;
    }

    public void subscribe(Blog blog) {
        blog.addObserver(this);
    }

    public void update(Observable blogPost, Object arg1) {
        this.lastNotification = this.name + ", New blog post: " + blogPost.toString();
    }
}
