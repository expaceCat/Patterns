package main.expacecat.patterns.behavioralpatterns.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java position");
        jobSite.addVacancy("Second Java position");

        Observer firstSubscriber = new Subscriber("Mikhail");
        Observer secondSubscriber = new Subscriber("Irina");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java position");
        jobSite.removeVacancy("Third Java position");
    }
}
