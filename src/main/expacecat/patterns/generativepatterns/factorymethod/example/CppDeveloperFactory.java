package main.expacecat.patterns.generativepatterns.factorymethod.example;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
