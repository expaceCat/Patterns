package main.expacecat.patterns.generativepatterns.abstractfactory.example;

import main.expacecat.patterns.generativepatterns.abstractfactory.example.banking.BankingTeamFactory;

public class SuperbankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.developer();
        Tester tester = projectTeamFactory.tester();
        ProjectManager pm = projectTeamFactory.projectManager();

        System.out.println("Creating bank system....");
        developer.writeCode();
        tester.testCode();
        pm.manageProject();
    }
}
