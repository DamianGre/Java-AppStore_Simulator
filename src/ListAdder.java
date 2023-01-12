import javax.swing.text.StyledEditorKit;
import java.util.List;
import java.util.Random;

public class ListAdder {
    public void possibleEmployesAdder(List<Employees> possibleEmployees){
        possibleEmployees.add(new Employees("Damian", true, false, false, false, false, false, 250.00));
        possibleEmployees.add(new Employees("Tomasz", false, true, false, false, false, false, 270.00));
        possibleEmployees.add(new Employees("Karolina", false, false, true, false, false, false, 235.00));
        possibleEmployees.add(new Employees("Borys", false, false, false, true, false, false, 245.00));
        possibleEmployees.add(new Employees("Sława", false, false, false, false, true, false, 240.00));
        possibleEmployees.add(new Employees("Dorota", false, false, false, false, false, true, 255.00));
        possibleEmployees.add(new Employees("Kamil", true, false, true, false, false, false, 295.00));
        possibleEmployees.add(new Employees("Piotr", true, true, false, false, false, false, 325.00));
        possibleEmployees.add(new Employees("Sasza", true, false, false, true, false, false, 315.00));
        possibleEmployees.add(new Employees("Anna", true, false, false, false, true, false, 330.00));
        possibleEmployees.add(new Employees("Sabina", true, false, false, false, false, true, 350.00));
        possibleEmployees.add(new Employees("Dariusz", true, true, false, true, false, false, 385.00));
        possibleEmployees.add(new Employees("Brygida", true, true, false, false, true, false, 490.00));
        possibleEmployees.add(new Employees("Donald", true, true, false, true, true, false, 495.00));
        possibleEmployees.add(new Employees("Beata", true, true, true, true, true, true, 535.00));
        possibleEmployees.add(new Employees("Karyna", true, false, false, false, false, true, 550.00));
        possibleEmployees.add(new Employees("Julia", true, true, false, true, false, false, 560.00));
        possibleEmployees.add(new Employees("Sebastian", true, true, true, false, true, false, 555.00));
        possibleEmployees.add(new Employees("Patryk", true, true, true, true, true, true, 570.00));
        possibleEmployees.add(new Employees("Stanisław", true, true, true, true, true, true, 650.00));
    }

    public void possibleProjectAdderTier1(List<Project> projects) {
        //10 projects from 1 level complexity
        projects.add(new Project("Web app", Project.ProjectType.Frontend, null, null,
                "Heyos", 5, 20000.00, 7000.00, 5,
                1));
        projects.add(new Project("SPA", Project.ProjectType.Pretashop, null, null,
                "Spasan", 3, 15000.00, 5000.00, 5,
                1));
        projects.add(new Project("Web app", Project.ProjectType.Mobile, null, null,
                "Felinta", 3, 22000.00, 7000.00, 5,
                1));
        projects.add(new Project("Mobile App", Project.ProjectType.Wordpress, null, null,
                "Gagle", 3, 25000.00, 8000.00, 5,
                1));
        projects.add(new Project("Data Base", Project.ProjectType.Database, null, null,
                "Zawiru", 3, 17500.00, 8000.00, 5,
                1));
        projects.add(new Project("Web app", Project.ProjectType.Mobile, null, null,
                "Heyos", 5, 20000.00, 7000.00, 5,
                1));
        projects.add(new Project("SPA", Project.ProjectType.Frontend, null, null,
                "Spasan", 3, 15000.00, 5000.00, 5,
                1));
        projects.add(new Project("Web app", Project.ProjectType.Backend, null, null,
                "Felinta", 3, 22000.00, 7000.00, 5,
                1));
        projects.add(new Project("Mobile App", Project.ProjectType.Wordpress, null, null,
                "Gagle", 3, 25000.00, 8000.00, 5,
                1));
        projects.add(new Project("Data Base", Project.ProjectType.Pretashop, null, null,
                "Zawiru", 3, 17500.00, 8000.00, 5,
                1));
    }
    public void possibleProjectAdderTier2(List<Project> projects) {
        //9 projects from 2 level complexity
        projects.add(new Project("Web app", Project.ProjectType.Frontend, Project.ProjectType.Backend, null,
                "Heyos", 5, 20000.00, 7000.00, 5,
                2));
        projects.add(new Project("SPA", Project.ProjectType.Frontend, Project.ProjectType.Database, null,
                "Spasan", 3, 15000.00, 5000.00, 5,
                2));
        projects.add(new Project("Web app", Project.ProjectType.Mobile, Project.ProjectType.Backend, null,
                "Felinta", 3, 22000.00, 7000.00, 5,
                2));
        projects.add(new Project("Mobile App", Project.ProjectType.Frontend, Project.ProjectType.Wordpress, null,
                "Gagle", 3, 25000.00, 8000.00, 5,
                2));
        projects.add(new Project("Data Base", Project.ProjectType.Mobile, Project.ProjectType.Database, null,
                "Zawiru", 3, 17500.00, 8000.00, 5,
                2));
        projects.add(new Project("Web app", Project.ProjectType.Frontend, Project.ProjectType.Wordpress, null,
                "Heyos", 5, 20000.00, 7000.00, 5,
                2));
        projects.add(new Project("SPA", Project.ProjectType.Mobile, Project.ProjectType.Database, null,
                "Spasan", 3, 15000.00, 5000.00, 5,
                2));
        projects.add(new Project("Web app", Project.ProjectType.Frontend, Project.ProjectType.Backend, null,
                "Felinta", 3, 22000.00, 7000.00, 5,
                2));
        projects.add(new Project("Mobile App", Project.ProjectType.Frontend, Project.ProjectType.Wordpress, null,
                "Gagle", 3, 25000.00, 8000.00, 5,
                2));
    }

