package main.expacecat.patterns.behavioralpatterns.chainofresponsibility;

public class SimpleReportNotifier extends Notifier{

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String massage) {
        System.out.println("Notifying using simple report " + massage);
    }


}
