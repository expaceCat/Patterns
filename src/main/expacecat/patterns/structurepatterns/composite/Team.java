package main.expacecat.patterns.structurepatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {

    List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void deleteDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void createProject() {
        System.out.println("Project creating: \n");
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
