package main.expacecat.patterns.behavioralpatterns.visitor;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    @Override
    public void beWritten(Developer developer) {
        for(ProjectElement element : projectElements) {
            element.beWritten(developer);
        }
    }

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new DataBase(),
                new Test()
        };
    }


}
