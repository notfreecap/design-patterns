package observer;

public class ClientObserver {
    public static void main(String[] args) {

        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsChannel observer = new PCLNewsChannel();
        PCLNewsBlog blog = new PCLNewsBlog();

        observable.addPropertyChangeListener(observer);
        observable.addPropertyChangeListener(blog);
        observable.setNews("news 1", "beta");

        System.out.println(observer.getNews());
        System.out.println(blog.getNews());

    }
}
