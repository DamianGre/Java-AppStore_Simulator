import javax.swing.text.StyledEditorKit;
import java.util.List;
import java.util.Random;

public class ListAdder {
    public void possibleEmployesAdder1_1(List<Employees> possibleEmployees1_1){
        possibleEmployees1_1.add(new Employees("Damian", true, false, false, false, false, false, 250.00));
        possibleEmployees1_1.add(new Employees("Tomasz", false, true, false, false, false, false, 270.00));
        possibleEmployees1_1.add(new Employees("Karolina", false, false, true, false, false, false, 235.00));
        possibleEmployees1_1.add(new Employees("Borys", false, false, false, true, false, false, 245.00));
    }
    public void possibleEmployesAdder1_2(List<Employees> possibleEmployees1_2){
        possibleEmployees1_2.add(new Employees("Dorota", false, false, false, false, false, true, 255.00));
        possibleEmployees1_2.add(new Employees("Kamil", true, false, true, false, false, false, 295.00));
        possibleEmployees1_2.add(new Employees("Sasza", true, false, false, true, false, false, 315.00));
    }
    public void possibleEmployesAdder1_3(List<Employees> possibleEmployees1_3){
        possibleEmployees1_3.add(new Employees("Sabina", true, false, false, false, false, true, 350.00));
        possibleEmployees1_3.add(new Employees("Dariusz", true, true, false, true, false, false, 385.00));
        possibleEmployees1_3.add(new Employees("Brygida", true, true, false, false, true, false, 490.00));
        possibleEmployees1_3.add(new Employees("Donald", true, true, false, true, true, false, 495.00));

    }
    public void possibleEmployesAdder1_4(List<Employees> possibleEmployees1_4){
        possibleEmployees1_4.add(new Employees("Anna", true, false, false, false, true, false, 330.00));
        possibleEmployees1_4.add(new Employees("Beata", true, true, true, true, true, true, 535.00));
        possibleEmployees1_4.add(new Employees("Karyna", true, false, false, false, false, true, 550.00));
    }
    public void possibleEmployesAdder1_5(List<Employees> possibleEmployees1_5){
        possibleEmployees1_5.add(new Employees("Julia", true, true, false, true, false, false, 560.00));
        possibleEmployees1_5.add(new Employees("Sebastian", true, true, true, false, true, false, 555.00));
        possibleEmployees1_5.add(new Employees("Patryk", true, true, true, true, true, true, 570.00));
    }
    public void possibleEmployesAdder1_6(List<Employees> possibleEmployees1_6){
        possibleEmployees1_6.add(new Employees("Stanisław", true, true, true, true, true, true, 650.00));
        possibleEmployees1_6.add(new Employees("Sława", false, false, false, false, true, false, 240.00));
        possibleEmployees1_6.add(new Employees("Piotr", true, true, false, false, false, false, 325.00));
    }

    public void possibleProjectAdderTier1_1(List<Project> projectsTier1_1) {
        //10 projects from 1 level complexity
        projectsTier1_1.add(new Project("Web app", Project.ProjectType.Frontend, null, null,
                "Heyos", 5, 20000.00, 7000.00, 5,
                1));
        projectsTier1_1.add(new Project("SPA", Project.ProjectType.Pretashop, null, null,
                "Spasan", 3, 15000.00, 5000.00, 5,
                1));
        projectsTier1_1.add(new Project("Web app", Project.ProjectType.Mobile, null, null,
                "Felinta", 3, 22000.00, 7000.00, 5,
                1));
        projectsTier1_1.add(new Project("Mobile App", Project.ProjectType.Wordpress, null, null,
                "Gagle", 3, 25000.00, 8000.00, 5,
                1));
    }

    public void possibleProjectAdderTier1_2(List<Project> projectsTier1_2) {
        projectsTier1_2.add(new Project("Data Base", Project.ProjectType.Database, null, null,
                "Zawiru", 3, 17500.00, 8000.00, 5,
                1));
        projectsTier1_2.add(new Project("Web app", Project.ProjectType.Mobile, null, null,
                "Heyos", 5, 20000.00, 7000.00, 5,
                1));
        projectsTier1_2.add(new Project("SPA", Project.ProjectType.Frontend, null, null,
                "Spasan", 3, 15000.00, 5000.00, 5,
                1));
    }
    public void possibleProjectAdderTier1_3(List<Project> projectsTier1_3) {
        projectsTier1_3.add(new Project("Web app", Project.ProjectType.Backend, null, null,
                "Felinta", 3, 22000.00, 7000.00, 5,
                1));
        projectsTier1_3.add(new Project("Mobile App", Project.ProjectType.Wordpress, null, null,
                "Gagle", 3, 25000.00, 8000.00, 5,
                1));
        projectsTier1_3.add(new Project("Data Base", Project.ProjectType.Pretashop, null, null,
                "Zawiru", 3, 17500.00, 8000.00, 5,
                1));
    }

