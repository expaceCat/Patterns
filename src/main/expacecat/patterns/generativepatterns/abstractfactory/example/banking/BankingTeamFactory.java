package main.expacecat.patterns.generativepatterns.abstractfactory.example.banking;

import main.expacecat.patterns.generativepatterns.abstractfactory.example.Developer;
import main.expacecat.patterns.generativepatterns.abstractfactory.example.ProjectManager;
import main.expacecat.patterns.generativepatterns.abstractfactory.example.ProjectTeamFactory;
import main.expacecat.patterns.generativepatterns.abstractfactory.example.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer developer() {
        return new JavaDeveloper();
    }

    @Override
    public Tester tester() {
        return new QATester();
    }

    @Override
    public ProjectManager projectManager() {
        return new BankingPM();
    }
}
