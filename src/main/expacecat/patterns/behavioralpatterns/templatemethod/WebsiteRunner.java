package main.expacecat.patterns.behavioralpatterns.templatemethod;

public class WebsiteRunner extends WelcomePage {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();

        System.out.println("\n========================\n");

        newsPage.showPage();
    }
}
