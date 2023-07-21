package main.expacecat.patterns.behavioralpatterns.visitor;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class Junior...");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Writing database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable test...");
    }
}
