package main.expacecat.patterns.structurepatterns.adapter.example;

public class AdapterJavaToDatabase extends ApplicationNew implements Database{

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
