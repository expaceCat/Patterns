package main.expacecat.patterns.generativepatterns.abstractfactory.example.website;

import main.expacecat.patterns.generativepatterns.abstractfactory.example.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Tester test website...");
    }
}
