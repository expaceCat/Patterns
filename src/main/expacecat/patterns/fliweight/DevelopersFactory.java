package main.expacecat.patterns.fliweight;

import java.util.HashMap;
import java.util.Map;

public class DevelopersFactory {
    private static final Map<String, Developer> developersMap = new HashMap<>();

    public Developer getDeveloper(String speciality) {
        Developer developer = developersMap.get(speciality);

        if(developersMap.get(speciality) == null) {
            switch (speciality) {
                case "Java":
                    System.out.println("Hiring Java Developer");
                    developersMap.put(speciality, new JavaDeveloper());
                    developer = developersMap.get(speciality);
                    break;
                case "C++":
                    System.out.println("Hiring C++ Developer");
                    developersMap.put(speciality, new CppDeveloper());
                    developer = developersMap.get(speciality);
                    break;
            }
        }
        return developer;
    }
}
