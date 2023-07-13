package main.expacecat.patterns.brige;

public abstract class Program {

    protected Developer developer;

    protected Program (Developer developerd) {
        this.developer = developerd;
    }

    public abstract void developProgram();
}
