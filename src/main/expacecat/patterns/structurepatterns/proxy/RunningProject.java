package main.expacecat.patterns.structurepatterns.proxy;

public class RunningProject {
    public static void main(String[] args) {
        Project project = new ProxyProject("www.github.com/expacecat/project");

        project.run();
    }
}
