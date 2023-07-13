package main.expacecat.patterns.builder;

public class Website {
    private String siteName;
    private Cms cms;
    private int price;

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Website{" +
                "siteName='" + siteName + '\'' +
                ", cms=" + cms +
                ", price=" + price +
                '}';
    }
}
