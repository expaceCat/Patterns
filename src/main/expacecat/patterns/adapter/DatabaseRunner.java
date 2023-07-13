package main.expacecat.patterns.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.select();
        database.insert();
        database.remove();
        database.update();
    }
}
