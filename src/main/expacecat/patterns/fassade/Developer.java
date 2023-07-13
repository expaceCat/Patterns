package main.expacecat.patterns.fassade;

public class Developer {

    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if(bugTracker.isActiveSprint()) {
            System.out.println("Developer write code...");
        } else {
            System.out.println("Developer read Habrahabr...");
        }
    }
}
