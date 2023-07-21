package main.expacecat.patterns.structurepatterns.brige.example;

public class BankingSystem extends Program {

    BankingSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Develop Banking Program...");
        developer.writeCode();
    }
}
