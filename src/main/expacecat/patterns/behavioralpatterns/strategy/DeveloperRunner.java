package main.expacecat.patterns.behavioralpatterns.strategy;

public class DeveloperRunner {
    public static void main(String[] args) {


        Developer developer = new Developer();
        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Traning());
        developer.executeActivity();

        developer.setActivity(new Codding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();
    }
}
