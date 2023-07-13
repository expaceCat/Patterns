package main.expacecat.patterns.builder;

public class ClientBuilder {
    public static void main(String[] args) {

        Director director = new Director();
        director.setBuilder(new VisitWebsiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
