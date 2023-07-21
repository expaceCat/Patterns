package main.expacecat.patterns.generativepatterns.abstractfactory.example.website;

import main.expacecat.patterns.generativepatterns.abstractfactory.example.Developer;
import main.expacecat.patterns.generativepatterns.abstractfactory.example.ProjectManager;
import main.expacecat.patterns.generativepatterns.abstractfactory.example.ProjectTeamFactory;
import main.expacecat.patterns.generativepatterns.abstractfactory.example.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer developer() {
        return new PhpDeveloper();
    }

    @Override
    public Tester tester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager projectManager() {
        return new WebsitePM();
    }
}
