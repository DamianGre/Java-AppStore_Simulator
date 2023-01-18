import javax.swing.text.StyledEditorKit;
import java.util.List;
import java.util.Random;

public class ListAdder {
    public void possibleEmployesAdder1_1(List<Employees> possibleEmployees1_1){
        possibleEmployees1_1.add(new Employees("Damian", "Wordpress", 250.00));
        possibleEmployees1_1.add(new Employees("Tomasz",  "Backend", 270.00));
        possibleEmployees1_1.add(new Employees("Karolina", "Database", 235.00));
        possibleEmployees1_1.add(new Employees("Borys", "Mobile", 245.00));
    }
    public void possibleEmployesAdder1_2(List<Employees> possibleEmployees1_2){
        possibleEmployees1_2.add(new Employees("Dorota", "Backend", 255.00));
        possibleEmployees1_2.add(new Employees("Kamil", "Database", 295.00));
        possibleEmployees1_2.add(new Employees("Sasza", "Mobile", 315.00));
    }
    public void possibleEmployesAdder1_3(List<Employees> possibleEmployees1_3){
        possibleEmployees1_3.add(new Employees("Sabina", "Frontend", 350.00));
        possibleEmployees1_3.add(new Employees("Dariusz","Database", 385.00));
        possibleEmployees1_3.add(new Employees("Brygida", "Frontend", 490.00));
        possibleEmployees1_3.add(new Employees("Donald", "Backend", 495.00));

    }
    public void possibleEmployesAdder1_4(List<Employees> possibleEmployees1_4){
        possibleEmployees1_4.add(new Employees("Anna", "Frontend", 330.00));
        possibleEmployees1_4.add(new Employees("Beata", "Wordpress", 535.00));
        possibleEmployees1_4.add(new Employees("Karyna", "FrontEnd", 550.00));
    }
    public void possibleEmployesAdder1_5(List<Employees> possibleEmployees1_5){
        possibleEmployees1_5.add(new Employees("Julia", "Backend", 560.00));
        possibleEmployees1_5.add(new Employees("Sebastian", "Database", 555.00));
        possibleEmployees1_5.add(new Employees("Patryk", "Wordpress", 570.00));
    }
    public void possibleEmployesAdder1_6(List<Employees> possibleEmployees1_6){
        possibleEmployees1_6.add(new Employees("Stanisław", "Frontend", 650.00));
        possibleEmployees1_6.add(new Employees("Sława", "Database", 240.00));
        possibleEmployees1_6.add(new Employees("Piotr", "Backend", 325.00));
    }

    public void possibleProjectAdderTier1_1(List<Project> projectsTier1_1) {
        //10 projects from 1 level complexity
        projectsTier1_1.add(new Project( "Frontend",
                "Hey", 6, 6500.00,
                1));
        projectsTier1_1.add(new Project("Wordpress",
                "Spas", 3, 3500.00,
                1));
        projectsTier1_1.add(new Project("Mobile",
                "Felinta", 3, 2500.00,
                1));
        projectsTier1_1.add(new Project( "Backend",
                "Gagle", 4, 4000.00,
                1));
    }

    public void possibleProjectAdderTier1_2(List<Project> projectsTier1_2) {
        projectsTier1_2.add(new Project( "Database",
                "Zawiru", 6, 7000.00,
                1));
        projectsTier1_2.add(new Project( "Mobile",
                "Heyos", 6, 5000.00,
                1));
        projectsTier1_2.add(new Project( "Frontend",
                "Spasan", 5, 3000.00,
                1));
    }
    public void possibleProjectAdderTier1_3(List<Project> projectsTier1_3) {
        projectsTier1_3.add(new Project( "Backend",
                "Fel", 7, 6500.00,
                1));
        projectsTier1_3.add(new Project( "Wordpress",
                "Gar", 8, 11000.00,
                1));
        projectsTier1_3.add(new Project( "Database",
                "Zawru", 9, 10500.00,
                1));
    }

