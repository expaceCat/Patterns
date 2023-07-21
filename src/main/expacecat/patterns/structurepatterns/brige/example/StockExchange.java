package main.expacecat.patterns.structurepatterns.brige.example;

public class StockExchange extends Program{

    StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Develop StockExchange program...");
        developer.writeCode();
    }
}
