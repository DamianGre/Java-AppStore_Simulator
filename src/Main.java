import java.util.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println(Project.ProjectType.FRONTEND);

        List<Project> projects = new ArrayList<Project>();

        projects.add(new Project("Web app",
                "Heyos",50000.00, 7000.00, 5,
                Project.ProjectType.FRONTEND, Project.ComplexityLevel.Easy));

        System.out.println(projects.get(0));
    }
}