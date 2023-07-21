package main.expacecat.patterns.generativepatterns.abstractfactory.example.banking;

import main.expacecat.patterns.generativepatterns.abstractfactory.example.Developer;

public class JavaDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Java developer writes code...");
    }
}
