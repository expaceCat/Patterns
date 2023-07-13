package main.expacecat.patterns.builder;

public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builderSite) {
        this.builder = builderSite;
    }

    Website buildWebsite() {
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        Website website = builder.getWebsite();

        return website;
    }
}