    public void possibleProjectAdderTier3(List<Project> projects) {
        //4 projects from 3 level complexity
        projects.add(new Project("SPA", Project.ProjectType.Frontend, Project.ProjectType.Backend, Project.ProjectType.Pretashop,
                "Spasan", 3, 15000.00, 5000.00, 5,
                3));
        projects.add(new Project("Web app", Project.ProjectType.Mobile, Project.ProjectType.Backend, Project.ProjectType.Database,
                "Felinta", 3, 22000.00, 7000.00, 5,
                3));
        projects.add(new Project("Mobile App", Project.ProjectType.Frontend, Project.ProjectType.Wordpress, Project.ProjectType.Database,
                "Gagle", 3, 25000.00, 8000.00, 5,
                3));
        projects.add(new Project("Data Base", Project.ProjectType.Database, Project.ProjectType.Backend, Project.ProjectType.Wordpress,
                "Zawiru", 3, 17500.00, 8000.00, 5,
                3));
    }

    public void friendEmployes(List<Employees> friendEmployees){
                    Employees friend1 = new Employees("Krystian", true, true, true, true, true, true, null);
                    friend1.projectSalary = 12500.00;
                    friend1.workingOnProjectDays = 12;
                    friend1.failureChanace = 0;
                    friendEmployees.add(friend1);
                    Employees friend2 = new Employees("Asia", true, true, false, true, false, true, null);
                    friend2.projectSalary = 10250.00;
                    friend2.workingOnProjectDays = 18;
                    friend2.failureChanace = 12;
                    friendEmployees.add(friend2);
                    Employees friend3 = new Employees("Tomasz", true, true, true, true, true, true, null);
                    friend3.projectSalary = 16500.00;
                    friend3.workingOnProjectDays = 22;
                    friend3.failureChanace = 31;
                    friendEmployees.add(friend3);
                    Employees friend4 = new Employees("Paweł", true, true, true, true, true, true, null);
                    friend1.projectSalary = 15000.00;
                    friend1.workingOnProjectDays = 15;
                    friend1.failureChanace = 0;
                    friendEmployees.add(friend4);
                    Employees friend5 = new Employees("Katarzyna", true, true, true, false, true, true, null);
                    friend2.projectSalary = 10000.00;
                    friend2.workingOnProjectDays = 20;
                    friend2.failureChanace = 15;
                    friendEmployees.add(friend5);
                    Employees friend6 = new Employees("Basia", true, false, true, true, false, false, null);
                    friend3.projectSalary = 8200.00;
                    friend3.workingOnProjectDays = 25;
                    friend3.failureChanace = 30;
                    friendEmployees.add(friend6);

                    Employees friend7 = new Employees("Stasia", true, true, true, true, true, true, null);
                    friend1.projectSalary = 16000.00;
                    friend1.workingOnProjectDays = 17;
                    friend1.failureChanace = 0;
                    friendEmployees.add(friend7);
                    Employees friend8 = new Employees("Ryszard", false, false, true, true, true, false, null);
                    friend2.projectSalary = 12000.00;
                    friend2.workingOnProjectDays = 21;
                    friend2.failureChanace = 17;
                    friendEmployees.add(friend8);
                    Employees friend9 = new Employees("Kuba", false, true, false, true, false, true, null);
                    friend3.projectSalary = 9500.00;
                    friend3.workingOnProjectDays = 27;
                    friend3.failureChanace = 35;
                    friendEmployees.add(friend9);
                }
            }



