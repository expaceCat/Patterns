package main.expacecat.patterns.generativepatterns.builder.example;

public abstract class WebsiteBuilder {
    Website website;

    void createWebsite() {
        website = new Website();
    }

    public abstract void buildName();
    public abstract void buildCms();
    public abstract void buildPrice();

    Website getWebsite() {
        return website;
    }
}
