package main.expacecat.patterns.generativepatterns.abstractfactory.example;

public interface ProjectTeamFactory
{
    Developer developer();
    Tester tester();
    ProjectManager projectManager();
}
