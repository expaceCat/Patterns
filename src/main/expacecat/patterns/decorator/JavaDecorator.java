package main.expacecat.patterns.decorator;

public class JavaDecorator implements Developer{
    Developer developer;

    public JavaDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
