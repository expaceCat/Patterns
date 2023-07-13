package main.expacecat.patterns.itterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "MySql"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Mikhail", skills);
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer " + javaDeveloper.getName());
        System.out.println("Skills");

        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }

    }
}
