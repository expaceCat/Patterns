package main.expacecat.patterns.behavioralpatterns.memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GitHubRepo git = new GitHubRepo();

        System.out.println("Creating new Project Version 1.0...");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current version to GitHub...");
        git.setSave(project.save());

        System.out.println("Updating project to Version 1.1");
        System.out.println("Write code...");
        Thread.sleep(3000);
        project.setVersionAndDate("Version 1.1");
        System.out.println(project);

        System.out.println("Something went wrong...");
        System.out.println("Rolling back to 1.0");
        project.load(git.getSave());

        System.out.println("Project after rollback");
        System.out.println(project);


    }
}
