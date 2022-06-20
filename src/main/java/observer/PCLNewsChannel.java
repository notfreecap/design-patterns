package observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLNewsChannel implements PropertyChangeListener {

    private String news;


    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        System.out.println("YOU CAN DO EVERYTHING YOU WANT");
        this.setNews((String) propertyChangeEvent.getNewValue());
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
