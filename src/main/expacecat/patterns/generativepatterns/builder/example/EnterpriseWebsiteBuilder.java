package main.expacecat.patterns.generativepatterns.builder.example;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {

    @Override
    public void buildName() {
        website.setSiteName("Enterprise website");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    public void buildPrice() {
        website.setPrice(10000);
    }
}
