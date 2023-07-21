package main.expacecat.patterns.generativepatterns.singleton.example;

public class ProgramRunner {
    public static void main(String[] args) {
       ProgramLogger.getProgramLogger().addLogInfo("Firs log...");
       ProgramLogger.getProgramLogger().addLogInfo("Second log...");
       ProgramLogger.getProgramLogger().addLogInfo("Third log...");
        ProgramLogger.getProgramLogger().showLogFile();


    }
}
