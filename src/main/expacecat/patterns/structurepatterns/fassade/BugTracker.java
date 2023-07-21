package main.expacecat.patterns.structurepatterns.fassade;

public class BugTracker {
    public boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint(){
        System.out.println("Sprint is active...");
        activeSprint = true;
    }

    public void stopSprint() {
        System.out.println("Sprint is stopped...");
        activeSprint = false;
    }


}
