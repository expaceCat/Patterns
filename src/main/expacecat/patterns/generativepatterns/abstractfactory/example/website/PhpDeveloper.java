package main.expacecat.patterns.generativepatterns.abstractfactory.example.website;

import main.expacecat.patterns.generativepatterns.abstractfactory.example.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PhpDeveloper writes php code...");
    }
}
