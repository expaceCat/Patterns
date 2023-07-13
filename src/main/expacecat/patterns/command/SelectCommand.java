package main.expacecat.patterns.command;

public class SelectCommand implements Command{

    Database database;

    @Override
    public void execute() {
        database.select();
    }

    public SelectCommand(Database database) {
        this.database = database;
    }
}
