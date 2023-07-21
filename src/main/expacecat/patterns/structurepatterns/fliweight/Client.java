package main.expacecat.patterns.structurepatterns.fliweight;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        DevelopersFactory developersFactory = new DevelopersFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developersFactory.getDeveloper("Java"));
        developers.add(developersFactory.getDeveloper("Java"));
        developers.add(developersFactory.getDeveloper("Java"));
        developers.add(developersFactory.getDeveloper("Java"));
        developers.add(developersFactory.getDeveloper("C++"));
        developers.add(developersFactory.getDeveloper("C++"));
        developers.add(developersFactory.getDeveloper("C++"));
        developers.add(developersFactory.getDeveloper("C++"));

        for(Developer developer : developers) {
            developer.writeCode();
        }
    }
}
