package main.expacecat.patterns.fassade;

public class SprintFassade {
    Developer developer = new Developer();
    BugTracker bugTracker = new BugTracker();
    Job job = new Job();

    public void doJobSprint() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
        bugTracker.stopSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
