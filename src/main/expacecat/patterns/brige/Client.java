package main.expacecat.patterns.brige;

public class Client {
    public static void main(String[] args) {

        Program[] programs = {new BankingSystem(new CppDeveloper()),
                new StockExchange(new JavaDeveloper())
        };

        for (Program program : programs) {
            program.developProgram();
        }

    }
}
