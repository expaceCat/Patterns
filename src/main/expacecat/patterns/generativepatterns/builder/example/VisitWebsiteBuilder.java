package main.expacecat.patterns.generativepatterns.builder.example;


public class VisitWebsiteBuilder extends WebsiteBuilder {

    @Override
    public void buildName() {
        website.setSiteName("Visit website");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    public void buildPrice() {
        website.setPrice(500);
    }

}
