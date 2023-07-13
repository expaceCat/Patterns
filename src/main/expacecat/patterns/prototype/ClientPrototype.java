package main.expacecat.patterns.prototype;

public class ClientPrototype {
    public static void main(String[] args) {
        Project master = new Project(1, "Project", "SourceCode");

        System.out.println(master);

        System.out.println("_____________\n");

        ProjectFactory masterFactory = new ProjectFactory(master);
        Project masterClone = masterFactory.cloneProject();
        System.out.println(masterClone);
    }
}
