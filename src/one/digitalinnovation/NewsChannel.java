package one.digitalinnovation;

public class NewsChannel implements Observer {
    private String news;

    public void setNews(String news) {
        this.news = news;
        System.out.println("Breaking News: " + news);
    }

    @Override
    public void update() {
        System.out.println("News Received: " + news);
    }
}
