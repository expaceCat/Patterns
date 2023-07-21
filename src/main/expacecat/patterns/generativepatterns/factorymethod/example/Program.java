package main.expacecat.patterns.generativepatterns.factorymethod.example;



public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String special){
        if (special.equalsIgnoreCase("Java")){
            return new JavaDeveloperFactory();
        } else if (special.equalsIgnoreCase("Cpp")) {
            return new CppDeveloperFactory();
        } else if (special.equalsIgnoreCase("php")){
                return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(special + " is unknown speciality");
        }
    }
}
