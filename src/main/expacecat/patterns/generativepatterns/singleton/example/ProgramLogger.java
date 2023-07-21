package main.expacecat.patterns.generativepatterns.singleton.example;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is logfile\n\n";

    public synchronized static ProgramLogger getProgramLogger() {
        if(programLogger == null) {
            return new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger(){}

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
