package main.expacecat.patterns.decorator;

public class TeamlidJavaDeveloper extends JavaDecorator{
    public TeamlidJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String sendReview() {
        return "Send review to customer";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendReview();
    }
}
