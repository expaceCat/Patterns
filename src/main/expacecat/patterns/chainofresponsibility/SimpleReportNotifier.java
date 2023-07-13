package main.expacecat.patterns.chainofresponsibility;

public class SimpleReportNotifier extends Notifier{

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String massage) {
        System.out.println("Notifying using simple report " + massage);
    }


}
