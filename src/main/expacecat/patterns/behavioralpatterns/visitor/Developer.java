package main.expacecat.patterns.behavioralpatterns.visitor;



public interface Developer {
    public void create(ProjectClass projectClass);

    public void create(DataBase dataBase);

    public void create(Test test);


}
