package main.expacecat.patterns.behavioralpatterns.visitor;

public class ProjectClass implements ProjectElement{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
