import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {

    Blog blog;

    @BeforeEach
    void setUp() {
        ArrayList<String> blogPosts = new ArrayList<String>();
        blog = new Blog("www.blog.com", "The most cool blog on the internet", blogPosts);
    }

    @Test
    void shouldNotifyOneSubscriber() {
        Reader reader = new Reader("Subscriber 1");
        reader.subscribe(blog);
        blog.addBlogPost("Post 1");
        assertEquals("Subscriber 1, New blog post: Blog {, url='www.blog.com', name='The most cool blog on the internet', lastBlogPost='Post 1'}", reader.getLastNotification());
    }

    @Test
    void shouldNotifyAllSubscribers() {
        Reader reader1 = new Reader("Subscriber 1");
        Reader reader2 = new Reader("Subscriber 2");
        reader1.subscribe(blog);
        reader2.subscribe(blog);
        blog.addBlogPost("Post 1");
        assertEquals("Subscriber 1, New blog post: Blog {, url='www.blog.com', name='The most cool blog on the internet', lastBlogPost='Post 1'}", reader1.getLastNotification());
        assertEquals("Subscriber 2, New blog post: Blog {, url='www.blog.com', name='The most cool blog on the internet', lastBlogPost='Post 1'}", reader2.getLastNotification());
    }

    @Test
    void shouldntNotifySubscriber() {
        Reader reader = new Reader("Subscriber 1");
        blog.addBlogPost("Post 1");
        assertEquals(null, reader.getLastNotification());
    }


}