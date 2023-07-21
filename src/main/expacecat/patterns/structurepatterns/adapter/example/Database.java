package main.expacecat.patterns.structurepatterns.adapter.example;

public interface Database {

    public void insert();

    public void update();

    public void select();

    public void remove();
}