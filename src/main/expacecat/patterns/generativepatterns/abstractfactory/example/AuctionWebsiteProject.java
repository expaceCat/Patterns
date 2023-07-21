package main.expacecat.patterns.generativepatterns.abstractfactory.example;

import main.expacecat.patterns.generativepatterns.abstractfactory.example.website.WebsiteTeamFactory;

public class AuctionWebsiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.developer();
        Tester tester = projectTeamFactory.tester();
        ProjectManager pm = projectTeamFactory.projectManager();

        developer.writeCode();
        tester.testCode();
        pm.manageProject();
    }
}
