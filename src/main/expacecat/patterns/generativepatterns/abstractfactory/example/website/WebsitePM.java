package main.expacecat.patterns.generativepatterns.abstractfactory.example.website;

import main.expacecat.patterns.generativepatterns.abstractfactory.example.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manage website project...");
    }
}
