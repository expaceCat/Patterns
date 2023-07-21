package main.expacecat.patterns.structurepatterns.decorator;

public class SeniorDeveloper extends JavaDecorator{
    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    public String makeReview() {
        return "Review code.";
    }
    @Override
    public String makeJob() {
        return super.makeJob() + makeReview();
    }
}