    public void possibleProjectAdderTier2_1(List<Project> projectsTier2_1) {
        projectsTier2_1.add(new Project("Web app", Project.ProjectType.Frontend, Project.ProjectType.Backend, null,
                "Heyos", 5, 20000.00, 7000.00, 5,
                2));
        projectsTier2_1.add(new Project("SPA", Project.ProjectType.Frontend, Project.ProjectType.Database, null,
                "Spasan", 3, 15000.00, 5000.00, 5,
                2));
    }


    public void possibleProjectAdderTier2_2(List<Project> projectsTier2_2) {
            projectsTier2_2.add(new Project("Web app", Project.ProjectType.Mobile, Project.ProjectType.Backend, null,
                    "Felinta", 3, 22000.00, 7000.00, 5,
                    2));
            projectsTier2_2.add(new Project("Mobile App", Project.ProjectType.Frontend, Project.ProjectType.Wordpress, null,
                    "Gagle", 3, 25000.00, 8000.00, 5,
                    2));
            projectsTier2_2.add(new Project("Data Base", Project.ProjectType.Mobile, Project.ProjectType.Database, null,
                    "Zawiru", 3, 17500.00, 8000.00, 5,
                    2));
        }
    public void possibleProjectAdderTier2_3(List<Project> projectsTier2_3) {
        projectsTier2_3.add(new Project("Web app", Project.ProjectType.Frontend, Project.ProjectType.Wordpress, null,
                "Heyos", 5, 20000.00, 7000.00, 5,
                2));
        projectsTier2_3.add(new Project("SPA", Project.ProjectType.Mobile, Project.ProjectType.Database, null,
                "Spasan", 3, 15000.00, 5000.00, 5,
                2));
        projectsTier2_3.add(new Project("Web app", Project.ProjectType.Frontend, Project.ProjectType.Backend, null,
                "Felinta", 3, 22000.00, 7000.00, 5,
                2));
    }


    public void possibleProjectAdderTier3_1(List<Project> projectsTier3_1) {
        projectsTier3_1.add(new Project("SPA", Project.ProjectType.Frontend, Project.ProjectType.Backend, Project.ProjectType.Pretashop,
                    "Spasan", 3, 15000.00, 5000.00, 5,
                    3));
        projectsTier3_1.add(new Project("Web app", Project.ProjectType.Mobile, Project.ProjectType.Backend, Project.ProjectType.Database,
                    "Felinta", 3, 22000.00, 7000.00, 5,
                    3));

    }
    public void possibleProjectAdderTier3_2(List<Project> projectsTier3_2) {
        projectsTier3_2.add(new Project("Mobile App", Project.ProjectType.Frontend, Project.ProjectType.Wordpress, Project.ProjectType.Database,
                "Gagle", 3, 25000.00, 8000.00, 5,
                3));
        projectsTier3_2.add(new Project("Data Base", Project.ProjectType.Database, Project.ProjectType.Backend, Project.ProjectType.Wordpress,
                "Zawiru", 3, 17500.00, 8000.00, 5,
                3));
    }

    public void friendEmployesAdder(List<Employees> friendEmployees1, List<Employees> friendEmployees2, List<Employees> friendEmployees3){
                    Employees friend1 = new Employees("Krystian", true, true, true, true, true, true, 500.00);
                    friend1.workingOnProjectDays = 12;
                    friend1.failureChanace = 0;
                    friendEmployees1.add(friend1);
                    Employees friend2 = new Employees("Asia", true, true, false, true, false, true, 435.00);
                    friend2.workingOnProjectDays = 18;
                    friend2.failureChanace = 12;
                    friendEmployees1.add(friend2);
                    Employees friend3 = new Employees("Tomasz", true, true, true, true, true, true, 475.00);
                    friend3.workingOnProjectDays = 22;
                    friend3.failureChanace = 31;
                    friendEmployees1.add(friend3);

                    Employees friend4 = new Employees("Paweł", true, true, true, true, true, true, 555.00);
                    friend1.workingOnProjectDays = 15;
                    friend1.failureChanace = 0;
                    friendEmployees2.add(friend4);
                    Employees friend5 = new Employees("Katarzyna", true, true, true, false, true, true, 465.00);
                    friend2.workingOnProjectDays = 20;
                    friend2.failureChanace = 15;
                    friendEmployees2.add(friend5);
                    Employees friend6 = new Employees("Basia", true, false, true, true, false, false, 535.00);
                    friend3.workingOnProjectDays = 25;
                    friend3.failureChanace = 30;
                    friendEmployees2.add(friend6);

                    Employees friend7 = new Employees("Stasia", true, true, true, true, true, true, 510.00);
                    friend1.workingOnProjectDays = 17;
                    friend1.failureChanace = 0;
                    friendEmployees3.add(friend7);
                    Employees friend8 = new Employees("Ryszard", false, false, true, true, true, false, 750.00);
                    friend2.workingOnProjectDays = 21;
                    friend2.failureChanace = 17;
                    friendEmployees3.add(friend8);
                    Employees friend9 = new Employees("Kuba", false, true, false, true, false, true, 850.00);
                    friend3.workingOnProjectDays = 27;
                    friend3.failureChanace = 35;
                    friendEmployees3.add(friend9);
    }
}



