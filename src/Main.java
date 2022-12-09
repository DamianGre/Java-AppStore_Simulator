import java.util.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Company damianGre = new Company("DamianGre");

        List<Project> projects = new ArrayList<Project>();

        //Projects to pickup by random generator
        //5 projects from 1 level complexity
        projects.add(new Project("Web app", Project.ProjectType.Frontend, null ,null,
                "Heyos",3,20000.00, 7000.00, 5,
                1));
        projects.add(new Project("SPA", Project.ProjectType.Frontend, null, null,
                "Spasan",3,15000.00, 5000.00, 5,
                1));
        projects.add(new Project("Web app", Project.ProjectType.Frontend, Project.ProjectType.Backend, null,
                "Felinta",3,22000.00, 7000.00, 5,
                1));
        projects.add(new Project("Mobile App", Project.ProjectType.Frontend, Project.ProjectType.Wordpress, null,
                "Gagle",3,25000.00, 8000.00, 5,
                1));
        projects.add(new Project("Data Base", Project.ProjectType.Database, null, null,
                "Zawiru",3,17500.00, 8000.00, 5,
                1));

        System.out.println(projects.get(0));
        System.out.println("Balance: " + damianGre.balance);
        damianGre.acceptProject(projects.get(0));
        System.out.println("Balance: " + damianGre.balance);

    }
}