    public void possibleProjectAdderTier2_1(List<Project> projectsTier2_1) {
        projectsTier2_1.add(new Project( "Backend",
                "Yos", 6, 5000.00,
                2));
        projectsTier2_1.add(new Project( "Frontend",
                "Ssan", 9, 9000.00,
                2));
    }


    public void possibleProjectAdderTier2_2(List<Project> projectsTier2_2) {
            projectsTier2_2.add(new Project( "Mobile",
                    "Belinta", 10, 10000.00,
                    2));
            projectsTier2_2.add(new Project("Frontend",
                    "Gle", 11, 9000.00,
                    2));
            projectsTier2_2.add(new Project( "Mobile",
                    "Rur", 13, 9500.00,
                    2));
        }
    public void possibleProjectAdderTier2_3(List<Project> projectsTier2_3) {
        projectsTier2_3.add(new Project( "Backend",
                "Dus", 11, 10500.00,
                2));
        projectsTier2_3.add(new Project( "Mobile",
                "Hus", 12, 11000.00,
                2));
        projectsTier2_3.add(new Project( "Frontend",
                "Frus", 14, 12000.00,
                2));
    }


    public void possibleProjectAdderTier3_1(List<Project> projectsTier3_1) {
        projectsTier3_1.add(new Project( "Wordpress",
                    "Lupi", 4, 4500.00,
                    3));
        projectsTier3_1.add(new Project( "Database",
                    "Fizu", 6, 11000.00,
                    3));

    }
    public void possibleProjectAdderTier3_2(List<Project> projectsTier3_2) {
        projectsTier3_2.add(new Project( "Backend",
                "Charpu", 5, 5000.00,
                3));
        projectsTier3_2.add(new Project( "Database",
                "Zinx", 12, 17500.00,
                3));
    }

    public void friendEmployesAdder(List<Employees> friendEmployees1, List<Employees> friendEmployees2, List<Employees> friendEmployees3){
                    Employees friend1 = new Employees("Krystian", "Frontend", 500.00);
                    friend1.workingOnProjectDays = 12;
                    friend1.failureChanace = 0;
                    friendEmployees1.add(friend1);
                    Employees friend2 = new Employees("Asia", "Mobile", 435.00);
                    friend2.workingOnProjectDays = 18;
                    friend2.failureChanace = 12;
                    friendEmployees1.add(friend2);
                    Employees friend3 = new Employees("Tomasz","Database", 515.00);
                    friend3.workingOnProjectDays = 22;
                    friend3.failureChanace = 31;
                    friendEmployees1.add(friend3);

                    Employees friend4 = new Employees("Paweł", "Frontend", 555.00);
                    friend1.workingOnProjectDays = 15;
                    friend1.failureChanace = 0;
                    friendEmployees2.add(friend4);
                    Employees friend5 = new Employees("Katarzyna", "Wordpress", 495.00);
                    friend2.workingOnProjectDays = 20;
                    friend2.failureChanace = 15;
                    friendEmployees2.add(friend5);
                    Employees friend6 = new Employees("Basia",  "Database", 535.00);
                    friend3.workingOnProjectDays = 25;
                    friend3.failureChanace = 30;
                    friendEmployees2.add(friend6);

                    Employees friend7 = new Employees("Stasia", "Wordpress", 510.00);
                    friend1.workingOnProjectDays = 17;
                    friend1.failureChanace = 0;
                    friendEmployees3.add(friend7);
                    Employees friend8 = new Employees("Ryszard", "Mobile", 750.00);
                    friend2.workingOnProjectDays = 21;
                    friend2.failureChanace = 17;
                    friendEmployees3.add(friend8);
                    Employees friend9 = new Employees("Kuba",  "Backend", 850.00);
                    friend3.workingOnProjectDays = 27;
                    friend3.failureChanace = 35;
                    friendEmployees3.add(friend9);
    }
}



